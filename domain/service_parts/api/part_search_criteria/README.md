## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **AdvanceSearchValue**, **AdvancedSearchCriteria**, **Identifier**, **PartIdentifier**, **PartLifecycle**, **PartLogisticsCriteria**, **PartName**, **PartPriceCriteria**, **PartSearchCriteria**, **PartSpecification**, **PartyIdentifier**, **SuperSession**, **WarehouseReference**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service_parts** and **PartSearchCriteria** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PartSearchCriteria** | /part-search-criterias | Manages PartSearchCriterias |
    | **UnitOfMeasure** | /part-search-criterias/{partSearchCriteriaKey}/unit-of-measures | Manages UnitOfMeasures belonging to PartSearchCriterias |
    | **PartSpecification** | /part-search-criterias/{partSearchCriteriaKey}/part-specifications | Manages PartSpecifications belonging to PartSearchCriterias |
    | **PartyIdentifier** | /part-search-criterias/{partSearchCriteriaKey}/party-identifiers | Manages PartyIdentifiers belonging to PartSearchCriterias |
    | **TimeSlot** | /part-search-criterias/{partSearchCriteriaKey}/time-slots | Manages TimeSlots belonging to PartSearchCriterias |
    | **AdvancedSearchCriteria** | /part-search-criterias/{partSearchCriteriaKey}/advanced-search-criterias | Manages AdvancedSearchCriterias belonging to PartSearchCriterias |
    | **PartPriceCriteria** | /part-search-criterias/{partSearchCriteriaKey}/part-price-criterias | Manages PartPriceCriterias belonging to PartSearchCriterias |
    | **Identifier** | /part-search-criterias/{partSearchCriteriaKey}/identifiers | Manages Identifiers belonging to PartSearchCriterias |
    | **PartName** | /part-search-criterias/{partSearchCriteriaKey}/part-names | Manages PartNames belonging to PartSearchCriterias |
    | **SuperSession** | /part-search-criterias/{partSearchCriteriaKey}/super-sessions | Manages SuperSessions belonging to PartSearchCriterias |
    | **AdvanceSearchValue** | /part-search-criterias/{partSearchCriteriaKey}/advance-search-values | Manages AdvanceSearchValues belonging to PartSearchCriterias |
    | **PartIdentifier** | /part-search-criterias/{partSearchCriteriaKey}/part-identifiers | Manages PartIdentifiers belonging to PartSearchCriterias |
    | **EffectivePeriod** | /part-search-criterias/{partSearchCriteriaKey}/effective-periods | Manages EffectivePeriods belonging to PartSearchCriterias |
    | **PartLogisticsCriteria** | /part-search-criterias/{partSearchCriteriaKey}/part-logistics-criterias | Manages PartLogisticsCriterias belonging to PartSearchCriterias |
    | **PartLifecycle** | /part-search-criterias/{partSearchCriteriaKey}/part-lifecycles | Manages PartLifecycles belonging to PartSearchCriterias |
    | **WarehouseReference** | /part-search-criterias/{partSearchCriteriaKey}/warehouse-references | Manages WarehouseReferences belonging to PartSearchCriterias |


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
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
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


