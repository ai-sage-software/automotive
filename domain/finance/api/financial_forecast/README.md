## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **ControlAccountReference**, **CreditReference**, **DiscountReference**, **FeeReference**, **FinancialCategoryReference**, **FinancialEvent**, **FinancialForecast**, **FinancialSplit**, **FinancialTrack**, **Identifier**, **Price**, **RebateReference**, **RewardReference**, **TaxSplit**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **finance** and **FinancialForecast** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **FinancialForecast** | /financial-forecasts | Manages FinancialForecasts |
    | **RebateReference** | /financial-forecasts/{financialForecastKey}/rebate-references | Manages RebateReferences belonging to FinancialForecasts |
    | **TaxSplit** | /financial-forecasts/{financialForecastKey}/tax-splits | Manages TaxSplits belonging to FinancialForecasts |
    | **DiscountReference** | /financial-forecasts/{financialForecastKey}/discount-references | Manages DiscountReferences belonging to FinancialForecasts |
    | **ControlAccountReference** | /financial-forecasts/{financialForecastKey}/control-account-references | Manages ControlAccountReferences belonging to FinancialForecasts |
    | **RewardReference** | /financial-forecasts/{financialForecastKey}/reward-references | Manages RewardReferences belonging to FinancialForecasts |
    | **FinancialCategoryReference** | /financial-forecasts/{financialForecastKey}/financial-category-references | Manages FinancialCategoryReferences belonging to FinancialForecasts |
    | **FeeReference** | /financial-forecasts/{financialForecastKey}/fee-references | Manages FeeReferences belonging to FinancialForecasts |
    | **Identifier** | /financial-forecasts/{financialForecastKey}/identifiers | Manages Identifiers belonging to FinancialForecasts |
    | **Price** | /financial-forecasts/{financialForecastKey}/prices | Manages Prices belonging to FinancialForecasts |
    | **FinancialEvent** | /financial-forecasts/{financialForecastKey}/financial-events | Manages FinancialEvents belonging to FinancialForecasts |
    | **CreditReference** | /financial-forecasts/{financialForecastKey}/credit-references | Manages CreditReferences belonging to FinancialForecasts |
    | **TextualDetail** | /financial-forecasts/{financialForecastKey}/textual-details | Manages TextualDetails belonging to FinancialForecasts |
    | **FinancialTrack** | /financial-forecasts/{financialForecastKey}/financial-tracks | Manages FinancialTracks belonging to FinancialForecasts |
    | **FinancialSplit** | /financial-forecasts/{financialForecastKey}/financial-splits | Manages FinancialSplits belonging to FinancialForecasts |


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
> `https://[Your-API-Host]/financial-forecast`

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

💠 **FinancialEventTypes** : types of financial events.<br/>
💠 **FinancialTransactionTypes** : types of financial transactions.<br/>
💠 **LedgerActionTypes** : types of ledger actions.<br/>
💠 **PaymentMethodTypes** : types of payment methods.<br/>
💠 **PaymentTransactionStatusTypes** : types of payment transaction status.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductPriceItemTypes** : types of product price items.<br/>
💠 **ResourceTypes** : types of resources.<br/>
💠 **TaxTypes** : types of taxs.<br/>
💠 **DurationUOMTypes** : Units of Measure for Durations<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : Effective Period<br/>
✅ **TextualDetail** : not nullable<br/>

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


### /financial-forecasts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts</span> <br/>
        <span class="api-summary">Retrieve a list of all FinancialForecast records. getFinancialForecasts</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts</span> <br/>
        <span class="api-summary">Create a new FinancialForecast record. createFinancialForecast</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialForecast record. getinancialForecastById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}</span> <br/>
        <span class="api-summary">Replace a FinancialForecast record. replaceFinancialForecast</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialForecast record. updateFinancialForecast</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}</span> <br/>
        <span class="api-summary">Delete a FinancialForecast Record deleteFinancialForecastRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/rebate-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/rebate-references</span> <br/>
        <span class="api-summary">Retrieve a list of RebateReference records scoped by financialForecastKey. getRebateReferencesByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/rebate-references</span> <br/>
        <span class="api-summary">Create a new RebateReference record. createRebateReference</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/rebate-references/{rebateReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RebateReference record. getebateReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RebateReference record. replaceRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RebateReference record. updateRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RebateReference Record deleteRebateReferenceRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/tax-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/tax-splits</span> <br/>
        <span class="api-summary">Retrieve a list of TaxSplit records scoped by financialForecastKey. getTaxSplitsByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/tax-splits</span> <br/>
        <span class="api-summary">Create a new TaxSplit record. createTaxSplit</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/tax-splits/{taxSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TaxSplit record. getaxSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Replace a TaxSplit record. replaceTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Partially update a TaxSplit record. updateTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Delete a TaxSplit Record deleteTaxSplitRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/discount-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/discount-references</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountReference records scoped by financialForecastKey. getDiscountReferencesByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/discount-references</span> <br/>
        <span class="api-summary">Create a new DiscountReference record. createDiscountReference</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/discount-references/{discountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountReference record. getiscountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a DiscountReference record. replaceDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountReference record. updateDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a DiscountReference Record deleteDiscountReferenceRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference records scoped by financialForecastKey. getControlAccountReferencesByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference record. createControlAccountReference</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference record. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference record. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference record. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference Record deleteControlAccountReferenceRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/reward-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/reward-references</span> <br/>
        <span class="api-summary">Retrieve a list of RewardReference records scoped by financialForecastKey. getRewardReferencesByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/reward-references</span> <br/>
        <span class="api-summary">Create a new RewardReference record. createRewardReference</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/reward-references/{rewardReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RewardReference record. getewardReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RewardReference record. replaceRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RewardReference record. updateRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RewardReference Record deleteRewardReferenceRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/financial-category-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-category-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialCategoryReference records scoped by financialForecastKey. getFinancialCategoryReferencesByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-category-references</span> <br/>
        <span class="api-summary">Create a new FinancialCategoryReference record. createFinancialCategoryReference</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/financial-category-references/{financialCategoryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialCategoryReference record. getinancialCategoryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialCategoryReference record. replaceFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialCategoryReference record. updateFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialCategoryReference Record deleteFinancialCategoryReferenceRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/fee-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/fee-references</span> <br/>
        <span class="api-summary">Retrieve a list of FeeReference records scoped by financialForecastKey. getFeeReferencesByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/fee-references</span> <br/>
        <span class="api-summary">Create a new FeeReference record. createFeeReference</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/fee-references/{feeReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FeeReference record. geteeReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FeeReference record. replaceFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FeeReference record. updateFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FeeReference Record deleteFeeReferenceRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by financialForecastKey. getIdentifiersByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price records scoped by financialForecastKey. getPricesByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price record. createPrice</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price record. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price record. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price record. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price Record deletePriceRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/financial-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-events</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialEvent records scoped by financialForecastKey. getFinancialEventsByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-events</span> <br/>
        <span class="api-summary">Create a new FinancialEvent record. createFinancialEvent</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/financial-events/{financialEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialEvent record. getinancialEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Replace a FinancialEvent record. replaceFinancialEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialEvent record. updateFinancialEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Delete a FinancialEvent Record deleteFinancialEventRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/credit-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/credit-references</span> <br/>
        <span class="api-summary">Retrieve a list of CreditReference records scoped by financialForecastKey. getCreditReferencesByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/credit-references</span> <br/>
        <span class="api-summary">Create a new CreditReference record. createCreditReference</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/credit-references/{creditReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditReference record. getreditReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Replace a CreditReference record. replaceCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a CreditReference record. updateCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Delete a CreditReference Record deleteCreditReferenceRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail records scoped by financialForecastKey. getTextualDetailsByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/textual-details</span> <br/>
        <span class="api-summary">Create a new TextualDetail record. createTextualDetail</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail record. getextualDetailById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Replace a TextualDetail record. replaceTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Partially update a TextualDetail record. updateTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Delete a TextualDetail Record deleteTextualDetailRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/financial-tracks
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-tracks</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialTrack records scoped by financialForecastKey. getFinancialTracksByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-tracks</span> <br/>
        <span class="api-summary">Create a new FinancialTrack record. createFinancialTrack</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/financial-tracks/{financialTrackKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialTrack record. getinancialTrackById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Replace a FinancialTrack record. replaceFinancialTrack</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialTrack record. updateFinancialTrack</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Delete a FinancialTrack Record deleteFinancialTrackRecord</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/financial-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-splits</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplit records scoped by financialForecastKey. getFinancialSplitsByFinancialForecastKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-splits</span> <br/>
        <span class="api-summary">Create a new FinancialSplit record. createFinancialSplit</span>
    </span>
</div>

### /financial-forecasts/{financialForecastKey}/financial-splits/{financialSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplit record. getinancialSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplit record. replaceFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplit record. updateFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-forecasts/{financialForecastKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplit Record deleteFinancialSplitRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under FinancialForecastroot with key {FinancialForecastKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **financial-forecast** | /financial-forecasts | listFinancialForecasts | createFinancialForecast | getFinancialForecasts | updateFinancialForecasts | deleteFinancialForecasts |
    | **rebate-reference** | /financial-forecasts/{financialForecastKey}/rebate-references | listRebateReferencesByFinancialForecastKey | createRebateReference | getRebateReferencesByFinancialForecastKey | updateRebateReferencesByFinancialForecastKey | deleteRebateReferencesByFinancialForecastKey |
    | **tax-split** | /financial-forecasts/{financialForecastKey}/tax-splits | listTaxSplitsByFinancialForecastKey | createTaxSplit | getTaxSplitsByFinancialForecastKey | updateTaxSplitsByFinancialForecastKey | deleteTaxSplitsByFinancialForecastKey |
    | **discount-reference** | /financial-forecasts/{financialForecastKey}/discount-references | listDiscountReferencesByFinancialForecastKey | createDiscountReference | getDiscountReferencesByFinancialForecastKey | updateDiscountReferencesByFinancialForecastKey | deleteDiscountReferencesByFinancialForecastKey |
    | **control-account-reference** | /financial-forecasts/{financialForecastKey}/control-account-references | listControlAccountReferencesByFinancialForecastKey | createControlAccountReference | getControlAccountReferencesByFinancialForecastKey | updateControlAccountReferencesByFinancialForecastKey | deleteControlAccountReferencesByFinancialForecastKey |
    | **reward-reference** | /financial-forecasts/{financialForecastKey}/reward-references | listRewardReferencesByFinancialForecastKey | createRewardReference | getRewardReferencesByFinancialForecastKey | updateRewardReferencesByFinancialForecastKey | deleteRewardReferencesByFinancialForecastKey |
    | **financial-category-reference** | /financial-forecasts/{financialForecastKey}/financial-category-references | listFinancialCategoryReferencesByFinancialForecastKey | createFinancialCategoryReference | getFinancialCategoryReferencesByFinancialForecastKey | updateFinancialCategoryReferencesByFinancialForecastKey | deleteFinancialCategoryReferencesByFinancialForecastKey |
    | **fee-reference** | /financial-forecasts/{financialForecastKey}/fee-references | listFeeReferencesByFinancialForecastKey | createFeeReference | getFeeReferencesByFinancialForecastKey | updateFeeReferencesByFinancialForecastKey | deleteFeeReferencesByFinancialForecastKey |
    | **identifier** | /financial-forecasts/{financialForecastKey}/identifiers | listIdentifiersByFinancialForecastKey | createIdentifier | getIdentifiersByFinancialForecastKey | updateIdentifiersByFinancialForecastKey | deleteIdentifiersByFinancialForecastKey |
    | **price** | /financial-forecasts/{financialForecastKey}/prices | listPricesByFinancialForecastKey | createPrice | getPricesByFinancialForecastKey | updatePricesByFinancialForecastKey | deletePricesByFinancialForecastKey |
    | **financial-event** | /financial-forecasts/{financialForecastKey}/financial-events | listFinancialEventsByFinancialForecastKey | createFinancialEvent | getFinancialEventsByFinancialForecastKey | updateFinancialEventsByFinancialForecastKey | deleteFinancialEventsByFinancialForecastKey |
    | **credit-reference** | /financial-forecasts/{financialForecastKey}/credit-references | listCreditReferencesByFinancialForecastKey | createCreditReference | getCreditReferencesByFinancialForecastKey | updateCreditReferencesByFinancialForecastKey | deleteCreditReferencesByFinancialForecastKey |
    | **textual-detail** | /financial-forecasts/{financialForecastKey}/textual-details | listTextualDetailsByFinancialForecastKey | createTextualDetail | getTextualDetailsByFinancialForecastKey | updateTextualDetailsByFinancialForecastKey | deleteTextualDetailsByFinancialForecastKey |
    | **financial-track** | /financial-forecasts/{financialForecastKey}/financial-tracks | listFinancialTracksByFinancialForecastKey | createFinancialTrack | getFinancialTracksByFinancialForecastKey | updateFinancialTracksByFinancialForecastKey | deleteFinancialTracksByFinancialForecastKey |
    | **financial-split** | /financial-forecasts/{financialForecastKey}/financial-splits | listFinancialSplitsByFinancialForecastKey | createFinancialSplit | getFinancialSplitsByFinancialForecastKey | updateFinancialSplitsByFinancialForecastKey | deleteFinancialSplitsByFinancialForecastKey |

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