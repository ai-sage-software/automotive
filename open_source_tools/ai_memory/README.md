# Automotive

# AI Memory

Welcome to the **AI Memory** project documentation.

[Image of neural network diagram]

This project focuses on the critical engineering challenge of **managing state, context, and long-term knowledge** for our platform's Artificial Intelligence applications, particularly those utilizing the **[ai\_llm\_models](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/ai_llm_models/README.md)**. For an AI to be useful in complex interactions, such as guiding a customer through a warranty claim or diagnosing a service issue, it must be able to "remember" previous turns, facts established earlier in the conversation, or specific user preferences over time. This project provides the infrastructure for that memory.

-----

## 🎯 Goal and Scope

The primary goal is to enable **context-aware and personalized AI experiences** by reliably storing and retrieving historical data relevant to an active session or a persistent user identity.

### Key Memory Types

| Memory Type | Duration | Use Case |
| :--- | :--- | :--- |
| **Short-Term (Context)** | Single session/conversation thread. | Remembering the VIN the customer just provided to answer follow-up questions about that car's history. |
| **Long-Term (User Profile)** | Persistent (years). | Remembering a customer's preference for text communication over email for future **[Marketing Campaigns](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/marketing_loyalty/README.md)**. |
| **Domain Knowledge** | Static, managed (lifetime of the model). | Storing indexed knowledge about every **[Labor Operation](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/service_parts/README.md)** to provide accurate service quotes. |

-----

## 🛠️ Core Components

The repository includes modules for encoding, storing, and retrieving context for AI services.

### 1\. Context Buffer

This module handles the in-session, short-term memory essential for conversational flow.

* **Sliding Window:** Manages the active context by using token limits (e.g., only keeping the last 4096 tokens of conversation history) to prevent the LLM's prompt from getting too large and expensive.
* **Semantic Compression:** Uses embeddings to identify the most relevant portions of a long conversation, reducing the amount of text passed to the LLM for each new turn.

### 2\. Vector Database Integration

This component provides the infrastructure for fast, semantic retrieval of long-term and domain knowledge.

* **Knowledge Indexing:** Converts documents and domain data (like all **[Incentive Rules](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/incentives_programs/README.md)**) into dense numerical vectors for efficient searching.
* **Retrieval-Augmented Generation (RAG):** The primary mechanism for preventing "hallucinations." Before the LLM answers a question, this system queries the Vector Database for relevant factual context (e.g., pulling the current price list for a requested part).

### 3\. Identity Linker

This module links active sessions to persistent **[Customer Profiles](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/party_identity/README.md)**.

* **Session Persistence:** Associates a transient chat session ID with a permanent `Party ID` (Customer ID) to access long-term preferences and history.
* **Personalized Context:** Pulls relevant, non-sensitive data (e.g., "The customer owns a 2024 model X and had service done last month") into the active memory buffer to personalize the AI's response.

-----

## 🔗 Integration and Usage

This project is foundational for the intelligent agents deployed across our platform.

* **LLM Prompting:** Every call to the **[ai\_llm\_models](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/ai_llm_models/README.md)** is first routed through **AI Memory** to retrieve the short-term context and any relevant RAG data.
* **Service Diagnosis:** When a customer initiates a service inquiry, their **[Vehicle Service History](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/service_parts/README.md)** is indexed and inserted into the RAG system, allowing the AI to instantly reference past repairs.
* **Sales Nurturing:** AI agents managing **[Sales Leads](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/sales_operations/README.md)** use long-term memory to recall past purchase attempts and financial queries, enabling a highly tailored approach.

-----

## 🤝 Contributing

We welcome expertise in vector database optimization and RAG pipeline improvement. Please consult the root `CONTRIBUTING.md` for guidelines.

### Roadmap Focus Areas

* Developing a standardized **"Forget Me" API** to comply with privacy regulations by selectively purging a user's long-term memory records.
* Implementing multi-modal memory to store and retrieve non-text data, such as images of damage related to a **[Warranty Claim](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/warranty/README.md)**.
* Building automatic data freshness checks to ensure indexed domain knowledge remains up-to-date.

<img src="https://github.com/ai-sage-software/automotive/blob/main/ai_sage.png">


 <br />
<a href="https://www.linkedin.com/in/eban-thomas-ai-sage/" > LinkedIn </a>
