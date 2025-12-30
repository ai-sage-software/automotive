## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **ControlAccountReference**, **CreditReference**, **DiscountReference**, **EffectivePeriod**, **FeeReference**, **FinancialCategoryReference**, **FinancialSplit**, **Identifier**, **LeadTime**, **PartCategory**, **PartIdentifier**, **PartInventoryReference**, **PartLifecycle**, **PartMaster**, **PartMasterProfile**, **PartMasterRegulatory**, **PartName**, **PartSpecification**, **Price**, **PricePlanReference**, **RebateReference**, **RewardReference**, **SuperSession**, **TaxSplit**, **TextualDetail**, **UnitOfMeasure**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service_parts** and **PartMaster** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PartMaster** | /part-masters | Manages PartMasters |
    | **DiscountReference** | /part-masters/{partMasterKey}/discount-references | Manages DiscountReferences belonging to PartMasters |
    | **PartMasterProfile** | /part-masters/{partMasterKey}/part-master-profiles | Manages PartMasterProfiles belonging to PartMasters |
    | **PartCategorie** | /part-masters/{partMasterKey}/part-categories | Manages PartCategories belonging to PartMasters |
    | **FinancialCategoryReference** | /part-masters/{partMasterKey}/financial-category-references | Manages FinancialCategoryReferences belonging to PartMasters |
    | **FeeReference** | /part-masters/{partMasterKey}/fee-references | Manages FeeReferences belonging to PartMasters |
    | **Identifier** | /part-masters/{partMasterKey}/identifiers | Manages Identifiers belonging to PartMasters |
    | **PartName** | /part-masters/{partMasterKey}/part-names | Manages PartNames belonging to PartMasters |
    | **PartIdentifier** | /part-masters/{partMasterKey}/part-identifiers | Manages PartIdentifiers belonging to PartMasters |
    | **PartLifecycle** | /part-masters/{partMasterKey}/part-lifecycles | Manages PartLifecycles belonging to PartMasters |
    | **CreditReference** | /part-masters/{partMasterKey}/credit-references | Manages CreditReferences belonging to PartMasters |
    | **RebateReference** | /part-masters/{partMasterKey}/rebate-references | Manages RebateReferences belonging to PartMasters |
    | **UnitOfMeasure** | /part-masters/{partMasterKey}/unit-of-measures | Manages UnitOfMeasures belonging to PartMasters |
    | **TaxSplit** | /part-masters/{partMasterKey}/tax-splits | Manages TaxSplits belonging to PartMasters |
    | **PricePlanReference** | /part-masters/{partMasterKey}/price-plan-references | Manages PricePlanReferences belonging to PartMasters |
    | **PartSpecification** | /part-masters/{partMasterKey}/part-specifications | Manages PartSpecifications belonging to PartMasters |
    | **ControlAccountReference** | /part-masters/{partMasterKey}/control-account-references | Manages ControlAccountReferences belonging to PartMasters |
    | **RewardReference** | /part-masters/{partMasterKey}/reward-references | Manages RewardReferences belonging to PartMasters |
    | **PartInventoryReference** | /part-masters/{partMasterKey}/part-inventory-references | Manages PartInventoryReferences belonging to PartMasters |
    | **LeadTime** | /part-masters/{partMasterKey}/lead-times | Manages LeadTimes belonging to PartMasters |
    | **SuperSession** | /part-masters/{partMasterKey}/super-sessions | Manages SuperSessions belonging to PartMasters |
    | **Price** | /part-masters/{partMasterKey}/prices | Manages Prices belonging to PartMasters |
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
> `https://[Your-API-Host]/partmasters`

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

💠 **FinancialSplitTypes** : types of financial splits.<br/>
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
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductConsumptionTypes** : types of product consumptions.<br/>
💠 **ProductPackageTypes** : types of product packages.<br/>
💠 **ProductStageTypes** : types of product stages.<br/>
💠 **SalesStatusTypes** : types of sales status.<br/>
💠 **TaxTypes** : types of taxs.<br/>
💠 **UOMLeadTimeTypes** : types of u o m lead times.<br/>
💠 **UOMQuantityCategoryTypes** : types of u o m quantity categorys.<br/>
💠 **UOMTimeTypes** : types of u o m times.<br/>
💠 **DurationUOMTypes** : Units of Measure for Durations<br/>
💠 **PartMasterSuperSessionTypes** : entity<br/>

## ✅ Entities

---


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
        <span class="api-summary">Retrieve a list of PartMaster entities. getPartMaster</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters</span> <br/>
        <span class="api-summary">Create a new PartMaster entity. createPartMaster</span>
    </span>
</div>

### /part-masters/{partMasterKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartMaster entity. getartMasterById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}</span> <br/>
        <span class="api-summary">Replace a PartMaster entity. replacePartMaster</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}</span> <br/>
        <span class="api-summary">Partially update a PartMaster entity. updatePartMaster</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}</span> <br/>
        <span class="api-summary">Delete a PartMaster entity deletePartMasterEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/discount-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/discount-references</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountReference entities scoped by partMasterKey. getDiscountReferenceByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/discount-references</span> <br/>
        <span class="api-summary">Create a new DiscountReference entity. createDiscountReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/discount-references/{discountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountReference entity. getiscountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a DiscountReference entity. replaceDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountReference entity. updateDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a DiscountReference entity deleteDiscountReferenceEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-master-profiles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles</span> <br/>
        <span class="api-summary">Retrieve a list of PartMasterProfile entities scoped by partMasterKey. getPartMasterProfileByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles</span> <br/>
        <span class="api-summary">Create a new PartMasterProfile entity. createPartMasterProfile</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-master-profiles/{partMasterProfileKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles/{partMasterProfileKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartMasterProfile entity. getartMasterProfileById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles/{partMasterProfileKey}</span> <br/>
        <span class="api-summary">Replace a PartMasterProfile entity. replacePartMasterProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles/{partMasterProfileKey}</span> <br/>
        <span class="api-summary">Partially update a PartMasterProfile entity. updatePartMasterProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-profiles/{partMasterProfileKey}</span> <br/>
        <span class="api-summary">Delete a PartMasterProfile entity deletePartMasterProfileEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-categories
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories</span> <br/>
        <span class="api-summary">Retrieve a list of PartCategory entities scoped by partMasterKey. getPartCategoryByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories</span> <br/>
        <span class="api-summary">Create a new PartCategory entity. createPartCategory</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-categories/{partCategoryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories/{partCategoryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartCategory entity. getartCategoryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories/{partCategoryKey}</span> <br/>
        <span class="api-summary">Replace a PartCategory entity. replacePartCategory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories/{partCategoryKey}</span> <br/>
        <span class="api-summary">Partially update a PartCategory entity. updatePartCategory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-categories/{partCategoryKey}</span> <br/>
        <span class="api-summary">Delete a PartCategory entity deletePartCategoryEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/financial-category-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-category-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialCategoryReference entities scoped by partMasterKey. getFinancialCategoryReferenceByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-category-references</span> <br/>
        <span class="api-summary">Create a new FinancialCategoryReference entity. createFinancialCategoryReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/financial-category-references/{financialCategoryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialCategoryReference entity. getinancialCategoryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialCategoryReference entity. replaceFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialCategoryReference entity. updateFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialCategoryReference entity deleteFinancialCategoryReferenceEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/fee-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/fee-references</span> <br/>
        <span class="api-summary">Retrieve a list of FeeReference entities scoped by partMasterKey. getFeeReferenceByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/fee-references</span> <br/>
        <span class="api-summary">Create a new FeeReference entity. createFeeReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/fee-references/{feeReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FeeReference entity. geteeReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FeeReference entity. replaceFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FeeReference entity. updateFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FeeReference entity deleteFeeReferenceEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by partMasterKey. getIdentifierByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /part-masters/{partMasterKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names</span> <br/>
        <span class="api-summary">Retrieve a list of PartName entities scoped by partMasterKey. getPartNameByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names</span> <br/>
        <span class="api-summary">Create a new PartName entity. createPartName</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-names/{partNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartName entity. getartNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Replace a PartName entity. replacePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Partially update a PartName entity. updatePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Delete a PartName entity deletePartNameEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartIdentifier entities scoped by partMasterKey. getPartIdentifierByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers</span> <br/>
        <span class="api-summary">Create a new PartIdentifier entity. createPartIdentifier</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-identifiers/{partIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartIdentifier entity. getartIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartIdentifier entity. replacePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartIdentifier entity. updatePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartIdentifier entity deletePartIdentifierEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-lifecycles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles</span> <br/>
        <span class="api-summary">Retrieve a list of PartLifecycle entities scoped by partMasterKey. getPartLifecycleByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles</span> <br/>
        <span class="api-summary">Create a new PartLifecycle entity. createPartLifecycle</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-lifecycles/{partLifecycleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartLifecycle entity. getartLifecycleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Replace a PartLifecycle entity. replacePartLifecycle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Partially update a PartLifecycle entity. updatePartLifecycle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-lifecycles/{partLifecycleKey}</span> <br/>
        <span class="api-summary">Delete a PartLifecycle entity deletePartLifecycleEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/credit-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/credit-references</span> <br/>
        <span class="api-summary">Retrieve a list of CreditReference entities scoped by partMasterKey. getCreditReferenceByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/credit-references</span> <br/>
        <span class="api-summary">Create a new CreditReference entity. createCreditReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/credit-references/{creditReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditReference entity. getreditReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Replace a CreditReference entity. replaceCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a CreditReference entity. updateCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Delete a CreditReference entity deleteCreditReferenceEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/rebate-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/rebate-references</span> <br/>
        <span class="api-summary">Retrieve a list of RebateReference entities scoped by partMasterKey. getRebateReferenceByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/rebate-references</span> <br/>
        <span class="api-summary">Create a new RebateReference entity. createRebateReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/rebate-references/{rebateReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RebateReference entity. getebateReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RebateReference entity. replaceRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RebateReference entity. updateRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RebateReference entity deleteRebateReferenceEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure entities scoped by partMasterKey. getUnitOfMeasureByPartMasterKey</span>
    </span>
</div>

### /part-masters/{partMasterKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure entity. getnitOfMeasureById</span>
    </span>
</div>

### /part-masters/{partMasterKey}/tax-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/tax-splits</span> <br/>
        <span class="api-summary">Retrieve a list of TaxSplit entities scoped by partMasterKey. getTaxSplitByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/tax-splits</span> <br/>
        <span class="api-summary">Create a new TaxSplit entity. createTaxSplit</span>
    </span>
</div>

### /part-masters/{partMasterKey}/tax-splits/{taxSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TaxSplit entity. getaxSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Replace a TaxSplit entity. replaceTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Partially update a TaxSplit entity. updateTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Delete a TaxSplit entity deleteTaxSplitEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/price-plan-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references</span> <br/>
        <span class="api-summary">Retrieve a list of PricePlanReference entities scoped by partMasterKey. getPricePlanReferenceByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references</span> <br/>
        <span class="api-summary">Create a new PricePlanReference entity. createPricePlanReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/price-plan-references/{pricePlanReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlanReference entity. getricePlanReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PricePlanReference entity. replacePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlanReference entity. updatePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PricePlanReference entity deletePricePlanReferenceEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-specifications
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications</span> <br/>
        <span class="api-summary">Retrieve a list of PartSpecification entities scoped by partMasterKey. getPartSpecificationByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications</span> <br/>
        <span class="api-summary">Create a new PartSpecification entity. createPartSpecification</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-specifications/{partSpecificationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartSpecification entity. getartSpecificationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Replace a PartSpecification entity. replacePartSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Partially update a PartSpecification entity. updatePartSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Delete a PartSpecification entity deletePartSpecificationEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference entities scoped by partMasterKey. getControlAccountReferenceByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference entity. createControlAccountReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference entity. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference entity. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference entity. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference entity deleteControlAccountReferenceEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/reward-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/reward-references</span> <br/>
        <span class="api-summary">Retrieve a list of RewardReference entities scoped by partMasterKey. getRewardReferenceByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/reward-references</span> <br/>
        <span class="api-summary">Create a new RewardReference entity. createRewardReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/reward-references/{rewardReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RewardReference entity. getewardReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RewardReference entity. replaceRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RewardReference entity. updateRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RewardReference entity deleteRewardReferenceEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-inventory-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartInventoryReference entities scoped by partMasterKey. getPartInventoryReferenceByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references</span> <br/>
        <span class="api-summary">Create a new PartInventoryReference entity. createPartInventoryReference</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-inventory-references/{partInventoryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references/{partInventoryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartInventoryReference entity. getartInventoryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references/{partInventoryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartInventoryReference entity. replacePartInventoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references/{partInventoryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartInventoryReference entity. updatePartInventoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-inventory-references/{partInventoryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartInventoryReference entity deletePartInventoryReferenceEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/lead-times
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times</span> <br/>
        <span class="api-summary">Retrieve a list of LeadTime entities scoped by partMasterKey. getLeadTimeByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times</span> <br/>
        <span class="api-summary">Create a new LeadTime entity. createLeadTime</span>
    </span>
</div>

### /part-masters/{partMasterKey}/lead-times/{leadTimeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times/{leadTimeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LeadTime entity. geteadTimeById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times/{leadTimeKey}</span> <br/>
        <span class="api-summary">Replace a LeadTime entity. replaceLeadTime</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times/{leadTimeKey}</span> <br/>
        <span class="api-summary">Partially update a LeadTime entity. updateLeadTime</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/lead-times/{leadTimeKey}</span> <br/>
        <span class="api-summary">Delete a LeadTime entity deleteLeadTimeEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/super-sessions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions</span> <br/>
        <span class="api-summary">Retrieve a list of SuperSession entities scoped by partMasterKey. getSuperSessionByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions</span> <br/>
        <span class="api-summary">Create a new SuperSession entity. createSuperSession</span>
    </span>
</div>

### /part-masters/{partMasterKey}/super-sessions/{superSessionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific SuperSession entity. getuperSessionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Replace a SuperSession entity. replaceSuperSession</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Partially update a SuperSession entity. updateSuperSession</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/super-sessions/{superSessionKey}</span> <br/>
        <span class="api-summary">Delete a SuperSession entity deleteSuperSessionEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by partMasterKey. getPriceByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price entity. createPrice</span>
    </span>
</div>

### /part-masters/{partMasterKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price entity. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price entity. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price entity deletePriceEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail entities scoped by partMasterKey. getTextualDetailByPartMasterKey</span>
    </span>
</div>

### /part-masters/{partMasterKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail entity. getextualDetailById</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-master-regulatories
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories</span> <br/>
        <span class="api-summary">Retrieve a list of PartMasterRegulatory entities scoped by partMasterKey. getPartMasterRegulatoryByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories</span> <br/>
        <span class="api-summary">Create a new PartMasterRegulatory entity. createPartMasterRegulatory</span>
    </span>
</div>

### /part-masters/{partMasterKey}/part-master-regulatories/{partMasterRegulatoryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories/{partMasterRegulatoryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartMasterRegulatory entity. getartMasterRegulatoryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories/{partMasterRegulatoryKey}</span> <br/>
        <span class="api-summary">Replace a PartMasterRegulatory entity. replacePartMasterRegulatory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories/{partMasterRegulatoryKey}</span> <br/>
        <span class="api-summary">Partially update a PartMasterRegulatory entity. updatePartMasterRegulatory</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/part-master-regulatories/{partMasterRegulatoryKey}</span> <br/>
        <span class="api-summary">Delete a PartMasterRegulatory entity deletePartMasterRegulatoryEntity</span>
    </span>
</div>

### /part-masters/{partMasterKey}/financial-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplit entities scoped by partMasterKey. getFinancialSplitByPartMasterKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits</span> <br/>
        <span class="api-summary">Create a new FinancialSplit entity. createFinancialSplit</span>
    </span>
</div>

### /part-masters/{partMasterKey}/financial-splits/{financialSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplit entity. getinancialSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplit entity. replaceFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplit entity. updateFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-masters/{partMasterKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplit entity deleteFinancialSplitEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PartMasterroot with key {PartMasterKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **part-master** | /part-masters | listPartMaster | createPartMaster | getPartMaster | updatePartMaster | deletePartMaster |
    | **discount-reference** | /part-masters/{partMasterKey}/discount-references | listDiscountReferenceByPartMasterKey | createDiscountReference | getDiscountReferenceByPartMasterKey | updateDiscountReferenceByPartMasterKey | deleteDiscountReferenceByPartMasterKey |
    | **part-master-profile** | /part-masters/{partMasterKey}/part-master-profiles | listPartMasterProfileByPartMasterKey | createPartMasterProfile | getPartMasterProfileByPartMasterKey | updatePartMasterProfileByPartMasterKey | deletePartMasterProfileByPartMasterKey |
    | **part-categorie** | /part-masters/{partMasterKey}/part-categories | listPartCategoryByPartMasterKey | createPartCategory | getPartCategoryByPartMasterKey | updatePartCategoryByPartMasterKey | deletePartCategoryByPartMasterKey |
    | **financial-category-reference** | /part-masters/{partMasterKey}/financial-category-references | listFinancialCategoryReferenceByPartMasterKey | createFinancialCategoryReference | getFinancialCategoryReferenceByPartMasterKey | updateFinancialCategoryReferenceByPartMasterKey | deleteFinancialCategoryReferenceByPartMasterKey |
    | **fee-reference** | /part-masters/{partMasterKey}/fee-references | listFeeReferenceByPartMasterKey | createFeeReference | getFeeReferenceByPartMasterKey | updateFeeReferenceByPartMasterKey | deleteFeeReferenceByPartMasterKey |
    | **identifier** | /part-masters/{partMasterKey}/identifiers | listIdentifierByPartMasterKey | createIdentifier | getIdentifierByPartMasterKey | updateIdentifierByPartMasterKey | deleteIdentifierByPartMasterKey |
    | **part-name** | /part-masters/{partMasterKey}/part-names | listPartNameByPartMasterKey | createPartName | getPartNameByPartMasterKey | updatePartNameByPartMasterKey | deletePartNameByPartMasterKey |
    | **part-identifier** | /part-masters/{partMasterKey}/part-identifiers | listPartIdentifierByPartMasterKey | createPartIdentifier | getPartIdentifierByPartMasterKey | updatePartIdentifierByPartMasterKey | deletePartIdentifierByPartMasterKey |
    | **part-lifecycle** | /part-masters/{partMasterKey}/part-lifecycles | listPartLifecycleByPartMasterKey | createPartLifecycle | getPartLifecycleByPartMasterKey | updatePartLifecycleByPartMasterKey | deletePartLifecycleByPartMasterKey |
    | **credit-reference** | /part-masters/{partMasterKey}/credit-references | listCreditReferenceByPartMasterKey | createCreditReference | getCreditReferenceByPartMasterKey | updateCreditReferenceByPartMasterKey | deleteCreditReferenceByPartMasterKey |
    | **rebate-reference** | /part-masters/{partMasterKey}/rebate-references | listRebateReferenceByPartMasterKey | createRebateReference | getRebateReferenceByPartMasterKey | updateRebateReferenceByPartMasterKey | deleteRebateReferenceByPartMasterKey |
    | **unit-of-measure** | /part-masters/{partMasterKey}/unit-of-measures | listUnitOfMeasureByPartMasterKey |  | getUnitOfMeasureByPartMasterKey | updateUnitOfMeasureByPartMasterKey | deleteUnitOfMeasureByPartMasterKey |
    | **tax-split** | /part-masters/{partMasterKey}/tax-splits | listTaxSplitByPartMasterKey | createTaxSplit | getTaxSplitByPartMasterKey | updateTaxSplitByPartMasterKey | deleteTaxSplitByPartMasterKey |
    | **price-plan-reference** | /part-masters/{partMasterKey}/price-plan-references | listPricePlanReferenceByPartMasterKey | createPricePlanReference | getPricePlanReferenceByPartMasterKey | updatePricePlanReferenceByPartMasterKey | deletePricePlanReferenceByPartMasterKey |
    | **part-specification** | /part-masters/{partMasterKey}/part-specifications | listPartSpecificationByPartMasterKey | createPartSpecification | getPartSpecificationByPartMasterKey | updatePartSpecificationByPartMasterKey | deletePartSpecificationByPartMasterKey |
    | **control-account-reference** | /part-masters/{partMasterKey}/control-account-references | listControlAccountReferenceByPartMasterKey | createControlAccountReference | getControlAccountReferenceByPartMasterKey | updateControlAccountReferenceByPartMasterKey | deleteControlAccountReferenceByPartMasterKey |
    | **reward-reference** | /part-masters/{partMasterKey}/reward-references | listRewardReferenceByPartMasterKey | createRewardReference | getRewardReferenceByPartMasterKey | updateRewardReferenceByPartMasterKey | deleteRewardReferenceByPartMasterKey |
    | **part-inventory-reference** | /part-masters/{partMasterKey}/part-inventory-references | listPartInventoryReferenceByPartMasterKey | createPartInventoryReference | getPartInventoryReferenceByPartMasterKey | updatePartInventoryReferenceByPartMasterKey | deletePartInventoryReferenceByPartMasterKey |
    | **lead-time** | /part-masters/{partMasterKey}/lead-times | listLeadTimeByPartMasterKey | createLeadTime | getLeadTimeByPartMasterKey | updateLeadTimeByPartMasterKey | deleteLeadTimeByPartMasterKey |
    | **super-session** | /part-masters/{partMasterKey}/super-sessions | listSuperSessionByPartMasterKey | createSuperSession | getSuperSessionByPartMasterKey | updateSuperSessionByPartMasterKey | deleteSuperSessionByPartMasterKey |
    | **price** | /part-masters/{partMasterKey}/prices | listPriceByPartMasterKey | createPrice | getPriceByPartMasterKey | updatePriceByPartMasterKey | deletePriceByPartMasterKey |
    | **textual-detail** | /part-masters/{partMasterKey}/textual-details | listTextualDetailByPartMasterKey |  | getTextualDetailByPartMasterKey | updateTextualDetailByPartMasterKey | deleteTextualDetailByPartMasterKey |
    | **part-master-regulatorie** | /part-masters/{partMasterKey}/part-master-regulatories | listPartMasterRegulatoryByPartMasterKey | createPartMasterRegulatory | getPartMasterRegulatoryByPartMasterKey | updatePartMasterRegulatoryByPartMasterKey | deletePartMasterRegulatoryByPartMasterKey |
    | **financial-split** | /part-masters/{partMasterKey}/financial-splits | listFinancialSplitByPartMasterKey | createFinancialSplit | getFinancialSplitByPartMasterKey | updateFinancialSplitByPartMasterKey | deleteFinancialSplitByPartMasterKey |

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

## Bulk Create PartMaster (`POST /partmasters/batch`)

The `/partmasters/batch` endpoint allows you to create multiple PartMaster entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of PartMaster and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `PartMasterCreate` schema.

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

Contains the full objects of the PartMaster that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A PartMaster with SKU W-002 already exists."
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

## Health Check (`GET /partmasters/health`)

The `/partmasters/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the PartMaster aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## PartMaster Commands and State Management

The partmasters API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /partmasters/{PartMasterKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a PartMaster (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /partmasters/{PartMasterKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /partmasters/capabilities`)

Before sending a command, you can "discover" what actions are valid for a PartMaster based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the PartMaster must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelPartMaster` | `CREATED`, `ACTIVE` | `DELETED` | Voids the PartMaster . |
| `ActivatePartMaster` | `PENDING` | `ACTIVE` | Moves a PartMaster into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |