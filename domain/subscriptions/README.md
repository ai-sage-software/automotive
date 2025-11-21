# Subscription Management

Welcome to the **Subscription Management** domain.

If you are new to the system, think of this domain as the **"Recurring Revenue Engine."** It handles all services sold to customers on a periodic basis, rather than a one-time purchase. This includes items like extended warranties, maintenance plans, connected car services, or premium roadside assistance packages.

This domain is essential for creating predictable income streams and fostering long-term customer relationships.

-----

## 📂 How to Navigate This Directory

We have organized the information based on the stages of the subscription lifecycle, from defining the product to managing the active contract.

| Folder / Path | Description | Best For... |
| :--- | :--- | :--- |
| **[`/api`](https://www.google.com/search?q=./api)** | **The Data Definitions.** Schemas for the Subscription Plans, Agreements, and Pricing structures. | Developers building subscription provisioning or billing integrations. |
| **[`/specs`](https://www.google.com/search?q=./specs)** | **The Business Rules.** Logic for renewal, cancellation, proration, and service activation/deactivation. | Billing Analysts and Legal/Compliance Teams. |
| **[`/examples`](https://www.google.com/search?q=./examples)** | **Sample Data.** Examples of various subscription contract types (e.g., monthly vs. annual, service vs. data). | QA Testers and data auditors. |
| **[`/model_diagrams`](https://www.google.com/search?q=./model_diagrams)** | **Visual Maps.** Diagrams illustrating the flow of a customer's contract lifecycle. | Architects and Finance Auditors. |

-----

## 🔁 Core Concepts (The API)

In the **[`/api`](https://www.google.com/search?q=./api)** folder, you will find the components that manage the recurring nature of our services.

### 1\. The Offer and Price

* **[`subscription_plan`](https://www.google.com/search?q=./api/subscription_plan)**: The definition of the product being sold (e.g., "Premium Connected Car Data"). It outlines the features and term options available.
* **[`price_plan`](https://www.google.com/search?q=./api/price_plan)**: The specific pricing model for a `Subscription Plan` (e.g., $19.99/month, $199/year). It handles tiered pricing and promotional rates.

### 2\. The Contract

* **[`subscription_agreement`](https://www.google.com/search?q=./api/subscription_agreement)**: The active, legally binding contract with the customer. It links the customer (from Identity), the plan, the vehicle, and the start/end dates. It is the central Aggregate Root (AR) for this domain.
* **[`subscription_service`](https://www.google.com/search?q=./api/subscription_service)**: Tracks the status of the service provided under the agreement. For example, if a car's GPS service is active, paused, or suspended.

-----

## 📜 Contract Lifecycles (The Specs)

The **[`/specs`](https://www.google.com/search?q=./specs)** folder details the critical rules that govern the duration of the contract and the associated billing.

* **Proration Logic:** Rules for calculating charges when a customer starts or cancels a service mid-cycle (e.g., only paying for 10 days of service).
* **Renewal Rules:** The automated process that extends a `Subscription Agreement` and attempts to process payment for the next term.
* **Suspension/Termination:** Logic for pausing or ending service due to non-payment or customer request, and how this is communicated to other systems (e.g., deactivating the feature in the **Telematics** domain).

-----

## 🔗 Domain Relationships

Subscription Management is a financial domain that requires input from Identity, Vehicles, and Finance to complete its core function (billing).

* **Party & Identity Management:** We rely on **[Party & Identity](https://www.google.com/search?q=../domains/party_identity/README.md)** to correctly link the `Subscription Agreement` to the billing party and manage their payment methods.
* **Inventory & Vehicle Management:** Subscriptions are often linked to a specific **[Vehicle](https://www.google.com/search?q=../domains/inventory_vehicle/README.md)** (e.g., a warranty plan tied to a VIN). We need the vehicle record to validate the contract.
* **Financial & Payments:** The most direct relationship. The `Subscription Agreement` triggers the creation of recurring **[Invoices](https://www.google.com/search?q=../finance/README.md)** and manages the billing schedule.
* **Telematics & Vehicle Events:** If the subscription is for a connected service (like GPS tracking), this domain signals the **[Telematics](https://www.google.com/search?q=../domains/telematics/README.md)** domain to activate or deactivate the feature in the car.

-----

## 🚀 Getting Started Checklist

If you are new to the Subscription domain, focus on the contract life:

1.  **The Contract:** Review the **[`subscription_agreement`](https://www.google.com/search?q=./api/subscription_agreement)** schema, as this object orchestrates everything else.
2.  **The Price:** Look at **[`price_plan`](https://www.google.com/search?q=./api/price_plan)** to understand how we model recurring charges and complex tiering.
3.  **The Output:** Understand how this domain feeds recurring **[Invoices](https://www.google.com/search?q=../finance/README.md)** to the Finance system.

*For questions about why a customer was charged a specific amount, consult the `Proration Logic` specs in the **[`/specs`](https://www.google.com/search?q=./specs)** folder.*