# Automotive

## AI Prompt Management

Welcome to the **AI Prompt Management** project documentation.

[Image of neural network diagram]

This project provides the tooling and governance required to **standardize, version control, and deploy the text prompts** used to interact with our **[ai\_llm\_models](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/ai_llm_models/README.md)**. A "prompt" is the instruction given to a Large Language Model (LLM) to elicit a desired response. As LLMs become integrated into critical business functions (like generating contract summaries or providing technical diagnostics), ensuring the prompts are consistent, reliable, and compliant is essential for predictable performance and security.

-----

## 🎯 Goal and Scope

The primary goal is to shift prompt development from ad-hoc text files to a **managed, tested, and versioned asset** to ensure the reliability and consistency of AI outputs across the platform.

### Key Principles

| Principle | Description | Why It Matters |
| :--- | :--- | :--- |
| **Reproducibility** | A prompt run today should yield the same quality of output a month from now, regardless of the calling application. | Essential for audit trails and regression testing. |
| **Separation of Concerns** | Prompts (the *instructions*) are stored separately from the code that calls them (the *application*). | Allows non-developers (like technical writers or compliance officers) to review and update instructions without code deployment. |
| **Security** | Prompts are hardened against **Prompt Injection** attacks, ensuring they cannot be exploited by malicious user input. | Critical for services that interact with sensitive data (e.g., HR, Finance). |

-----

## 🛠️ Core Components

This project manages the prompt lifecycle, from drafting to deployment.

### 1\. Prompt Registry

The central repository where all production prompts are stored and tagged.

* **Versioning:** Every prompt modification is tracked with a semantic version (e.g., `v1.0.0`, `v1.0.1`), allowing domain services to pin to a specific, tested version.
* **Template Management:** Supports variables that are filled in at runtime by the calling service (e.g., a **[Service Order](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/service_parts/README.md)** summary prompt might include a `{VIN}` variable).

### 2\. Prompt Testing Framework

Automated tools to ensure prompts are robust and provide consistent outputs.

* **Golden Answers:** Stores a library of expected "golden answers" for specific inputs to detect regression when a prompt is updated or when the underlying **[ai\_llm\_models](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/ai_llm_models/README.md)** are retrained.
* **Toxicity/Bias Checkers:** Scans prompt outputs for harmful, non-compliant, or biased language before deployment, particularly important for **[Marketing Campaigns](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/marketing_loyalty/README.md)**.

### 3\. Prompt Injection Guardrails

Code that wraps the prompt before it is sent to the LLM to protect against malicious input.

* **Sanitization Layer:** Filters user-provided text for common injection patterns (e.g., commands that attempt to override the system prompt).
* **Instruction Prefixing:** Ensures critical instructions (like "Do not discuss financial rates") are prefixed to the prompt and are difficult for the user to override.

-----

## 🔗 Integration and Usage

This project acts as an intermediary layer between the domains and the generative AI services.

* **Domain Consumption:** Instead of embedding prompt text directly in their code, domains like **Service** make an API call to the Prompt Registry: `get_prompt(name='service_summary_v1.2')`.
* **Memory Integration:** Used alongside **[ai\_memory](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/ai_memory.md)**, the template retrieved by this project is filled with both the user's immediate question and the historical context provided by the memory system.
* **AI Reasoning:** The **[ai\_reasoning](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/ai_reasoning/README.md)** project often uses highly specific, structured prompts managed here to execute complex logic checks (e.g., extracting named entities from a sales agreement).

### Example Prompt Definition (YAML)

```yaml
name: "warranty_claim_eligibility_checker"
version: "2.1.0"
description: "Instructs the LLM to determine claim coverage based on mileage limits."
system_instruction: "You are a Warranty Adjudicator. Only answer YES or NO."
user_template: |
  Review the Warranty terms for {MAKE} {MODEL} (VIN: {VIN}). 
  Is the current mileage ({MILEAGE}) below the 36,000 mile limit?
```

-----

## 🤝 Contributing

We encourage technical writers, compliance experts, and security analysts to contribute to prompt improvement and safety. Please consult the root `CONTRIBUTING.md` for guidelines.

### Roadmap Focus Areas

* Building a graphical user interface (GUI) for non-technical users to manage and test prompt templates visually.
* Implementing A/B testing capabilities to measure the performance and output quality of different prompt versions in production.
* Integrating a **"cost-per-token"** metric into the registry to allow teams to optimize their prompts for efficiency.

<img src="https://github.com/ai-sage-software/automotive/blob/main/ai_sage.png">


 <br />
<a href="https://www.linkedin.com/in/eban-thomas-ai-sage/" > LinkedIn </a>