### /part-search-criterias
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias</span> <br/>
        <span class="api-summary">Retrieve a list of all PartSearchCriteria records. getPartSearchCriterias</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias</span> <br/>
        <span class="api-summary">Create a new PartSearchCriteria record. createPartSearchCriteria</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartSearchCriteria record. getartSearchCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a PartSearchCriteria record. replacePartSearchCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a PartSearchCriteria record. updatePartSearchCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a PartSearchCriteria Record deletePartSearchCriteriaRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure records scoped by partSearchCriteriaKey. getUnitOfMeasuresByPartSearchCriteriaKey</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure record. getnitOfMeasureById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Replace a UnitOfMeasure record. replaceUnitOfMeasure</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-specifications
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-specifications</span> <br/>
        <span class="api-summary">Retrieve a list of PartSpecification records scoped by partSearchCriteriaKey. getPartSpecificationsByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-specifications</span> <br/>
        <span class="api-summary">Create a new PartSpecification record. createPartSpecification</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-specifications/{partSpecificationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartSpecification record. getartSpecificationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Replace a PartSpecification record. replacePartSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Partially update a PartSpecification record. updatePartSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Delete a PartSpecification Record deletePartSpecificationRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/party-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/party-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartyIdentifier records scoped by partSearchCriteriaKey. getPartyIdentifiersByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/party-identifiers</span> <br/>
        <span class="api-summary">Create a new PartyIdentifier record. createPartyIdentifier</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/party-identifiers/{partyIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyIdentifier record. getartyIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartyIdentifier record. replacePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartyIdentifier record. updatePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartyIdentifier Record deletePartyIdentifierRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot records scoped by partSearchCriteriaKey. getTimeSlotsByPartSearchCriteriaKey</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot record. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot record. replaceTimeSlot</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/advanced-search-criterias
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advanced-search-criterias</span> <br/>
        <span class="api-summary">Retrieve a list of AdvancedSearchCriteria records scoped by partSearchCriteriaKey. getAdvancedSearchCriteriasByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advanced-search-criterias</span> <br/>
        <span class="api-summary">Create a new AdvancedSearchCriteria record. createAdvancedSearchCriteria</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/advanced-search-criterias/{advancedSearchCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advanced-search-criterias/{advancedSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AdvancedSearchCriteria record. getdvancedSearchCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advanced-search-criterias/{advancedSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a AdvancedSearchCriteria record. replaceAdvancedSearchCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advanced-search-criterias/{advancedSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a AdvancedSearchCriteria record. updateAdvancedSearchCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advanced-search-criterias/{advancedSearchCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a AdvancedSearchCriteria Record deleteAdvancedSearchCriteriaRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-price-criterias
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-price-criterias</span> <br/>
        <span class="api-summary">Retrieve a list of PartPriceCriteria records scoped by partSearchCriteriaKey. getPartPriceCriteriasByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-price-criterias</span> <br/>
        <span class="api-summary">Create a new PartPriceCriteria record. createPartPriceCriteria</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-price-criterias/{partPriceCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-price-criterias/{partPriceCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartPriceCriteria record. getartPriceCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-price-criterias/{partPriceCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a PartPriceCriteria record. replacePartPriceCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-price-criterias/{partPriceCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a PartPriceCriteria record. updatePartPriceCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-price-criterias/{partPriceCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a PartPriceCriteria Record deletePartPriceCriteriaRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by partSearchCriteriaKey. getIdentifiersByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-names</span> <br/>
        <span class="api-summary">Retrieve a list of PartName records scoped by partSearchCriteriaKey. getPartNamesByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-names</span> <br/>
        <span class="api-summary">Create a new PartName record. createPartName</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-names/{partNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartName record. getartNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Replace a PartName record. replacePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Partially update a PartName record. updatePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Delete a PartName Record deletePartNameRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/super-sessions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/super-sessions</span> <br/>
        <span class="api-summary">Retrieve a list of SuperSession records scoped by partSearchCriteriaKey. getSuperSessionsByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/super-sessions</span> <br/>
        <span class="api-summary">Create a new SuperSession record. createSuperSession</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/super-sessions/{superSessionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific SuperSession record. getuperSessionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Replace a SuperSession record. replaceSuperSession</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Partially update a SuperSession record. updateSuperSession</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Delete a SuperSession Record deleteSuperSessionRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/advance-search-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advance-search-values</span> <br/>
        <span class="api-summary">Retrieve a list of AdvanceSearchValue records scoped by partSearchCriteriaKey. getAdvanceSearchValuesByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advance-search-values</span> <br/>
        <span class="api-summary">Create a new AdvanceSearchValue record. createAdvanceSearchValue</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/advance-search-values/{advanceSearchValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advance-search-values/{advanceSearchValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AdvanceSearchValue record. getdvanceSearchValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advance-search-values/{advanceSearchValueKey}</span> <br/>
        <span class="api-summary">Replace a AdvanceSearchValue record. replaceAdvanceSearchValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advance-search-values/{advanceSearchValueKey}</span> <br/>
        <span class="api-summary">Partially update a AdvanceSearchValue record. updateAdvanceSearchValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/advance-search-values/{advanceSearchValueKey}</span> <br/>
        <span class="api-summary">Delete a AdvanceSearchValue Record deleteAdvanceSearchValueRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartIdentifier records scoped by partSearchCriteriaKey. getPartIdentifiersByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-identifiers</span> <br/>
        <span class="api-summary">Create a new PartIdentifier record. createPartIdentifier</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-identifiers/{partIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartIdentifier record. getartIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartIdentifier record. replacePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartIdentifier record. updatePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartIdentifier Record deletePartIdentifierRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by partSearchCriteriaKey. getEffectivePeriodsByPartSearchCriteriaKey</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-logistics-criterias
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-logistics-criterias</span> <br/>
        <span class="api-summary">Retrieve a list of PartLogisticsCriteria records scoped by partSearchCriteriaKey. getPartLogisticsCriteriasByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-logistics-criterias</span> <br/>
        <span class="api-summary">Create a new PartLogisticsCriteria record. createPartLogisticsCriteria</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-logistics-criterias/{partLogisticsCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-logistics-criterias/{partLogisticsCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartLogisticsCriteria record. getartLogisticsCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-logistics-criterias/{partLogisticsCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a PartLogisticsCriteria record. replacePartLogisticsCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-logistics-criterias/{partLogisticsCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a PartLogisticsCriteria record. updatePartLogisticsCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-logistics-criterias/{partLogisticsCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a PartLogisticsCriteria Record deletePartLogisticsCriteriaRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-lifecycles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-lifecycles</span> <br/>
        <span class="api-summary">Retrieve a list of PartLifecycle records scoped by partSearchCriteriaKey. getPartLifecyclesByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-lifecycles</span> <br/>
        <span class="api-summary">Create a new PartLifecycle record. createPartLifecycle</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/part-lifecycles/{partLifecycleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartLifecycle record. getartLifecycleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Replace a PartLifecycle record. replacePartLifecycle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Partially update a PartLifecycle record. updatePartLifecycle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Delete a PartLifecycle Record deletePartLifecycleRecord</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/warehouse-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/warehouse-references</span> <br/>
        <span class="api-summary">Retrieve a list of WarehouseReference records scoped by partSearchCriteriaKey. getWarehouseReferencesByPartSearchCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/warehouse-references</span> <br/>
        <span class="api-summary">Create a new WarehouseReference record. createWarehouseReference</span>
    </span>
</div>

### /part-search-criterias/{partSearchCriteriaKey}/warehouse-references/{warehouseReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific WarehouseReference record. getarehouseReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Replace a WarehouseReference record. replaceWarehouseReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a WarehouseReference record. updateWarehouseReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-search-criterias/{partSearchCriteriaKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Delete a WarehouseReference Record deleteWarehouseReferenceRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PartSearchCriteriaroot with key {PartSearchCriteriaKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **part-search-criteria** | /part-search-criterias | listPartSearchCriterias | createPartSearchCriteria | getPartSearchCriterias | updatePartSearchCriterias | deletePartSearchCriterias |
    | **unit-of-measure** | /part-search-criterias/{partSearchCriteriaKey}/unit-of-measures | listUnitOfMeasuresByPartSearchCriteriaKey |  | getUnitOfMeasuresByPartSearchCriteriaKey | updateUnitOfMeasuresByPartSearchCriteriaKey | deleteUnitOfMeasuresByPartSearchCriteriaKey |
    | **part-specification** | /part-search-criterias/{partSearchCriteriaKey}/part-specifications | listPartSpecificationsByPartSearchCriteriaKey | createPartSpecification | getPartSpecificationsByPartSearchCriteriaKey | updatePartSpecificationsByPartSearchCriteriaKey | deletePartSpecificationsByPartSearchCriteriaKey |
    | **party-identifier** | /part-search-criterias/{partSearchCriteriaKey}/party-identifiers | listPartyIdentifiersByPartSearchCriteriaKey | createPartyIdentifier | getPartyIdentifiersByPartSearchCriteriaKey | updatePartyIdentifiersByPartSearchCriteriaKey | deletePartyIdentifiersByPartSearchCriteriaKey |
    | **time-slot** | /part-search-criterias/{partSearchCriteriaKey}/time-slots | listTimeSlotsByPartSearchCriteriaKey |  | getTimeSlotsByPartSearchCriteriaKey | updateTimeSlotsByPartSearchCriteriaKey | deleteTimeSlotsByPartSearchCriteriaKey |
    | **advanced-search-criteria** | /part-search-criterias/{partSearchCriteriaKey}/advanced-search-criterias | listAdvancedSearchCriteriasByPartSearchCriteriaKey | createAdvancedSearchCriteria | getAdvancedSearchCriteriasByPartSearchCriteriaKey | updateAdvancedSearchCriteriasByPartSearchCriteriaKey | deleteAdvancedSearchCriteriasByPartSearchCriteriaKey |
    | **part-price-criteria** | /part-search-criterias/{partSearchCriteriaKey}/part-price-criterias | listPartPriceCriteriasByPartSearchCriteriaKey | createPartPriceCriteria | getPartPriceCriteriasByPartSearchCriteriaKey | updatePartPriceCriteriasByPartSearchCriteriaKey | deletePartPriceCriteriasByPartSearchCriteriaKey |
    | **identifier** | /part-search-criterias/{partSearchCriteriaKey}/identifiers | listIdentifiersByPartSearchCriteriaKey | createIdentifier | getIdentifiersByPartSearchCriteriaKey | updateIdentifiersByPartSearchCriteriaKey | deleteIdentifiersByPartSearchCriteriaKey |
    | **part-name** | /part-search-criterias/{partSearchCriteriaKey}/part-names | listPartNamesByPartSearchCriteriaKey | createPartName | getPartNamesByPartSearchCriteriaKey | updatePartNamesByPartSearchCriteriaKey | deletePartNamesByPartSearchCriteriaKey |
    | **super-session** | /part-search-criterias/{partSearchCriteriaKey}/super-sessions | listSuperSessionsByPartSearchCriteriaKey | createSuperSession | getSuperSessionsByPartSearchCriteriaKey | updateSuperSessionsByPartSearchCriteriaKey | deleteSuperSessionsByPartSearchCriteriaKey |
    | **advance-search-value** | /part-search-criterias/{partSearchCriteriaKey}/advance-search-values | listAdvanceSearchValuesByPartSearchCriteriaKey | createAdvanceSearchValue | getAdvanceSearchValuesByPartSearchCriteriaKey | updateAdvanceSearchValuesByPartSearchCriteriaKey | deleteAdvanceSearchValuesByPartSearchCriteriaKey |
    | **part-identifier** | /part-search-criterias/{partSearchCriteriaKey}/part-identifiers | listPartIdentifiersByPartSearchCriteriaKey | createPartIdentifier | getPartIdentifiersByPartSearchCriteriaKey | updatePartIdentifiersByPartSearchCriteriaKey | deletePartIdentifiersByPartSearchCriteriaKey |
    | **effective-period** | /part-search-criterias/{partSearchCriteriaKey}/effective-periods | listEffectivePeriodsByPartSearchCriteriaKey |  | getEffectivePeriodsByPartSearchCriteriaKey | updateEffectivePeriodsByPartSearchCriteriaKey | deleteEffectivePeriodsByPartSearchCriteriaKey |
    | **part-logistics-criteria** | /part-search-criterias/{partSearchCriteriaKey}/part-logistics-criterias | listPartLogisticsCriteriasByPartSearchCriteriaKey | createPartLogisticsCriteria | getPartLogisticsCriteriasByPartSearchCriteriaKey | updatePartLogisticsCriteriasByPartSearchCriteriaKey | deletePartLogisticsCriteriasByPartSearchCriteriaKey |
    | **part-lifecycle** | /part-search-criterias/{partSearchCriteriaKey}/part-lifecycles | listPartLifecyclesByPartSearchCriteriaKey | createPartLifecycle | getPartLifecyclesByPartSearchCriteriaKey | updatePartLifecyclesByPartSearchCriteriaKey | deletePartLifecyclesByPartSearchCriteriaKey |
    | **warehouse-reference** | /part-search-criterias/{partSearchCriteriaKey}/warehouse-references | listWarehouseReferencesByPartSearchCriteriaKey | createWarehouseReference | getWarehouseReferencesByPartSearchCriteriaKey | updateWarehouseReferencesByPartSearchCriteriaKey | deleteWarehouseReferencesByPartSearchCriteriaKey |

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