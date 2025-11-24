
-----

# Inventory & Vehicle Management

Welcome to the **Inventory & Vehicle Management** domain.

[Image of vehicle lifecycle diagram]

If you are new to the system, think of this domain as the **"Master Asset Registry."** This is the single source of truth for every physical vehicle the business owns, is expecting, or has sold.

This domain is critical because it connects the physical world (a car on the lot) to the digital world (a VIN record). It handles the vehicle's unique identity, its features, and its current location and availability.

-----

## 📂 How to Navigate This Directory

We have organized the information to distinguish between the core asset data and the necessary supporting descriptive data.

| Folder / Path | Description | Best For... |
| :--- | :--- | :--- |
| **[`/api`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance)** | **The Data Definitions.** Schemas for the Vehicle itself, its Specs, Inventory Status, and Ordering processes. | Developers needing VIN-level data or inventory counts. |
| **[`/specs`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs)** | **The Business Rules.** Logic for vehicle movement (check-in/check-out) and standard coding procedures. | Business Analysts and Inventory Managers. |
| **[`/examples`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/examples)** | **Sample Data.** Examples of vehicle spec sheets and incoming factory order data. | QA Testers and Data Scientists. |
| **[`/model_diagrams`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/model_diagrams)** | **Visual Maps.** Diagrams showing the inventory pipeline (from Order to Sold). | Architects and Process Trainers. |

-----

## 🚗 Core Concepts (The API)

In the **[`/api`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance)** folder, you will find the definitions that track the physical car and its attributes.

### 1\. The Core Asset

* **[`vehicle`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle)**: This is the actual car. It is tracked by its unique VIN (Vehicle Identification Number) and is the central Aggregate Root (AR) for all data related to that physical unit.
* **[`vehicle_inventory`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_inventory)**: Tracks the status and count. It answers questions like: "Is this vehicle currently available for sale?" and "How many 2024 Ford Explorers do we have in total?"

### 2\. Vehicle Description & Acquisition

These components define *what* the car is and *how* we acquired it.

* **[`vehicle_specifications`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_specifications)**: The detailed features of the car (Engine size, transmission type, interior color, trim level).
* **[`model_codes`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/model_codes)**: The standardized codes that identify the make and model (e.g., "T-100" or "Explorer XLT"). Used for consistent reporting.
* **[`vehicle_order`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_order)**: The record of the purchase request sent to the Manufacturer. It tracks expected delivery dates and configuration requests.

### 3\. Standards & Location

* **[`warehouse`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/warehouse)**: Defines the physical locations where vehicles are stored (e.g., Dealership Lot A, Off-Site Storage Facility).
* **[`standards`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/standards)** / **[`standard_codes`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/standard_codes)**: Industry-wide codes used to classify options and features for consistency when dealing with external partners.

-----

## 🏗️ The Inventory Lifecycle (The Specs)

The **[`/specs`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs)** folder details the flow of a car through the system.

* **Order to Receipt:** The process of validating a vehicle when it arrives from the factory and formally adding it to the available `Vehicle Inventory`.
* **Status Changes:** The rules governing when a vehicle status flips from `In Transit` to `On Lot` to `Test Driven` to `Deal Pending`.
* **Title & Registration:** The required documentation and data needed to transfer legal ownership of the `Vehicle`.

-----

## 🔗 Domain Relationships

Inventory is consumed by Sales and serviced by the rest of the business.

* **Sales (Dealership Ops):** The Sales domain requires `Vehicle Inventory` to know what to sell. A **[Deal](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/sales_operations/README.md)** is finalized only after reserving a specific `Vehicle`.
* **Service, Repair & Parts:** The Service domain uses the `Vehicle` record to look up past **[Service History](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/service_parts/README.md)** and required `Vehicle Specifications` (e.g., correct oil filter type).
* **Logistics & Fulfillment:** Vehicle `Warehouse` location and `Vehicle Inventory` status are essential for processing a **[Vehicle Transfer Order](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/logistics/README.md)** between dealerships.
* **Incentives & Programs:** Incentives check `Model Codes` and `Vehicle Specifications` to determine if a car qualifies for a specific rebate.

-----

## 🚀 Getting Started Checklist

If you are new to working with car data, this is the place to start:

1.  **The Master Record:** Look at the **[`vehicle`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle)** schema to understand the most important fields attached to a VIN.
2.  **The Features:** Review **[`vehicle_specifications`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_specifications)**. This explains the descriptive detail that drives both the price and the user experience.
3.  **The Stock:** Look at **[`vehicle_inventory`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_inventory)** to understand the simple yet critical concept of availability.

*For questions about why a vehicle is showing an incorrect location, please check the **[Logistics](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/logistics/README.md)** transfer logs.*