# Open Source Tools & Utilities

Welcome to **Open Source Tools & Utilities**.

This directory houses internally developed tools and libraries designed to support, accelerate, and enhance the primary domain services (like Sales, Finance, and Service). These tools focus heavily on **Artificial Intelligence**, **Testing**, and **Developer Enablement**.

While the domain folders contain the core business logic, these utilities provide the underlying infrastructure for advanced features like automated testing, documentation generation, and complex AI reasoning.

-----

## 🛠️ Project Index

This list outlines the key projects within this folder and their primary function within the platform. Click on any project name to view its specific documentation.

| Project Name | Description | Supports Domain(s) |
| :--- | :--- | :--- |
| **[ai\_data\_quality](https://github.com/ai-sage-software/automotive/tree/main/open_source/ai_data_quality/README.md)** | A utility focused on measuring and enforcing consistency in critical data fields (e.g., VIN formats, address standardization, currency integrity). | *All Domains* |
| **[ai\_diagrams](https://github.com/ai-sage-software/automotive/tree/main/open_source/ai_diagrams/README.md)** | Generates and maintains architectural diagrams (like PlantUML and C4 models) automatically from source code or specification files, ensuring documentation stays current. | *All Domains* |
| **[ai\_iot\_simulation](https://github.com/ai-sage-software/automotive/tree/main/open_source/ai_iot_simulation/README.md)** | A toolkit for simulating realistic vehicle telemetry and event streams, crucial for testing the **Telematics** domain under various load conditions. | *Telematics, Service* |
| **[ai\_llm\_models](https://github.com/ai-sage-software/automotive/tree/main/open_source/ai_llm_models/README.md)** | Repository for custom Large Language Models (LLMs) used for internal documentation Q\&A, customer service chat, and generating internal summaries of complex legal documents. | *Marketing, HR, Warranty* |
| **[ai\_memory](https://github.com/ai-sage-software/automotive/tree/main/open_source/ai_memory/README.md)** | Provides state management and context persistence for conversational AI applications, allowing chat bots to remember past interactions within a session. | *Marketing, Service* |
| **[ai\_prompt\_mgmt](https://github.com/ai-sage-software/automotive/tree/main/open_source/ai_prompt_mgmt/README.md)** | A version control system for standardizing, testing, and deploying the text prompts used to interface with the **ai\_llm\_models**. | *All AI-Enabled Domains* |
| **[ai\_reasoning](https://github.com/ai-sage-software/automotive/tree/main/open_source/ai_reasoning/README.md)** | A rules engine and logic processing framework used to evaluate complex business criteria, such as stacked incentive eligibility or multi-factor fraud detection. | *Incentives, Finance, Sales* |
| **[synthetic\_data](https://github.com/ai-sage-software/automotive/tree/main/open_source/synthetic_data/README.md)** | Generates high-fidelity, anonymized test data (fake customer names, VINs, deal prices) for development and QA environments while maintaining security and privacy compliance. | *All Domains (Testing)* |

-----

## 🚀 Usage & Contribution

These projects are often decoupled from the main domain services and can be consumed as micro-services, libraries, or command-line tools.

### Key Use Cases

* **Testing:** Developers use **`synthetic_data`** and **`ai_iot_simulation`** to populate testing environments with reliable, reproducible data.
* **Documentation:** The **`ai_diagrams`** project ensures that our architecture documentation (like the READMEs you are currently reading) remains accurate and easy to generate.
* **Business Logic:** Teams utilize **`ai_reasoning`** to centralize complex, non-linear business rules, reducing complexity in core domain code (e.g., **Incentives**).

### Contributing

We encourage contributions\! Please review the `CONTRIBUTING.md` file located in the root of each specific project folder for details on:

* Submitting bug fixes.
* Proposing new features.
* The project's governance and code review process.