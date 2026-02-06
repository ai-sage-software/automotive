## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **FinancialSplitReference**, **GeographicBoundaryReference**, **Identifier**, **PricePlan**, **PriceSensitivity**, **ProductScheduleReference**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **subscriptions** and **PricePlan** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PricePlan** | /price-plans | Manages PricePlans |
    | **ProductScheduleReference** | /price-plans/{pricePlanKey}/product-schedule-references | Manages ProductScheduleReferences belonging to PricePlans |
    | **Identifier** | /price-plans/{pricePlanKey}/identifiers | Manages Identifiers belonging to PricePlans |
    | **GeographicBoundaryReference** | /price-plans/{pricePlanKey}/geographic-boundary-references | Manages GeographicBoundaryReferences belonging to PricePlans |
    | **PriceSensitivitie** | /price-plans/{pricePlanKey}/price-sensitivities | Manages PriceSensitivities belonging to PricePlans |
    | **EffectivePeriod** | /price-plans/{pricePlanKey}/effective-periods | Manages EffectivePeriods belonging to PricePlans |
    | **FinancialSplitReference** | /price-plans/{pricePlanKey}/financial-split-references | Manages FinancialSplitReferences belonging to PricePlans |
    | **TimeSlot** | /price-plans/{pricePlanKey}/time-slots | Manages TimeSlots belonging to PricePlans |


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
> `https://[Your-API-Host]/priceplans`

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

        *Note: Details on authentication (e.g., API Keys, OAuth 2.0) will be defined in the security_readme.md.*

    ---

    ## 🔑 Key Concepts & Schemas

---

The API is built upon core entities, defined in the /components/schemas/ section of the OpenAPI file.
## 💠 Enums

---

💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **PriceClassTypes** : types of price class.<br/>
💠 **PriceSensitivityTypes** : types of price sensitivitys.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ResourceTypes** : types of resources.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : effective.period.desc<br/>
✅ **TimeSlot** : time.slot.desc<br/>

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


### /price-plans
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans</span> <br/>
        <span class="api-summary">Retrieve a list of PricePlan entities. getPricePlan</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans</span> <br/>
        <span class="api-summary">Create a new PricePlan entity. createPricePlan</span>
    </span>
</div>

### /price-plans/{pricePlanKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlan entity. getricePlanById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}</span> <br/>
        <span class="api-summary">Replace a PricePlan entity. replacePricePlan</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlan entity. updatePartialPricePlan</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}</span> <br/>
        <span class="api-summary">Delete a PricePlan entity deletePricePlanEntity</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/product-schedule-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references</span> <br/>
        <span class="api-summary">Retrieve a list of ProductScheduleReference entities scoped by pricePlanKey. getProductScheduleReferenceByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references</span> <br/>
        <span class="api-summary">Create a new ProductScheduleReference entity. createProductScheduleReference</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/product-schedule-references/{productScheduleReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references/{productScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ProductScheduleReference entity. getroductScheduleReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references/{productScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ProductScheduleReference entity. replaceProductScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references/{productScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ProductScheduleReference entity. updatePartialProductScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references/{productScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ProductScheduleReference entity deleteProductScheduleReferenceEntity</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by pricePlanKey. getIdentifierByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updatePartialIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/geographic-boundary-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references</span> <br/>
        <span class="api-summary">Retrieve a list of GeographicBoundaryReference entities scoped by pricePlanKey. getGeographicBoundaryReferenceByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references</span> <br/>
        <span class="api-summary">Create a new GeographicBoundaryReference entity. createGeographicBoundaryReference</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific GeographicBoundaryReference entity. geteographicBoundaryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a GeographicBoundaryReference entity. replaceGeographicBoundaryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a GeographicBoundaryReference entity. updatePartialGeographicBoundaryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a GeographicBoundaryReference entity deleteGeographicBoundaryReferenceEntity</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/price-sensitivities
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities</span> <br/>
        <span class="api-summary">Retrieve a list of PriceSensitivity entities scoped by pricePlanKey. getPriceSensitivityByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities</span> <br/>
        <span class="api-summary">Create a new PriceSensitivity entity. createPriceSensitivity</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/price-sensitivities/{priceSensitivityKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities/{priceSensitivityKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PriceSensitivity entity. getriceSensitivityById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities/{priceSensitivityKey}</span> <br/>
        <span class="api-summary">Replace a PriceSensitivity entity. replacePriceSensitivity</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities/{priceSensitivityKey}</span> <br/>
        <span class="api-summary">Partially update a PriceSensitivity entity. updatePartialPriceSensitivity</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities/{priceSensitivityKey}</span> <br/>
        <span class="api-summary">Delete a PriceSensitivity entity deletePriceSensitivityEntity</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by pricePlanKey. getEffectivePeriodByPricePlanKey</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/financial-split-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplitReference entities scoped by pricePlanKey. getFinancialSplitReferenceByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references</span> <br/>
        <span class="api-summary">Create a new FinancialSplitReference entity. createFinancialSplitReference</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/financial-split-references/{financialSplitReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplitReference entity. getinancialSplitReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplitReference entity. replaceFinancialSplitReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplitReference entity. updatePartialFinancialSplitReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplitReference entity deleteFinancialSplitReferenceEntity</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by pricePlanKey. getTimeSlotByPricePlanKey</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PricePlanroot with key {PricePlanKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **price-plan** | /price-plans | listPricePlan | createPricePlan | getPricePlan | updatePricePlan | deletePricePlan |
    | **product-schedule-reference** | /price-plans/{pricePlanKey}/product-schedule-references | listProductScheduleReferenceByPricePlanKey | createProductScheduleReference | getProductScheduleReferenceByPricePlanKey | updateProductScheduleReferenceByPricePlanKey | deleteProductScheduleReferenceByPricePlanKey |
    | **identifier** | /price-plans/{pricePlanKey}/identifiers | listIdentifierByPricePlanKey | createIdentifier | getIdentifierByPricePlanKey | updateIdentifierByPricePlanKey | deleteIdentifierByPricePlanKey |
    | **geographic-boundary-reference** | /price-plans/{pricePlanKey}/geographic-boundary-references | listGeographicBoundaryReferenceByPricePlanKey | createGeographicBoundaryReference | getGeographicBoundaryReferenceByPricePlanKey | updateGeographicBoundaryReferenceByPricePlanKey | deleteGeographicBoundaryReferenceByPricePlanKey |
    | **price-sensitivitie** | /price-plans/{pricePlanKey}/price-sensitivities | listPriceSensitivityByPricePlanKey | createPriceSensitivity | getPriceSensitivityByPricePlanKey | updatePriceSensitivityByPricePlanKey | deletePriceSensitivityByPricePlanKey |
    | **effective-period** | /price-plans/{pricePlanKey}/effective-periods | listEffectivePeriodByPricePlanKey |  | getEffectivePeriodByPricePlanKey | updateEffectivePeriodByPricePlanKey | deleteEffectivePeriodByPricePlanKey |
    | **financial-split-reference** | /price-plans/{pricePlanKey}/financial-split-references | listFinancialSplitReferenceByPricePlanKey | createFinancialSplitReference | getFinancialSplitReferenceByPricePlanKey | updateFinancialSplitReferenceByPricePlanKey | deleteFinancialSplitReferenceByPricePlanKey |
    | **time-slot** | /price-plans/{pricePlanKey}/time-slots | listTimeSlotByPricePlanKey |  | getTimeSlotByPricePlanKey | updateTimeSlotByPricePlanKey | deleteTimeSlotByPricePlanKey |

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


## Batch Processing

## Bulk Create PricePlan (`POST /priceplans/batch`)

The `/priceplans/batch` endpoint allows you to create multiple PricePlan entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of PricePlan and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `PricePlanCreate` schema.

**Example Request Body:**

```json
{
"items": [
{ "name": "Widget A", "sku": "W-001", "price": 10.99 },
{ "name": "Widget B", "sku": "W-002", "price": 15.50 }
]
}

```

---

### Response Handling

The API returns a `200 OK` status code once the batch has been processed. The response body categorizes the results into two arrays: `succeeded` and `failed`.

#### 1. Succeeded Array

Contains the full objects of the PricePlan that were successfully created, including server-generated fields like `id` or `createdAt`.

#### 2. Failed Array

Contains error objects for items that could not be processed. Each error object includes:

* **`index`**: The zero-based position of the item in your original request array (to help you identify which specific entry failed).
* **`error`**: A detailed explanation of why the creation failed (e.g., validation errors or duplicate SKUs).

**Example Response Body:**

```json
{
"succeeded": [
{ "id": "123", "name": "Widget A", "sku": "W-001", "price": 10.99 }
],
"failed": [
{
"index": 1,
"error": {
"code": "DUPLICATE_SKU",
"message": "A PricePlan with SKU W-002 already exists."
}
}
]
}

```

---

### Best Practices

* **Chunking:** If you have 500 items to create, split them into 5 separate requests of 100 items each.
* **Idempotency:** Ensure your client handles the `failed` array appropriately. You may want to correct the data and retry only the failed indices.
* **Transactional Safety:** Note that this endpoint is **not** atomic. If 50 items succeed and 50 fail, the 50 successful items remain in the database.

## Health Check (`GET /priceplans/health`)

The `/priceplans/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the PricePlan aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

### Response Structure

A successful health check returns a `200 OK` status with a JSON object detailing the service status and metadata.

| Property | Type | Description |
| --- | --- | --- |
| **`status`** | `string` | The current state of the service. (See [Status Codes](https://www.google.com/search?q=%23status-codes)) |
| **`version`** | `string` | The version of the ontology/API currently implemented. |
| **`timestamp`** | `string` | The current server time in ISO-8601 format. |

---

### Status Codes

The `status` field will return one of the following values:

* **`up`**: The service is fully operational and reachable.
* **`down`**: The service is experiencing an outage or critical failure.
* **`maintenance`**: The service is intentionally offline for scheduled updates or repairs.

**Example Response:**

```json
{
"status": "up",
"version": "1.0.0",
"timestamp": "2025-12-21T23:00:00Z"
}

```

---

### Common Use Cases

* **Load Balancing**: Configure your load balancer to poll this endpoint. If the status is anything other than `up`, the balancer can automatically route traffic away from the unhealthy instance.
* **CI/CD Pipelines**: After a deployment, scripts can poll this endpoint to confirm the new version is live and reporting a healthy status before finalizing the rollout.
* **Integration Debugging**: Quickly verify that the network path to the API is open without needing to send complex, authenticated requests.

## PricePlan Commands and State Management

The priceplans API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /priceplans/{PricePlanKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a PricePlan (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /priceplans/{PricePlanKey}/commands/{commandId}`)

For asynchronous commands, use this endpoint to track progress.

* **`progress`**: An integer (0-100) indicating how far along the background task is.
* **`status`**: Watch for `SUCCESS` to retrieve the final `result` object, or `FAILED` to inspect the `errors` array.
* **`REQUIRES_ACTION`**: This status indicates the workflow is paused and needs user intervention or additional data to proceed.

**Polling Logic Example:**

1. Submit Command  receive `commandId`.
2. If status is `PROCESSING`, wait  seconds (defined by `retry_after`).
3. Fetch status via `GET`.
4. Repeat until terminal state (`SUCCESS` or `FAILED`).

---

### 3. Capability Discovery (`GET /priceplans/capabilities`)

Before sending a command, you can "discover" what actions are valid for a PricePlan based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the PricePlan must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelPricePlan` | `CREATED`, `ACTIVE` | `DELETED` | Voids the PricePlan . |
| `ActivatePricePlan` | `PENDING` | `ACTIVE` | Moves a PricePlan into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |
