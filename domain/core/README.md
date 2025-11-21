# Core & Common Entities

Welcome to the **Core & Common Entities** domain.

If you are new to the system, think of this domain as the **"Dictionary"** or the **"LEGO Box"** for our platform.

This domain does not process sales or manage employees directly. Instead, it defines the **standards** that everyone else uses. When the **Finance** team records a transaction, they use the `Money` definition found here. When **Logistics** ships a part, they use the `Unit of Measure` defined here. This ensures that "100 Dollars" means the same thing to every part of the system.

-----

## 📂 How to Navigate This Directory

We have organized the information to distinguish between simple data types and complex shared utilities.

| Folder / Path | Description | Best For... |
| :--- | :--- | :--- |
| **[`/api`](https://www.google.com/search?q=./api)** | **The Definitions.** The schemas for shared objects like Money, Addresses, and Enums. | Developers needing standard field formats. |
| **[`/specs`](https://www.google.com/search?q=./specs)** | **The Standards.** Documentation on formatting rules (e.g., Date formats, Currency precision). | Architects and QA Engineers. |
| **[`/examples`](https://www.google.com/search?q=./examples)** | **Snippets.** JSON snippets showing how to embed these core objects into larger documents. | Developers building new features. |

-----

## 🧱 Core Building Blocks (The API)

In the **[`/api`](https://www.google.com/search?q=./api)** folder, you will find the shared components used across the 12 other domains.

### 1\. The Value Objects (The Atoms)

These are the small, reusable pieces of data that appear almost everywhere.

* **[`money_price`](https://github.com/ai-sage-software/automotive/tree/main/domain/core/money_price)**: Defines how we store currency. It ensures we always capture the Amount *and* the Currency Code (e.g., `{ "amount": 100.00, "currency": "USD" }`).
* **[`effective_date`](https://github.com/ai-sage-software/automotive/tree/main/domain/core/effective_date)**: Handles time-sensitive data (e.g., "This price is valid *from* Jan 1st *to* Dec 31st").
* **[`unit_of_measure`](https://github.com/ai-sage-software/automotive/tree/main/domain/core/unit_of_measure)**: Standardization for weights and dimensions (kg, lbs, meters, feet) so **Logistics** and **Parts** calculate shipping correctly.
* **[`enums_types`](https://github.com/ai-sage-software/automotive/tree/main/domain/core/enums_types)**: The master lists of fixed options (e.g., Dropdown menu choices, status codes, color codes).

### 2\. Shared Services

These are larger components that provide utility to multiple domains.

* **[`geographic_boundary`](https://github.com/ai-sage-software/automotive/tree/main/domain/core/geographic_boundary)**: Defines regions, states, postal codes, and territories. Used by **Sales** for territories and **Logistics** for shipping zones.
* **[`large_file`](https://github.com/ai-sage-software/automotive/tree/main/domain/core/large_file)**: A standard way to handle document attachments (PDFs, Images). Whether it's a Scanned Invoice (**Finance**) or a Picture of a scratch on a car (**Service**), we handle the file storage the same way.
* **[`lifecycle_event`](https://github.com/ai-sage-software/automotive/tree/main/domain/core/lifecycle_event)**: A standardized audit trail. Every time a record changes status (Created → Pending → Approved), we use this structure to record *Who*, *When*, and *Why*.

-----

## 📏 The Rules (The Specs)

The **[`/specs`](https://www.google.com/search?q=./specs)** folder details the strict rules for data consistency.

* **Currency Precision:** How many decimal places do we use? (2 for USD, 0 for JPY).
* **Date/Time Zones:** All `Effective Date` fields must be stored in UTC.
* **Localization:** How `Textual Detail` handles multiple languages for description fields.

-----

## 🔗 Why This Matters (Dependencies)

The Core domain has **incoming** dependencies from everywhere, but **outgoing** dependencies to nowhere. This is the foundation.

* **Finance** uses `Money/Price` to ensure ledgers balance.
* **Inventory** uses `Unit of Measure` to calculate warehouse space.
* **Identity** uses `Geographic Boundary` to validate addresses.
* **Service** uses `Large File` to attach diagnostic reports.

[Image of dependency diagram showing Core at the bottom]

-----

## 🚀 Getting Started Checklist

If you are developing a new feature in *any* domain, you should check here first to avoid "reinventing the wheel."

1.  **Check `enums_types`**: Before you create a new status code or category list, see if one already exists.
2.  **Review `money_price`**: Never store money as a simple "Float" or "Integer." Always use the structure defined here.
3.  **Understand `identifier`**: Read how we generate unique IDs (UUIDs vs. Readable IDs) for system objects.

*For requests to add new Units of Measure or Currency Codes, please submit a Pull Request to the Core Standards Committee.*