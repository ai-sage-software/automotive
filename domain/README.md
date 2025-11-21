
-----

# Automotive Retail Platform: Domain Index

Welcome to the central documentation hub for the Automotive Retail Platform.

Think of these Domains like departments in a real car dealership: The people selling cars (Sales) don't need to worry about how the mechanics organize their tools (Service), but they do need to talk to each other occasionally.

This document lists every Domain in the system, what it does, and links to its specific documentation.

-----

## 1\. Identity & Core Reference

*The "Who" of our system. These domains handle the people and organizations involved.*

### 📂 [Party & Identity Management (PIM)](https://github.com/ai-sage-software/automotive/tree/main/domain/party_identity/README.md)

**"The Global Address Book"**
This is the single source of truth for every person or company we interact with. whether they are a Customer, a Dealer, a Staff member, or a Vendor, their profile lives here.

* **Key Concepts:** Customer Profiles, Dealer Locators, Organization structures.

-----

## 2\. Core Assets & Operations

*The "What" and "How." These are the bread-and-butter operations of a dealership.*

### 📂 [Inventory & Vehicle Management](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/inventory_vehicle/README.md)

**" The Virtual Garage"**
This domain tracks the physical vehicles. It handles what cars we have, where they are stored (Warehouses), and their specific configurations (Model Codes, Specs).

### 📂 [Sales & Dealership Operations](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/sales_operations/README.md)

**"The Showroom Floor"**
Everything related to selling a car. This handles the "Deal," managing leads (potential customers), and reporting the sale to the manufacturer (RDR).

### 📂 [Service, Repair & Parts](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/service_parts/README.md)

**"The Workshop"**
The most complex operational domain. It manages the service bay, scheduling appointments, fixing cars (Repair Orders), and managing the inventory of spare parts (ordering, stocking, and pricing).

-----

## 3\. Financial & Support Services

*The "Money" and "Back Office." These domains support the core operations.*

### 📂 [Financial & Payments](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/README.md)

**"The Ledger"**
The central nervous system for money. It handles Invoicing, collecting Payments, and recording every financial transaction into the General Ledger.

* **Note:** This interacts heavily with Sales and Service.

### 📂 [Human Resources](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/human_resources/README.md)

**"Staff Management"**
Manages the people who work here. It handles Personnel records, Time & Attendance tracking, and Payroll processing.

### 📂 [Marketing & Loyalty](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/marketing_loyalty/README.md)

**"Customer Engagement"**
Responsible for reaching out to customers. This includes managing Marketing Campaigns and analyzing Vehicle e-Marketing data.

### 📂 [Incentives & Programs](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/incentives_programs/README.md)

**"Discounts & Rules"**
Manages manufacturer programs and rebates. If there is a special "Summer Sales Event" or a rebate for a specific vehicle model, the rules and logic live here.

### 📂 [Warranty & Insurance](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/warranty_insurance/README.md)

**"Claims Processing"**
Handles the submission and validation of Warranty Claims when a vehicle needs repair covered by the manufacturer.

### 📂 [Subscription Management](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/subscriptions/README.md)

**"Recurring Services"**
Manages on-going services that customers subscribe to, rather than buy once (e.g., monthly maintenance plans or software features).

-----

## 4\. Logistics & Telematics

*The "Movement" and "Data."*

### 📂 [Logistics & Fulfillment](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/logistics_fulfillment/README.md)

**"Shipping & Receiving"**
Handles moving things from Point A to Point B. This includes transferring vehicles between dealerships and managing shipments of spare parts.

### 📂 [Telematics & Vehicle Events](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/telematics_vehicle_events/README.md)

**"The Connected Car"**
Handles real-time data coming *from* the vehicles. This includes the Vehicle State (health, mileage) and data availability.

-----

## 5\. Shared Kernel

*The "glue" that holds it all together.*

### 📂 [Core & Common Entities](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/core_common/README.md)

**"The Dictionary"**
Contains data standards used by *everyone*. If you are looking for standard definitions of currency (Money), dates, units of measure, or geography, look here.

-----

## 💡 How to Read the Documentation

Inside each Domain folder linked above, you will generally find:

1.  **API Definitions:** The technical schemas for the data.
2.  **Lifecycle Specs:** Rules explaining how data changes over time.
3.  **Model Diagrams:** Visual maps of that specific area.

*If you are unsure where to start, we recommend reading the **[Party & Identity](https://github.com/ai-sage-software/automotive/tree/main/domain/domains/party_identity/README.md)** documentation first, as almost every other domain relies on it.*