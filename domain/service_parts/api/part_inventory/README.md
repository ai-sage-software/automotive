## 🚗 STAR Automotive Retail Systems API (This API provides a standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration between Master Catalog systems, Inventory Management, and Financial Invoicing workflows. 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **ControlAccountReference**, **Identifier**, **PartInventory**, **PartInventoryEvent**, **PartInventoryMetric**, **PartReference**, **Price**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service_parts** and **PartInventory** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PartInventorie** | /part-inventories | Manages PartInventories |
    | **Identifier** | /part-inventories/{partInventoryKey}/identifiers | Manages Identifiers belonging to PartInventories |
    | **PartInventoryEvent** | /part-inventories/{partInventoryKey}/part-inventory-events | Manages PartInventoryEvents belonging to PartInventories |
    | **PartReference** | /part-inventories/{partInventoryKey}/part-references | Manages PartReferences belonging to PartInventories |
    | **Price** | /part-inventories/{partInventoryKey}/prices | Manages Prices belonging to PartInventories |
    | **EffectivePeriod** | /part-inventories/{partInventoryKey}/effective-periods | Manages EffectivePeriods belonging to PartInventories |
    | **ControlAccountReference** | /part-inventories/{partInventoryKey}/control-account-references | Manages ControlAccountReferences belonging to PartInventories |
    | **TimeSlot** | /part-inventories/{partInventoryKey}/time-slots | Manages TimeSlots belonging to PartInventories |
    | **PartInventoryMetric** | /part-inventories/{partInventoryKey}/part-inventory-metrics | Manages PartInventoryMetrics belonging to PartInventories |


---

## 🛠️ Getting Started 🧭

To begin using this API specification, choose your preferred path:
### A. Understanding this Directory 🔎

This directory contains openapi yaml files.  The openapi_monolith.yaml contains the complete schema, paths, etc.. with enhanced entities.
Enhanced entities are used for Create and Update operations.  This allows the transfer of information with many required fields which may not be available or needed for the operation.


| File Name | File Description |
| :--- | :--- |
| **openapi_monolith.yaml** |   contains the full API path and schema information |
| **openapi_path.yaml** |   contains only the API path information |
| **openapi_schema.yaml** |   contains only the schema information.  does not contain the enhanced entities |
| **openapi_schema_enriched.yaml** |   contains only the schema information with the enhanced enriched entities |



### B. Explore and Test the API 🔎

1.  **View the Interactive Docs:** Load the `openapi_monolith.yaml` file into an interactive tool like **Swagger UI**, **Redoc**, or **Postman** to browse endpoints, schemas, and test calls.
2.  **Make a First Call:** To retrieve the base list of resources, you can make an unauthenticated **GET** request to:
> `https://[Your-API-Host]/part-inventory`

### C. Integrate the API into Your Application 💻

1.  **Host the Specification:** Deploy the `openapi_monolith.yaml` file to your server or API gateway.
2.  **Generate Client Code:** Use tools like **Swagger Codegen** or **OpenAPI Generator** to automatically generate client libraries in your preferred programming language, accelerating your integration.


Here are some public web tools that may offer further assistance:

| Tool Name | URL for Web Version | Purpose |
| :--- | :--- | :--- |
| **Swagger Editor** | `https://editor.swagger.io/` | For designing, editing, and validating your `openapi.yaml` in real-time. |
| **Postman** (Web App) | `https://app.getpostman.com/` | For importing your `openapi.yaml` to create a test collection, making requests, and collaborative testing. (Requires sign-in) |
| **Redocly** (Live Demo) | `https://redoc.ly/redoc/` | For viewing a beautiful, production-quality rendering of any OpenAPI document via its URL. |
| **Swagger UI** (Pet Store Demo) | `https://petstore.swagger.io/` | A live example of how Swagger UI renders an OpenAPI spec, where you can "Try It Out" against a live sample API. |

***

### 📝 Important Note

Most production implementations of **Swagger UI** and **Redocly** are typically **hosted by the API provider itself**.

They take the open-source code and host it at a URL like `https://api.yourcompany.com/docs` or `https://yourcompany.com/swagger`. The official **Swagger UI** link provided above is primarily a demo environment.

---

## 🔒 Authentication & Authorization

        *Note: Details on authentication (e.g., API Keys, OAuth 2.0) will be defined here.*

    ---

    ## 🔑 Key Concepts & Schemas

---

The API is built upon core entities, defined in the /components/schemas/ section of the OpenAPI file.
## 💠 Enums

---

💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **InventoryStatusTypes** : types of inventory status.<br/>
💠 **PartInventoryMetricTypes** : types of part inventory metrics.<br/>
💠 **PartInventoryOrderTypes** : types of part inventory orders.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductTypes** : types of products.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : Effective Period<br/>
✅ **TimeSlot** : Range of time for the appointment including start/end times, recurring patterns, and directives.<br/>

