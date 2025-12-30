## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **AddressReference**, **EffectivePeriod**, **FinancialTrackReference**, **Identifier**, **LifecycleEvent**, **PartReference**, **PartyReference**, **Position**, **Price**, **PurchaseOrderReference**, **Receipt**, **ReceiptLineItem**, **ShipmentEvent**, **ShipmentReference**, **StaffAssignmentReference**, **TimeSlot**, **UnitOfMeasure**, **WarehouseReference**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **finance** and **Receipt** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Receipt** | /receipts | Manages Receipts |
    | **ShipmentReference** | /receipts/{receiptKey}/shipment-references | Manages ShipmentReferences belonging to Receipts |
    | **UnitOfMeasure** | /receipts/{receiptKey}/unit-of-measures | Manages UnitOfMeasures belonging to Receipts |
    | **Position** | /receipts/{receiptKey}/positions | Manages Positions belonging to Receipts |
    | **TimeSlot** | /receipts/{receiptKey}/time-slots | Manages TimeSlots belonging to Receipts |
    | **AddressReference** | /receipts/{receiptKey}/address-references | Manages AddressReferences belonging to Receipts |
    | **PartyReference** | /receipts/{receiptKey}/party-references | Manages PartyReferences belonging to Receipts |
    | **StaffAssignmentReference** | /receipts/{receiptKey}/staff-assignment-references | Manages StaffAssignmentReferences belonging to Receipts |
    | **ShipmentEvent** | /receipts/{receiptKey}/shipment-events | Manages ShipmentEvents belonging to Receipts |
    | **Identifier** | /receipts/{receiptKey}/identifiers | Manages Identifiers belonging to Receipts |
    | **Price** | /receipts/{receiptKey}/prices | Manages Prices belonging to Receipts |
    | **PurchaseOrderReference** | /receipts/{receiptKey}/purchase-order-references | Manages PurchaseOrderReferences belonging to Receipts |
    | **ReceiptLineItem** | /receipts/{receiptKey}/receipt-line-items | Manages ReceiptLineItems belonging to Receipts |
    | **PartReference** | /receipts/{receiptKey}/part-references | Manages PartReferences belonging to Receipts |
    | **EffectivePeriod** | /receipts/{receiptKey}/effective-periods | Manages EffectivePeriods belonging to Receipts |
    | **LifecycleEvent** | /receipts/{receiptKey}/lifecycle-events | Manages LifecycleEvents belonging to Receipts |
    | **WarehouseReference** | /receipts/{receiptKey}/warehouse-references | Manages WarehouseReferences belonging to Receipts |
    | **FinancialTrackReference** | /receipts/{receiptKey}/financial-track-references | Manages FinancialTrackReferences belonging to Receipts |


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
> `https://[Your-API-Host]/receipts`

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

💠 **AddressTypes** : types of address.<br/>
💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **LifecycleEventTypes** : types of lifecycle events.<br/>
💠 **OrderTypes** : types of orders.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductTypes** : types of products.<br/>
💠 **ReceiptStatusTypes** : types of receipt status.<br/>
💠 **ResourceTypes** : types of resources.<br/>
💠 **ShipmentStateTypes** : types of shipment states.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>
💠 **UOMQuantityCategoryTypes** : types of u o m quantity categorys.<br/>

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


### /receipts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts</span> <br/>
        <span class="api-summary">Retrieve a list of Receipt entities. getReceipt</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts</span> <br/>
        <span class="api-summary">Create a new Receipt entity. createReceipt</span>
    </span>
</div>

### /receipts/{receiptKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Receipt entity. geteceiptById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}</span> <br/>
        <span class="api-summary">Replace a Receipt entity. replaceReceipt</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}</span> <br/>
        <span class="api-summary">Partially update a Receipt entity. updateReceipt</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}</span> <br/>
        <span class="api-summary">Delete a Receipt entity deleteReceiptEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/shipment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentReference entities scoped by receiptKey. getShipmentReferenceByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references</span> <br/>
        <span class="api-summary">Create a new ShipmentReference entity. createShipmentReference</span>
    </span>
</div>

### /receipts/{receiptKey}/shipment-references/{shipmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentReference entity. gethipmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentReference entity. replaceShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentReference entity. updateShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentReference entity deleteShipmentReferenceEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure entities scoped by receiptKey. getUnitOfMeasureByReceiptKey</span>
    </span>
</div>

### /receipts/{receiptKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure entity. getnitOfMeasureById</span>
    </span>
</div>

### /receipts/{receiptKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position entities scoped by receiptKey. getPositionByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position entity. createPosition</span>
    </span>
</div>

### /receipts/{receiptKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position entity. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position entity. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position entity. updatePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position entity deletePositionEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by receiptKey. getTimeSlotByReceiptKey</span>
    </span>
</div>

### /receipts/{receiptKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### /receipts/{receiptKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference entities scoped by receiptKey. getAddressReferenceByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference entity. createAddressReference</span>
    </span>
</div>

### /receipts/{receiptKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference entity. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference entity. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference entity. updateAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference entity deleteAddressReferenceEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/party-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartyReference entities scoped by receiptKey. getPartyReferenceByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references</span> <br/>
        <span class="api-summary">Create a new PartyReference entity. createPartyReference</span>
    </span>
</div>

### /receipts/{receiptKey}/party-references/{partyReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyReference entity. getartyReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartyReference entity. replacePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartyReference entity. updatePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartyReference entity deletePartyReferenceEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/staff-assignment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Retrieve a list of StaffAssignmentReference entities scoped by receiptKey. getStaffAssignmentReferenceByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Create a new StaffAssignmentReference entity. createStaffAssignmentReference</span>
    </span>
</div>

### /receipts/{receiptKey}/staff-assignment-references/{staffAssignmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffAssignmentReference entity. gettaffAssignmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a StaffAssignmentReference entity. replaceStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a StaffAssignmentReference entity. updateStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a StaffAssignmentReference entity deleteStaffAssignmentReferenceEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/shipment-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentEvent entities scoped by receiptKey. getShipmentEventByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events</span> <br/>
        <span class="api-summary">Create a new ShipmentEvent entity. createShipmentEvent</span>
    </span>
</div>

### /receipts/{receiptKey}/shipment-events/{shipmentEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentEvent entity. gethipmentEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentEvent entity. replaceShipmentEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentEvent entity. updateShipmentEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentEvent entity deleteShipmentEventEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by receiptKey. getIdentifierByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /receipts/{receiptKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by receiptKey. getPriceByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price entity. createPrice</span>
    </span>
</div>

### /receipts/{receiptKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price entity. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price entity. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price entity deletePriceEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/purchase-order-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references</span> <br/>
        <span class="api-summary">Retrieve a list of PurchaseOrderReference entities scoped by receiptKey. getPurchaseOrderReferenceByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references</span> <br/>
        <span class="api-summary">Create a new PurchaseOrderReference entity. createPurchaseOrderReference</span>
    </span>
</div>

### /receipts/{receiptKey}/purchase-order-references/{purchaseOrderReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references/{purchaseOrderReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PurchaseOrderReference entity. geturchaseOrderReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references/{purchaseOrderReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PurchaseOrderReference entity. replacePurchaseOrderReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references/{purchaseOrderReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PurchaseOrderReference entity. updatePurchaseOrderReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references/{purchaseOrderReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PurchaseOrderReference entity deletePurchaseOrderReferenceEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/receipt-line-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items</span> <br/>
        <span class="api-summary">Retrieve a list of ReceiptLineItem entities scoped by receiptKey. getReceiptLineItemByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items</span> <br/>
        <span class="api-summary">Create a new ReceiptLineItem entity. createReceiptLineItem</span>
    </span>
</div>

### /receipts/{receiptKey}/receipt-line-items/{receiptLineItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items/{receiptLineItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ReceiptLineItem entity. geteceiptLineItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items/{receiptLineItemKey}</span> <br/>
        <span class="api-summary">Replace a ReceiptLineItem entity. replaceReceiptLineItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items/{receiptLineItemKey}</span> <br/>
        <span class="api-summary">Partially update a ReceiptLineItem entity. updateReceiptLineItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items/{receiptLineItemKey}</span> <br/>
        <span class="api-summary">Delete a ReceiptLineItem entity deleteReceiptLineItemEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/part-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartReference entities scoped by receiptKey. getPartReferenceByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references</span> <br/>
        <span class="api-summary">Create a new PartReference entity. createPartReference</span>
    </span>
