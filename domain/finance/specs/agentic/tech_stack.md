In the context of the **UCP/MCP Bridge**, the "AI Agent" participant isn't a single library but an orchestrated stack designed for **reasoning, tool-use, and context management**.

To handle a transaction as complex as a dealership financial split, the stack typically breaks down into four primary layers:

### 1. The Reasoning Engine (LLM)

This is the "brain" that interprets the user's intent (e.g., "I have a coupon") and decides which tool to call.

* **Core Models:** **Gemini 1.5 Pro** or **Flash** (optimized for low latency and high context windows).
* **Capabilities:** Must support **Function Calling** (the ability to output structured JSON instead of just text) and **System Instructions** (the guardrails that prevent the agent from applying a discount without verification).

### 2. The Model Context Protocol (MCP) Layer

This is the "handshake" layer that allows the AI to securely interact with your local or remote data.

* **MCP Host:** A runtime (like a Node.js or Python environment) that manages the connection between the LLM and the tools.
* **MCP Server:** The specific implementation of your `propose_financial_split` and `get_customer_context` tools.
* **SDKs:** The **Anthropic MCP SDK** or specialized wrappers that allow the LLM to browse the "Tools" menu.

### 3. Context & Memory Orchestration

An AI agent needs to remember that the user already provided their phone number three messages ago.

* **LangGraph / LangChain:** Used to create a state machine. For your "Verify-then-Propose" flow, LangGraph is ideal because it forces the agent to move through a "Verification Node" before reaching the "Financial Split Node."
* **Vector Database (optional):** Tools like **Pinecone** or **ChromaDB** to store dealership-specific PDF manuals or service bulletins so the agent can explain *why* a certain labor operation is required.

### 4. Interface & Integration (The Gateway)

The agent needs a way to talk to the user and the bridge.

* **API Gateway:** **gRPC** or **REST** endpoints that connect the AI's tool outputs to your Java `JobAssemblyService`.
* **Front-end:** A web-based chat interface or an **Omnichannel** integration (Twilio for SMS, SendGrid for Email).

---

### The Architecture in Action

| Layer | Technology Choice | Function in your Flow |
| --- | --- | --- |
| **Logic** | Gemini 1.5 Flash | Parses "I have a $20 coupon" into a tool request. |
| **Orchestration** | LangGraph | Ensures the phone number is asked for **before** the split tool is called. |
| **Protocol** | MCP (Model Context Protocol) | Standardizes the JSON schema for the financial split. |
| **Security** | OAuth2 / JWT | Ensures the AI agent is authorized to view customer loyalty data. |

### How it looks "Under the Hood"

When the user says "Apply my coupon," the **LangGraph** state machine checks the `verification_status`. If it is `FALSE`, it overrides the LLM's desire to call the split tool and forces it to call the `request_customer_info` tool instead. This is how you ensure the **Tekion** or **CDK** data remains clean.

In the Java world, you don't need to switch to Python to build high-fidelity AI agents. The ecosystem has evolved rapidly, with **Spring AI** and **LangChain4j** leading the way. Both frameworks provide first-class support for **Function Calling** and the **Model Context Protocol (MCP)**.

Here is the tech stack that perfectly fits your "Verify-then-Propose" requirement:

### 1. Spring AI (The Enterprise Choice)

Spring AI is designed to integrate seamlessly with the Spring Boot ecosystem. It treats AI models as a first-class resource, similar to how Spring handles database connections or REST templates.

* **Key Component:** `ChatClient` with `Advisors`. You can use a `ToolCallAdvisor` to automate the function-calling loop.
* **Verification Strategy:** Use **Spring AI Advisors** to intercept tool calls. If an agent tries to call `propose_financial_split` without the `verification_context` being set in the conversation metadata, the Advisor can re-route the agent back to a "Verification Prompt."
* **MCP Support:** Spring AI 2026 releases now include a dedicated `spring-ai-mcp-client` starter, allowing you to connect to MCP servers written in any language via standard Java POJOs.

### 2. LangChain4j (The Specialized Toolset)

If your application isn't strictly Spring-based or you want a library that mirrors the Python LangChain experience with a Java flavor, **LangChain4j** is the standard.

* **Key Component:** `AiServices`. You define a Java Interface for your agent, and LangChain4j handles the interaction with the LLM.
* **Verification Strategy:** Define a "Verification Service" interface. LangChain4j's **Tools** (using the `@Tool` annotation) are incredibly easy to implement; you can have a `verifyCustomer` tool that returns a `CustomerResult` object which then becomes part of the LLM's working memory.

---

### Comparison for Your Use Case

| Feature | **Spring AI** | **LangChain4j** |
| --- | --- | --- |
| **Orchestration** | Advisor-based (Interceptor pattern) | Interface-based (Proxy pattern) |
| **MCP Integration** | Deeply integrated with Spring Boot starters. | Flexible, works in any Java SE/EE environment. |
| **POJO Mapping** | Native Jackson/SnakeCase support. | Native GSON/Jackson support. |
| **State Management** | Spring Session / Managed Beans. | `ChatMemory` abstractions. |

---

### Implementation Snippet (Spring AI Style)

To enforce the **"Verification First"** logic in Java, you would define your tools like this:

```java
@Service
public class BillingTools {

    @McpTool(description = "Propose a financial split for a service request")
    public String proposeSplit(
        @McpToolParam(description = "The verified DMS customer key") String customerKey,
        @McpToolParam(description = "The list of splits") List<FinancialSplit> splits
    ) {
        // Logic to push to CDK or Tekion
        return "Split successfully proposed for Customer: " + customerKey;
    }

    @McpTool(description = "Verify a customer loyalty status via phone or email")
    public CustomerContext verifyCustomer(String identifier) {
        // Logic to check your database
        return new CustomerContext("C-12345", "VALID");
    }
}

```

By providing both tools, the LLM will naturally learn that it cannot get a `customerKey` (required for the first tool) without calling the `verifyCustomer` tool first.

**Would you like me to generate a Maven `pom.xml` configuration that includes the necessary dependencies for a Spring AI project with MCP and GSON/SnakeCase support?**

---

[Java AI Agents: LangChain4j vs. Spring AI Showdown](https://www.youtube.com/watch?v=lkMhqEyjfXs)

This video provides a practical comparison between the two major Java AI frameworks, helping you choose the one that best suits your existing architecture.