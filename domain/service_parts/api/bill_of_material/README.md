## 🚗 STAR Automotive Retail Systems API (This API provides a standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration between Master Catalog systems, Inventory Management, and Financial Invoicing workflows. 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **BillOfMaterial**, **BomComponent**, **Identifier**, **PartIdentifier**, **PartName**, **PartSpecification**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service_parts** and **BillOfMaterial** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **BillOfMaterial** | /bill-of-materials | Manages BillOfMaterials |
    | **BomComponent** | /bill-of-materials/{billOfMaterialKey}/bom-components | Manages BomComponents belonging to BillOfMaterials |
    | **Identifier** | /bill-of-materials/{billOfMaterialKey}/identifiers | Manages Identifiers belonging to BillOfMaterials |
    | **PartName** | /bill-of-materials/{billOfMaterialKey}/part-names | Manages PartNames belonging to BillOfMaterials |
    | **UnitOfMeasure** | /bill-of-materials/{billOfMaterialKey}/unit-of-measures | Manages UnitOfMeasures belonging to BillOfMaterials |
    | **PartIdentifier** | /bill-of-materials/{billOfMaterialKey}/part-identifiers | Manages PartIdentifiers belonging to BillOfMaterials |
    | **EffectivePeriod** | /bill-of-materials/{billOfMaterialKey}/effective-periods | Manages EffectivePeriods belonging to BillOfMaterials |
    | **PartSpecification** | /bill-of-materials/{billOfMaterialKey}/part-specifications | Manages PartSpecifications belonging to BillOfMaterials |
    | **TextualDetail** | /bill-of-materials/{billOfMaterialKey}/textual-details | Manages TextualDetails belonging to BillOfMaterials |
    | **TimeSlot** | /bill-of-materials/{billOfMaterialKey}/time-slots | Manages TimeSlots belonging to BillOfMaterials |


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
> `https://[Your-API-Host]/bill-of-material`

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
💠 **PartNameTypes** : types of part names.<br/>
💠 **ProductPackageTypes** : types of product packages.<br/>
💠 **ProductStatusTypes** : types of product status.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>
💠 **UOMQuantityCategoryTypes** : types of u o m quantity categorys.<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : Effective Period<br/>
✅ **TextualDetail** : not nullable<br/>
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


### /bill-of-materials
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials</span> <br/>
        <span class="api-summary">Retrieve a list of BillOfMaterial entities. getBillOfMaterial</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials</span> <br/>
        <span class="api-summary">Create a new BillOfMaterial entity. createBillOfMaterial</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}</span> <br/>
        <span class="api-summary">Retrieve a specific BillOfMaterial entity. getillOfMaterialById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}</span> <br/>
        <span class="api-summary">Replace a BillOfMaterial entity. replaceBillOfMaterial</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}</span> <br/>
        <span class="api-summary">Partially update a BillOfMaterial entity. updateBillOfMaterial</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}</span> <br/>
        <span class="api-summary">Delete a BillOfMaterial entity deleteBillOfMaterialEntity</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/bom-components
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/bom-components</span> <br/>
        <span class="api-summary">Retrieve a list of BomComponent entities scoped by billOfMaterialKey. getBomComponentByBillOfMaterialKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/bom-components</span> <br/>
        <span class="api-summary">Create a new BomComponent entity. createBomComponent</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/bom-components/{bomComponentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/bom-components/{bomComponentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific BomComponent entity. getomComponentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/bom-components/{bomComponentKey}</span> <br/>
        <span class="api-summary">Replace a BomComponent entity. replaceBomComponent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/bom-components/{bomComponentKey}</span> <br/>
        <span class="api-summary">Partially update a BomComponent entity. updateBomComponent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/bom-components/{bomComponentKey}</span> <br/>
        <span class="api-summary">Delete a BomComponent entity deleteBomComponentEntity</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by billOfMaterialKey. getIdentifierByBillOfMaterialKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/part-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-names</span> <br/>
        <span class="api-summary">Retrieve a list of PartName entities scoped by billOfMaterialKey. getPartNameByBillOfMaterialKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-names</span> <br/>
        <span class="api-summary">Create a new PartName entity. createPartName</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/part-names/{partNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartName entity. getartNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Replace a PartName entity. replacePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Partially update a PartName entity. updatePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Delete a PartName entity deletePartNameEntity</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure entities scoped by billOfMaterialKey. getUnitOfMeasureByBillOfMaterialKey</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure entity. getnitOfMeasureById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Replace a UnitOfMeasure entity. replaceUnitOfMeasure</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/part-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartIdentifier entities scoped by billOfMaterialKey. getPartIdentifierByBillOfMaterialKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-identifiers</span> <br/>
        <span class="api-summary">Create a new PartIdentifier entity. createPartIdentifier</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/part-identifiers/{partIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartIdentifier entity. getartIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartIdentifier entity. replacePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartIdentifier entity. updatePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartIdentifier entity deletePartIdentifierEntity</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by billOfMaterialKey. getEffectivePeriodByBillOfMaterialKey</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod entity. replaceEffectivePeriod</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/part-specifications
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-specifications</span> <br/>
        <span class="api-summary">Retrieve a list of PartSpecification entities scoped by billOfMaterialKey. getPartSpecificationByBillOfMaterialKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-specifications</span> <br/>
        <span class="api-summary">Create a new PartSpecification entity. createPartSpecification</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/part-specifications/{partSpecificationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartSpecification entity. getartSpecificationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Replace a PartSpecification entity. replacePartSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Partially update a PartSpecification entity. updatePartSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/part-specifications/{partSpecificationKey}</span> <br/>
        <span class="api-summary">Delete a PartSpecification entity deletePartSpecificationEntity</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail entities scoped by billOfMaterialKey. getTextualDetailByBillOfMaterialKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/textual-details</span> <br/>
        <span class="api-summary">Create a new TextualDetail entity. createTextualDetail</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail entity. getextualDetailById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Replace a TextualDetail entity. replaceTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Partially update a TextualDetail entity. updateTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Delete a TextualDetail entity deleteTextualDetailEntity</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by billOfMaterialKey. getTimeSlotByBillOfMaterialKey</span>
    </span>
</div>

### /bill-of-materials/{billOfMaterialKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/bill-of-materials/{billOfMaterialKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot entity. replaceTimeSlot</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under BillOfMaterialroot with key {BillOfMaterialKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **bill-of-material** | /bill-of-materials | listBillOfMaterial | createBillOfMaterial | getBillOfMaterial | updateBillOfMaterial | deleteBillOfMaterial |
    | **bom-component** | /bill-of-materials/{billOfMaterialKey}/bom-components | listBomComponentByBillOfMaterialKey | createBomComponent | getBomComponentByBillOfMaterialKey | updateBomComponentByBillOfMaterialKey | deleteBomComponentByBillOfMaterialKey |
    | **identifier** | /bill-of-materials/{billOfMaterialKey}/identifiers | listIdentifierByBillOfMaterialKey | createIdentifier | getIdentifierByBillOfMaterialKey | updateIdentifierByBillOfMaterialKey | deleteIdentifierByBillOfMaterialKey |
    | **part-name** | /bill-of-materials/{billOfMaterialKey}/part-names | listPartNameByBillOfMaterialKey | createPartName | getPartNameByBillOfMaterialKey | updatePartNameByBillOfMaterialKey | deletePartNameByBillOfMaterialKey |
    | **unit-of-measure** | /bill-of-materials/{billOfMaterialKey}/unit-of-measures | listUnitOfMeasureByBillOfMaterialKey |  | getUnitOfMeasureByBillOfMaterialKey | updateUnitOfMeasureByBillOfMaterialKey | deleteUnitOfMeasureByBillOfMaterialKey |
    | **part-identifier** | /bill-of-materials/{billOfMaterialKey}/part-identifiers | listPartIdentifierByBillOfMaterialKey | createPartIdentifier | getPartIdentifierByBillOfMaterialKey | updatePartIdentifierByBillOfMaterialKey | deletePartIdentifierByBillOfMaterialKey |
    | **effective-period** | /bill-of-materials/{billOfMaterialKey}/effective-periods | listEffectivePeriodByBillOfMaterialKey |  | getEffectivePeriodByBillOfMaterialKey | updateEffectivePeriodByBillOfMaterialKey | deleteEffectivePeriodByBillOfMaterialKey |
    | **part-specification** | /bill-of-materials/{billOfMaterialKey}/part-specifications | listPartSpecificationByBillOfMaterialKey | createPartSpecification | getPartSpecificationByBillOfMaterialKey | updatePartSpecificationByBillOfMaterialKey | deletePartSpecificationByBillOfMaterialKey |
    | **textual-detail** | /bill-of-materials/{billOfMaterialKey}/textual-details | listTextualDetailByBillOfMaterialKey | createTextualDetail | getTextualDetailByBillOfMaterialKey | updateTextualDetailByBillOfMaterialKey | deleteTextualDetailByBillOfMaterialKey |
    | **time-slot** | /bill-of-materials/{billOfMaterialKey}/time-slots | listTimeSlotByBillOfMaterialKey |  | getTimeSlotByBillOfMaterialKey | updateTimeSlotByBillOfMaterialKey | deleteTimeSlotByBillOfMaterialKey |

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