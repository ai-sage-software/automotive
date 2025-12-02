## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **ControlAccountReference**, **Identifier**, **PartInventory**, **PartInventoryEvent**, **PartInventoryMetric**, **PartReference**, **Price**.

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
        <span class="api-summary">Retrieve a list of all PartInventory records. getPartInventorys</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories</span> <br/>
        <span class="api-summary">Create a new PartInventory record. createPartInventory</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartInventory record. getartInventoryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}</span> <br/>
        <span class="api-summary">Replace a PartInventory record. replacePartInventory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}</span> <br/>
        <span class="api-summary">Partially update a PartInventory record. updatePartInventory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}</span> <br/>
        <span class="api-summary">Delete a PartInventory Record deletePartInventoryRecord</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by partInventoryKey. getIdentifiersByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-inventory-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events</span> <br/>
        <span class="api-summary">Retrieve a list of PartInventoryEvent records scoped by partInventoryKey. getPartInventoryEventsByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events</span> <br/>
        <span class="api-summary">Create a new PartInventoryEvent record. createPartInventoryEvent</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-inventory-events/{partInventoryEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events/{partInventoryEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartInventoryEvent record. getartInventoryEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events/{partInventoryEventKey}</span> <br/>
        <span class="api-summary">Replace a PartInventoryEvent record. replacePartInventoryEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events/{partInventoryEventKey}</span> <br/>
        <span class="api-summary">Partially update a PartInventoryEvent record. updatePartInventoryEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-events/{partInventoryEventKey}</span> <br/>
        <span class="api-summary">Delete a PartInventoryEvent Record deletePartInventoryEventRecord</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartReference records scoped by partInventoryKey. getPartReferencesByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references</span> <br/>
        <span class="api-summary">Create a new PartReference record. createPartReference</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-references/{partReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartReference record. getartReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartReference record. replacePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartReference record. updatePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartReference Record deletePartReferenceRecord</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price records scoped by partInventoryKey. getPricesByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price record. createPrice</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price record. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price record. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price record. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price Record deletePriceRecord</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by partInventoryKey. getEffectivePeriodsByPartInventoryKey</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference records scoped by partInventoryKey. getControlAccountReferencesByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference record. createControlAccountReference</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference record. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference record. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference record. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference Record deleteControlAccountReferenceRecord</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot records scoped by partInventoryKey. getTimeSlotsByPartInventoryKey</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot record. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot record. replaceTimeSlot</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-inventory-metrics
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics</span> <br/>
        <span class="api-summary">Retrieve a list of PartInventoryMetric records scoped by partInventoryKey. getPartInventoryMetricsByPartInventoryKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics</span> <br/>
        <span class="api-summary">Create a new PartInventoryMetric record. createPartInventoryMetric</span>
    </span>
</div>

### /part-inventories/{partInventoryKey}/part-inventory-metrics/{partInventoryMetricKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics/{partInventoryMetricKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartInventoryMetric record. getartInventoryMetricById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics/{partInventoryMetricKey}</span> <br/>
        <span class="api-summary">Replace a PartInventoryMetric record. replacePartInventoryMetric</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics/{partInventoryMetricKey}</span> <br/>
        <span class="api-summary">Partially update a PartInventoryMetric record. updatePartInventoryMetric</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-inventories/{partInventoryKey}/part-inventory-metrics/{partInventoryMetricKey}</span> <br/>
        <span class="api-summary">Delete a PartInventoryMetric Record deletePartInventoryMetricRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PartInventoryroot with key {PartInventoryKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **part-inventorie** | /part-inventories | listPartInventorys | createPartInventory | getPartInventorys | updatePartInventorys | deletePartInventorys |
    | **identifier** | /part-inventories/{partInventoryKey}/identifiers | listIdentifiersByPartInventoryKey | createIdentifier | getIdentifiersByPartInventoryKey | updateIdentifiersByPartInventoryKey | deleteIdentifiersByPartInventoryKey |
    | **part-inventory-event** | /part-inventories/{partInventoryKey}/part-inventory-events | listPartInventoryEventsByPartInventoryKey | createPartInventoryEvent | getPartInventoryEventsByPartInventoryKey | updatePartInventoryEventsByPartInventoryKey | deletePartInventoryEventsByPartInventoryKey |
    | **part-reference** | /part-inventories/{partInventoryKey}/part-references | listPartReferencesByPartInventoryKey | createPartReference | getPartReferencesByPartInventoryKey | updatePartReferencesByPartInventoryKey | deletePartReferencesByPartInventoryKey |
    | **price** | /part-inventories/{partInventoryKey}/prices | listPricesByPartInventoryKey | createPrice | getPricesByPartInventoryKey | updatePricesByPartInventoryKey | deletePricesByPartInventoryKey |
    | **effective-period** | /part-inventories/{partInventoryKey}/effective-periods | listEffectivePeriodsByPartInventoryKey |  | getEffectivePeriodsByPartInventoryKey | updateEffectivePeriodsByPartInventoryKey | deleteEffectivePeriodsByPartInventoryKey |
    | **control-account-reference** | /part-inventories/{partInventoryKey}/control-account-references | listControlAccountReferencesByPartInventoryKey | createControlAccountReference | getControlAccountReferencesByPartInventoryKey | updateControlAccountReferencesByPartInventoryKey | deleteControlAccountReferencesByPartInventoryKey |
    | **time-slot** | /part-inventories/{partInventoryKey}/time-slots | listTimeSlotsByPartInventoryKey |  | getTimeSlotsByPartInventoryKey | updateTimeSlotsByPartInventoryKey | deleteTimeSlotsByPartInventoryKey |
    | **part-inventory-metric** | /part-inventories/{partInventoryKey}/part-inventory-metrics | listPartInventoryMetricsByPartInventoryKey | createPartInventoryMetric | getPartInventoryMetricsByPartInventoryKey | updatePartInventoryMetricsByPartInventoryKey | deletePartInventoryMetricsByPartInventoryKey |

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