</div>

### /receipts/{receiptKey}/part-references/{partReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartReference entity. getartReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartReference entity. replacePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartReference entity. updatePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartReference entity deletePartReferenceEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by receiptKey. getEffectivePeriodByReceiptKey</span>
    </span>
</div>

### /receipts/{receiptKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /receipts/{receiptKey}/lifecycle-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events</span> <br/>
        <span class="api-summary">Retrieve a list of LifecycleEvent entities scoped by receiptKey. getLifecycleEventByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events</span> <br/>
        <span class="api-summary">Create a new LifecycleEvent entity. createLifecycleEvent</span>
    </span>
</div>

### /receipts/{receiptKey}/lifecycle-events/{lifecycleEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events/{lifecycleEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LifecycleEvent entity. getifecycleEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events/{lifecycleEventKey}</span> <br/>
        <span class="api-summary">Replace a LifecycleEvent entity. replaceLifecycleEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events/{lifecycleEventKey}</span> <br/>
        <span class="api-summary">Partially update a LifecycleEvent entity. updateLifecycleEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events/{lifecycleEventKey}</span> <br/>
        <span class="api-summary">Delete a LifecycleEvent entity deleteLifecycleEventEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/warehouse-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references</span> <br/>
        <span class="api-summary">Retrieve a list of WarehouseReference entities scoped by receiptKey. getWarehouseReferenceByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references</span> <br/>
        <span class="api-summary">Create a new WarehouseReference entity. createWarehouseReference</span>
    </span>
</div>

### /receipts/{receiptKey}/warehouse-references/{warehouseReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific WarehouseReference entity. getarehouseReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Replace a WarehouseReference entity. replaceWarehouseReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a WarehouseReference entity. updateWarehouseReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Delete a WarehouseReference entity deleteWarehouseReferenceEntity</span>
    </span>
</div>

### /receipts/{receiptKey}/financial-track-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialTrackReference entities scoped by receiptKey. getFinancialTrackReferenceByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references</span> <br/>
        <span class="api-summary">Create a new FinancialTrackReference entity. createFinancialTrackReference</span>
    </span>
</div>