---

## ✨ API Endpoints Summary

The API utilizes standard **CRUD** (Create, Read, Update, Delete) operations across its resources.


<style>
    /* You would ideally put this CSS in a separate .css file
       and link it to your markdown renderer, but inline is shown for demonstration. */

    .api-endpoint-row {
        display: flex; /* Use flexbox for alignment */
        align-items: center; /* Vertically center items */
        background-color: #f0f4f8; /* Light blue-grey background for the row */
        padding: 10px 15px;
        border-radius: 5px;
        margin-bottom: 10px; /* Space between rows */
        font-family: Arial, sans-serif; /* Example font */
        box-shadow: 0 1px 3px rgba(0,0,0,0.1); /* Subtle shadow */
    }

    .api-method-button {
        padding: 6px 12px;
        border-radius: 5px; /* Rounded corners for the "button" */
        color: white;
        font-weight: bold;
        font-size: 0.9em;
        margin-right: 15px;
        text-transform: uppercase;
        flex-shrink: 0; /* Don't allow the button to shrink */
    }

    .method-get {background-color: #61affe; }
    .method-post {background-color: #49cc90; }
    .method-put {background-color: #fca130; }

    .method-patch {background-color: #50e3c2; }
    .method-delete {background-color: #f93e3e; }
    .method-head {background-color: #9012fe; }


    /* You would add .method-post { background-color: #f0ad4e; } for yellow POST, etc. */

    .api-path-summary {
        display: flex;
        flex-direction: column; /* Stack path and summary vertically if needed, or keep them inline */
        flex-grow: 1; /* Allow this section to take up available space */
    }

    .api-path {
        font-family: 'Courier New', monospace; /* Monospace for path */
        font-weight: bold;
        font-size: 1.1em;
        color: #333;
        margin-bottom: 2px; /* Small space between path and summary */
    }

    .api-summary {
        font-size: 0.95em;
        color: #555;
    }

    /* If you want path and summary to be strictly on one line, use: */
    .api-path-summary {
        display: inline; /* Or remove flex-direction: column from above */
    }
    .api-path {
        display: inline-block;
        margin-right: 10px; /* Space between path and summary */
        margin-bottom: 0;
    }
    .api-summary {
        display: inline-block;
    }

</style>
### 🏛️ Dealer Endpoints


### /part-inventories
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories</span> <br/>
        <span class="api-summary">Retrieve a list of PartInventory entities. getPartInventory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories</span> <br/>
        <span class="api-summary">Create a new PartInventory entity. createPartInventory</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartInventory entity. getartInventoryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}</span> <br/>
        <span class="api-summary">Replace a PartInventory entity. replacePartInventory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}</span> <br/>
        <span class="api-summary">Partially update a PartInventory entity. updatePartInventory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}</span> <br/>
        <span class="api-summary">Delete a PartInventory entity deletePartInventoryEntity</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by partInventoryKey. getIdentifierByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-inventory-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events</span> <br/>
        <span class="api-summary">Retrieve a list of PartInventoryEvent entities scoped by partInventoryKey. getPartInventoryEventByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events</span> <br/>
        <span class="api-summary">Create a new PartInventoryEvent entity. createPartInventoryEvent</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-inventory-events/{partInventoryEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events/{partInventoryEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartInventoryEvent entity. getartInventoryEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events/{partInventoryEventKey}</span> <br/>
        <span class="api-summary">Replace a PartInventoryEvent entity. replacePartInventoryEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events/{partInventoryEventKey}</span> <br/>
        <span class="api-summary">Partially update a PartInventoryEvent entity. updatePartInventoryEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events/{partInventoryEventKey}</span> <br/>
        <span class="api-summary">Delete a PartInventoryEvent entity deletePartInventoryEventEntity</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartReference entities scoped by partInventoryKey. getPartReferenceByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references</span> <br/>
        <span class="api-summary">Create a new PartReference entity. createPartReference</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-references/{partReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartReference entity. getartReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartReference entity. replacePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartReference entity. updatePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartReference entity deletePartReferenceEntity</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by partInventoryKey. getPriceByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price entity. createPrice</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price entity. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price entity. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price entity deletePriceEntity</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by partInventoryKey. getEffectivePeriodByPartInventoryKey</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod entity. replaceEffectivePeriod</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference entities scoped by partInventoryKey. getControlAccountReferenceByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference entity. createControlAccountReference</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference entity. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference entity. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference entity. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference entity deleteControlAccountReferenceEntity</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by partInventoryKey. getTimeSlotByPartInventoryKey</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot entity. replaceTimeSlot</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-inventory-metrics
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics</span> <br/>
        <span class="api-summary">Retrieve a list of PartInventoryMetric entities scoped by partInventoryKey. getPartInventoryMetricByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics</span> <br/>
        <span class="api-summary">Create a new PartInventoryMetric entity. createPartInventoryMetric</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-inventory-metrics/{partInventoryMetricKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics/{partInventoryMetricKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartInventoryMetric entity. getartInventoryMetricById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics/{partInventoryMetricKey}</span> <br/>
        <span class="api-summary">Replace a PartInventoryMetric entity. replacePartInventoryMetric</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics/{partInventoryMetricKey}</span> <br/>
        <span class="api-summary">Partially update a PartInventoryMetric entity. updatePartInventoryMetric</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics/{partInventoryMetricKey}</span> <br/>
        <span class="api-summary">Delete a PartInventoryMetric entity deletePartInventoryMetricEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PartInventoryroot with key {PartInventoryKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **part-inventorie** | /part-inventories | listPartInventory | createPartInventory | getPartInventory | updatePartInventory | deletePartInventory |
    | **identifier** | /part-inventories/{partInventoryKey}/identifiers | listIdentifierByPartInventoryKey | createIdentifier | getIdentifierByPartInventoryKey | updateIdentifierByPartInventoryKey | deleteIdentifierByPartInventoryKey |
    | **part-inventory-event** | /part-inventories/{partInventoryKey}/part-inventory-events | listPartInventoryEventByPartInventoryKey | createPartInventoryEvent | getPartInventoryEventByPartInventoryKey | updatePartInventoryEventByPartInventoryKey | deletePartInventoryEventByPartInventoryKey |
    | **part-reference** | /part-inventories/{partInventoryKey}/part-references | listPartReferenceByPartInventoryKey | createPartReference | getPartReferenceByPartInventoryKey | updatePartReferenceByPartInventoryKey | deletePartReferenceByPartInventoryKey |
    | **price** | /part-inventories/{partInventoryKey}/prices | listPriceByPartInventoryKey | createPrice | getPriceByPartInventoryKey | updatePriceByPartInventoryKey | deletePriceByPartInventoryKey |
    | **effective-period** | /part-inventories/{partInventoryKey}/effective-periods | listEffectivePeriodByPartInventoryKey |  | getEffectivePeriodByPartInventoryKey | updateEffectivePeriodByPartInventoryKey | deleteEffectivePeriodByPartInventoryKey |
    | **control-account-reference** | /part-inventories/{partInventoryKey}/control-account-references | listControlAccountReferenceByPartInventoryKey | createControlAccountReference | getControlAccountReferenceByPartInventoryKey | updateControlAccountReferenceByPartInventoryKey | deleteControlAccountReferenceByPartInventoryKey |
    | **time-slot** | /part-inventories/{partInventoryKey}/time-slots | listTimeSlotByPartInventoryKey |  | getTimeSlotByPartInventoryKey | updateTimeSlotByPartInventoryKey | deleteTimeSlotByPartInventoryKey |
    | **part-inventory-metric** | /part-inventories/{partInventoryKey}/part-inventory-metrics | listPartInventoryMetricByPartInventoryKey | createPartInventoryMetric | getPartInventoryMetricByPartInventoryKey | updatePartInventoryMetricByPartInventoryKey | deletePartInventoryMetricByPartInventoryKey |

***Note on List Operations:***

*List operations support pagination using the query parameters:
**limit** (max 100, default 50)
**cursor** last id processed

---

## ⚠️ Common Responses

Standard HTTP status codes are used to indicate the outcome of an operation:

| Status Code | Description | Reference |
| :--- | :--- | :--- |
    | **200 OK** | Successful retrieval, replacement, or partial update. | #/components/responses/OK (Implied) |
    | **201 Created** | Successful creation of a new resource. Includes a Location header. | #/components/responses/Created (Implied) |
    | **204 No Content** | Successful deletion. | #/components/responses/NoContent (Implied) |
    | **400 Bad Request** | The request was malformed or invalid. | #/components/responses/BadRequestError |
    | **401 Unauthorized** | Authentication credentials were missing or invalid. | #/components/responses/UnauthorizedError |
    | **404 Not Found** | The requested resource could not be found. | #/components/responses/NotFoundError |
    | **409 Conflict** | The request conflicts with the current state of the target resource (e.g., duplicate creation). | #/components/responses/ConflictError |
    | **500 Server Error** | An unexpected error occurred on the server. | #/components/responses/ServerError |

*Explore with Tools:** Load the specification into tools like **Swagger UI**, **Redoc**, or **Postman** for interactive documentation and testing.