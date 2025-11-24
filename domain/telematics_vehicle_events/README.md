# Telematics & Vehicle Events

Welcome to the **Telematics & Vehicle Events** domain.

If you are new to the system, think of this domain as the **"Connected Car Data Hub."** This is the crucial intersection between the physical vehicle and the digital world. It manages the continuous stream of real-time data sent from the vehicle's onboard sensors and computer systems (e.g., location, engine status, diagnostic alerts).

This domain is essential for providing value-added services like remote diagnostics, safety features, and usage-based insurance, while also feeding critical diagnostic information to the Service domain.

-----

## 📂 How to Navigate This Directory

We have organized the information to distinguish between the raw data coming from the car and the standards used to manage it.

| Folder / Path | Description | Best For... |
| :--- | :--- | :--- |
| **[`/api`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance)** | **The Data Definitions.** Schemas for the Vehicle State, real-time events, and data accessibility entitlements. | Developers integrating with IoT or streaming data platforms. |
| **[`/specs`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs)** | **The Business Rules.** Logic for data filtering, event alerting thresholds (e.g., "low tire pressure"), and data retention policies. | Data Scientists and Compliance Teams. |
| **[`/examples`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/examples)** | **Sample Data.** Examples of vehicle telemetry packets, including GPS and diagnostic codes. | QA Testers and Data Analysts. |
| **[`/model_diagrams`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/model_diagrams)** | **Visual Maps.** Diagrams showing the path of data from the vehicle's ECU to the cloud platform. | Architects and Connectivity Engineers. |

-----

## 🛰️ Core Concepts (The API)

In the **[`/api`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance)** folder, you will find the components that define the data coming from the connected fleet.

### 1\. Real-Time Status

* **[`vehicle_state`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_state)**: The central Aggregate Root (AR). This provides the current status of the vehicle at any given moment, including key operational metrics like mileage, fuel level, battery charge, and ignition status.
* **[`vehicle_telematics`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_telematics)**: The stream of raw data points (events) sent periodically or triggered by specific actions (e.g., hard braking, engine light illumination).

### 2\. Data Entitlements

* **[`vehicle_data_availability`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_data_availability)**: Defines which data streams are available for a specific vehicle and for whom. This is crucial for privacy and managing which features are tied to active subscriptions.

-----

## 🚦 Event Processing (The Specs)

The **[`/specs`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/specs)** folder details how we process the continuous stream of raw data into actionable information.

* **Alert Thresholds:** Specs defining the logic for when a data point becomes an "event" (e.g., if oil temperature exceeds $250^{\circ}F$, trigger a critical alert).
* **Data Transformation:** Rules for converting proprietary Manufacturer/OEM codes into standardized **[Core](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/core_common/README.md)** domain error codes for universal use.
* **Privacy Controls:** Specs detailing how customer consent (from the **[Identity](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/party_identity/README.md)** domain) limits the recording or transmission of location-based data.

-----

## 🔗 Domain Relationships

Telematics is a producer domain; it feeds real-time insights that improve operations and customer safety in other domains.

* **Service, Repair & Parts:** The most direct consumer. Service uses `Vehicle State` and diagnostic events to proactively schedule maintenance or to pre-diagnose a vehicle before it arrives in the shop.
* **Subscriptions:** We check **[Subscription Management](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/subscriptions/README.md)** to ensure a customer is entitled to receive specific premium data services (like live traffic or remote locking).
* **Inventory & Vehicle Management:** Telematics provides verified, real-time mileage and location updates to the **[Inventory](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/inventory_vehicle/README.md)** record.
* **Warranty & Insurance:** Vehicle usage data (miles driven, driving behavior) can be used by the **[Warranty](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/warranty/README.md)** domain to validate claims or by external partners for usage-based insurance programs.

-----

## 🚀 Getting Started Checklist

If you are new to working with connected car data, this is where you start:

1.  **The Current Status:** Review the **[`vehicle_state`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_state)** schema to understand the most common and critical real-time data points.
2.  **The Raw Feed:** Look at **[`vehicle_telematics`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_telematics)** to see the structure of a raw event packet.
3.  **The Access Control:** Understand the rules in **[`vehicle_data_availability`](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/vehicle_data_availability)** to ensure you are only accessing data the customer has permitted.

*For questions about why a feature is not working in a specific car, check the **[Subscription Management](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/subscriptions/README.md)** domain to verify the active contract status.*