## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **FinancialSplitReference**, **GeographicBoundaryReference**, **Identifier**, **PartyIdentifier**, **PricePlan**, **PriceSensitivity**, **ProductScheduleReference**.

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
    | **PartyIdentifier** | /price-plans/{pricePlanKey}/party-identifiers | Manages PartyIdentifiers belonging to PricePlans |
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
> `https://[Your-API-Host]/price-plan`

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
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PriceClassTypes** : types of price class.<br/>
💠 **PriceSensitivityTypes** : types of price sensitivitys.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ResourceTypes** : types of resources.<br/>
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


### /price-plans
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans</span> <br/>
        <span class="api-summary">Retrieve a list of all PricePlan records. getPricePlans</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans</span> <br/>
        <span class="api-summary">Create a new PricePlan record. createPricePlan</span>
    </span>
</div>

### /price-plans/{pricePlanKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlan record. getricePlanById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}</span> <br/>
        <span class="api-summary">Replace a PricePlan record. replacePricePlan</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlan record. updatePricePlan</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}</span> <br/>
        <span class="api-summary">Delete a PricePlan Record deletePricePlanRecord</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/product-schedule-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references</span> <br/>
        <span class="api-summary">Retrieve a list of ProductScheduleReference records scoped by pricePlanKey. getProductScheduleReferencesByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references</span> <br/>
        <span class="api-summary">Create a new ProductScheduleReference record. createProductScheduleReference</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/product-schedule-references/{productScheduleReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references/{productScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ProductScheduleReference record. getroductScheduleReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references/{productScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ProductScheduleReference record. replaceProductScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references/{productScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ProductScheduleReference record. updateProductScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/product-schedule-references/{productScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ProductScheduleReference Record deleteProductScheduleReferenceRecord</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by pricePlanKey. getIdentifiersByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/geographic-boundary-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references</span> <br/>
        <span class="api-summary">Retrieve a list of GeographicBoundaryReference records scoped by pricePlanKey. getGeographicBoundaryReferencesByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references</span> <br/>
        <span class="api-summary">Create a new GeographicBoundaryReference record. createGeographicBoundaryReference</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific GeographicBoundaryReference record. geteographicBoundaryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a GeographicBoundaryReference record. replaceGeographicBoundaryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a GeographicBoundaryReference record. updateGeographicBoundaryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a GeographicBoundaryReference Record deleteGeographicBoundaryReferenceRecord</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/price-sensitivities
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities</span> <br/>
        <span class="api-summary">Retrieve a list of PriceSensitivity records scoped by pricePlanKey. getPriceSensitivitysByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities</span> <br/>
        <span class="api-summary">Create a new PriceSensitivity record. createPriceSensitivity</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/price-sensitivities/{priceSensitivityKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities/{priceSensitivityKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PriceSensitivity record. getriceSensitivityById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities/{priceSensitivityKey}</span> <br/>
        <span class="api-summary">Replace a PriceSensitivity record. replacePriceSensitivity</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities/{priceSensitivityKey}</span> <br/>
        <span class="api-summary">Partially update a PriceSensitivity record. updatePriceSensitivity</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/price-sensitivities/{priceSensitivityKey}</span> <br/>
        <span class="api-summary">Delete a PriceSensitivity Record deletePriceSensitivityRecord</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by pricePlanKey. getEffectivePeriodsByPricePlanKey</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/party-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/party-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartyIdentifier records scoped by pricePlanKey. getPartyIdentifiersByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/party-identifiers</span> <br/>
        <span class="api-summary">Create a new PartyIdentifier record. createPartyIdentifier</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/party-identifiers/{partyIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyIdentifier record. getartyIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartyIdentifier record. replacePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartyIdentifier record. updatePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartyIdentifier Record deletePartyIdentifierRecord</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/financial-split-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplitReference records scoped by pricePlanKey. getFinancialSplitReferencesByPricePlanKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references</span> <br/>
        <span class="api-summary">Create a new FinancialSplitReference record. createFinancialSplitReference</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/financial-split-references/{financialSplitReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplitReference record. getinancialSplitReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplitReference record. replaceFinancialSplitReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplitReference record. updateFinancialSplitReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplitReference Record deleteFinancialSplitReferenceRecord</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot records scoped by pricePlanKey. getTimeSlotsByPricePlanKey</span>
    </span>
</div>

### /price-plans/{pricePlanKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot record. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-plans/{pricePlanKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot record. replaceTimeSlot</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PricePlanroot with key {PricePlanKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **price-plan** | /price-plans | listPricePlans | createPricePlan | getPricePlans | updatePricePlans | deletePricePlans |
    | **product-schedule-reference** | /price-plans/{pricePlanKey}/product-schedule-references | listProductScheduleReferencesByPricePlanKey | createProductScheduleReference | getProductScheduleReferencesByPricePlanKey | updateProductScheduleReferencesByPricePlanKey | deleteProductScheduleReferencesByPricePlanKey |
    | **identifier** | /price-plans/{pricePlanKey}/identifiers | listIdentifiersByPricePlanKey | createIdentifier | getIdentifiersByPricePlanKey | updateIdentifiersByPricePlanKey | deleteIdentifiersByPricePlanKey |
    | **geographic-boundary-reference** | /price-plans/{pricePlanKey}/geographic-boundary-references | listGeographicBoundaryReferencesByPricePlanKey | createGeographicBoundaryReference | getGeographicBoundaryReferencesByPricePlanKey | updateGeographicBoundaryReferencesByPricePlanKey | deleteGeographicBoundaryReferencesByPricePlanKey |
    | **price-sensitivitie** | /price-plans/{pricePlanKey}/price-sensitivities | listPriceSensitivitysByPricePlanKey | createPriceSensitivity | getPriceSensitivitysByPricePlanKey | updatePriceSensitivitysByPricePlanKey | deletePriceSensitivitysByPricePlanKey |
    | **effective-period** | /price-plans/{pricePlanKey}/effective-periods | listEffectivePeriodsByPricePlanKey |  | getEffectivePeriodsByPricePlanKey | updateEffectivePeriodsByPricePlanKey | deleteEffectivePeriodsByPricePlanKey |
    | **party-identifier** | /price-plans/{pricePlanKey}/party-identifiers | listPartyIdentifiersByPricePlanKey | createPartyIdentifier | getPartyIdentifiersByPricePlanKey | updatePartyIdentifiersByPricePlanKey | deletePartyIdentifiersByPricePlanKey |
    | **financial-split-reference** | /price-plans/{pricePlanKey}/financial-split-references | listFinancialSplitReferencesByPricePlanKey | createFinancialSplitReference | getFinancialSplitReferencesByPricePlanKey | updateFinancialSplitReferencesByPricePlanKey | deleteFinancialSplitReferencesByPricePlanKey |
    | **time-slot** | /price-plans/{pricePlanKey}/time-slots | listTimeSlotsByPricePlanKey |  | getTimeSlotsByPricePlanKey | updateTimeSlotsByPricePlanKey | deleteTimeSlotsByPricePlanKey |

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