## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **AccountingPeriod**, **CashFlowLineItem**, **CashFlowProjection**, **CashFlowProjectionCriteria**, **CashFlowScenario**, **Identifier**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **finance** and **CashFlowProjection** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **CashFlowProjection** | /cash-flow-projections | Manages CashFlowProjections |
    | **Money** | /cash-flow-projections/{cashFlowProjectionKey}/moneys | Manages Moneys belonging to CashFlowProjections |
    | **CashFlowScenario** | /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-scenarios | Manages CashFlowScenarios belonging to CashFlowProjections |
    | **Identifier** | /cash-flow-projections/{cashFlowProjectionKey}/identifiers | Manages Identifiers belonging to CashFlowProjections |
    | **AccountingPeriod** | /cash-flow-projections/{cashFlowProjectionKey}/accounting-periods | Manages AccountingPeriods belonging to CashFlowProjections |
    | **CashFlowLineItem** | /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-line-items | Manages CashFlowLineItems belonging to CashFlowProjections |
    | **CashFlowProjectionCriteria** | /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-projection-criteria | Manages CashFlowProjectionCriteria belonging to CashFlowProjections |


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
> `https://[Your-API-Host]/cashflowprojections`

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

💠 **AccountingPeriodStatusTypes** : types of accounting period status.<br/>
💠 **UOMTimeTypes** : types of u o m times.<br/>

## ✅ Entities

---

✅ **Money** : Represents a monetary value, including its currency, locale, and display format.<br/>

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


### /cash-flow-projections
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections</span> <br/>
        <span class="api-summary">Retrieve a list of CashFlowProjection entities. getCashFlowProjection</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections</span> <br/>
        <span class="api-summary">Create a new CashFlowProjection entity. createCashFlowProjection</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CashFlowProjection entity. getashFlowProjectionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}</span> <br/>
        <span class="api-summary">Replace a CashFlowProjection entity. replaceCashFlowProjection</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}</span> <br/>
        <span class="api-summary">Partially update a CashFlowProjection entity. updateCashFlowProjection</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}</span> <br/>
        <span class="api-summary">Delete a CashFlowProjection entity deleteCashFlowProjectionEntity</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/moneys
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/moneys</span> <br/>
        <span class="api-summary">Retrieve a list of Money entities scoped by cashFlowProjectionKey. getMoneyByCashFlowProjectionKey</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/moneys/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money entity. getoneyById</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-scenarios
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-scenarios</span> <br/>
        <span class="api-summary">Retrieve a list of CashFlowScenario entities scoped by cashFlowProjectionKey. getCashFlowScenarioByCashFlowProjectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-scenarios</span> <br/>
        <span class="api-summary">Create a new CashFlowScenario entity. createCashFlowScenario</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-scenarios/{cashFlowScenarioKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-scenarios/{cashFlowScenarioKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CashFlowScenario entity. getashFlowScenarioById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-scenarios/{cashFlowScenarioKey}</span> <br/>
        <span class="api-summary">Replace a CashFlowScenario entity. replaceCashFlowScenario</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-scenarios/{cashFlowScenarioKey}</span> <br/>
        <span class="api-summary">Partially update a CashFlowScenario entity. updateCashFlowScenario</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-scenarios/{cashFlowScenarioKey}</span> <br/>
        <span class="api-summary">Delete a CashFlowScenario entity deleteCashFlowScenarioEntity</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by cashFlowProjectionKey. getIdentifierByCashFlowProjectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/accounting-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/accounting-periods</span> <br/>
        <span class="api-summary">Retrieve a list of AccountingPeriod entities scoped by cashFlowProjectionKey. getAccountingPeriodByCashFlowProjectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/accounting-periods</span> <br/>
        <span class="api-summary">Create a new AccountingPeriod entity. createAccountingPeriod</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/accounting-periods/{accountingPeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/accounting-periods/{accountingPeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AccountingPeriod entity. getccountingPeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/accounting-periods/{accountingPeriodKey}</span> <br/>
        <span class="api-summary">Replace a AccountingPeriod entity. replaceAccountingPeriod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/accounting-periods/{accountingPeriodKey}</span> <br/>
        <span class="api-summary">Partially update a AccountingPeriod entity. updateAccountingPeriod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/accounting-periods/{accountingPeriodKey}</span> <br/>
        <span class="api-summary">Delete a AccountingPeriod entity deleteAccountingPeriodEntity</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-line-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-line-items</span> <br/>
        <span class="api-summary">Retrieve a list of CashFlowLineItem entities scoped by cashFlowProjectionKey. getCashFlowLineItemByCashFlowProjectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-line-items</span> <br/>
        <span class="api-summary">Create a new CashFlowLineItem entity. createCashFlowLineItem</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-line-items/{cashFlowLineItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-line-items/{cashFlowLineItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CashFlowLineItem entity. getashFlowLineItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-line-items/{cashFlowLineItemKey}</span> <br/>
        <span class="api-summary">Replace a CashFlowLineItem entity. replaceCashFlowLineItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-line-items/{cashFlowLineItemKey}</span> <br/>
        <span class="api-summary">Partially update a CashFlowLineItem entity. updateCashFlowLineItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-line-items/{cashFlowLineItemKey}</span> <br/>
        <span class="api-summary">Delete a CashFlowLineItem entity deleteCashFlowLineItemEntity</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-projection-criteria
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-projection-criteria</span> <br/>
        <span class="api-summary">Retrieve a list of CashFlowProjectionCriteria entities scoped by cashFlowProjectionKey. getCashFlowProjectionCriteriaByCashFlowProjectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-projection-criteria</span> <br/>
        <span class="api-summary">Create a new CashFlowProjectionCriteria entity. createCashFlowProjectionCriteria</span>
    </span>
</div>

### /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-projection-criteria/{cashFlowProjectionCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-projection-criteria/{cashFlowProjectionCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CashFlowProjectionCriteria entity. getashFlowProjectionCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-projection-criteria/{cashFlowProjectionCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a CashFlowProjectionCriteria entity. replaceCashFlowProjectionCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-projection-criteria/{cashFlowProjectionCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a CashFlowProjectionCriteria entity. updateCashFlowProjectionCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/cash-flow-projections/{cashFlowProjectionKey}/cash-flow-projection-criteria/{cashFlowProjectionCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a CashFlowProjectionCriteria entity deleteCashFlowProjectionCriteriaEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under CashFlowProjectionroot with key {CashFlowProjectionKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **cash-flow-projection** | /cash-flow-projections | listCashFlowProjection | createCashFlowProjection | getCashFlowProjection | updateCashFlowProjection | deleteCashFlowProjection |
    | **money** | /cash-flow-projections/{cashFlowProjectionKey}/moneys | listMoneyByCashFlowProjectionKey |  | getMoneyByCashFlowProjectionKey | updateMoneyByCashFlowProjectionKey | deleteMoneyByCashFlowProjectionKey |
    | **cash-flow-scenario** | /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-scenarios | listCashFlowScenarioByCashFlowProjectionKey | createCashFlowScenario | getCashFlowScenarioByCashFlowProjectionKey | updateCashFlowScenarioByCashFlowProjectionKey | deleteCashFlowScenarioByCashFlowProjectionKey |
    | **identifier** | /cash-flow-projections/{cashFlowProjectionKey}/identifiers | listIdentifierByCashFlowProjectionKey | createIdentifier | getIdentifierByCashFlowProjectionKey | updateIdentifierByCashFlowProjectionKey | deleteIdentifierByCashFlowProjectionKey |
    | **accounting-period** | /cash-flow-projections/{cashFlowProjectionKey}/accounting-periods | listAccountingPeriodByCashFlowProjectionKey | createAccountingPeriod | getAccountingPeriodByCashFlowProjectionKey | updateAccountingPeriodByCashFlowProjectionKey | deleteAccountingPeriodByCashFlowProjectionKey |
    | **cash-flow-line-item** | /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-line-items | listCashFlowLineItemByCashFlowProjectionKey | createCashFlowLineItem | getCashFlowLineItemByCashFlowProjectionKey | updateCashFlowLineItemByCashFlowProjectionKey | deleteCashFlowLineItemByCashFlowProjectionKey |
    | **cash-flow-projection-criteria** | /cash-flow-projections/{cashFlowProjectionKey}/cash-flow-projection-criteria | listCashFlowProjectionCriteriaByCashFlowProjectionKey | createCashFlowProjectionCriteria | getCashFlowProjectionCriteriaByCashFlowProjectionKey | updateCashFlowProjectionCriteriaByCashFlowProjectionKey | deleteCashFlowProjectionCriteriaByCashFlowProjectionKey |

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

## Bulk Create CashFlowProjection (`POST /cashflowprojections/batch`)

The `/cashflowprojections/batch` endpoint allows you to create multiple CashFlowProjection entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of CashFlowProjection and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `CashFlowProjectionCreate` schema.

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

Contains the full objects of the CashFlowProjection that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A CashFlowProjection with SKU W-002 already exists."
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

## Health Check (`GET /cashflowprojections/health`)

The `/cashflowprojections/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the CashFlowProjection aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## CashFlowProjection Commands and State Management

The cashflowprojections API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /cashflowprojections/{CashFlowProjectionKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a CashFlowProjection (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /cashflowprojections/{CashFlowProjectionKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /cashflowprojections/capabilities`)

Before sending a command, you can "discover" what actions are valid for a CashFlowProjection based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the CashFlowProjection must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelCashFlowProjection` | `CREATED`, `ACTIVE` | `DELETED` | Voids the CashFlowProjection . |
| `ActivateCashFlowProjection` | `PENDING` | `ACTIVE` | Moves a CashFlowProjection into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |