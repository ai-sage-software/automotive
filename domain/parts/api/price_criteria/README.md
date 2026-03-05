## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **AddressReference**, **ControlAccountReference**, **CreditReference**, **DiscountMetricValue**, **DiscountReference**, **FeeReference**, **FinancialCategoryReference**, **FinancialSplit**, **Locale**, **PartName**, **PartyReference**, **PriceCriteria**, **PriceCriteriaItem**, **RebateReference**, **RewardReference**, **TaxSplit**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **parts** and **PriceCriteria** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PriceCriteria** | /price-criteria | Manages PriceCriteria |
    | **Locale** | /price-criteria/{priceCriteriaKey}/locales | Manages Locales belonging to PriceCriteria |
    | **RebateReference** | /price-criteria/{priceCriteriaKey}/rebate-references | Manages RebateReferences belonging to PriceCriteria |
    | **PriceCriteriaItem** | /price-criteria/{priceCriteriaKey}/price-criteria-items | Manages PriceCriteriaItems belonging to PriceCriteria |
    | **TaxSplit** | /price-criteria/{priceCriteriaKey}/tax-splits | Manages TaxSplits belonging to PriceCriteria |
    | **DiscountReference** | /price-criteria/{priceCriteriaKey}/discount-references | Manages DiscountReferences belonging to PriceCriteria |
    | **ControlAccountReference** | /price-criteria/{priceCriteriaKey}/control-account-references | Manages ControlAccountReferences belonging to PriceCriteria |
    | **RewardReference** | /price-criteria/{priceCriteriaKey}/reward-references | Manages RewardReferences belonging to PriceCriteria |
    | **CurrencyExchange** | /price-criteria/{priceCriteriaKey}/currency-exchanges | Manages CurrencyExchanges belonging to PriceCriteria |
    | **TimeSlot** | /price-criteria/{priceCriteriaKey}/time-slots | Manages TimeSlots belonging to PriceCriteria |
    | **DiscountMetricValue** | /price-criteria/{priceCriteriaKey}/discount-metric-values | Manages DiscountMetricValues belonging to PriceCriteria |
    | **AddressReference** | /price-criteria/{priceCriteriaKey}/address-references | Manages AddressReferences belonging to PriceCriteria |
    | **FinancialCategoryReference** | /price-criteria/{priceCriteriaKey}/financial-category-references | Manages FinancialCategoryReferences belonging to PriceCriteria |
    | **PartyReference** | /price-criteria/{priceCriteriaKey}/party-references | Manages PartyReferences belonging to PriceCriteria |
    | **FeeReference** | /price-criteria/{priceCriteriaKey}/fee-references | Manages FeeReferences belonging to PriceCriteria |
    | **Identifier** | /price-criteria/{priceCriteriaKey}/identifiers | Manages Identifiers belonging to PriceCriteria |
    | **EventMessage** | /price-criteria/{priceCriteriaKey}/event-messages | Manages EventMessages belonging to PriceCriteria |
    | **PartName** | /price-criteria/{priceCriteriaKey}/part-names | Manages PartNames belonging to PriceCriteria |
    | **Price** | /price-criteria/{priceCriteriaKey}/prices | Manages Prices belonging to PriceCriteria |
    | **EffectivePeriod** | /price-criteria/{priceCriteriaKey}/effective-periods | Manages EffectivePeriods belonging to PriceCriteria |
    | **CreditReference** | /price-criteria/{priceCriteriaKey}/credit-references | Manages CreditReferences belonging to PriceCriteria |
    | **FinancialSplit** | /price-criteria/{priceCriteriaKey}/financial-splits | Manages FinancialSplits belonging to PriceCriteria |


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
> `https://[Your-API-Host]/pricecriterias`

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

💠 **AddressTypes** : types of address.<br/>
💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **EventMessageTypes** : types of event messages.<br/>
💠 **FinancialTransactionTypes** : types of financial transactions.<br/>
💠 **IncentiveTypes** : types of incentives.<br/>
💠 **LedgerActionTypes** : types of ledger actions.<br/>
💠 **OrderCategoryTypes** : types of order categorys.<br/>
💠 **PartNameTypes** : types of part names.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PartyTypes** : types of partys.<br/>
💠 **PayTypes** : types of pays.<br/>
💠 **PaymentTypes** : types of payments.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductPriceItemTypes** : types of product price items.<br/>
💠 **ProductStateTypes** : types of product states.<br/>
💠 **StaffRoleTypes** : types of staff roles.<br/>
💠 **TaxTypes** : types of taxs.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>
💠 **UnitOfMeasureTypes** : types of unit of measures.<br/>

## ✅ Entities

---

✅ **CurrencyExchange** : Details concerning the conversion between different currencies.<br/>
✅ **EffectivePeriod** : The date range during which this record is valid.<br/>
✅ **EventMessage** : A descriptive notification regarding a system or business event.<br/>
✅ **Identifier** : Unique identification key for the record.<br/>
✅ **Price** : The cost or valuation amount.<br/>
✅ **TimeSlot** : Designated window of time for the activity.<br/>

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


### /price-criteria
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria</span> <br/>
        <span class="api-summary">Retrieve a list of PriceCriteria entities. getPriceCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria</span> <br/>
        <span class="api-summary">Create a new PriceCriteria entity. createPriceCriteria</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PriceCriteria entity. getriceCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a PriceCriteria entity. replacePriceCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a PriceCriteria entity. updatePartialPriceCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a PriceCriteria entity deletePriceCriteriaEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/locales
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/locales</span> <br/>
        <span class="api-summary">Retrieve a list of Locale entities scoped by priceCriteriaKey. getLocaleByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/locales</span> <br/>
        <span class="api-summary">Create a new Locale entity. createLocale</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/locales/{localeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Locale entity. getocaleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Replace a Locale entity. replaceLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Partially update a Locale entity. updatePartialLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Delete a Locale entity deleteLocaleEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/rebate-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/rebate-references</span> <br/>
        <span class="api-summary">Retrieve a list of RebateReference entities scoped by priceCriteriaKey. getRebateReferenceByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/rebate-references</span> <br/>
        <span class="api-summary">Create a new RebateReference entity. createRebateReference</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/rebate-references/{rebateReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RebateReference entity. getebateReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RebateReference entity. replaceRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RebateReference entity. updatePartialRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RebateReference entity deleteRebateReferenceEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/price-criteria-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/price-criteria-items</span> <br/>
        <span class="api-summary">Retrieve a list of PriceCriteriaItem entities scoped by priceCriteriaKey. getPriceCriteriaItemByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/price-criteria-items</span> <br/>
        <span class="api-summary">Create a new PriceCriteriaItem entity. createPriceCriteriaItem</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/price-criteria-items/{priceCriteriaItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/price-criteria-items/{priceCriteriaItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PriceCriteriaItem entity. getriceCriteriaItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/price-criteria-items/{priceCriteriaItemKey}</span> <br/>
        <span class="api-summary">Replace a PriceCriteriaItem entity. replacePriceCriteriaItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/price-criteria-items/{priceCriteriaItemKey}</span> <br/>
        <span class="api-summary">Partially update a PriceCriteriaItem entity. updatePartialPriceCriteriaItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/price-criteria-items/{priceCriteriaItemKey}</span> <br/>
        <span class="api-summary">Delete a PriceCriteriaItem entity deletePriceCriteriaItemEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/tax-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/tax-splits</span> <br/>
        <span class="api-summary">Retrieve a list of TaxSplit entities scoped by priceCriteriaKey. getTaxSplitByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/tax-splits</span> <br/>
        <span class="api-summary">Create a new TaxSplit entity. createTaxSplit</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/tax-splits/{taxSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TaxSplit entity. getaxSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Replace a TaxSplit entity. replaceTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Partially update a TaxSplit entity. updatePartialTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Delete a TaxSplit entity deleteTaxSplitEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/discount-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-references</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountReference entities scoped by priceCriteriaKey. getDiscountReferenceByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-references</span> <br/>
        <span class="api-summary">Create a new DiscountReference entity. createDiscountReference</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/discount-references/{discountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountReference entity. getiscountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a DiscountReference entity. replaceDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountReference entity. updatePartialDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a DiscountReference entity deleteDiscountReferenceEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference entities scoped by priceCriteriaKey. getControlAccountReferenceByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference entity. createControlAccountReference</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference entity. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference entity. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference entity. updatePartialControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference entity deleteControlAccountReferenceEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/reward-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/reward-references</span> <br/>
        <span class="api-summary">Retrieve a list of RewardReference entities scoped by priceCriteriaKey. getRewardReferenceByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/reward-references</span> <br/>
        <span class="api-summary">Create a new RewardReference entity. createRewardReference</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/reward-references/{rewardReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RewardReference entity. getewardReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RewardReference entity. replaceRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RewardReference entity. updatePartialRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RewardReference entity deleteRewardReferenceEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/currency-exchanges
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/currency-exchanges</span> <br/>
        <span class="api-summary">Retrieve a list of CurrencyExchange entities scoped by priceCriteriaKey. getCurrencyExchangeByPriceCriteriaKey</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/currency-exchanges/{currencyExchangeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/currency-exchanges/{currencyExchangeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CurrencyExchange entity. geturrencyExchangeById</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by priceCriteriaKey. getTimeSlotByPriceCriteriaKey</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/discount-metric-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-metric-values</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountMetricValue entities scoped by priceCriteriaKey. getDiscountMetricValueByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-metric-values</span> <br/>
        <span class="api-summary">Create a new DiscountMetricValue entity. createDiscountMetricValue</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/discount-metric-values/{discountMetricValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountMetricValue entity. getiscountMetricValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Replace a DiscountMetricValue entity. replaceDiscountMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountMetricValue entity. updatePartialDiscountMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Delete a DiscountMetricValue entity deleteDiscountMetricValueEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference entities scoped by priceCriteriaKey. getAddressReferenceByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference entity. createAddressReference</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference entity. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference entity. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference entity. updatePartialAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference entity deleteAddressReferenceEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/financial-category-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-category-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialCategoryReference entities scoped by priceCriteriaKey. getFinancialCategoryReferenceByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-category-references</span> <br/>
        <span class="api-summary">Create a new FinancialCategoryReference entity. createFinancialCategoryReference</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/financial-category-references/{financialCategoryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialCategoryReference entity. getinancialCategoryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialCategoryReference entity. replaceFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialCategoryReference entity. updatePartialFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialCategoryReference entity deleteFinancialCategoryReferenceEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/party-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/party-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartyReference entities scoped by priceCriteriaKey. getPartyReferenceByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/party-references</span> <br/>
        <span class="api-summary">Create a new PartyReference entity. createPartyReference</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/party-references/{partyReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyReference entity. getartyReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartyReference entity. replacePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartyReference entity. updatePartialPartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartyReference entity deletePartyReferenceEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/fee-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/fee-references</span> <br/>
        <span class="api-summary">Retrieve a list of FeeReference entities scoped by priceCriteriaKey. getFeeReferenceByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/fee-references</span> <br/>
        <span class="api-summary">Create a new FeeReference entity. createFeeReference</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/fee-references/{feeReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FeeReference entity. geteeReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FeeReference entity. replaceFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FeeReference entity. updatePartialFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FeeReference entity deleteFeeReferenceEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by priceCriteriaKey. getIdentifierByPriceCriteriaKey</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/event-messages
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/event-messages</span> <br/>
        <span class="api-summary">Retrieve a list of EventMessage entities scoped by priceCriteriaKey. getEventMessageByPriceCriteriaKey</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/event-messages/{eventMessageKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/event-messages/{eventMessageKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EventMessage entity. getventMessageById</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/part-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/part-names</span> <br/>
        <span class="api-summary">Retrieve a list of PartName entities scoped by priceCriteriaKey. getPartNameByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/part-names</span> <br/>
        <span class="api-summary">Create a new PartName entity. createPartName</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/part-names/{partNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartName entity. getartNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Replace a PartName entity. replacePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Partially update a PartName entity. updatePartialPartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Delete a PartName entity deletePartNameEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by priceCriteriaKey. getPriceByPriceCriteriaKey</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by priceCriteriaKey. getEffectivePeriodByPriceCriteriaKey</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/credit-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/credit-references</span> <br/>
        <span class="api-summary">Retrieve a list of CreditReference entities scoped by priceCriteriaKey. getCreditReferenceByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/credit-references</span> <br/>
        <span class="api-summary">Create a new CreditReference entity. createCreditReference</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/credit-references/{creditReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditReference entity. getreditReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Replace a CreditReference entity. replaceCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a CreditReference entity. updatePartialCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Delete a CreditReference entity deleteCreditReferenceEntity</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/financial-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-splits</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplit entities scoped by priceCriteriaKey. getFinancialSplitByPriceCriteriaKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-splits</span> <br/>
        <span class="api-summary">Create a new FinancialSplit entity. createFinancialSplit</span>
    </span>
</div>

### /price-criteria/{priceCriteriaKey}/financial-splits/{financialSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplit entity. getinancialSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplit entity. replaceFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplit entity. updatePartialFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/price-criteria/{priceCriteriaKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplit entity deleteFinancialSplitEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PriceCriteriaroot with key {PriceCriteriaKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **price-criteria** | /price-criteria | listPriceCriteria | createPriceCriteria | getPriceCriteria | updatePriceCriteria | deletePriceCriteria |
    | **locale** | /price-criteria/{priceCriteriaKey}/locales | listLocaleByPriceCriteriaKey | createLocale | getLocaleByPriceCriteriaKey | updateLocaleByPriceCriteriaKey | deleteLocaleByPriceCriteriaKey |
    | **rebate-reference** | /price-criteria/{priceCriteriaKey}/rebate-references | listRebateReferenceByPriceCriteriaKey | createRebateReference | getRebateReferenceByPriceCriteriaKey | updateRebateReferenceByPriceCriteriaKey | deleteRebateReferenceByPriceCriteriaKey |
    | **price-criteria-item** | /price-criteria/{priceCriteriaKey}/price-criteria-items | listPriceCriteriaItemByPriceCriteriaKey | createPriceCriteriaItem | getPriceCriteriaItemByPriceCriteriaKey | updatePriceCriteriaItemByPriceCriteriaKey | deletePriceCriteriaItemByPriceCriteriaKey |
    | **tax-split** | /price-criteria/{priceCriteriaKey}/tax-splits | listTaxSplitByPriceCriteriaKey | createTaxSplit | getTaxSplitByPriceCriteriaKey | updateTaxSplitByPriceCriteriaKey | deleteTaxSplitByPriceCriteriaKey |
    | **discount-reference** | /price-criteria/{priceCriteriaKey}/discount-references | listDiscountReferenceByPriceCriteriaKey | createDiscountReference | getDiscountReferenceByPriceCriteriaKey | updateDiscountReferenceByPriceCriteriaKey | deleteDiscountReferenceByPriceCriteriaKey |
    | **control-account-reference** | /price-criteria/{priceCriteriaKey}/control-account-references | listControlAccountReferenceByPriceCriteriaKey | createControlAccountReference | getControlAccountReferenceByPriceCriteriaKey | updateControlAccountReferenceByPriceCriteriaKey | deleteControlAccountReferenceByPriceCriteriaKey |
    | **reward-reference** | /price-criteria/{priceCriteriaKey}/reward-references | listRewardReferenceByPriceCriteriaKey | createRewardReference | getRewardReferenceByPriceCriteriaKey | updateRewardReferenceByPriceCriteriaKey | deleteRewardReferenceByPriceCriteriaKey |
    | **currency-exchange** | /price-criteria/{priceCriteriaKey}/currency-exchanges | listCurrencyExchangeByPriceCriteriaKey |  | getCurrencyExchangeByPriceCriteriaKey | updateCurrencyExchangeByPriceCriteriaKey | deleteCurrencyExchangeByPriceCriteriaKey |
    | **time-slot** | /price-criteria/{priceCriteriaKey}/time-slots | listTimeSlotByPriceCriteriaKey |  | getTimeSlotByPriceCriteriaKey | updateTimeSlotByPriceCriteriaKey | deleteTimeSlotByPriceCriteriaKey |
    | **discount-metric-value** | /price-criteria/{priceCriteriaKey}/discount-metric-values | listDiscountMetricValueByPriceCriteriaKey | createDiscountMetricValue | getDiscountMetricValueByPriceCriteriaKey | updateDiscountMetricValueByPriceCriteriaKey | deleteDiscountMetricValueByPriceCriteriaKey |
    | **address-reference** | /price-criteria/{priceCriteriaKey}/address-references | listAddressReferenceByPriceCriteriaKey | createAddressReference | getAddressReferenceByPriceCriteriaKey | updateAddressReferenceByPriceCriteriaKey | deleteAddressReferenceByPriceCriteriaKey |
    | **financial-category-reference** | /price-criteria/{priceCriteriaKey}/financial-category-references | listFinancialCategoryReferenceByPriceCriteriaKey | createFinancialCategoryReference | getFinancialCategoryReferenceByPriceCriteriaKey | updateFinancialCategoryReferenceByPriceCriteriaKey | deleteFinancialCategoryReferenceByPriceCriteriaKey |
    | **party-reference** | /price-criteria/{priceCriteriaKey}/party-references | listPartyReferenceByPriceCriteriaKey | createPartyReference | getPartyReferenceByPriceCriteriaKey | updatePartyReferenceByPriceCriteriaKey | deletePartyReferenceByPriceCriteriaKey |
    | **fee-reference** | /price-criteria/{priceCriteriaKey}/fee-references | listFeeReferenceByPriceCriteriaKey | createFeeReference | getFeeReferenceByPriceCriteriaKey | updateFeeReferenceByPriceCriteriaKey | deleteFeeReferenceByPriceCriteriaKey |
    | **identifier** | /price-criteria/{priceCriteriaKey}/identifiers | listIdentifierByPriceCriteriaKey |  | getIdentifierByPriceCriteriaKey | updateIdentifierByPriceCriteriaKey | deleteIdentifierByPriceCriteriaKey |
    | **event-message** | /price-criteria/{priceCriteriaKey}/event-messages | listEventMessageByPriceCriteriaKey |  | getEventMessageByPriceCriteriaKey | updateEventMessageByPriceCriteriaKey | deleteEventMessageByPriceCriteriaKey |
    | **part-name** | /price-criteria/{priceCriteriaKey}/part-names | listPartNameByPriceCriteriaKey | createPartName | getPartNameByPriceCriteriaKey | updatePartNameByPriceCriteriaKey | deletePartNameByPriceCriteriaKey |
    | **price** | /price-criteria/{priceCriteriaKey}/prices | listPriceByPriceCriteriaKey |  | getPriceByPriceCriteriaKey | updatePriceByPriceCriteriaKey | deletePriceByPriceCriteriaKey |
    | **effective-period** | /price-criteria/{priceCriteriaKey}/effective-periods | listEffectivePeriodByPriceCriteriaKey |  | getEffectivePeriodByPriceCriteriaKey | updateEffectivePeriodByPriceCriteriaKey | deleteEffectivePeriodByPriceCriteriaKey |
    | **credit-reference** | /price-criteria/{priceCriteriaKey}/credit-references | listCreditReferenceByPriceCriteriaKey | createCreditReference | getCreditReferenceByPriceCriteriaKey | updateCreditReferenceByPriceCriteriaKey | deleteCreditReferenceByPriceCriteriaKey |
    | **financial-split** | /price-criteria/{priceCriteriaKey}/financial-splits | listFinancialSplitByPriceCriteriaKey | createFinancialSplit | getFinancialSplitByPriceCriteriaKey | updateFinancialSplitByPriceCriteriaKey | deleteFinancialSplitByPriceCriteriaKey |

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

## Bulk Create PriceCriteria (`POST /pricecriterias/batch`)

The `/pricecriterias/batch` endpoint allows you to create multiple PriceCriteria entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of PriceCriteria and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `PriceCriteriaCreate` schema.

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

Contains the full objects of the PriceCriteria that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A PriceCriteria with SKU W-002 already exists."
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

## Health Check (`GET /pricecriterias/health`)

The `/pricecriterias/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the PriceCriteria aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## PriceCriteria Commands and State Management

The pricecriterias API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /pricecriterias/{PriceCriteriaKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a PriceCriteria (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /pricecriterias/{PriceCriteriaKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /pricecriterias/capabilities`)

Before sending a command, you can "discover" what actions are valid for a PriceCriteria based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the PriceCriteria must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelPriceCriteria` | `CREATED`, `ACTIVE` | `DELETED` | Voids the PriceCriteria . |
| `ActivatePriceCriteria` | `PENDING` | `ACTIVE` | Moves a PriceCriteria into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |
