## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **AdvanceSearchValue**, **AdvancedSearchCriteria**, **Identifier**, **PartIdentifier**, **PartLifecycle**, **PartLogisticsCriteria**, **PartName**, **PartPriceCriteria**, **PartSearchCriteria**, **PartSpecification**, **SuperSession**, **WarehouseReference**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service_parts** and **PartSearchCriteria** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PartSearchCriteria** | /part-search-criteria | Manages PartSearchCriteria |
    | **UnitOfMeasure** | /part-search-criteria/{partSearchCriteriaKey}/unit-of-measures | Manages UnitOfMeasures belonging to PartSearchCriteria |
    | **PartSpecification** | /part-search-criteria/{partSearchCriteriaKey}/part-specifications | Manages PartSpecifications belonging to PartSearchCriteria |
    | **TimeSlot** | /part-search-criteria/{partSearchCriteriaKey}/time-slots | Manages TimeSlots belonging to PartSearchCriteria |
    | **AdvancedSearchCriteria** | /part-search-criteria/{partSearchCriteriaKey}/advanced-search-criteria | Manages AdvancedSearchCriteria belonging to PartSearchCriteria |
    | **PartPriceCriteria** | /part-search-criteria/{partSearchCriteriaKey}/part-price-criteria | Manages PartPriceCriteria belonging to PartSearchCriteria |
    | **Identifier** | /part-search-criteria/{partSearchCriteriaKey}/identifiers | Manages Identifiers belonging to PartSearchCriteria |
    | **PartName** | /part-search-criteria/{partSearchCriteriaKey}/part-names | Manages PartNames belonging to PartSearchCriteria |
    | **SuperSession** | /part-search-criteria/{partSearchCriteriaKey}/super-sessions | Manages SuperSessions belonging to PartSearchCriteria |
    | **AdvanceSearchValue** | /part-search-criteria/{partSearchCriteriaKey}/advance-search-values | Manages AdvanceSearchValues belonging to PartSearchCriteria |
    | **PartIdentifier** | /part-search-criteria/{partSearchCriteriaKey}/part-identifiers | Manages PartIdentifiers belonging to PartSearchCriteria |
    | **EffectivePeriod** | /part-search-criteria/{partSearchCriteriaKey}/effective-periods | Manages EffectivePeriods belonging to PartSearchCriteria |
    | **PartLogisticsCriteria** | /part-search-criteria/{partSearchCriteriaKey}/part-logistics-criteria | Manages PartLogisticsCriteria belonging to PartSearchCriteria |
    | **PartLifecycle** | /part-search-criteria/{partSearchCriteriaKey}/part-lifecycles | Manages PartLifecycles belonging to PartSearchCriteria |
    | **WarehouseReference** | /part-search-criteria/{partSearchCriteriaKey}/warehouse-references | Manages WarehouseReferences belonging to PartSearchCriteria |


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
> `https://[Your-API-Host]/part-search-criteria`

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

💠 **AdvanceSearchTypes** : types of advance searchs.<br/>
💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **PartConditionGradeTypes** : types of part condition grades.<br/>
💠 **PartConditionTypes** : types of part conditions.<br/>
💠 **PartIdentifierTypes** : types of part identifiers.<br/>
💠 **PartInventoryOrderTypes** : types of part inventory orders.<br/>
💠 **PartNameTypes** : types of part names.<br/>
💠 **PartOrderConfigTypes** : types of part order configs.<br/>
💠 **PartStatusTypes** : types of part status.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductConsumptionTypes** : types of product consumptions.<br/>
💠 **ProductPackageTypes** : types of product packages.<br/>
💠 **ProductStageTypes** : types of product stages.<br/>
💠 **ShippingMethodTypes** : types of shipping methods.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>
💠 **UOMLengthTypes** : types of u o m lengths.<br/>
💠 **UOMQuantityCategoryTypes** : types of u o m quantity categorys.<br/>
💠 **WarehouseTypes** : types of warehouses.<br/>
💠 **WarrantyTypes** : types of warrantys.<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : Effective Period<br/>
✅ **TimeSlot** : Range of time for the appointment including start/end times, recurring patterns, and directives.<br/>
✅ **UnitOfMeasure** : value price with unit of measure<br/>

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


