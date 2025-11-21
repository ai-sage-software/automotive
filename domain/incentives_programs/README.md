
-----

# Incentives & Programs

Welcome to the **Incentives & Programs** domain.

If you are new to the system, think of this domain as the **"Coupon & Rebate Engine"** of the dealership.

Buying a car is rarely as simple as paying the sticker price. There might be a "Summer Sales Event," a "Recent College Graduate Rebate," or a specific discount on "2024 Hybrid Models." This domain manages the massive, constantly changing library of these rules. It answers two questions:

1.  *Does this customer and this car qualify for a discount?*
2.  *How do we get paid back by the manufacturer for giving that discount?*

-----

## 📂 How to Navigate This Directory

We have organized the information to separate the incoming data feeds from the logic applied to sales.

| Folder / Path | Description | Best For... |
| :--- | :--- | :--- |
| **[`/api`](https://www.google.com/search?q=./api)** | **The Data Definitions.** Schemas for Programs, Rules, and Reimbursement Invoices. | Developers integrating with OEM data feeds. |
| **[`/specs`](https://www.google.com/search?q=./specs)** | **The Business Rules.** Logic explaining "Stackability" (can I use two coupons?) and Eligibility. | Business Analysts and Sales Managers. |
| **[`/examples`](https://www.google.com/search?q=./examples)** | **Sample Data.** Examples of complex rule sets and JSON payloads from manufacturers. | QA Testers verifying rule logic. |
| **[`/model_diagrams`](https://www.google.com/search?q=./model_diagrams)** | **Visual Maps.** Diagrams showing the flow from Manufacturer → Dealer → Customer. | Architects. |

-----

## 🏷️ Core Concepts (The API)

In the **[`/api`](https://www.google.com/search?q=./api)** folder, you will find the components that drive our pricing logic.

### 1\. The Catalog (Programs & Rules)

Before we can sell anything, we need to know what offers exist.

* **[`program_registry`](https://www.google.com/search?q=./api/program_registry)**: The high-level container. (e.g., "Ford Q4 Sales Event").
* **[`incentive_rules`](https://www.google.com/search?q=./api/incentive_rules)**: The specific logic gates. (e.g., "Must be a Resident of California" AND "Must finance through our bank").
* **[`initiative_download`](https://www.google.com/search?q=./api/initiative_download)**: The mechanism for pulling these rules down from the Manufacturer (OEM) systems.

### 2\. Eligibility & Application

When a salesperson is working a deal, they query this domain.

* **[`incentive_inquiry`](https://www.google.com/search?q=./api/incentive_inquiry)**: A request asking, "Here is a Customer and a Car—what can they get?"
* **[`vehicle_initiatives`](https://www.google.com/search?q=./api/vehicle_initiatives)**: Discounts attached specifically to a VIN (Vehicle Identification Number), often called "Cash on the Hood."
* **[`incentive_modification`](https://www.google.com/search?q=./api/incentive_modification)**: Handling changes to the applied incentives during the negotiation process.

### 3\. Reimbursement (Getting Paid)

If we give a customer $1,000 off because the Manufacturer promised a rebate, we need to collect that $1,000 from the Manufacturer.

* **[`vehicle_initiative_invoice`](https://www.google.com/search?q=./api/vehicle_initiative_invoice)**: The formal request sent back to the OEM to claim the money for the rebate given.

-----

## 🧠 The "Brain" of the Deal (The Specs)

The **[`/specs`](https://www.google.com/search?q=./specs)** folder is crucial because incentive logic is notoriously difficult.

* **Stackability Logic:** Can a customer use the "Military Discount" AND the "Summer Sale Discount" at the same time? This spec defines exclusive vs. additive rules.
* **Geo-Fencing:** How we handle programs that only apply to specific zip codes (handled via **[Core/Geographic Boundary](https://www.google.com/search?q=../domains/core_common/README.md)**).
* **Expiration Handling:** What happens if a program expires *while* a deal is being negotiated?

-----

## 🔗 Domain Relationships

This domain acts as a filter between the Car, the Customer, and the Price.

* **Inventory (Vehicles):** Programs often target specific Model Codes or VINs (e.g., "Rebates on all Red Trucks"). We read data from **[Inventory & Vehicle](https://www.google.com/search?q=../domains/inventory_vehicle/README.md)** to validate.
* **Identity (Customer):** Programs often target specific people (e.g., "Loyalty Bonus for previous owners"). We check **[Party & Identity](https://www.google.com/search?q=../domains/party_identity/README.md)** to validate.
* **Sales (The Deal):** The Sales domain *asks* us for valid coupons, and we return the calculated deduction.
* **Finance:** Once the deal is done, Finance tracks the *receivable* (money owed to us) from the Manufacturer using the data generated here.

-----

## 🚀 Getting Started Checklist

If you are working on pricing or deal calculation, start here:

1.  **The Source:** Review **[`initiative_download_retrieval`](https://www.google.com/search?q=./api/initiative_download_retrieval)**. Understanding how we get the data from the factory is step one.
2.  **The Logic:** Look at **[`incentive_rules`](https://www.google.com/search?q=./api/incentive_rules)**. This is where the complexity lives (Boolean logic, dates, exclusions).
3.  **The Result:** Check **[`incentive_inquiry`](https://www.google.com/search?q=./api/incentive_inquiry)** to see how the system presents valid options to a salesperson.

*For issues regarding missing manufacturer programs, please check the Data Feed logs.*