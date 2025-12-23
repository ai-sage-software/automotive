## 🚗 STAR Automotive Retail Systems API (This API provides a standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration between Master Catalog systems, Inventory Management, and Financial Invoicing workflows. 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **FinancialSnapshot**, **FinancialSnapshotCriteria**, **FinancialSnapshotLineItem**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **finance** and **FinancialSnapshot** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **FinancialSnapshot** | /financial-snapshots | Manages FinancialSnapshots |
    | **FinancialSnapshotLineItem** | /financial-snapshots/{financialSnapshotKey}/financial-snapshot-line-items | Manages FinancialSnapshotLineItems belonging to FinancialSnapshots |
    | **Money** | /financial-snapshots/{financialSnapshotKey}/moneys | Manages Moneys belonging to FinancialSnapshots |
    | **FinancialSnapshotCriteria** | /financial-snapshots/{financialSnapshotKey}/financial-snapshot-criteria | Manages FinancialSnapshotCriteria belonging to FinancialSnapshots |


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
> `https://[Your-API-Host]/financial-snapshot`

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

💠 **FinancialCategoryTypes** : types of financial categorys.<br/>
💠 **FinancialReportTypes** : types of financial reports.<br/>

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


### /financial-snapshots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSnapshot entities. getFinancialSnapshot</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots</span> <br/>
        <span class="api-summary">Create a new FinancialSnapshot entity. createFinancialSnapshot</span>
    </span>
</div>

### /financial-snapshots/{financialSnapshotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSnapshot entity. getinancialSnapshotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSnapshot entity. replaceFinancialSnapshot</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSnapshot entity. updateFinancialSnapshot</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSnapshot entity deleteFinancialSnapshotEntity</span>
    </span>
</div>

### /financial-snapshots/{financialSnapshotKey}/financial-snapshot-line-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-line-items</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSnapshotLineItem entities scoped by financialSnapshotKey. getFinancialSnapshotLineItemByFinancialSnapshotKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-line-items</span> <br/>
        <span class="api-summary">Create a new FinancialSnapshotLineItem entity. createFinancialSnapshotLineItem</span>
    </span>
</div>

### /financial-snapshots/{financialSnapshotKey}/financial-snapshot-line-items/{financialSnapshotLineItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-line-items/{financialSnapshotLineItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSnapshotLineItem entity. getinancialSnapshotLineItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-line-items/{financialSnapshotLineItemKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSnapshotLineItem entity. replaceFinancialSnapshotLineItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-line-items/{financialSnapshotLineItemKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSnapshotLineItem entity. updateFinancialSnapshotLineItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-line-items/{financialSnapshotLineItemKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSnapshotLineItem entity deleteFinancialSnapshotLineItemEntity</span>
    </span>
</div>

### /financial-snapshots/{financialSnapshotKey}/moneys
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/moneys</span> <br/>
        <span class="api-summary">Retrieve a list of Money entities scoped by financialSnapshotKey. getMoneyByFinancialSnapshotKey</span>
    </span>
</div>

### /financial-snapshots/{financialSnapshotKey}/moneys/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money entity. getoneyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Replace a Money entity. replaceMoney</span>
    </span>
</div>

### /financial-snapshots/{financialSnapshotKey}/financial-snapshot-criteria
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-criteria</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSnapshotCriteria entities scoped by financialSnapshotKey. getFinancialSnapshotCriteriaByFinancialSnapshotKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-criteria</span> <br/>
        <span class="api-summary">Create a new FinancialSnapshotCriteria entity. createFinancialSnapshotCriteria</span>
    </span>
</div>

### /financial-snapshots/{financialSnapshotKey}/financial-snapshot-criteria/{financialSnapshotCriteriaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-criteria/{financialSnapshotCriteriaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSnapshotCriteria entity. getinancialSnapshotCriteriaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-criteria/{financialSnapshotCriteriaKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSnapshotCriteria entity. replaceFinancialSnapshotCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-criteria/{financialSnapshotCriteriaKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSnapshotCriteria entity. updateFinancialSnapshotCriteria</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/financial-snapshots/{financialSnapshotKey}/financial-snapshot-criteria/{financialSnapshotCriteriaKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSnapshotCriteria entity deleteFinancialSnapshotCriteriaEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under FinancialSnapshotroot with key {FinancialSnapshotKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **financial-snapshot** | /financial-snapshots | listFinancialSnapshot | createFinancialSnapshot | getFinancialSnapshot | updateFinancialSnapshot | deleteFinancialSnapshot |
    | **financial-snapshot-line-item** | /financial-snapshots/{financialSnapshotKey}/financial-snapshot-line-items | listFinancialSnapshotLineItemByFinancialSnapshotKey | createFinancialSnapshotLineItem | getFinancialSnapshotLineItemByFinancialSnapshotKey | updateFinancialSnapshotLineItemByFinancialSnapshotKey | deleteFinancialSnapshotLineItemByFinancialSnapshotKey |
    | **money** | /financial-snapshots/{financialSnapshotKey}/moneys | listMoneyByFinancialSnapshotKey |  | getMoneyByFinancialSnapshotKey | updateMoneyByFinancialSnapshotKey | deleteMoneyByFinancialSnapshotKey |
    | **financial-snapshot-criteria** | /financial-snapshots/{financialSnapshotKey}/financial-snapshot-criteria | listFinancialSnapshotCriteriaByFinancialSnapshotKey | createFinancialSnapshotCriteria | getFinancialSnapshotCriteriaByFinancialSnapshotKey | updateFinancialSnapshotCriteriaByFinancialSnapshotKey | deleteFinancialSnapshotCriteriaByFinancialSnapshotKey |

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