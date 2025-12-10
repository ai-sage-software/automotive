## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **AccountingPeriod**, **Budget**, **BudgetItem**, **ControlAccountReference**, **GeneralLedgerReference**, **Identifier**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **finance** and **Budget** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Budget** | /budgets | Manages Budgets |
    | **Money** | /budgets/{budgetKey}/moneys | Manages Moneys belonging to Budgets |
    | **GeneralLedgerReference** | /budgets/{budgetKey}/general-ledger-references | Manages GeneralLedgerReferences belonging to Budgets |
    | **Identifier** | /budgets/{budgetKey}/identifiers | Manages Identifiers belonging to Budgets |
    | **BudgetItem** | /budgets/{budgetKey}/budget-items | Manages BudgetItems belonging to Budgets |
    | **AccountingPeriod** | /budgets/{budgetKey}/accounting-periods | Manages AccountingPeriods belonging to Budgets |
    | **ControlAccountReference** | /budgets/{budgetKey}/control-account-references | Manages ControlAccountReferences belonging to Budgets |


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
> `https://[Your-API-Host]/budget`

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
💠 **BudgetStatusTypes** : types of budget status.<br/>
💠 **FinancialCategoryTypes** : types of financial categorys.<br/>

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


### /budgets
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets</span> <br/>
        <span class="api-summary">Retrieve a list of all Budget records. getBudgets</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets</span> <br/>
        <span class="api-summary">Create a new Budget record. createBudget</span>
    </span>
</div>

### /budgets/{budgetKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Budget record. getudgetById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}</span> <br/>
        <span class="api-summary">Replace a Budget record. replaceBudget</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}</span> <br/>
        <span class="api-summary">Partially update a Budget record. updateBudget</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}</span> <br/>
        <span class="api-summary">Delete a Budget Record deleteBudgetRecord</span>
    </span>
</div>

### /budgets/{budgetKey}/moneys
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/moneys</span> <br/>
        <span class="api-summary">Retrieve a list of Money records scoped by budgetKey. getMoneysByBudgetKey</span>
    </span>
</div>

### /budgets/{budgetKey}/moneys/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money record. getoneyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Replace a Money record. replaceMoney</span>
    </span>
</div>

### /budgets/{budgetKey}/general-ledger-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/general-ledger-references</span> <br/>
        <span class="api-summary">Retrieve a list of GeneralLedgerReference records scoped by budgetKey. getGeneralLedgerReferencesByBudgetKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/general-ledger-references</span> <br/>
        <span class="api-summary">Create a new GeneralLedgerReference record. createGeneralLedgerReference</span>
    </span>
</div>

### /budgets/{budgetKey}/general-ledger-references/{generalLedgerReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/general-ledger-references/{generalLedgerReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific GeneralLedgerReference record. geteneralLedgerReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/general-ledger-references/{generalLedgerReferenceKey}</span> <br/>
        <span class="api-summary">Replace a GeneralLedgerReference record. replaceGeneralLedgerReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/general-ledger-references/{generalLedgerReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a GeneralLedgerReference record. updateGeneralLedgerReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/general-ledger-references/{generalLedgerReferenceKey}</span> <br/>
        <span class="api-summary">Delete a GeneralLedgerReference Record deleteGeneralLedgerReferenceRecord</span>
    </span>
</div>

### /budgets/{budgetKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by budgetKey. getIdentifiersByBudgetKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /budgets/{budgetKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /budgets/{budgetKey}/budget-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/budget-items</span> <br/>
        <span class="api-summary">Retrieve a list of BudgetItem records scoped by budgetKey. getBudgetItemsByBudgetKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/budget-items</span> <br/>
        <span class="api-summary">Create a new BudgetItem record. createBudgetItem</span>
    </span>
</div>

### /budgets/{budgetKey}/budget-items/{budgetItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/budget-items/{budgetItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific BudgetItem record. getudgetItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/budget-items/{budgetItemKey}</span> <br/>
        <span class="api-summary">Replace a BudgetItem record. replaceBudgetItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/budget-items/{budgetItemKey}</span> <br/>
        <span class="api-summary">Partially update a BudgetItem record. updateBudgetItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/budget-items/{budgetItemKey}</span> <br/>
        <span class="api-summary">Delete a BudgetItem Record deleteBudgetItemRecord</span>
    </span>
</div>

### /budgets/{budgetKey}/accounting-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/accounting-periods</span> <br/>
        <span class="api-summary">Retrieve a list of AccountingPeriod records scoped by budgetKey. getAccountingPeriodsByBudgetKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/accounting-periods</span> <br/>
        <span class="api-summary">Create a new AccountingPeriod record. createAccountingPeriod</span>
    </span>
</div>

### /budgets/{budgetKey}/accounting-periods/{accountingPeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/accounting-periods/{accountingPeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AccountingPeriod record. getccountingPeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/accounting-periods/{accountingPeriodKey}</span> <br/>
        <span class="api-summary">Replace a AccountingPeriod record. replaceAccountingPeriod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/accounting-periods/{accountingPeriodKey}</span> <br/>
        <span class="api-summary">Partially update a AccountingPeriod record. updateAccountingPeriod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/accounting-periods/{accountingPeriodKey}</span> <br/>
        <span class="api-summary">Delete a AccountingPeriod Record deleteAccountingPeriodRecord</span>
    </span>
</div>

### /budgets/{budgetKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference records scoped by budgetKey. getControlAccountReferencesByBudgetKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference record. createControlAccountReference</span>
    </span>
</div>

### /budgets/{budgetKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference record. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference record. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference record. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/budgets/{budgetKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference Record deleteControlAccountReferenceRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Budgetroot with key {BudgetKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **budget** | /budgets | listBudgets | createBudget | getBudgets | updateBudgets | deleteBudgets |
    | **money** | /budgets/{budgetKey}/moneys | listMoneysByBudgetKey |  | getMoneysByBudgetKey | updateMoneysByBudgetKey | deleteMoneysByBudgetKey |
    | **general-ledger-reference** | /budgets/{budgetKey}/general-ledger-references | listGeneralLedgerReferencesByBudgetKey | createGeneralLedgerReference | getGeneralLedgerReferencesByBudgetKey | updateGeneralLedgerReferencesByBudgetKey | deleteGeneralLedgerReferencesByBudgetKey |
    | **identifier** | /budgets/{budgetKey}/identifiers | listIdentifiersByBudgetKey | createIdentifier | getIdentifiersByBudgetKey | updateIdentifiersByBudgetKey | deleteIdentifiersByBudgetKey |
    | **budget-item** | /budgets/{budgetKey}/budget-items | listBudgetItemsByBudgetKey | createBudgetItem | getBudgetItemsByBudgetKey | updateBudgetItemsByBudgetKey | deleteBudgetItemsByBudgetKey |
    | **accounting-period** | /budgets/{budgetKey}/accounting-periods | listAccountingPeriodsByBudgetKey | createAccountingPeriod | getAccountingPeriodsByBudgetKey | updateAccountingPeriodsByBudgetKey | deleteAccountingPeriodsByBudgetKey |
    | **control-account-reference** | /budgets/{budgetKey}/control-account-references | listControlAccountReferencesByBudgetKey | createControlAccountReference | getControlAccountReferencesByBudgetKey | updateControlAccountReferencesByBudgetKey | deleteControlAccountReferencesByBudgetKey |

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