### /part-search-criteria
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria</span> <br/>
        <span class="api-summary">Retrieve a list of PartSearchCriteria entities. getPartSearchCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria</span> <br/>
        <span class="api-summary">Create a new PartSearchCriteria entity. createPartSearchCriteria</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartSearchCriteria entity. getartSearchCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a PartSearchCriteria entity. replacePartSearchCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a PartSearchCriteria entity. updatePartSearchCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a PartSearchCriteria entity deletePartSearchCriteriaEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure entities scoped by partSearchCriteriaKey. getUnitOfMeasureByPartSearchCriteriaKey</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure entity. getnitOfMeasureById</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-specifications
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-specifications</span> <br/>
        <span class="api-summary">Retrieve a list of PartSpecification entities scoped by partSearchCriteriaKey. getPartSpecificationByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-specifications</span> <br/>
        <span class="api-summary">Create a new PartSpecification entity. createPartSpecification</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-specifications/{partSpecificationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartSpecification entity. getartSpecificationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Replace a PartSpecification entity. replacePartSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Partially update a PartSpecification entity. updatePartSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Delete a PartSpecification entity deletePartSpecificationEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by partSearchCriteriaKey. getTimeSlotByPartSearchCriteriaKey</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/advanced-search-criteria
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advanced-search-criteria</span> <br/>
        <span class="api-summary">Retrieve a list of AdvancedSearchCriteria entities scoped by partSearchCriteriaKey. getAdvancedSearchCriteriaByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advanced-search-criteria</span> <br/>
        <span class="api-summary">Create a new AdvancedSearchCriteria entity. createAdvancedSearchCriteria</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/advanced-search-criteria/{advancedSearchCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advanced-search-criteria/{advancedSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AdvancedSearchCriteria entity. getdvancedSearchCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advanced-search-criteria/{advancedSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a AdvancedSearchCriteria entity. replaceAdvancedSearchCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advanced-search-criteria/{advancedSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a AdvancedSearchCriteria entity. updateAdvancedSearchCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advanced-search-criteria/{advancedSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a AdvancedSearchCriteria entity deleteAdvancedSearchCriteriaEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-price-criteria
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-price-criteria</span> <br/>
        <span class="api-summary">Retrieve a list of PartPriceCriteria entities scoped by partSearchCriteriaKey. getPartPriceCriteriaByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-price-criteria</span> <br/>
        <span class="api-summary">Create a new PartPriceCriteria entity. createPartPriceCriteria</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-price-criteria/{partPriceCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-price-criteria/{partPriceCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartPriceCriteria entity. getartPriceCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-price-criteria/{partPriceCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a PartPriceCriteria entity. replacePartPriceCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-price-criteria/{partPriceCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a PartPriceCriteria entity. updatePartPriceCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-price-criteria/{partPriceCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a PartPriceCriteria entity deletePartPriceCriteriaEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by partSearchCriteriaKey. getIdentifierByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-names</span> <br/>
        <span class="api-summary">Retrieve a list of PartName entities scoped by partSearchCriteriaKey. getPartNameByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-names</span> <br/>
        <span class="api-summary">Create a new PartName entity. createPartName</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-names/{partNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartName entity. getartNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Replace a PartName entity. replacePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Partially update a PartName entity. updatePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Delete a PartName entity deletePartNameEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/super-sessions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/super-sessions</span> <br/>
        <span class="api-summary">Retrieve a list of SuperSession entities scoped by partSearchCriteriaKey. getSuperSessionByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/super-sessions</span> <br/>
        <span class="api-summary">Create a new SuperSession entity. createSuperSession</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/super-sessions/{superSessionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific SuperSession entity. getuperSessionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Replace a SuperSession entity. replaceSuperSession</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Partially update a SuperSession entity. updateSuperSession</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Delete a SuperSession entity deleteSuperSessionEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/advance-search-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advance-search-values</span> <br/>
        <span class="api-summary">Retrieve a list of AdvanceSearchValue entities scoped by partSearchCriteriaKey. getAdvanceSearchValueByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advance-search-values</span> <br/>
        <span class="api-summary">Create a new AdvanceSearchValue entity. createAdvanceSearchValue</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/advance-search-values/{advanceSearchValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advance-search-values/{advanceSearchValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AdvanceSearchValue entity. getdvanceSearchValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advance-search-values/{advanceSearchValueKey}</span> <br/>
        <span class="api-summary">Replace a AdvanceSearchValue entity. replaceAdvanceSearchValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advance-search-values/{advanceSearchValueKey}</span> <br/>
        <span class="api-summary">Partially update a AdvanceSearchValue entity. updateAdvanceSearchValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/advance-search-values/{advanceSearchValueKey}</span> <br/>
        <span class="api-summary">Delete a AdvanceSearchValue entity deleteAdvanceSearchValueEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartIdentifier entities scoped by partSearchCriteriaKey. getPartIdentifierByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-identifiers</span> <br/>
        <span class="api-summary">Create a new PartIdentifier entity. createPartIdentifier</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-identifiers/{partIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartIdentifier entity. getartIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartIdentifier entity. replacePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartIdentifier entity. updatePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartIdentifier entity deletePartIdentifierEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by partSearchCriteriaKey. getEffectivePeriodByPartSearchCriteriaKey</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-logistics-criteria
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-logistics-criteria</span> <br/>
        <span class="api-summary">Retrieve a list of PartLogisticsCriteria entities scoped by partSearchCriteriaKey. getPartLogisticsCriteriaByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-logistics-criteria</span> <br/>
        <span class="api-summary">Create a new PartLogisticsCriteria entity. createPartLogisticsCriteria</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-logistics-criteria/{partLogisticsCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-logistics-criteria/{partLogisticsCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartLogisticsCriteria entity. getartLogisticsCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-logistics-criteria/{partLogisticsCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a PartLogisticsCriteria entity. replacePartLogisticsCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-logistics-criteria/{partLogisticsCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a PartLogisticsCriteria entity. updatePartLogisticsCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-logistics-criteria/{partLogisticsCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a PartLogisticsCriteria entity deletePartLogisticsCriteriaEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-lifecycles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-lifecycles</span> <br/>
        <span class="api-summary">Retrieve a list of PartLifecycle entities scoped by partSearchCriteriaKey. getPartLifecycleByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-lifecycles</span> <br/>
        <span class="api-summary">Create a new PartLifecycle entity. createPartLifecycle</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/part-lifecycles/{partLifecycleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartLifecycle entity. getartLifecycleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Replace a PartLifecycle entity. replacePartLifecycle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Partially update a PartLifecycle entity. updatePartLifecycle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Delete a PartLifecycle entity deletePartLifecycleEntity</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/warehouse-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/warehouse-references</span> <br/>
        <span class="api-summary">Retrieve a list of WarehouseReference entities scoped by partSearchCriteriaKey. getWarehouseReferenceByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/warehouse-references</span> <br/>
        <span class="api-summary">Create a new WarehouseReference entity. createWarehouseReference</span>
    </span>
</div>

### /part-search-criteria/{partSearchCriteriaKey}/warehouse-references/{warehouseReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific WarehouseReference entity. getarehouseReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Replace a WarehouseReference entity. replaceWarehouseReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a WarehouseReference entity. updateWarehouseReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criteria/{partSearchCriteriaKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Delete a WarehouseReference entity deleteWarehouseReferenceEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PartSearchCriteriaroot with key {PartSearchCriteriaKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **part-search-criteria** | /part-search-criteria | listPartSearchCriteria | createPartSearchCriteria | getPartSearchCriteria | updatePartSearchCriteria | deletePartSearchCriteria |
    | **unit-of-measure** | /part-search-criteria/{partSearchCriteriaKey}/unit-of-measures | listUnitOfMeasureByPartSearchCriteriaKey |  | getUnitOfMeasureByPartSearchCriteriaKey | updateUnitOfMeasureByPartSearchCriteriaKey | deleteUnitOfMeasureByPartSearchCriteriaKey |
    | **part-specification** | /part-search-criteria/{partSearchCriteriaKey}/part-specifications | listPartSpecificationByPartSearchCriteriaKey | createPartSpecification | getPartSpecificationByPartSearchCriteriaKey | updatePartSpecificationByPartSearchCriteriaKey | deletePartSpecificationByPartSearchCriteriaKey |
    | **time-slot** | /part-search-criteria/{partSearchCriteriaKey}/time-slots | listTimeSlotByPartSearchCriteriaKey |  | getTimeSlotByPartSearchCriteriaKey | updateTimeSlotByPartSearchCriteriaKey | deleteTimeSlotByPartSearchCriteriaKey |
    | **advanced-search-criteria** | /part-search-criteria/{partSearchCriteriaKey}/advanced-search-criteria | listAdvancedSearchCriteriaByPartSearchCriteriaKey | createAdvancedSearchCriteria | getAdvancedSearchCriteriaByPartSearchCriteriaKey | updateAdvancedSearchCriteriaByPartSearchCriteriaKey | deleteAdvancedSearchCriteriaByPartSearchCriteriaKey |
    | **part-price-criteria** | /part-search-criteria/{partSearchCriteriaKey}/part-price-criteria | listPartPriceCriteriaByPartSearchCriteriaKey | createPartPriceCriteria | getPartPriceCriteriaByPartSearchCriteriaKey | updatePartPriceCriteriaByPartSearchCriteriaKey | deletePartPriceCriteriaByPartSearchCriteriaKey |
    | **identifier** | /part-search-criteria/{partSearchCriteriaKey}/identifiers | listIdentifierByPartSearchCriteriaKey | createIdentifier | getIdentifierByPartSearchCriteriaKey | updateIdentifierByPartSearchCriteriaKey | deleteIdentifierByPartSearchCriteriaKey |
    | **part-name** | /part-search-criteria/{partSearchCriteriaKey}/part-names | listPartNameByPartSearchCriteriaKey | createPartName | getPartNameByPartSearchCriteriaKey | updatePartNameByPartSearchCriteriaKey | deletePartNameByPartSearchCriteriaKey |
    | **super-session** | /part-search-criteria/{partSearchCriteriaKey}/super-sessions | listSuperSessionByPartSearchCriteriaKey | createSuperSession | getSuperSessionByPartSearchCriteriaKey | updateSuperSessionByPartSearchCriteriaKey | deleteSuperSessionByPartSearchCriteriaKey |
    | **advance-search-value** | /part-search-criteria/{partSearchCriteriaKey}/advance-search-values | listAdvanceSearchValueByPartSearchCriteriaKey | createAdvanceSearchValue | getAdvanceSearchValueByPartSearchCriteriaKey | updateAdvanceSearchValueByPartSearchCriteriaKey | deleteAdvanceSearchValueByPartSearchCriteriaKey |
    | **part-identifier** | /part-search-criteria/{partSearchCriteriaKey}/part-identifiers | listPartIdentifierByPartSearchCriteriaKey | createPartIdentifier | getPartIdentifierByPartSearchCriteriaKey | updatePartIdentifierByPartSearchCriteriaKey | deletePartIdentifierByPartSearchCriteriaKey |
    | **effective-period** | /part-search-criteria/{partSearchCriteriaKey}/effective-periods | listEffectivePeriodByPartSearchCriteriaKey |  | getEffectivePeriodByPartSearchCriteriaKey | updateEffectivePeriodByPartSearchCriteriaKey | deleteEffectivePeriodByPartSearchCriteriaKey |
    | **part-logistics-criteria** | /part-search-criteria/{partSearchCriteriaKey}/part-logistics-criteria | listPartLogisticsCriteriaByPartSearchCriteriaKey | createPartLogisticsCriteria | getPartLogisticsCriteriaByPartSearchCriteriaKey | updatePartLogisticsCriteriaByPartSearchCriteriaKey | deletePartLogisticsCriteriaByPartSearchCriteriaKey |
    | **part-lifecycle** | /part-search-criteria/{partSearchCriteriaKey}/part-lifecycles | listPartLifecycleByPartSearchCriteriaKey | createPartLifecycle | getPartLifecycleByPartSearchCriteriaKey | updatePartLifecycleByPartSearchCriteriaKey | deletePartLifecycleByPartSearchCriteriaKey |
    | **warehouse-reference** | /part-search-criteria/{partSearchCriteriaKey}/warehouse-references | listWarehouseReferenceByPartSearchCriteriaKey | createWarehouseReference | getWarehouseReferenceByPartSearchCriteriaKey | updateWarehouseReferenceByPartSearchCriteriaKey | deleteWarehouseReferenceByPartSearchCriteriaKey |

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