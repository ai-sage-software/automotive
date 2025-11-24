# Sales & Dealership Operations

Welcome to the **Sales & Dealership Operations** domain.

[Image of sales pipeline]

If you are new to the system, think of this domain as the **"Showroom Floor and Closing Desk."** This is where we capture the initial customer interest, negotiate the terms, and execute the final sales contract.

This domain is critical because it bridges customer desire with physical inventory, ultimately generating the revenue that drives the rest of the business.

-----

## 📂 How to Navigate This Directory

We have organized the information based on the stages of the sales process, from initial opportunity through final reporting.

| Folder / Path | Description | Best For... |
| :--- | :--- | :--- |
| **[`/api`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance)** | **The Data Definitions.** Schemas for Sales Leads, Contracts (Deals), and final reporting to the manufacturer. | Developers integrating the CRM or external pricing tools. |
| **[`/specs`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs)** | **The Business Rules.** Logic for Deal profitability, commission calculation triggers, and contract validation. | Sales Managers and Business Analysts. |
| **[`/examples`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/examples)** | **Sample Data.** Examples of finalized deal contracts, including line items and trade-in values. | QA Testers and data auditors. |
| **[`/model_diagrams`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/model_diagrams)** | **Visual Maps.** Diagrams illustrating the Lead-to-Sale conversion process. | Process Trainers and Executives. |

-----

## 🤝 Core Concepts (The API)

In the **[`/api`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance)** folder, you will find the components that manage the sales transaction.

### 1\. The Transaction Core

* **[`deal`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/deal)**: The central Aggregate Root (AR) of the sales domain. This is the contract between the customer and the dealer, containing the final negotiated prices, trade-in value, accessories, and financing structure.
* **[`sales_lead`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/sales_lead)**: The initial contact or inquiry from a potential customer. This record tracks the source of the lead and the follow-up history.

### 2\. People & Procurement

* **[`staff`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/staff)**: References the employee (salesperson) who executed the deal. Used for tracking commissions (sent to HR) and performance.
* **[`vendor`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vendor)**: Reference to third-party organizations we might interact with during the sales process (e.g., wholesalers buying a trade-in vehicle).
* **[`purchase_order`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/purchase_order)**: A request to purchase goods or services *by the dealership* (e.g., buying new office furniture or acquiring a car from a competitor lot).

### 3\. Finalization & Reporting

* **[`retail_delivery_reporting`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/retail_delivery_reporting)**: Often called "RDR." This is the mandatory data package sent to the manufacturer (OEM) confirming the sale of a specific VIN to a customer. This triggers warranty coverage and factory reporting.

-----

## 📈 The Sales Process (The Specs)

The **[`/specs`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs)** folder details the complex rules required to finalize a compliant and profitable sale.

* **Deal Desk Approval Logic:** The rules governing when a Deal requires approval from a manager (e.g., if the profit margin falls below a specific threshold).
* **Trade-In Valuation:** The standardized process for incorporating a trade-in vehicle into the Deal and tracking its subsequent inventory status.
* **Compliance:** Specs ensuring that all financing disclosures and legal terms are captured in the final `Deal` contract before it is marked as closed.

-----

## 🔗 Domain Relationships

The Sales domain acts as the orchestrator, pulling information from many other domains to complete the transaction and pushing critical data out when the transaction is closed.

* **Inventory & Vehicle Management:** Sales reserves a **[Vehicle](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/inventory_vehicle/README.md)** when a deal is inked, removing it from available inventory.
* **Party & Identity Management:** We rely on **[Party & Identity](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/party_identity/README.md)** for accurate customer and dealer profiles necessary for the contract and RDR submission.
* **Financial & Payments:** Closing a `Deal` triggers the creation of an **[Invoice](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/finance/README.md)** and eventual `Payment` processing.
* **Incentives & Programs:** Sales queries **[Incentives](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/incentives/README.md)** to determine which discounts apply to the specific customer and vehicle combination.
* **Logistics & Fulfillment:** If the vehicle must be sourced from another dealer, the `Deal` initiates a **[Vehicle Transfer Order](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/logistics/README.md)**.

-----

## 🚀 Getting Started Checklist

If you are working on the core transaction flows, start here:

1.  **The Contract:** Review the **[`deal`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/deal)** schema to understand how all aspects of the sale (price, trade, financing) are unified.
2.  **The Start:** Look at **[`sales_lead`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/sales_lead)** to see how initial interest is captured and tracked.
3.  **The Close:** Understand the strict data requirements for **[`retail_delivery_reporting`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/retail_delivery_reporting)**, as this is the final, non-negotiable step of a sale.

*For questions about how commissions are calculated, please consult the **[Human Resources](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/human_resources/README.md)** documentation.*