## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **ContactMethod**, **Identifier**, **Insurance**, **Media**, **MetricValue**, **PartIdentifier**, **PartName**, **PartPickList**, **PartPickListItem**, **Position**, **Price**, **Vehicle**, **VehicleEvent**, **VehicleIdentifier**, **VehicleLicense**, **VehicleMedia**, **VehicleOption**, **VehiclePriceSummary**, **VehicleSpecification**, **WarehouseReference**, **Warranty**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **inventory** and **PartPickList** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PartPickList** | /part-pick-lists | Manages PartPickLists |
    | **Warrantie** | /part-pick-lists/{partPickListKey}/warranties | Manages Warranties belonging to PartPickLists |
    | **VehicleLicense** | /part-pick-lists/{partPickListKey}/vehicle-licenses | Manages VehicleLicenses belonging to PartPickLists |
    | **Position** | /part-pick-lists/{partPickListKey}/positions | Manages Positions belonging to PartPickLists |
    | **Media** | /part-pick-lists/{partPickListKey}/medias | Manages Medias belonging to PartPickLists |
    | **VehiclePriceSummarie** | /part-pick-lists/{partPickListKey}/vehicle-price-summaries | Manages VehiclePriceSummaries belonging to PartPickLists |
    | **VehicleEvent** | /part-pick-lists/{partPickListKey}/vehicle-events | Manages VehicleEvents belonging to PartPickLists |
    | **Vehicle** | /part-pick-lists/{partPickListKey}/vehicles | Manages Vehicles belonging to PartPickLists |
    | **PartPickListItem** | /part-pick-lists/{partPickListKey}/part-pick-list-items | Manages PartPickListItems belonging to PartPickLists |
    | **MetricValue** | /part-pick-lists/{partPickListKey}/metric-values | Manages MetricValues belonging to PartPickLists |
    | **VehicleMedia** | /part-pick-lists/{partPickListKey}/vehicle-medias | Manages VehicleMedias belonging to PartPickLists |
    | **Identifier** | /part-pick-lists/{partPickListKey}/identifiers | Manages Identifiers belonging to PartPickLists |
    | **PartName** | /part-pick-lists/{partPickListKey}/part-names | Manages PartNames belonging to PartPickLists |
    | **Price** | /part-pick-lists/{partPickListKey}/prices | Manages Prices belonging to PartPickLists |
    | **Insurance** | /part-pick-lists/{partPickListKey}/insurances | Manages Insurances belonging to PartPickLists |
    | **PartIdentifier** | /part-pick-lists/{partPickListKey}/part-identifiers | Manages PartIdentifiers belonging to PartPickLists |
    | **EffectivePeriod** | /part-pick-lists/{partPickListKey}/effective-periods | Manages EffectivePeriods belonging to PartPickLists |
    | **WarehouseReference** | /part-pick-lists/{partPickListKey}/warehouse-references | Manages WarehouseReferences belonging to PartPickLists |
    | **VehicleOption** | /part-pick-lists/{partPickListKey}/vehicle-options | Manages VehicleOptions belonging to PartPickLists |
    | **VehicleSpecification** | /part-pick-lists/{partPickListKey}/vehicle-specifications | Manages VehicleSpecifications belonging to PartPickLists |
    | **VehicleIdentifier** | /part-pick-lists/{partPickListKey}/vehicle-identifiers | Manages VehicleIdentifiers belonging to PartPickLists |


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
> `https://[Your-API-Host]/partpicklists`

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

💠 **ControlAccountTypes** : types of control accounts.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **OrderCategoryTypes** : types of order categorys.<br/>
💠 **PartIdentifierTypes** : types of part identifiers.<br/>
💠 **PartNameTypes** : types of part names.<br/>
💠 **PartStatusTypes** : types of part status.<br/>
💠 **PaymentTypes** : types of payments.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductStateTypes** : types of product states.<br/>
💠 **UnitOfMeasureTypes** : types of unit of measures.<br/>
💠 **VehicleHistoryEventTypes** : types of vehicle history events.<br/>
💠 **InventoryStatusTypes** : entity<br/>
💠 **InsuranceTypes** : Defines the various types of insurance.<br/>
💠 **MediaUsageTypes** : entity<br/>
💠 **MediaTypes** : entity<br/>
💠 **MediaFormatTypes** : entity<br/>
💠 **OptionTypes** : Undocumented Enum<br/>
💠 **OptionInstallationTypes** : entity<br/>
💠 **DaysOfWeekTypes** : Status of the account<br/>
💠 **TimeslotDirectiveTypes** : Represents the directive for a timeslot.<br/>
💠 **VehicleResourceTypes** : Represents the various types of resources, syst...<br/>
💠 **CabTypes** : Defines the various types of a vehicle's cab co...<br/>
💠 **VehicleCategoryTypes** : Represents a classification or category for a v...<br/>
💠 **EngineTypes** : Defines various types of engines used in vehicles.<br/>
💠 **FuelTypes** : Defines the types of fuel used to power a vehic...<br/>
💠 **VehicleBodyStyleTypes** : Represents the body style of a vehicle.<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : The date range during which this record is valid.<br/>
✅ **Link** : Link<br/>
✅ **TextualDetail** : not nullable<br/>
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


### /part-pick-lists
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists</span> <br/>
        <span class="api-summary">Retrieve a list of PartPickList entities. getPartPickList</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists</span> <br/>
        <span class="api-summary">Create a new PartPickList entity. createPartPickList</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartPickList entity. getartPickListById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}</span> <br/>
        <span class="api-summary">Replace a PartPickList entity. replacePartPickList</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}</span> <br/>
        <span class="api-summary">Partially update a PartPickList entity. updatePartialPartPickList</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}</span> <br/>
        <span class="api-summary">Delete a PartPickList entity deletePartPickListEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/warranties
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warranties</span> <br/>
        <span class="api-summary">Retrieve a list of Warranty entities scoped by partPickListKey. getWarrantyByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warranties</span> <br/>
        <span class="api-summary">Create a new Warranty entity. createWarranty</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/warranties/{warrantyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warranties/{warrantyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Warranty entity. getarrantyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warranties/{warrantyKey}</span> <br/>
        <span class="api-summary">Replace a Warranty entity. replaceWarranty</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warranties/{warrantyKey}</span> <br/>
        <span class="api-summary">Partially update a Warranty entity. updatePartialWarranty</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warranties/{warrantyKey}</span> <br/>
        <span class="api-summary">Delete a Warranty entity deleteWarrantyEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-licenses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-licenses</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleLicense entities scoped by partPickListKey. getVehicleLicenseByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-licenses</span> <br/>
        <span class="api-summary">Create a new VehicleLicense entity. createVehicleLicense</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-licenses/{vehicleLicenseKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleLicense entity. getehicleLicenseById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Replace a VehicleLicense entity. replaceVehicleLicense</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleLicense entity. updatePartialVehicleLicense</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Delete a VehicleLicense entity deleteVehicleLicenseEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position entities scoped by partPickListKey. getPositionByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position entity. createPosition</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position entity. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position entity. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position entity. updatePartialPosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position entity deletePositionEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/medias
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/medias</span> <br/>
        <span class="api-summary">Retrieve a list of Media entities scoped by partPickListKey. getMediaByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/medias</span> <br/>
        <span class="api-summary">Create a new Media entity. createMedia</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/medias/{mediaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Media entity. getediaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Replace a Media entity. replaceMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Partially update a Media entity. updatePartialMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Delete a Media entity deleteMediaEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-price-summaries
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-price-summaries</span> <br/>
        <span class="api-summary">Retrieve a list of VehiclePriceSummary entities scoped by partPickListKey. getVehiclePriceSummaryByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-price-summaries</span> <br/>
        <span class="api-summary">Create a new VehiclePriceSummary entity. createVehiclePriceSummary</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-price-summaries/{vehiclePriceSummaryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-price-summaries/{vehiclePriceSummaryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehiclePriceSummary entity. getehiclePriceSummaryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-price-summaries/{vehiclePriceSummaryKey}</span> <br/>
        <span class="api-summary">Replace a VehiclePriceSummary entity. replaceVehiclePriceSummary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-price-summaries/{vehiclePriceSummaryKey}</span> <br/>
        <span class="api-summary">Partially update a VehiclePriceSummary entity. updatePartialVehiclePriceSummary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-price-summaries/{vehiclePriceSummaryKey}</span> <br/>
        <span class="api-summary">Delete a VehiclePriceSummary entity deleteVehiclePriceSummaryEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-events</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleEvent entities scoped by partPickListKey. getVehicleEventByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-events</span> <br/>
        <span class="api-summary">Create a new VehicleEvent entity. createVehicleEvent</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-events/{vehicleEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-events/{vehicleEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleEvent entity. getehicleEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-events/{vehicleEventKey}</span> <br/>
        <span class="api-summary">Replace a VehicleEvent entity. replaceVehicleEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-events/{vehicleEventKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleEvent entity. updatePartialVehicleEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-events/{vehicleEventKey}</span> <br/>
        <span class="api-summary">Delete a VehicleEvent entity deleteVehicleEventEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicles</span> <br/>
        <span class="api-summary">Retrieve a list of Vehicle entities scoped by partPickListKey. getVehicleByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicles</span> <br/>
        <span class="api-summary">Create a new Vehicle entity. createVehicle</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicles/{vehicleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicles/{vehicleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Vehicle entity. getehicleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicles/{vehicleKey}</span> <br/>
        <span class="api-summary">Replace a Vehicle entity. replaceVehicle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicles/{vehicleKey}</span> <br/>
        <span class="api-summary">Partially update a Vehicle entity. updatePartialVehicle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicles/{vehicleKey}</span> <br/>
        <span class="api-summary">Delete a Vehicle entity deleteVehicleEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/part-pick-list-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-pick-list-items</span> <br/>
        <span class="api-summary">Retrieve a list of PartPickListItem entities scoped by partPickListKey. getPartPickListItemByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-pick-list-items</span> <br/>
        <span class="api-summary">Create a new PartPickListItem entity. createPartPickListItem</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/part-pick-list-items/{partPickListItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-pick-list-items/{partPickListItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartPickListItem entity. getartPickListItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-pick-list-items/{partPickListItemKey}</span> <br/>
        <span class="api-summary">Replace a PartPickListItem entity. replacePartPickListItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-pick-list-items/{partPickListItemKey}</span> <br/>
        <span class="api-summary">Partially update a PartPickListItem entity. updatePartialPartPickListItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-pick-list-items/{partPickListItemKey}</span> <br/>
        <span class="api-summary">Delete a PartPickListItem entity deletePartPickListItemEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/metric-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/metric-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricValue entities scoped by partPickListKey. getMetricValueByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/metric-values</span> <br/>
        <span class="api-summary">Create a new MetricValue entity. createMetricValue</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/metric-values/{metricValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricValue entity. getetricValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricValue entity. replaceMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricValue entity. updatePartialMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricValue entity deleteMetricValueEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-medias
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-medias</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleMedia entities scoped by partPickListKey. getVehicleMediaByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-medias</span> <br/>
        <span class="api-summary">Create a new VehicleMedia entity. createVehicleMedia</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-medias/{vehicleMediaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-medias/{vehicleMediaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleMedia entity. getehicleMediaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-medias/{vehicleMediaKey}</span> <br/>
        <span class="api-summary">Replace a VehicleMedia entity. replaceVehicleMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-medias/{vehicleMediaKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleMedia entity. updatePartialVehicleMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-medias/{vehicleMediaKey}</span> <br/>
        <span class="api-summary">Delete a VehicleMedia entity deleteVehicleMediaEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by partPickListKey. getIdentifierByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updatePartialIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/part-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-names</span> <br/>
        <span class="api-summary">Retrieve a list of PartName entities scoped by partPickListKey. getPartNameByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-names</span> <br/>
        <span class="api-summary">Create a new PartName entity. createPartName</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/part-names/{partNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartName entity. getartNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Replace a PartName entity. replacePartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Partially update a PartName entity. updatePartialPartName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-names/{partNameKey}</span> <br/>
        <span class="api-summary">Delete a PartName entity deletePartNameEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by partPickListKey. getPriceByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price entity. createPrice</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price entity. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price entity. updatePartialPrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price entity deletePriceEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/insurances
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/insurances</span> <br/>
        <span class="api-summary">Retrieve a list of Insurance entities scoped by partPickListKey. getInsuranceByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/insurances</span> <br/>
        <span class="api-summary">Create a new Insurance entity. createInsurance</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/insurances/{insuranceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/insurances/{insuranceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Insurance entity. getnsuranceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/insurances/{insuranceKey}</span> <br/>
        <span class="api-summary">Replace a Insurance entity. replaceInsurance</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/insurances/{insuranceKey}</span> <br/>
        <span class="api-summary">Partially update a Insurance entity. updatePartialInsurance</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/insurances/{insuranceKey}</span> <br/>
        <span class="api-summary">Delete a Insurance entity deleteInsuranceEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/part-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartIdentifier entities scoped by partPickListKey. getPartIdentifierByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-identifiers</span> <br/>
        <span class="api-summary">Create a new PartIdentifier entity. createPartIdentifier</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/part-identifiers/{partIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartIdentifier entity. getartIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartIdentifier entity. replacePartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartIdentifier entity. updatePartialPartIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/part-identifiers/{partIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartIdentifier entity deletePartIdentifierEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by partPickListKey. getEffectivePeriodByPartPickListKey</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/warehouse-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warehouse-references</span> <br/>
        <span class="api-summary">Retrieve a list of WarehouseReference entities scoped by partPickListKey. getWarehouseReferenceByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warehouse-references</span> <br/>
        <span class="api-summary">Create a new WarehouseReference entity. createWarehouseReference</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/warehouse-references/{warehouseReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific WarehouseReference entity. getarehouseReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Replace a WarehouseReference entity. replaceWarehouseReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a WarehouseReference entity. updatePartialWarehouseReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Delete a WarehouseReference entity deleteWarehouseReferenceEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-options
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-options</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleOption entities scoped by partPickListKey. getVehicleOptionByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-options</span> <br/>
        <span class="api-summary">Create a new VehicleOption entity. createVehicleOption</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-options/{vehicleOptionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-options/{vehicleOptionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleOption entity. getehicleOptionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-options/{vehicleOptionKey}</span> <br/>
        <span class="api-summary">Replace a VehicleOption entity. replaceVehicleOption</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-options/{vehicleOptionKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleOption entity. updatePartialVehicleOption</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-options/{vehicleOptionKey}</span> <br/>
        <span class="api-summary">Delete a VehicleOption entity deleteVehicleOptionEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-specifications
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-specifications</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleSpecification entities scoped by partPickListKey. getVehicleSpecificationByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-specifications</span> <br/>
        <span class="api-summary">Create a new VehicleSpecification entity. createVehicleSpecification</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-specifications/{vehicleSpecificationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-specifications/{vehicleSpecificationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleSpecification entity. getehicleSpecificationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-specifications/{vehicleSpecificationKey}</span> <br/>
        <span class="api-summary">Replace a VehicleSpecification entity. replaceVehicleSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-specifications/{vehicleSpecificationKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleSpecification entity. updatePartialVehicleSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-specifications/{vehicleSpecificationKey}</span> <br/>
        <span class="api-summary">Delete a VehicleSpecification entity deleteVehicleSpecificationEntity</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleIdentifier entities scoped by partPickListKey. getVehicleIdentifierByPartPickListKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Create a new VehicleIdentifier entity. createVehicleIdentifier</span>
    </span>
</div>

### /part-pick-lists/{partPickListKey}/vehicle-identifiers/{vehicleIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleIdentifier entity. getehicleIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a VehicleIdentifier entity. replaceVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleIdentifier entity. updatePartialVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-pick-lists/{partPickListKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a VehicleIdentifier entity deleteVehicleIdentifierEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PartPickListroot with key {PartPickListKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **part-pick-list** | /part-pick-lists | listPartPickList | createPartPickList | getPartPickList | updatePartPickList | deletePartPickList |
    | **warrantie** | /part-pick-lists/{partPickListKey}/warranties | listWarrantyByPartPickListKey | createWarranty | getWarrantyByPartPickListKey | updateWarrantyByPartPickListKey | deleteWarrantyByPartPickListKey |
    | **vehicle-license** | /part-pick-lists/{partPickListKey}/vehicle-licenses | listVehicleLicenseByPartPickListKey | createVehicleLicense | getVehicleLicenseByPartPickListKey | updateVehicleLicenseByPartPickListKey | deleteVehicleLicenseByPartPickListKey |
    | **position** | /part-pick-lists/{partPickListKey}/positions | listPositionByPartPickListKey | createPosition | getPositionByPartPickListKey | updatePositionByPartPickListKey | deletePositionByPartPickListKey |
    | **media** | /part-pick-lists/{partPickListKey}/medias | listMediaByPartPickListKey | createMedia | getMediaByPartPickListKey | updateMediaByPartPickListKey | deleteMediaByPartPickListKey |
    | **vehicle-price-summarie** | /part-pick-lists/{partPickListKey}/vehicle-price-summaries | listVehiclePriceSummaryByPartPickListKey | createVehiclePriceSummary | getVehiclePriceSummaryByPartPickListKey | updateVehiclePriceSummaryByPartPickListKey | deleteVehiclePriceSummaryByPartPickListKey |
    | **vehicle-event** | /part-pick-lists/{partPickListKey}/vehicle-events | listVehicleEventByPartPickListKey | createVehicleEvent | getVehicleEventByPartPickListKey | updateVehicleEventByPartPickListKey | deleteVehicleEventByPartPickListKey |
    | **vehicle** | /part-pick-lists/{partPickListKey}/vehicles | listVehicleByPartPickListKey | createVehicle | getVehicleByPartPickListKey | updateVehicleByPartPickListKey | deleteVehicleByPartPickListKey |
    | **part-pick-list-item** | /part-pick-lists/{partPickListKey}/part-pick-list-items | listPartPickListItemByPartPickListKey | createPartPickListItem | getPartPickListItemByPartPickListKey | updatePartPickListItemByPartPickListKey | deletePartPickListItemByPartPickListKey |
    | **metric-value** | /part-pick-lists/{partPickListKey}/metric-values | listMetricValueByPartPickListKey | createMetricValue | getMetricValueByPartPickListKey | updateMetricValueByPartPickListKey | deleteMetricValueByPartPickListKey |
    | **vehicle-media** | /part-pick-lists/{partPickListKey}/vehicle-medias | listVehicleMediaByPartPickListKey | createVehicleMedia | getVehicleMediaByPartPickListKey | updateVehicleMediaByPartPickListKey | deleteVehicleMediaByPartPickListKey |
    | **identifier** | /part-pick-lists/{partPickListKey}/identifiers | listIdentifierByPartPickListKey | createIdentifier | getIdentifierByPartPickListKey | updateIdentifierByPartPickListKey | deleteIdentifierByPartPickListKey |
    | **part-name** | /part-pick-lists/{partPickListKey}/part-names | listPartNameByPartPickListKey | createPartName | getPartNameByPartPickListKey | updatePartNameByPartPickListKey | deletePartNameByPartPickListKey |
    | **price** | /part-pick-lists/{partPickListKey}/prices | listPriceByPartPickListKey | createPrice | getPriceByPartPickListKey | updatePriceByPartPickListKey | deletePriceByPartPickListKey |
    | **insurance** | /part-pick-lists/{partPickListKey}/insurances | listInsuranceByPartPickListKey | createInsurance | getInsuranceByPartPickListKey | updateInsuranceByPartPickListKey | deleteInsuranceByPartPickListKey |
    | **part-identifier** | /part-pick-lists/{partPickListKey}/part-identifiers | listPartIdentifierByPartPickListKey | createPartIdentifier | getPartIdentifierByPartPickListKey | updatePartIdentifierByPartPickListKey | deletePartIdentifierByPartPickListKey |
    | **effective-period** | /part-pick-lists/{partPickListKey}/effective-periods | listEffectivePeriodByPartPickListKey |  | getEffectivePeriodByPartPickListKey | updateEffectivePeriodByPartPickListKey | deleteEffectivePeriodByPartPickListKey |
    | **warehouse-reference** | /part-pick-lists/{partPickListKey}/warehouse-references | listWarehouseReferenceByPartPickListKey | createWarehouseReference | getWarehouseReferenceByPartPickListKey | updateWarehouseReferenceByPartPickListKey | deleteWarehouseReferenceByPartPickListKey |
    | **vehicle-option** | /part-pick-lists/{partPickListKey}/vehicle-options | listVehicleOptionByPartPickListKey | createVehicleOption | getVehicleOptionByPartPickListKey | updateVehicleOptionByPartPickListKey | deleteVehicleOptionByPartPickListKey |
    | **vehicle-specification** | /part-pick-lists/{partPickListKey}/vehicle-specifications | listVehicleSpecificationByPartPickListKey | createVehicleSpecification | getVehicleSpecificationByPartPickListKey | updateVehicleSpecificationByPartPickListKey | deleteVehicleSpecificationByPartPickListKey |
    | **vehicle-identifier** | /part-pick-lists/{partPickListKey}/vehicle-identifiers | listVehicleIdentifierByPartPickListKey | createVehicleIdentifier | getVehicleIdentifierByPartPickListKey | updateVehicleIdentifierByPartPickListKey | deleteVehicleIdentifierByPartPickListKey |

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

## Bulk Create PartPickList (`POST /partpicklists/batch`)

The `/partpicklists/batch` endpoint allows you to create multiple PartPickList entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of PartPickList and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `PartPickListCreate` schema.

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

Contains the full objects of the PartPickList that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A PartPickList with SKU W-002 already exists."
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

## Health Check (`GET /partpicklists/health`)

The `/partpicklists/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the PartPickList aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## PartPickList Commands and State Management

The partpicklists API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /partpicklists/{PartPickListKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a PartPickList (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /partpicklists/{PartPickListKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /partpicklists/capabilities`)

Before sending a command, you can "discover" what actions are valid for a PartPickList based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the PartPickList must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelPartPickList` | `CREATED`, `ACTIVE` | `DELETED` | Voids the PartPickList . |
| `ActivatePartPickList` | `PENDING` | `ACTIVE` | Moves a PartPickList into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |