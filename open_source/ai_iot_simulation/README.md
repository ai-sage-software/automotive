# Automotive

# AI IoT Simulation

Welcome to the **AI IoT Simulation** project documentation.

This project provides a robust, scalable framework for generating **synthetic, realistic vehicle telemetry and event data streams**. In a complex ecosystem like the Automotive Retail Platform, testing domains like **Telematics**, **Service**, and **Logistics** in a controlled environment is critical. This simulation tool allows developers and QA teams to test complex scenarios—like a fleet of vehicles simultaneously reporting low tire pressure or a specific VIN changing location—without needing physical hardware or live data feeds.

-----

## 🎯 Goal and Scope

The primary goal is to provide a reliable, high-volume source of data that mimics production vehicles, enabling comprehensive testing of downstream services.

### Key Capabilities

* **Mass Scale Simulation:** Ability to simulate thousands of distinct **Vehicle** IDs (VINs) simultaneously, generating data at configurable frequencies (e.g., 1 message per second per vehicle).
* **Scenario Generation:** Programmatic creation of specific, high-value events (e.g., triggering a collision alert, simulating a rapid drop in oil pressure, or initiating a tow request).
* **Data Reliability Testing:** Generating data with intentional errors or latency spikes to test how the **Telematics** domain handles network degradation and data quality issues.

-----

## 🛠️ Core Components

The simulator is built around the concept of a "Digital Twin" for each simulated vehicle.

### 1\. The Digital Twin Engine

This engine maintains the state of every simulated vehicle, ensuring consistency across events.

* **Vehicle State Management:** Tracks the simulated **[Vehicle State](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/telematics/README.md)** (mileage, fuel, location, ignition) in a persistence layer to ensure the next event generated is logically possible (e.g., mileage must increase over time).
* **VIN Generation Logic:** Utilizes standards from the **[Inventory](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/inventory_vehicle/README.md)** domain to generate valid, realistic VINs and corresponding **[Model Codes](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/inventory_vehicle/README.md)**.

### 2\. Event Publisher

This module handles the physical output of the simulated data stream.

* **Protocol Support:** Can publish events over multiple protocols (e.g., Kafka, MQTT, WebSockets) to directly integrate with the platform's ingest pipeline.
* **Frequency Control:** Allows users to set the heartbeat frequency for standard telemetry messages (e.g., location updates every 60 seconds).

### 3\. Scenario Scripts

Pre-built code that executes complex, multi-step actions on a fleet or a single VIN.

* **Service Diagnostics Script:** Simulates a vehicle generating a complex sequence of fault codes that would trigger a **[Service Appointment](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/service_parts/README.md)** recommendation.
* **Logistics Transfer Script:** Simulates a **[Vehicle Transfer Order](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/logistics/README.md)** by having a VIN travel between two defined **[Geographic Boundaries](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/core/README.md)** over a set time period.

-----

## 🔗 Integration and Usage

The simulation is primarily used to stress-test the **Telematics & Vehicle Events** domain and validate the business logic of its consumers.

* **Telematics Validation:** Confirms that the data ingestion pipeline can handle the volume, velocity, and variety of real-time vehicle data.
* **Service Logic Testing:** Ensures that automated service alerts (e.g., "Engine Light On") correctly trigger in the **Service** domain, creating the appropriate **[Service Order](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/service_parts/README.md)**.
* **Subscriptions Testing:** Used to verify that activation/deactivation signals from the **[Subscription Management](https://github.com/ai-sage-software/automotive/tree/main/domain/finance/domains/subscriptions/README.md)** domain correctly stop or start the data stream for a specific VIN.

### Configuration (YAML Example)

```yaml
simulation_id: "QA_Stress_Test_2025"
fleet_size: 5000
duration_minutes: 60
frequency_seconds: 5
output_topic: "telematics.raw_stream.dev"
scenarios:
  - name: "low_tire_pressure"
    vin_count: 50
    start_time: 15 # minutes
```

-----

## 🤝 Contributing

We welcome additions to the scenario library to cover more edge cases and failure modes. Please consult the root `CONTRIBUTING.md` for guidelines.

### Roadmap Focus Areas

* Integrating weather and road condition factors into the physics model for more accurate speed/location updates.
* Adding support for non-vehicle IoT devices (e.g., simulated warehouse sensors for the **Logistics** domain).
* Developing a visual interface for real-time monitoring of simulated fleet health.

<img src="https://github.com/ai-sage-software/automotive/blob/main/ai_sage.png">


 <br />
<a href="https://www.linkedin.com/in/eban-thomas-ai-sage/" > LinkedIn </a>