# Marketing & Loyalty

Welcome to the **Marketing & Loyalty** domain.

[Image of marketing funnel diagram]

If you are new to the system, think of this domain as the **"Customer Engagement Hub."** Its job is to manage communication with our existing and prospective customers to drive future revenue and build long-term relationships.

This domain uses customer data from across the system to define *who* we talk to, *when* we talk to them, and *what* we say, ensuring our efforts are targeted and compliant.

-----

## 📂 How to Navigate This Directory

We have organized the information based on the two core functions: defining the outreach and utilizing vehicle data for communications.

| Folder / Path | Description | Best For... |
| :--- | :--- | :--- |
| **[`/api`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance)** | **The Data Definitions.** Schemas for Campaign definitions, communication preferences, and loyalty status. | Developers building customer segmentation tools. |
| **[`/specs`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs)** | **The Business Rules.** Logic for targeting audiences, managing communication frequency (throttling), and opt-out compliance. | Marketing Analysts and Legal/Compliance Teams. |
| **[`/examples`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/examples)** | **Sample Data.** Examples of target audience lists and campaign definitions. | QA Testers verifying audience logic. |
| **[`/model_diagrams`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/model_diagrams)** | **Visual Maps.** Diagrams illustrating the customer journey and loyalty tiers. | Strategy and Executive Teams. |

-----

## 📣 Core Concepts (The API)

In the **[`/api`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance)** folder, you will find the components that manage outreach efforts.

### 1\. The Outreach Plan

* **[`marketing_campaign`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/marketing_campaign)**: The high-level definition of a marketing effort (e.g., "Service Appointment Reminder," "End of Year Sales Push"). It contains the budget, duration, and the rules used to define the target audience.
* **[`vehicle_e_marketing`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_e_marketing)**: The digital communication assets focused on specific inventory. This allows us to send targeted emails or ads for a specific car model that a customer has previously shown interest in.

### 2\. Loyalty & Preferences

While not explicitly listed as separate components in the diagram, the concept of loyalty relies on:

* **Customer Segmentation:** Rules defined here determine if a customer is a "First-Time Buyer" or a "Tier 3 Loyalty Member" based on their purchase history (data pulled from the Sales domain).
* **Communication Preferences:** Managing the data that tracks if a customer has opted in or out of specific types of communication (e.g., "SMS only," "No mail").

-----

## 🎯 Targeting & Compliance (The Specs)

The **[`/specs`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs)** folder details the critical rules that manage customer relationships legally and effectively.

* **Audience Segmentation Logic:** Specs detailing the complex queries used to build target lists (e.g., "All customers who own a car over 5 years old AND live within 10 miles of Dealer X").
* **CAN-SPAM/GDPR Rules:** The mandatory logic checks to ensure a customer is only contacted via approved methods and frequency, based on their profile data in the Identity domain.
* **Attribution:** Rules defining how a closed sale is credited back to the initiating `Marketing Campaign` to calculate Return on Investment (ROI).

-----

## 🔗 Domain Relationships

Marketing is highly dependent on other domains for its input data, which it then uses to generate new engagement that feeds back into the Sales process.

* **Identity (PIM):** This is the most crucial dependency. We rely on **[Party & Identity](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/party_identity/README.md)** for accurate contact information and foundational identity data to build segments.
* **Inventory & Vehicle Management:** Marketing queries **[Inventory](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/inventory_vehicle/README.md)** constantly to ensure communications are relevant (e.g., advertising a car that is currently available on the lot).
* **Sales & Dealership Operations:** Marketing often generates new **[Sales Leads](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/sales_operations/README.md)**, which are tracked in the Sales domain, forming a closed loop.
* **Warranty & Service:** Marketing utilizes data from these domains to trigger automated service reminders or warranty expiration notices.

-----

## 🚀 Getting Started Checklist

If you are new to the Marketing domain data, start here:

1.  **The Target:** Understand how to query **[Party & Identity](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/party_identity/README.md)** to build a reliable customer list.
2.  **The Message:** Review the **[`marketing_campaign`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/marketing_campaign)** schema to understand how an initiative is technically defined (not just the creative content, but the rules).
3.  **The Compliance:** Review the specs folder for our **Opt-Out Logic**—this is the most critical compliance feature of the domain.

*For data quality issues regarding customer contact information, please report them to the **[Party & Identity](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/party_identity/README.md)** domain team.*