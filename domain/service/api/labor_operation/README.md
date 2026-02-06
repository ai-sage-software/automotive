## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **BillOfMaterialReference**, **FinancialSplitReference**, **GeographicBoundaryReference**, **Identifier**, **LaborOperation**, **LaborOperationEvent**, **LaborResource**, **PartIdentifier**, **PartName**, **PartyReference**, **PricePlanReference**, **ServiceCatalogReferences**, **StaffAssignmentReference**, **StaffSkill**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service** and **LaborOperation** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **LaborOperation** | /labor-operations | Manages LaborOperations |
    | **StaffSkill** | /labor-operations/{laborOperationKey}/staff-skills | Manages StaffSkills belonging to LaborOperations |
    | **LaborOperationEvent** | /labor-operations/{laborOperationKey}/labor-operation-events | Manages LaborOperationEvents belonging to LaborOperations |
    | **LaborResource** | /labor-operations/{laborOperationKey}/labor-resources | Manages LaborResources belonging to LaborOperations |
    | **PricePlanReference** | /labor-operations/{laborOperationKey}/price-plan-references | Manages PricePlanReferences belonging to LaborOperations |
    | **TimeSlot** | /labor-operations/{laborOperationKey}/time-slots | Manages TimeSlots belonging to LaborOperations |
    | **Money** | /labor-operations/{laborOperationKey}/money | Manages Money belonging to LaborOperations |
    | **PartyReference** | /labor-operations/{laborOperationKey}/party-references | Manages PartyReferences belonging to LaborOperations |
    | **StaffAssignmentReference** | /labor-operations/{laborOperationKey}/staff-assignment-references | Manages StaffAssignmentReferences belonging to LaborOperations |
    | **BillOfMaterialReference** | /labor-operations/{laborOperationKey}/bill-of-material-references | Manages BillOfMaterialReferences belonging to LaborOperations |
    | **Identifier** | /labor-operations/{laborOperationKey}/identifiers | Manages Identifiers belonging to LaborOperations |
    | **PartName** | /labor-operations/{laborOperationKey}/part-names | Manages PartNames belonging to LaborOperations |
    | **GeographicBoundaryReference** | /labor-operations/{laborOperationKey}/geographic-boundary-references | Manages GeographicBoundaryReferences belonging to LaborOperations |
    | **EffectivePeriod** | /labor-operations/{laborOperationKey}/effective-periods | Manages EffectivePeriods belonging to LaborOperations |
    | **PartIdentifier** | /labor-operations/{laborOperationKey}/part-identifiers | Manages PartIdentifiers belonging to LaborOperations |
    | **FinancialSplitReference** | /labor-operations/{laborOperationKey}/financial-split-references | Manages FinancialSplitReferences belonging to LaborOperations |
    | **TextualDetail** | /labor-operations/{laborOperationKey}/textual-details | Manages TextualDetails belonging to LaborOperations |


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
> `https://[Your-API-Host]/laboroperations`

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

💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **LaborLocationTypes** : types of labor locations.<br/>
💠 **LaborOperationStatusTypes** : types of labor operation status.<br/>
💠 **LaborOperationTypes** : types of labor operations.<br/>
💠 **LaborResourceTypes** : types of labor resources.<br/>
💠 **PartIdentifierTypes** : types of part identifiers.<br/>
💠 **PartNameTypes** : types of part names.<br/>
💠 **PartStatusTypes** : types of part status.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PayTypes** : types of pays.<br/>
💠 **PayeeTypes** : types of payees.<br/>
💠 **RoleTypes** : types of roles.<br/>
💠 **ServiceJobTypes** : types of service jobs.<br/>
💠 **SkillCategoryTypes** : types of skill categorys.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : effective.period.desc<br/>
✅ **Money** : money.desc<br/>
✅ **TextualDetail** : not nullable<br/>
✅ **TimeSlot** : time.slot.desc<br/>

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


### /labor-operations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations</span> <br/>
        <span class="api-summary">Retrieve a list of LaborOperation entities. getLaborOperation</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations</span> <br/>
        <span class="api-summary">Create a new LaborOperation entity. createLaborOperation</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LaborOperation entity. getaborOperationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Replace a LaborOperation entity. replaceLaborOperation</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Partially update a LaborOperation entity. updatePartialLaborOperation</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Delete a LaborOperation entity deleteLaborOperationEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/staff-skills
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-skills</span> <br/>
        <span class="api-summary">Retrieve a list of StaffSkill entities scoped by laborOperationKey. getStaffSkillByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-skills</span> <br/>
        <span class="api-summary">Create a new StaffSkill entity. createStaffSkill</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/staff-skills/{staffSkillKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-skills/{staffSkillKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffSkill entity. gettaffSkillById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-skills/{staffSkillKey}</span> <br/>
        <span class="api-summary">Replace a StaffSkill entity. replaceStaffSkill</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-skills/{staffSkillKey}</span> <br/>
        <span class="api-summary">Partially update a StaffSkill entity. updatePartialStaffSkill</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-skills/{staffSkillKey}</span> <br/>
        <span class="api-summary">Delete a StaffSkill entity deleteStaffSkillEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/labor-operation-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-operation-events</span> <br/>
        <span class="api-summary">Retrieve a list of LaborOperationEvent entities scoped by laborOperationKey. getLaborOperationEventByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-operation-events</span> <br/>
        <span class="api-summary">Create a new LaborOperationEvent entity. createLaborOperationEvent</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/labor-operation-events/{laborOperationEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LaborOperationEvent entity. getaborOperationEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Replace a LaborOperationEvent entity. replaceLaborOperationEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Partially update a LaborOperationEvent entity. updatePartialLaborOperationEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Delete a LaborOperationEvent entity deleteLaborOperationEventEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/labor-resources
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-resources</span> <br/>
        <span class="api-summary">Retrieve a list of LaborResource entities scoped by laborOperationKey. getLaborResourceByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-resources</span> <br/>
        <span class="api-summary">Create a new LaborResource entity. createLaborResource</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/labor-resources/{laborResourceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LaborResource entity. getaborResourceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Replace a LaborResource entity. replaceLaborResource</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Partially update a LaborResource entity. updatePartialLaborResource</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Delete a LaborResource entity deleteLaborResourceEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/price-plan-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/price-plan-references</span> <br/>
        <span class="api-summary">Retrieve a list of PricePlanReference entities scoped by laborOperationKey. getPricePlanReferenceByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/price-plan-references</span> <br/>
        <span class="api-summary">Create a new PricePlanReference entity. createPricePlanReference</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/price-plan-references/{pricePlanReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlanReference entity. getricePlanReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PricePlanReference entity. replacePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlanReference entity. updatePartialPricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PricePlanReference entity deletePricePlanReferenceEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by laborOperationKey. getTimeSlotByLaborOperationKey</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/money
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/money</span> <br/>
        <span class="api-summary">Retrieve a list of Money entities scoped by laborOperationKey. getMoneyByLaborOperationKey</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/money/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/money/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money entity. getoneyById</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/party-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/party-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartyReference entities scoped by laborOperationKey. getPartyReferenceByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/party-references</span> <br/>
        <span class="api-summary">Create a new PartyReference entity. createPartyReference</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/party-references/{partyReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyReference entity. getartyReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartyReference entity. replacePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartyReference entity. updatePartialPartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartyReference entity deletePartyReferenceEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/staff-assignment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Retrieve a list of StaffAssignmentReference entities scoped by laborOperationKey. getStaffAssignmentReferenceByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Create a new StaffAssignmentReference entity. createStaffAssignmentReference</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/staff-assignment-references/{staffAssignmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffAssignmentReference entity. gettaffAssignmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a StaffAssignmentReference entity. replaceStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a StaffAssignmentReference entity. updatePartialStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a StaffAssignmentReference entity deleteStaffAssignmentReferenceEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/bill-of-material-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/bill-of-material-references</span> <br/>
        <span class="api-summary">Retrieve a list of BillOfMaterialReference entities scoped by laborOperationKey. getBillOfMaterialReferenceByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/bill-of-material-references</span> <br/>
        <span class="api-summary">Create a new BillOfMaterialReference entity. createBillOfMaterialReference</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/bill-of-material-references/{billOfMaterialReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific BillOfMaterialReference entity. getillOfMaterialReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Replace a BillOfMaterialReference entity. replaceBillOfMaterialReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a BillOfMaterialReference entity. updatePartialBillOfMaterialReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Delete a BillOfMaterialReference entity deleteBillOfMaterialReferenceEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by laborOperationKey. getIdentifierByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updatePartialIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/part-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-names</span> <br/>
        <span class="api-summary">Retrieve a list of PartName entities scoped by laborOperationKey. getPartNameByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-names</span> <br/>
        <span class="api-summary">Create a new PartName entity. createPartName</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/part-names/{partNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartName entity. getartNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Replace a PartName entity. replacePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Partially update a PartName entity. updatePartialPartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Delete a PartName entity deletePartNameEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/geographic-boundary-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/geographic-boundary-references</span> <br/>
        <span class="api-summary">Retrieve a list of GeographicBoundaryReference entities scoped by laborOperationKey. getGeographicBoundaryReferenceByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/geographic-boundary-references</span> <br/>
        <span class="api-summary">Create a new GeographicBoundaryReference entity. createGeographicBoundaryReference</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific GeographicBoundaryReference entity. geteographicBoundaryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a GeographicBoundaryReference entity. replaceGeographicBoundaryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a GeographicBoundaryReference entity. updatePartialGeographicBoundaryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/geographic-boundary-references/{geographicBoundaryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a GeographicBoundaryReference entity deleteGeographicBoundaryReferenceEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by laborOperationKey. getEffectivePeriodByLaborOperationKey</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/part-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartIdentifier entities scoped by laborOperationKey. getPartIdentifierByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-identifiers</span> <br/>
        <span class="api-summary">Create a new PartIdentifier entity. createPartIdentifier</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/part-identifiers/{partIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartIdentifier entity. getartIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartIdentifier entity. replacePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartIdentifier entity. updatePartialPartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartIdentifier entity deletePartIdentifierEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/financial-split-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/financial-split-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplitReference entities scoped by laborOperationKey. getFinancialSplitReferenceByLaborOperationKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/financial-split-references</span> <br/>
        <span class="api-summary">Create a new FinancialSplitReference entity. createFinancialSplitReference</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/financial-split-references/{financialSplitReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplitReference entity. getinancialSplitReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplitReference entity. replaceFinancialSplitReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplitReference entity. updatePartialFinancialSplitReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplitReference entity deleteFinancialSplitReferenceEntity</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail entities scoped by laborOperationKey. getTextualDetailByLaborOperationKey</span>
    </span>
</div>

### /labor-operations/{laborOperationKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/labor-operations/{laborOperationKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail entity. getextualDetailById</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under LaborOperationroot with key {LaborOperationKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **labor-operation** | /labor-operations | listLaborOperation | createLaborOperation | getLaborOperation | updateLaborOperation | deleteLaborOperation |
    | **staff-skill** | /labor-operations/{laborOperationKey}/staff-skills | listStaffSkillByLaborOperationKey | createStaffSkill | getStaffSkillByLaborOperationKey | updateStaffSkillByLaborOperationKey | deleteStaffSkillByLaborOperationKey |
    | **labor-operation-event** | /labor-operations/{laborOperationKey}/labor-operation-events | listLaborOperationEventByLaborOperationKey | createLaborOperationEvent | getLaborOperationEventByLaborOperationKey | updateLaborOperationEventByLaborOperationKey | deleteLaborOperationEventByLaborOperationKey |
    | **labor-resource** | /labor-operations/{laborOperationKey}/labor-resources | listLaborResourceByLaborOperationKey | createLaborResource | getLaborResourceByLaborOperationKey | updateLaborResourceByLaborOperationKey | deleteLaborResourceByLaborOperationKey |
    | **price-plan-reference** | /labor-operations/{laborOperationKey}/price-plan-references | listPricePlanReferenceByLaborOperationKey | createPricePlanReference | getPricePlanReferenceByLaborOperationKey | updatePricePlanReferenceByLaborOperationKey | deletePricePlanReferenceByLaborOperationKey |
    | **time-slot** | /labor-operations/{laborOperationKey}/time-slots | listTimeSlotByLaborOperationKey |  | getTimeSlotByLaborOperationKey | updateTimeSlotByLaborOperationKey | deleteTimeSlotByLaborOperationKey |
    | **money** | /labor-operations/{laborOperationKey}/money | listMoneyByLaborOperationKey |  | getMoneyByLaborOperationKey | updateMoneyByLaborOperationKey | deleteMoneyByLaborOperationKey |
    | **party-reference** | /labor-operations/{laborOperationKey}/party-references | listPartyReferenceByLaborOperationKey | createPartyReference | getPartyReferenceByLaborOperationKey | updatePartyReferenceByLaborOperationKey | deletePartyReferenceByLaborOperationKey |
    | **staff-assignment-reference** | /labor-operations/{laborOperationKey}/staff-assignment-references | listStaffAssignmentReferenceByLaborOperationKey | createStaffAssignmentReference | getStaffAssignmentReferenceByLaborOperationKey | updateStaffAssignmentReferenceByLaborOperationKey | deleteStaffAssignmentReferenceByLaborOperationKey |
    | **bill-of-material-reference** | /labor-operations/{laborOperationKey}/bill-of-material-references | listBillOfMaterialReferenceByLaborOperationKey | createBillOfMaterialReference | getBillOfMaterialReferenceByLaborOperationKey | updateBillOfMaterialReferenceByLaborOperationKey | deleteBillOfMaterialReferenceByLaborOperationKey |
    | **identifier** | /labor-operations/{laborOperationKey}/identifiers | listIdentifierByLaborOperationKey | createIdentifier | getIdentifierByLaborOperationKey | updateIdentifierByLaborOperationKey | deleteIdentifierByLaborOperationKey |
    | **part-name** | /labor-operations/{laborOperationKey}/part-names | listPartNameByLaborOperationKey | createPartName | getPartNameByLaborOperationKey | updatePartNameByLaborOperationKey | deletePartNameByLaborOperationKey |
    | **geographic-boundary-reference** | /labor-operations/{laborOperationKey}/geographic-boundary-references | listGeographicBoundaryReferenceByLaborOperationKey | createGeographicBoundaryReference | getGeographicBoundaryReferenceByLaborOperationKey | updateGeographicBoundaryReferenceByLaborOperationKey | deleteGeographicBoundaryReferenceByLaborOperationKey |
    | **effective-period** | /labor-operations/{laborOperationKey}/effective-periods | listEffectivePeriodByLaborOperationKey |  | getEffectivePeriodByLaborOperationKey | updateEffectivePeriodByLaborOperationKey | deleteEffectivePeriodByLaborOperationKey |
    | **part-identifier** | /labor-operations/{laborOperationKey}/part-identifiers | listPartIdentifierByLaborOperationKey | createPartIdentifier | getPartIdentifierByLaborOperationKey | updatePartIdentifierByLaborOperationKey | deletePartIdentifierByLaborOperationKey |
    | **financial-split-reference** | /labor-operations/{laborOperationKey}/financial-split-references | listFinancialSplitReferenceByLaborOperationKey | createFinancialSplitReference | getFinancialSplitReferenceByLaborOperationKey | updateFinancialSplitReferenceByLaborOperationKey | deleteFinancialSplitReferenceByLaborOperationKey |
    | **textual-detail** | /labor-operations/{laborOperationKey}/textual-details | listTextualDetailByLaborOperationKey |  | getTextualDetailByLaborOperationKey | updateTextualDetailByLaborOperationKey | deleteTextualDetailByLaborOperationKey |

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

## Bulk Create LaborOperation (`POST /laboroperations/batch`)

The `/laboroperations/batch` endpoint allows you to create multiple LaborOperation entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of LaborOperation and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `LaborOperationCreate` schema.

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

Contains the full objects of the LaborOperation that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A LaborOperation with SKU W-002 already exists."
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

## Health Check (`GET /laboroperations/health`)

The `/laboroperations/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the LaborOperation aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## LaborOperation Commands and State Management

The laboroperations API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /laboroperations/{LaborOperationKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a LaborOperation (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /laboroperations/{LaborOperationKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /laboroperations/capabilities`)

Before sending a command, you can "discover" what actions are valid for a LaborOperation based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the LaborOperation must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelLaborOperation` | `CREATED`, `ACTIVE` | `DELETED` | Voids the LaborOperation . |
| `ActivateLaborOperation` | `PENDING` | `ACTIVE` | Moves a LaborOperation into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |
