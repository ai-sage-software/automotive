## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **ControlAccountReference**, **CreditReference**, **DiscountReference**, **FeeReference**, **FinancialCategoryReference**, **FinancialSplit**, **Identifier**, **LeadTime**, **PartCategory**, **PartIdentifier**, **PartInventoryReference**, **PartLifecycle**, **PartMaster**, **PartMasterProfile**, **PartMasterRegulatory**, **PartName**, **PartSpecification**, **PartyIdentifier**, **Price**, **PricePlanReference**, **RebateReference**, **RewardReference**, **SuperSession**, **TaxSplit**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service_parts** and **PartMaster** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PartMaster** | /part-masters | Manages PartMasters |
    | **UnitOfMeasure** | /part-masters/{partMasterKey}/unit-of-measures | Manages UnitOfMeasures belonging to PartMasters |
    | **PricePlanReference** | /part-masters/{partMasterKey}/price-plan-references | Manages PricePlanReferences belonging to PartMasters |
    | **PartSpecification** | /part-masters/{partMasterKey}/part-specifications | Manages PartSpecifications belonging to PartMasters |
    | **PartyIdentifier** | /part-masters/{partMasterKey}/party-identifiers | Manages PartyIdentifiers belonging to PartMasters |
    | **PartMasterProfile** | /part-masters/{partMasterKey}/part-master-profiles | Manages PartMasterProfiles belonging to PartMasters |
    | **PartCategorie** | /part-masters/{partMasterKey}/part-categories | Manages PartCategories belonging to PartMasters |
    | **Identifier** | /part-masters/{partMasterKey}/identifiers | Manages Identifiers belonging to PartMasters |
    | **PartInventoryReference** | /part-masters/{partMasterKey}/part-inventory-references | Manages PartInventoryReferences belonging to PartMasters |
    | **PartName** | /part-masters/{partMasterKey}/part-names | Manages PartNames belonging to PartMasters |
    | **LeadTime** | /part-masters/{partMasterKey}/lead-times | Manages LeadTimes belonging to PartMasters |
    | **SuperSession** | /part-masters/{partMasterKey}/super-sessions | Manages SuperSessions belonging to PartMasters |
    | **PartIdentifier** | /part-masters/{partMasterKey}/part-identifiers | Manages PartIdentifiers belonging to PartMasters |
    | **EffectivePeriod** | /part-masters/{partMasterKey}/effective-periods | Manages EffectivePeriods belonging to PartMasters |
    | **PartLifecycle** | /part-masters/{partMasterKey}/part-lifecycles | Manages PartLifecycles belonging to PartMasters |
    | **TextualDetail** | /part-masters/{partMasterKey}/textual-details | Manages TextualDetails belonging to PartMasters |
    | **PartMasterRegulatorie** | /part-masters/{partMasterKey}/part-master-regulatories | Manages PartMasterRegulatories belonging to PartMasters |
    | **FinancialSplit** | /part-masters/{partMasterKey}/financial-splits | Manages FinancialSplits belonging to PartMasters |


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
> `https://[Your-API-Host]/part-master`

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

💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **FinancialTransactionTypes** : types of financial transactions.<br/>
💠 **HazardClassTypes** : types of hazard class.<br/>
💠 **LedgerActionTypes** : types of ledger actions.<br/>
💠 **LifecycleEventTypes** : types of lifecycle events.<br/>
💠 **PartConditionGradeTypes** : types of part condition grades.<br/>
💠 **PartConditionTypes** : types of part conditions.<br/>
💠 **PartHazardPackingGroupTypes** : types of part hazard packing groups.<br/>
💠 **PartIdentifierTypes** : types of part identifiers.<br/>
💠 **PartNameTypes** : types of part names.<br/>
💠 **PartOrderConfigTypes** : types of part order configs.<br/>
💠 **PartStatusTypes** : types of part status.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **ProductConsumptionTypes** : types of product consumptions.<br/>
💠 **ProductPackageTypes** : types of product packages.<br/>
💠 **ProductPriceItemTypes** : types of product price items.<br/>
💠 **ProductStageTypes** : types of product stages.<br/>
💠 **SalesStatusTypes** : types of sales status.<br/>
💠 **UOMLeadTimeTypes** : types of u o m lead times.<br/>
💠 **UOMQuantityCategoryTypes** : types of u o m quantity categorys.<br/>
💠 **UOMTimeTypes** : types of u o m times.<br/>
💠 **TaxTypes** : Defines various types of taxes, such as sales t...<br/>
💠 **PriceTypes** : entity<br/>
💠 **DaysOfWeekTypes** : Status of the account<br/>
💠 **TimeslotDirectiveTypes** : Represents the directive for a timeslot.<br/>
💠 **PartMasterSuperSessionTypes** : entity<br/>

## ✅ Entities

---

✅ **Codes** : List of Codes<br/>
✅ **CreditReferences** : List of CreditReference<br/>
✅ **DiscountReferences** : List of DiscountReference<br/>
✅ **EffectivePeriod** : Effective Period<br/>
✅ **FeeReferences** : List of FeeReference<br/>
✅ **FinancialCategoryReferences** : List of FinancialCategoryReference<br/>
✅ **FinancialSplits** : List of FinancialSplit<br/>
✅ **Identifiers** : List of Identifier<br/>
✅ **LeadTimes** : List of LeadTime<br/>
✅ **Link** : Quick Link<br/>
✅ **Links** : List of Links<br/>
✅ **List** : List of PartyRelationshipTypes<br/>
✅ **Memo** : List of String<br/>
✅ **PartCategories** : List of PartCategory<br/>
✅ **PartIdentifiers** : List of PartIdentifier<br/>
✅ **PartInventoryReferences** : List of PartInventoryReference<br/>
✅ **PartLifecycles** : List of PartLifecycle<br/>
✅ **PartNames** : List of PartName<br/>
✅ **PartSpecifications** : List of PartSpecification<br/>
✅ **PartyIdentifiers** : List of PartyIdentifier<br/>
✅ **PricePlanReferences** : List of PricePlanReference<br/>
✅ **RebateReferences** : List of RebateReference<br/>
✅ **RewardReferences** : List of RewardReference<br/>
✅ **SuperSessions** : List of SuperSession<br/>
✅ **TaxSplits** : List of TaxSplit<br/>
✅ **TextualDetail** : not nullable<br/>
✅ **TextualDetails** : List of TextualDetail<br/>
✅ **TimeSlot** : Range of time for the appointment including start/end times, recurring patterns, and directives.<br/>
✅ **UnitOfMeasure** : value price with unit of measure<br/>
✅ **UnitOfMeasures** : List of UnitOfMeasure<br/>

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


### /part-masters
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters</span> <br/>
        <span class="api-summary">Retrieve a list of all PartMaster records. getPartMasters</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters</span> <br/>
        <span class="api-summary">Create a new PartMaster record. createPartMaster</span>
    </span>
</div>

### /part-masters/{partMasterKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartMaster record. getartMasterById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}</span> <br/>
        <span class="api-summary">Replace a PartMaster record. replacePartMaster</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}</span> <br/>
        <span class="api-summary">Partially update a PartMaster record. updatePartMaster</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}</span> <br/>
        <span class="api-summary">Delete a PartMaster Record deletePartMasterRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure records scoped by partMasterKey. getUnitOfMeasuresByPartMasterKey</span>
    </span>
</div>

### /part-masters/{partMasterKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure record. getnitOfMeasureById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Replace a UnitOfMeasure record. replaceUnitOfMeasure</span>
    </span>
</div>

### /part-masters/{partMasterKey}/price-plan-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references</span> <br/>
        <span class="api-summary">Retrieve a list of PricePlanReference records scoped by partMasterKey. getPricePlanReferencesByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references</span> <br/>
        <span class="api-summary">Create a new PricePlanReference record. createPricePlanReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/price-plan-references/{pricePlanReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlanReference record. getricePlanReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PricePlanReference record. replacePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlanReference record. updatePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PricePlanReference Record deletePricePlanReferenceRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-specifications
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications</span> <br/>
        <span class="api-summary">Retrieve a list of PartSpecification records scoped by partMasterKey. getPartSpecificationsByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications</span> <br/>
        <span class="api-summary">Create a new PartSpecification record. createPartSpecification</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-specifications/{partSpecificationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartSpecification record. getartSpecificationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Replace a PartSpecification record. replacePartSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Partially update a PartSpecification record. updatePartSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Delete a PartSpecification Record deletePartSpecificationRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/party-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/party-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartyIdentifier records scoped by partMasterKey. getPartyIdentifiersByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/party-identifiers</span> <br/>
        <span class="api-summary">Create a new PartyIdentifier record. createPartyIdentifier</span>
    </span>
</div>

### /part-masters/{partMasterKey}/party-identifiers/{partyIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyIdentifier record. getartyIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartyIdentifier record. replacePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartyIdentifier record. updatePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartyIdentifier Record deletePartyIdentifierRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-master-profiles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles</span> <br/>
        <span class="api-summary">Retrieve a list of PartMasterProfile records scoped by partMasterKey. getPartMasterProfilesByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles</span> <br/>
        <span class="api-summary">Create a new PartMasterProfile record. createPartMasterProfile</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-master-profiles/{partMasterProfileKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles/{partMasterProfileKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartMasterProfile record. getartMasterProfileById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles/{partMasterProfileKey}</span> <br/>
        <span class="api-summary">Replace a PartMasterProfile record. replacePartMasterProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles/{partMasterProfileKey}</span> <br/>
        <span class="api-summary">Partially update a PartMasterProfile record. updatePartMasterProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles/{partMasterProfileKey}</span> <br/>
        <span class="api-summary">Delete a PartMasterProfile Record deletePartMasterProfileRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-categories
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories</span> <br/>
        <span class="api-summary">Retrieve a list of PartCategory records scoped by partMasterKey. getPartCategorysByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories</span> <br/>
        <span class="api-summary">Create a new PartCategory record. createPartCategory</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-categories/{partCategoryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories/{partCategoryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartCategory record. getartCategoryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories/{partCategoryKey}</span> <br/>
        <span class="api-summary">Replace a PartCategory record. replacePartCategory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories/{partCategoryKey}</span> <br/>
        <span class="api-summary">Partially update a PartCategory record. updatePartCategory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories/{partCategoryKey}</span> <br/>
        <span class="api-summary">Delete a PartCategory Record deletePartCategoryRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by partMasterKey. getIdentifiersByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /part-masters/{partMasterKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-inventory-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartInventoryReference records scoped by partMasterKey. getPartInventoryReferencesByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references</span> <br/>
        <span class="api-summary">Create a new PartInventoryReference record. createPartInventoryReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-inventory-references/{partInventoryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references/{partInventoryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartInventoryReference record. getartInventoryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references/{partInventoryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartInventoryReference record. replacePartInventoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references/{partInventoryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartInventoryReference record. updatePartInventoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references/{partInventoryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartInventoryReference Record deletePartInventoryReferenceRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names</span> <br/>
        <span class="api-summary">Retrieve a list of PartName records scoped by partMasterKey. getPartNamesByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names</span> <br/>
        <span class="api-summary">Create a new PartName record. createPartName</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-names/{partNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartName record. getartNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Replace a PartName record. replacePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Partially update a PartName record. updatePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Delete a PartName Record deletePartNameRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/lead-times
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times</span> <br/>
        <span class="api-summary">Retrieve a list of LeadTime records scoped by partMasterKey. getLeadTimesByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times</span> <br/>
        <span class="api-summary">Create a new LeadTime record. createLeadTime</span>
    </span>
</div>

### /part-masters/{partMasterKey}/lead-times/{leadTimeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times/{leadTimeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LeadTime record. geteadTimeById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times/{leadTimeKey}</span> <br/>
        <span class="api-summary">Replace a LeadTime record. replaceLeadTime</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times/{leadTimeKey}</span> <br/>
        <span class="api-summary">Partially update a LeadTime record. updateLeadTime</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times/{leadTimeKey}</span> <br/>
        <span class="api-summary">Delete a LeadTime Record deleteLeadTimeRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/super-sessions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions</span> <br/>
        <span class="api-summary">Retrieve a list of SuperSession records scoped by partMasterKey. getSuperSessionsByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions</span> <br/>
        <span class="api-summary">Create a new SuperSession record. createSuperSession</span>
    </span>
</div>

### /part-masters/{partMasterKey}/super-sessions/{superSessionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific SuperSession record. getuperSessionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Replace a SuperSession record. replaceSuperSession</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Partially update a SuperSession record. updateSuperSession</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Delete a SuperSession Record deleteSuperSessionRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartIdentifier records scoped by partMasterKey. getPartIdentifiersByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers</span> <br/>
        <span class="api-summary">Create a new PartIdentifier record. createPartIdentifier</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-identifiers/{partIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartIdentifier record. getartIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartIdentifier record. replacePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartIdentifier record. updatePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartIdentifier Record deletePartIdentifierRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by partMasterKey. getEffectivePeriodsByPartMasterKey</span>
    </span>
</div>

### /part-masters/{partMasterKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-lifecycles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles</span> <br/>
        <span class="api-summary">Retrieve a list of PartLifecycle records scoped by partMasterKey. getPartLifecyclesByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles</span> <br/>
        <span class="api-summary">Create a new PartLifecycle record. createPartLifecycle</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-lifecycles/{partLifecycleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartLifecycle record. getartLifecycleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Replace a PartLifecycle record. replacePartLifecycle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Partially update a PartLifecycle record. updatePartLifecycle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Delete a PartLifecycle Record deletePartLifecycleRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail records scoped by partMasterKey. getTextualDetailsByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/textual-details</span> <br/>
        <span class="api-summary">Create a new TextualDetail record. createTextualDetail</span>
    </span>
</div>

### /part-masters/{partMasterKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail record. getextualDetailById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Replace a TextualDetail record. replaceTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Partially update a TextualDetail record. updateTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Delete a TextualDetail Record deleteTextualDetailRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-master-regulatories
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories</span> <br/>
        <span class="api-summary">Retrieve a list of PartMasterRegulatory records scoped by partMasterKey. getPartMasterRegulatorysByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories</span> <br/>
        <span class="api-summary">Create a new PartMasterRegulatory record. createPartMasterRegulatory</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-master-regulatories/{partMasterRegulatoryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories/{partMasterRegulatoryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartMasterRegulatory record. getartMasterRegulatoryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories/{partMasterRegulatoryKey}</span> <br/>
        <span class="api-summary">Replace a PartMasterRegulatory record. replacePartMasterRegulatory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories/{partMasterRegulatoryKey}</span> <br/>
        <span class="api-summary">Partially update a PartMasterRegulatory record. updatePartMasterRegulatory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories/{partMasterRegulatoryKey}</span> <br/>
        <span class="api-summary">Delete a PartMasterRegulatory Record deletePartMasterRegulatoryRecord</span>
    </span>
</div>

### /part-masters/{partMasterKey}/financial-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplit records scoped by partMasterKey. getFinancialSplitsByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits</span> <br/>
        <span class="api-summary">Create a new FinancialSplit record. createFinancialSplit</span>
    </span>
</div>

### /part-masters/{partMasterKey}/financial-splits/{financialSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplit record. getinancialSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplit record. replaceFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplit record. updateFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplit Record deleteFinancialSplitRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PartMasterroot with key {PartMasterKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **part-master** | /part-masters | listPartMasters | createPartMaster | getPartMasters | updatePartMasters | deletePartMasters |
    | **unit-of-measure** | /part-masters/{partMasterKey}/unit-of-measures | listUnitOfMeasuresByPartMasterKey |  | getUnitOfMeasuresByPartMasterKey | updateUnitOfMeasuresByPartMasterKey | deleteUnitOfMeasuresByPartMasterKey |
    | **price-plan-reference** | /part-masters/{partMasterKey}/price-plan-references | listPricePlanReferencesByPartMasterKey | createPricePlanReference | getPricePlanReferencesByPartMasterKey | updatePricePlanReferencesByPartMasterKey | deletePricePlanReferencesByPartMasterKey |
    | **part-specification** | /part-masters/{partMasterKey}/part-specifications | listPartSpecificationsByPartMasterKey | createPartSpecification | getPartSpecificationsByPartMasterKey | updatePartSpecificationsByPartMasterKey | deletePartSpecificationsByPartMasterKey |
    | **party-identifier** | /part-masters/{partMasterKey}/party-identifiers | listPartyIdentifiersByPartMasterKey | createPartyIdentifier | getPartyIdentifiersByPartMasterKey | updatePartyIdentifiersByPartMasterKey | deletePartyIdentifiersByPartMasterKey |
    | **part-master-profile** | /part-masters/{partMasterKey}/part-master-profiles | listPartMasterProfilesByPartMasterKey | createPartMasterProfile | getPartMasterProfilesByPartMasterKey | updatePartMasterProfilesByPartMasterKey | deletePartMasterProfilesByPartMasterKey |
    | **part-categorie** | /part-masters/{partMasterKey}/part-categories | listPartCategorysByPartMasterKey | createPartCategory | getPartCategorysByPartMasterKey | updatePartCategorysByPartMasterKey | deletePartCategorysByPartMasterKey |
    | **identifier** | /part-masters/{partMasterKey}/identifiers | listIdentifiersByPartMasterKey | createIdentifier | getIdentifiersByPartMasterKey | updateIdentifiersByPartMasterKey | deleteIdentifiersByPartMasterKey |
    | **part-inventory-reference** | /part-masters/{partMasterKey}/part-inventory-references | listPartInventoryReferencesByPartMasterKey | createPartInventoryReference | getPartInventoryReferencesByPartMasterKey | updatePartInventoryReferencesByPartMasterKey | deletePartInventoryReferencesByPartMasterKey |
    | **part-name** | /part-masters/{partMasterKey}/part-names | listPartNamesByPartMasterKey | createPartName | getPartNamesByPartMasterKey | updatePartNamesByPartMasterKey | deletePartNamesByPartMasterKey |
    | **lead-time** | /part-masters/{partMasterKey}/lead-times | listLeadTimesByPartMasterKey | createLeadTime | getLeadTimesByPartMasterKey | updateLeadTimesByPartMasterKey | deleteLeadTimesByPartMasterKey |
    | **super-session** | /part-masters/{partMasterKey}/super-sessions | listSuperSessionsByPartMasterKey | createSuperSession | getSuperSessionsByPartMasterKey | updateSuperSessionsByPartMasterKey | deleteSuperSessionsByPartMasterKey |
    | **part-identifier** | /part-masters/{partMasterKey}/part-identifiers | listPartIdentifiersByPartMasterKey | createPartIdentifier | getPartIdentifiersByPartMasterKey | updatePartIdentifiersByPartMasterKey | deletePartIdentifiersByPartMasterKey |
    | **effective-period** | /part-masters/{partMasterKey}/effective-periods | listEffectivePeriodsByPartMasterKey |  | getEffectivePeriodsByPartMasterKey | updateEffectivePeriodsByPartMasterKey | deleteEffectivePeriodsByPartMasterKey |
    | **part-lifecycle** | /part-masters/{partMasterKey}/part-lifecycles | listPartLifecyclesByPartMasterKey | createPartLifecycle | getPartLifecyclesByPartMasterKey | updatePartLifecyclesByPartMasterKey | deletePartLifecyclesByPartMasterKey |
    | **textual-detail** | /part-masters/{partMasterKey}/textual-details | listTextualDetailsByPartMasterKey | createTextualDetail | getTextualDetailsByPartMasterKey | updateTextualDetailsByPartMasterKey | deleteTextualDetailsByPartMasterKey |
    | **part-master-regulatorie** | /part-masters/{partMasterKey}/part-master-regulatories | listPartMasterRegulatorysByPartMasterKey | createPartMasterRegulatory | getPartMasterRegulatorysByPartMasterKey | updatePartMasterRegulatorysByPartMasterKey | deletePartMasterRegulatorysByPartMasterKey |
    | **financial-split** | /part-masters/{partMasterKey}/financial-splits | listFinancialSplitsByPartMasterKey | createFinancialSplit | getFinancialSplitsByPartMasterKey | updateFinancialSplitsByPartMasterKey | deleteFinancialSplitsByPartMasterKey |

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