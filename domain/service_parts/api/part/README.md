## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **ControlAccountReference**, **Identifier**, **Part**, **PartEvent**, **PartIdentifier**, **PartLifecycle**, **PartLocation**, **PartName**, **Price**, **SuperSession**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service_parts** and **Part** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Part** | /parts | Manages Parts |
    | **Identifier** | /parts/{partKey}/identifiers | Manages Identifiers belonging to Parts |
    | **PartLocation** | /parts/{partKey}/part-locations | Manages PartLocations belonging to Parts |
    | **PartName** | /parts/{partKey}/part-names | Manages PartNames belonging to Parts |
    | **Price** | /parts/{partKey}/prices | Manages Prices belonging to Parts |
    | **SuperSession** | /parts/{partKey}/super-sessions | Manages SuperSessions belonging to Parts |
    | **PartEvent** | /parts/{partKey}/part-events | Manages PartEvents belonging to Parts |
    | **PartIdentifier** | /parts/{partKey}/part-identifiers | Manages PartIdentifiers belonging to Parts |
    | **EffectivePeriod** | /parts/{partKey}/effective-periods | Manages EffectivePeriods belonging to Parts |
    | **ControlAccountReference** | /parts/{partKey}/control-account-references | Manages ControlAccountReferences belonging to Parts |
    | **PartLifecycle** | /parts/{partKey}/part-lifecycles | Manages PartLifecycles belonging to Parts |
    | **TimeSlot** | /parts/{partKey}/time-slots | Manages TimeSlots belonging to Parts |


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
> `https://[Your-API-Host]/part`

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
💠 **PartConditionGradeTypes** : types of part condition grades.<br/>
💠 **PartConditionTypes** : types of part conditions.<br/>
💠 **PartIdentifierTypes** : types of part identifiers.<br/>
💠 **PartInventoryOrderTypes** : types of part inventory orders.<br/>
💠 **PartNameTypes** : types of part names.<br/>
💠 **PartOrderConfigTypes** : types of part order configs.<br/>
💠 **PartStatusTypes** : types of part status.<br/>
💠 **PartStorageTypes** : types of part storages.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductConsumptionTypes** : types of product consumptions.<br/>
💠 **ProductPackageTypes** : types of product packages.<br/>
💠 **ProductStageTypes** : types of product stages.<br/>
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


### /parts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts</span> <br/>
        <span class="api-summary">Retrieve a list of Part entities. getPart</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parts</span> <br/>
        <span class="api-summary">Create a new Part entity. createPart</span>
    </span>
</div>

### /parts/{partKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Part entity. getartById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}</span> <br/>
        <span class="api-summary">Replace a Part entity. replacePart</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}</span> <br/>
        <span class="api-summary">Partially update a Part entity. updatePart</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}</span> <br/>
        <span class="api-summary">Delete a Part entity deletePartEntity</span>
    </span>
</div>

### /parts/{partKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by partKey. getIdentifierByPartKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /parts/{partKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /parts/{partKey}/part-locations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-locations</span> <br/>
        <span class="api-summary">Retrieve a list of PartLocation entities scoped by partKey. getPartLocationByPartKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-locations</span> <br/>
        <span class="api-summary">Create a new PartLocation entity. createPartLocation</span>
    </span>
</div>

### /parts/{partKey}/part-locations/{partLocationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-locations/{partLocationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartLocation entity. getartLocationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-locations/{partLocationKey}</span> <br/>
        <span class="api-summary">Replace a PartLocation entity. replacePartLocation</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-locations/{partLocationKey}</span> <br/>
        <span class="api-summary">Partially update a PartLocation entity. updatePartLocation</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-locations/{partLocationKey}</span> <br/>
        <span class="api-summary">Delete a PartLocation entity deletePartLocationEntity</span>
    </span>
</div>

### /parts/{partKey}/part-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-names</span> <br/>
        <span class="api-summary">Retrieve a list of PartName entities scoped by partKey. getPartNameByPartKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-names</span> <br/>
        <span class="api-summary">Create a new PartName entity. createPartName</span>
    </span>
</div>

### /parts/{partKey}/part-names/{partNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartName entity. getartNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Replace a PartName entity. replacePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Partially update a PartName entity. updatePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Delete a PartName entity deletePartNameEntity</span>
    </span>
</div>

### /parts/{partKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by partKey. getPriceByPartKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price entity. createPrice</span>
    </span>
</div>

### /parts/{partKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price entity. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price entity. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price entity deletePriceEntity</span>
    </span>
</div>

### /parts/{partKey}/super-sessions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/super-sessions</span> <br/>
        <span class="api-summary">Retrieve a list of SuperSession entities scoped by partKey. getSuperSessionByPartKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/super-sessions</span> <br/>
        <span class="api-summary">Create a new SuperSession entity. createSuperSession</span>
    </span>
</div>

### /parts/{partKey}/super-sessions/{superSessionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific SuperSession entity. getuperSessionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Replace a SuperSession entity. replaceSuperSession</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Partially update a SuperSession entity. updateSuperSession</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Delete a SuperSession entity deleteSuperSessionEntity</span>
    </span>
</div>

### /parts/{partKey}/part-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-events</span> <br/>
        <span class="api-summary">Retrieve a list of PartEvent entities scoped by partKey. getPartEventByPartKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-events</span> <br/>
        <span class="api-summary">Create a new PartEvent entity. createPartEvent</span>
    </span>
</div>

### /parts/{partKey}/part-events/{partEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-events/{partEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartEvent entity. getartEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-events/{partEventKey}</span> <br/>
        <span class="api-summary">Replace a PartEvent entity. replacePartEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-events/{partEventKey}</span> <br/>
        <span class="api-summary">Partially update a PartEvent entity. updatePartEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-events/{partEventKey}</span> <br/>
        <span class="api-summary">Delete a PartEvent entity deletePartEventEntity</span>
    </span>
</div>

### /parts/{partKey}/part-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartIdentifier entities scoped by partKey. getPartIdentifierByPartKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-identifiers</span> <br/>
        <span class="api-summary">Create a new PartIdentifier entity. createPartIdentifier</span>
    </span>
</div>

### /parts/{partKey}/part-identifiers/{partIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartIdentifier entity. getartIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartIdentifier entity. replacePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartIdentifier entity. updatePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartIdentifier entity deletePartIdentifierEntity</span>
    </span>
</div>

### /parts/{partKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by partKey. getEffectivePeriodByPartKey</span>
    </span>
</div>

### /parts/{partKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /parts/{partKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference entities scoped by partKey. getControlAccountReferenceByPartKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference entity. createControlAccountReference</span>
    </span>
</div>

### /parts/{partKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference entity. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference entity. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference entity. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference entity deleteControlAccountReferenceEntity</span>
    </span>
</div>

### /parts/{partKey}/part-lifecycles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-lifecycles</span> <br/>
        <span class="api-summary">Retrieve a list of PartLifecycle entities scoped by partKey. getPartLifecycleByPartKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-lifecycles</span> <br/>
        <span class="api-summary">Create a new PartLifecycle entity. createPartLifecycle</span>
    </span>
</div>

### /parts/{partKey}/part-lifecycles/{partLifecycleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartLifecycle entity. getartLifecycleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Replace a PartLifecycle entity. replacePartLifecycle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Partially update a PartLifecycle entity. updatePartLifecycle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Delete a PartLifecycle entity deletePartLifecycleEntity</span>
    </span>
</div>

### /parts/{partKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by partKey. getTimeSlotByPartKey</span>
    </span>
</div>

### /parts/{partKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parts/{partKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Partroot with key {PartKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **part** | /parts | listPart | createPart | getPart | updatePart | deletePart |
    | **identifier** | /parts/{partKey}/identifiers | listIdentifierByPartKey | createIdentifier | getIdentifierByPartKey | updateIdentifierByPartKey | deleteIdentifierByPartKey |
    | **part-location** | /parts/{partKey}/part-locations | listPartLocationByPartKey | createPartLocation | getPartLocationByPartKey | updatePartLocationByPartKey | deletePartLocationByPartKey |
    | **part-name** | /parts/{partKey}/part-names | listPartNameByPartKey | createPartName | getPartNameByPartKey | updatePartNameByPartKey | deletePartNameByPartKey |
    | **price** | /parts/{partKey}/prices | listPriceByPartKey | createPrice | getPriceByPartKey | updatePriceByPartKey | deletePriceByPartKey |
    | **super-session** | /parts/{partKey}/super-sessions | listSuperSessionByPartKey | createSuperSession | getSuperSessionByPartKey | updateSuperSessionByPartKey | deleteSuperSessionByPartKey |
    | **part-event** | /parts/{partKey}/part-events | listPartEventByPartKey | createPartEvent | getPartEventByPartKey | updatePartEventByPartKey | deletePartEventByPartKey |
    | **part-identifier** | /parts/{partKey}/part-identifiers | listPartIdentifierByPartKey | createPartIdentifier | getPartIdentifierByPartKey | updatePartIdentifierByPartKey | deletePartIdentifierByPartKey |
    | **effective-period** | /parts/{partKey}/effective-periods | listEffectivePeriodByPartKey |  | getEffectivePeriodByPartKey | updateEffectivePeriodByPartKey | deleteEffectivePeriodByPartKey |
    | **control-account-reference** | /parts/{partKey}/control-account-references | listControlAccountReferenceByPartKey | createControlAccountReference | getControlAccountReferenceByPartKey | updateControlAccountReferenceByPartKey | deleteControlAccountReferenceByPartKey |
    | **part-lifecycle** | /parts/{partKey}/part-lifecycles | listPartLifecycleByPartKey | createPartLifecycle | getPartLifecycleByPartKey | updatePartLifecycleByPartKey | deletePartLifecycleByPartKey |
    | **time-slot** | /parts/{partKey}/time-slots | listTimeSlotByPartKey |  | getTimeSlotByPartKey | updateTimeSlotByPartKey | deleteTimeSlotByPartKey |

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