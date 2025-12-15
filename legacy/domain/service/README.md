-----

# Service

Welcome to the **Service** domain.

If you are new here, think of this directory as the "Central Bank" of our automotive service system. Every time a car is serviced, the data eventually flows here to be recorded, tracked, and audited.

This document will guide you through the structure of this service repository and explain the core concepts we model.

The Service Domain, originally developed in the STAR5 XML Schema Repository, has been migrated into these OpenAPI specifications. This domain is currently undergoing harmonization with the new STAR Domain Model architecture. As you explore the Service Domain, we eagerly anticipate your feedback on how this domain can be further enhanced. 
-----

## 📂 How to Navigate This Directory

We have organized the information into four distinct areas to help you find what you need quickly.

| Folder / Path | Description | Best For... |
| :--- | :--- | :--- |
| **[`/api`](https://github.com/starstandard/automotive/tree/main/legacy/domain/service/api)** | **The Data Definitions.** Contains the technical "blueprints" (schemas) for our service objects like Repair Orders, Labor Operations, and Vehicle Service History. | Developers looking for field names and data types. |
| **[`/specs`](https://github.com/starstandard/automotive/tree/main/legacy/domain/service/specs)** | **The Business Rules (WORK IN PROGRESS)** Documentation explaining *how* the system behaves during specific events. | Product Managers and Business Analysts. |
| **[`/examples`](https://github.com/starstandard/automotive/tree/main/legacy/domain/service/examples)** | **Sample Data (WORK IN PROGRESS)** JSON or YAML files showing real-world examples of what the data looks like. | Testers and Developers needing mock data. |
| **[`/model_diagrams`](https://github.com/starstandard/automotive/tree/main/legacy/domain/service/model_diagrams)** | **Visual Maps (WORK IN PROGRESS)** Images and UML charts showing how these Service pieces fit together. | Everyone needing a "Big Picture" view. |

-----

## 🏦 Core Concepts (The API)

In the **[`/api`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/api)** folder, you will find the building blocks of our financial system. Here is a breakdown of what each component does:

### 1\. The Ledger (The Source of Truth)

Everything in finance relies on the "General Ledger" (GL). It is the master record of all transactions.

* **[`general_ledger_account`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/api/general_ledger_account)**: Represents the specific buckets where money lives (e.g., "Cash," "Inventory Assets," "Sales Revenue").
* **[`control_account`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/api/control_account)**: A special summary account used to keep the ledger balanced without showing every single tiny detail in the main view.
* **[`subsidiary_ledger_transaction`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/api/subsidiary_ledger_transaction)**: The detailed records. While the General Ledger might just say "Customers owe us $50k," the Subsidiary Ledger lists exactly *which* customers owe *what* amount.

### 2\. Money Movement (In & Out)

* **[`invoice`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/api/invoice)**: A request for payment. This is generated when we sell a vehicle (from the Sales domain) or service a car.
* **[`payment`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/api/payment)**: The actual act of money changing hands to settle an invoice.
* **[`payment_method`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/api/payment_method)**: How the payment was made (Credit Card, ACH, Cash, Wire).
* **[`payment_event`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/api/payment_event)**: Tracks the status of the money. Just because a user clicked "Pay" doesn't mean the bank approved it. This tracks `Pending`, `Success`, or `Failed`.

### 3\. Accounting Records

* **[`journal_entry_transaction`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/api/journal_entry_transaction)**: The fundamental unit of accounting. Every time money moves, a "Journal Entry" is created to record it using the double-entry system (Debits must equal Credits).

-----

## 🔄 Business Lifecycles (The Specs)

The **[`/specs/lifecycle`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs/lifecycle)** directory is critical for understanding the **flows** of the system. Data isn't static; it moves through states.

We have documented the most complex financial workflows here:

* **Manual Adjustments**
    * 📄 **[`1_manual_journal_entry_push.md`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs/lifecycle/_1_manual_journal_entry_push.md)**
    * *What it is:* How an accountant manually fixes numbers in the ledger.
* **Allocations**
    * 📄 **[`2_automated_allocations.md`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs/lifecycle/_2_automated_allocations.md)**
    * *What it is:* How the system automatically splits money across different departments (e.g., splitting a utility bill between Sales and Service departments).
* **Corrections**
    * 📄 **[`3_reversal_voiding.md`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs/lifecycle/_3_reversal_voiding.md)**
    * *What it is:* The "Undo" button. How to properly void a transaction while keeping a transparent audit trail.
* **Corporate Finance**
    * 📄 **[`4_financial_consolidation...`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs/lifecycle/_4_financial_consolidation_intercompany_adjustment.md)**
    * *What it is:* How we combine the finances of multiple dealership locations into one big report for headquarters.

-----

## 🔗 Domain Relationships

The Finance domain does not exist in a vacuum. Based on our [System Architecture Map](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/model_diagrams), here is how we connect to the rest of the business:

* **Sales (Dealership Ops):** When a `Deal` is finalized, it triggers an `Invoice` and a `Journal Entry` in our system.
* **HR (Human Resources):** `Payroll Runs` send data here to generate `Payroll Payments` and record labor costs in the Ledger.
* **Service & Parts:** Every `Repair Order` or `Parts Order` creates financial transactions that flow into our `Subsidiary Ledgers`.

-----

## 🚀 Getting Started Checklist

If you are new to this specific domain, we recommend this order:

1.  **Read** `initial_requirements.md` in the specs folder to understand the goals.
2.  **View** the `control_account.md` spec to understand how we balance the books.
3.  **Explore** the `api/invoice` folder to see the JSON structure of a bill.

*For questions or architecture updates, please contact the Finance Domain Lead.*