### /receipts/{receiptKey}/financial-track-references/{financialTrackReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialTrackReference entity. getinancialTrackReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialTrackReference entity. replaceFinancialTrackReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialTrackReference entity. updateFinancialTrackReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialTrackReference entity deleteFinancialTrackReferenceEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Receiptroot with key {ReceiptKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **receipt** | /receipts | listReceipt | createReceipt | getReceipt | updateReceipt | deleteReceipt |
    | **shipment-reference** | /receipts/{receiptKey}/shipment-references | listShipmentReferenceByReceiptKey | createShipmentReference | getShipmentReferenceByReceiptKey | updateShipmentReferenceByReceiptKey | deleteShipmentReferenceByReceiptKey |
    | **unit-of-measure** | /receipts/{receiptKey}/unit-of-measures | listUnitOfMeasureByReceiptKey |  | getUnitOfMeasureByReceiptKey | updateUnitOfMeasureByReceiptKey | deleteUnitOfMeasureByReceiptKey |
    | **position** | /receipts/{receiptKey}/positions | listPositionByReceiptKey | createPosition | getPositionByReceiptKey | updatePositionByReceiptKey | deletePositionByReceiptKey |
    | **time-slot** | /receipts/{receiptKey}/time-slots | listTimeSlotByReceiptKey |  | getTimeSlotByReceiptKey | updateTimeSlotByReceiptKey | deleteTimeSlotByReceiptKey |
    | **address-reference** | /receipts/{receiptKey}/address-references | listAddressReferenceByReceiptKey | createAddressReference | getAddressReferenceByReceiptKey | updateAddressReferenceByReceiptKey | deleteAddressReferenceByReceiptKey |
    | **party-reference** | /receipts/{receiptKey}/party-references | listPartyReferenceByReceiptKey | createPartyReference | getPartyReferenceByReceiptKey | updatePartyReferenceByReceiptKey | deletePartyReferenceByReceiptKey |
    | **staff-assignment-reference** | /receipts/{receiptKey}/staff-assignment-references | listStaffAssignmentReferenceByReceiptKey | createStaffAssignmentReference | getStaffAssignmentReferenceByReceiptKey | updateStaffAssignmentReferenceByReceiptKey | deleteStaffAssignmentReferenceByReceiptKey |
    | **shipment-event** | /receipts/{receiptKey}/shipment-events | listShipmentEventByReceiptKey | createShipmentEvent | getShipmentEventByReceiptKey | updateShipmentEventByReceiptKey | deleteShipmentEventByReceiptKey |
    | **identifier** | /receipts/{receiptKey}/identifiers | listIdentifierByReceiptKey | createIdentifier | getIdentifierByReceiptKey | updateIdentifierByReceiptKey | deleteIdentifierByReceiptKey |
    | **price** | /receipts/{receiptKey}/prices | listPriceByReceiptKey | createPrice | getPriceByReceiptKey | updatePriceByReceiptKey | deletePriceByReceiptKey |
    | **purchase-order-reference** | /receipts/{receiptKey}/purchase-order-references | listPurchaseOrderReferenceByReceiptKey | createPurchaseOrderReference | getPurchaseOrderReferenceByReceiptKey | updatePurchaseOrderReferenceByReceiptKey | deletePurchaseOrderReferenceByReceiptKey |
    | **receipt-line-item** | /receipts/{receiptKey}/receipt-line-items | listReceiptLineItemByReceiptKey | createReceiptLineItem | getReceiptLineItemByReceiptKey | updateReceiptLineItemByReceiptKey | deleteReceiptLineItemByReceiptKey |
    | **part-reference** | /receipts/{receiptKey}/part-references | listPartReferenceByReceiptKey | createPartReference | getPartReferenceByReceiptKey | updatePartReferenceByReceiptKey | deletePartReferenceByReceiptKey |
    | **effective-period** | /receipts/{receiptKey}/effective-periods | listEffectivePeriodByReceiptKey |  | getEffectivePeriodByReceiptKey | updateEffectivePeriodByReceiptKey | deleteEffectivePeriodByReceiptKey |
    | **lifecycle-event** | /receipts/{receiptKey}/lifecycle-events | listLifecycleEventByReceiptKey | createLifecycleEvent | getLifecycleEventByReceiptKey | updateLifecycleEventByReceiptKey | deleteLifecycleEventByReceiptKey |
    | **warehouse-reference** | /receipts/{receiptKey}/warehouse-references | listWarehouseReferenceByReceiptKey | createWarehouseReference | getWarehouseReferenceByReceiptKey | updateWarehouseReferenceByReceiptKey | deleteWarehouseReferenceByReceiptKey |
    | **financial-track-reference** | /receipts/{receiptKey}/financial-track-references | listFinancialTrackReferenceByReceiptKey | createFinancialTrackReference | getFinancialTrackReferenceByReceiptKey | updateFinancialTrackReferenceByReceiptKey | deleteFinancialTrackReferenceByReceiptKey |

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

## Bulk Create Receipt (`POST /receipts/batch`)

The `/receipts/batch` endpoint allows you to create multiple Receipt entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of Receipt and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `ReceiptCreate` schema.

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

Contains the full objects of the Receipt that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A Receipt with SKU W-002 already exists."
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

## Health Check (`GET /receipts/health`)

The `/receipts/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the Receipt aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## Receipt Commands and State Management

The receipts API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /receipts/{ReceiptKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a Receipt (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /receipts/{ReceiptKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /receipts/capabilities`)

Before sending a command, you can "discover" what actions are valid for a Receipt based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the Receipt must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelReceipt` | `CREATED`, `ACTIVE` | `DELETED` | Voids the Receipt . |
| `ActivateReceipt` | `PENDING` | `ACTIVE` | Moves a Receipt into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |