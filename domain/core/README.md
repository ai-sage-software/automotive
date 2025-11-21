
-----

# Party & Identity Management (PIM)

Welcome to the **Party & Identity Management** domain.

If you are new to the system, think of this domain as the **"Global Address Book"** or the **"Passport Office"** for the entire platform.

Whether it is a Customer buying a car, a Vendor selling us parts, a Staff member fixing an engine, or a Dealership franchise—they all start here. This domain is the **Source of Truth** for who everyone is.

-----

## 📂 How to Navigate This Directory

We have organized the information into four distinct areas to help you find what you need quickly.

| Folder / Path | Description | Best For... |
| :--- | :--- | :--- |
| **[`/api`](https://www.google.com/search?q=./api)** | **The Data Definitions.** Contains the schemas for People, Organizations, and their specific Profiles. | Developers looking for field names (e.g., `first_name`, `tax_id`). |
| **[`/specs`](https://www.google.com/search?q=./specs)** | **The Business Rules.** Documentation explaining how we handle privacy, profile merging, and identity validation. | Product Managers and Business Analysts. |
| **[`/examples`](https://www.google.com/search?q=./examples)** | **Sample Data.** JSON examples of what a Customer or Dealer profile actually looks like. | Testers and Developers. |
| **[`/model_diagrams`](https://www.google.com/search?q=./model_diagrams)** | **Visual Maps.** Images showing how generic "Parties" transform into specific roles. | Everyone needing a "Big Picture" view. |

-----

## 🆔 Core Concepts (The API)

In the **[`/api`](https://www.google.com/search?q=./api)** folder, you will find the "Aggregate Roots" (AR) that define our users.

### 1\. The "Party" Concept

In our system, we use a standard industry pattern called "Party." A Party is the abstract parent of any entity we do business with.

* **[`party`](https://www.google.com/search?q=./api/party)**: The base record. A Party is either an **Individual** (a human) or an **Organization** (a business).

### 2\. Profiles (Roles)

A "Party" is just a name and an address. A "Profile" is what they *do*.

* **[`customer_profile`](https://www.google.com/search?q=./api/customer_profile)**: When a Party buys a car, they gain this profile. It holds data like preferences and buying history.
* **[`dealer_profile`](https://www.google.com/search?q=./api/dealer_profile)**: Represents a franchise location. Contains data like store hours, franchise codes, and certifications.
* **[`organization_profile`](https://www.google.com/search?q=./api/organization_profile)**: Represents a business entity that *isn't* a dealer (e.g., a Vendor supplying parts or a Bank providing loans).
* **[`staff`](https://www.google.com/search?q=./api/staff)**: (Linked to HR) Represents a human Party acting as an employee.

### 3\. Location & Discovery

* **[`dealer_locator`](https://www.google.com/search?q=./api/dealer_locator)**: APIs used by the public website to find the nearest dealership based on zip code or GPS.
* **[`dealer_locator_extended`](https://www.google.com/search?q=./api/dealer_locator_extended)**: Detailed metadata for the locator, including specific services offered (e.g., "Has EV Charging Station," "Body Shop on site").

-----

## 🔄 Key Functionality & Rules

The **[`/specs`](https://www.google.com/search?q=./specs)** folder details how we manage these identities.

* **Identity Resolution:** How we ensure we don't have duplicate records for the same person (e.g., "John Smith" vs "J. Smith").
* **GDPR/CCPA Compliance:** How we handle "Right to be Forgotten" and data privacy requests for Customer Profiles.
* **Role Assignment:** How a single `Party` (Person) can be both a `Customer` (bought a car) and `Staff` (works here) simultaneously without duplicating their personal data.

-----

## 🔗 Domain Relationships

[Image of entity relationship diagram customer profile]

The Identity domain is the foundation for almost every other part of the system. If PIM goes down, nobody knows who anyone is.

* **Sales (Deals):** A Deal cannot exist without linking to a `Customer Profile` (buyer) and a `Dealer Profile` (seller).
* **Finance (Invoices):** An Invoice requires a `Party` address to know where to send the bill.
* **Marketing:** Campaigns target specific lists of `Customer Profiles`.
* **HR:** Personnel records link back to the `Staff` identity established here.
* **Logistics:** Shipments use `Organization Profiles` to identify Vendor locations.

-----

## 🚀 Getting Started Checklist

If you are new to this specific domain, we recommend this order:

1.  **Understanding the Base:** Look at the **[`party`](https://www.google.com/search?q=./api/party)** schema first. Understand the distinction between an *Individual* and an *Organization*.
2.  **The Customer View:** Look at **[`customer_profile`](https://www.google.com/search?q=./api/customer_profile)** to see how we extend a basic person with retail data.
3.  **The Network:** Check out **[`dealer_locator`](https://www.google.com/search?q=./api/dealer_locator)** to see how we map our physical stores geographically.

*For questions regarding Data Privacy or Identity Security, please contact the Data Governance Lead.*