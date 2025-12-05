## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **AddressReference**, **FinancialTrackReference**, **Identifier**, **LifecycleEvent**, **PartReference**, **PartyReference**, **Position**, **Price**, **PurchaseOrderReference**, **Receipt**, **ReceiptLineItem**, **ShipmentEvent**, **ShipmentReference**, **StaffAssignmentReference**, **WarehouseReference**.

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
> `https://[Your-API-Host]/receipt`

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

✅ **EffectivePeriod** : Effective Period<br/>
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


### /receipts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts</span> <br/>
        <span class="api-summary">Retrieve a list of all Receipt records. getReceipts</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts</span> <br/>
        <span class="api-summary">Create a new Receipt record. createReceipt</span>
    </span>
</div>

### /receipts/{receiptKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Receipt record. geteceiptById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}</span> <br/>
        <span class="api-summary">Replace a Receipt record. replaceReceipt</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}</span> <br/>
        <span class="api-summary">Partially update a Receipt record. updateReceipt</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}</span> <br/>
        <span class="api-summary">Delete a Receipt Record deleteReceiptRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/shipment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentReference records scoped by receiptKey. getShipmentReferencesByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references</span> <br/>
        <span class="api-summary">Create a new ShipmentReference record. createShipmentReference</span>
    </span>
</div>

### /receipts/{receiptKey}/shipment-references/{shipmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentReference record. gethipmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentReference record. replaceShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentReference record. updateShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentReference Record deleteShipmentReferenceRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure records scoped by receiptKey. getUnitOfMeasuresByReceiptKey</span>
    </span>
</div>

### /receipts/{receiptKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure record. getnitOfMeasureById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Replace a UnitOfMeasure record. replaceUnitOfMeasure</span>
    </span>
</div>

### /receipts/{receiptKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position records scoped by receiptKey. getPositionsByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position record. createPosition</span>
    </span>
</div>

### /receipts/{receiptKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position record. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position record. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position record. updatePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position Record deletePositionRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot records scoped by receiptKey. getTimeSlotsByReceiptKey</span>
    </span>
</div>

### /receipts/{receiptKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot record. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot record. replaceTimeSlot</span>
    </span>
</div>

### /receipts/{receiptKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference records scoped by receiptKey. getAddressReferencesByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference record. createAddressReference</span>
    </span>
</div>

### /receipts/{receiptKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference record. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference record. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference record. updateAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference Record deleteAddressReferenceRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/party-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartyReference records scoped by receiptKey. getPartyReferencesByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references</span> <br/>
        <span class="api-summary">Create a new PartyReference record. createPartyReference</span>
    </span>
</div>

### /receipts/{receiptKey}/party-references/{partyReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyReference record. getartyReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartyReference record. replacePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartyReference record. updatePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartyReference Record deletePartyReferenceRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/staff-assignment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Retrieve a list of StaffAssignmentReference records scoped by receiptKey. getStaffAssignmentReferencesByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Create a new StaffAssignmentReference record. createStaffAssignmentReference</span>
    </span>
</div>

### /receipts/{receiptKey}/staff-assignment-references/{staffAssignmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffAssignmentReference record. gettaffAssignmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a StaffAssignmentReference record. replaceStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a StaffAssignmentReference record. updateStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a StaffAssignmentReference Record deleteStaffAssignmentReferenceRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/shipment-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentEvent records scoped by receiptKey. getShipmentEventsByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events</span> <br/>
        <span class="api-summary">Create a new ShipmentEvent record. createShipmentEvent</span>
    </span>
</div>

### /receipts/{receiptKey}/shipment-events/{shipmentEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentEvent record. gethipmentEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentEvent record. replaceShipmentEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentEvent record. updateShipmentEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentEvent Record deleteShipmentEventRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by receiptKey. getIdentifiersByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /receipts/{receiptKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price records scoped by receiptKey. getPricesByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price record. createPrice</span>
    </span>
</div>

### /receipts/{receiptKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price record. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price record. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price record. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price Record deletePriceRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/purchase-order-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references</span> <br/>
        <span class="api-summary">Retrieve a list of PurchaseOrderReference records scoped by receiptKey. getPurchaseOrderReferencesByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references</span> <br/>
        <span class="api-summary">Create a new PurchaseOrderReference record. createPurchaseOrderReference</span>
    </span>
</div>

### /receipts/{receiptKey}/purchase-order-references/{purchaseOrderReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references/{purchaseOrderReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PurchaseOrderReference record. geturchaseOrderReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references/{purchaseOrderReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PurchaseOrderReference record. replacePurchaseOrderReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references/{purchaseOrderReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PurchaseOrderReference record. updatePurchaseOrderReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/purchase-order-references/{purchaseOrderReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PurchaseOrderReference Record deletePurchaseOrderReferenceRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/receipt-line-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items</span> <br/>
        <span class="api-summary">Retrieve a list of ReceiptLineItem records scoped by receiptKey. getReceiptLineItemsByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items</span> <br/>
        <span class="api-summary">Create a new ReceiptLineItem record. createReceiptLineItem</span>
    </span>
</div>

### /receipts/{receiptKey}/receipt-line-items/{receiptLineItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items/{receiptLineItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ReceiptLineItem record. geteceiptLineItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items/{receiptLineItemKey}</span> <br/>
        <span class="api-summary">Replace a ReceiptLineItem record. replaceReceiptLineItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items/{receiptLineItemKey}</span> <br/>
        <span class="api-summary">Partially update a ReceiptLineItem record. updateReceiptLineItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/receipt-line-items/{receiptLineItemKey}</span> <br/>
        <span class="api-summary">Delete a ReceiptLineItem Record deleteReceiptLineItemRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/part-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartReference records scoped by receiptKey. getPartReferencesByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references</span> <br/>
        <span class="api-summary">Create a new PartReference record. createPartReference</span>
    </span>
</div>

### /receipts/{receiptKey}/part-references/{partReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartReference record. getartReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartReference record. replacePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartReference record. updatePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartReference Record deletePartReferenceRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by receiptKey. getEffectivePeriodsByReceiptKey</span>
    </span>
</div>

### /receipts/{receiptKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /receipts/{receiptKey}/lifecycle-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events</span> <br/>
        <span class="api-summary">Retrieve a list of LifecycleEvent records scoped by receiptKey. getLifecycleEventsByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events</span> <br/>
        <span class="api-summary">Create a new LifecycleEvent record. createLifecycleEvent</span>
    </span>
</div>

### /receipts/{receiptKey}/lifecycle-events/{lifecycleEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events/{lifecycleEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LifecycleEvent record. getifecycleEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events/{lifecycleEventKey}</span> <br/>
        <span class="api-summary">Replace a LifecycleEvent record. replaceLifecycleEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events/{lifecycleEventKey}</span> <br/>
        <span class="api-summary">Partially update a LifecycleEvent record. updateLifecycleEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/lifecycle-events/{lifecycleEventKey}</span> <br/>
        <span class="api-summary">Delete a LifecycleEvent Record deleteLifecycleEventRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/warehouse-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references</span> <br/>
        <span class="api-summary">Retrieve a list of WarehouseReference records scoped by receiptKey. getWarehouseReferencesByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references</span> <br/>
        <span class="api-summary">Create a new WarehouseReference record. createWarehouseReference</span>
    </span>
</div>

### /receipts/{receiptKey}/warehouse-references/{warehouseReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific WarehouseReference record. getarehouseReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Replace a WarehouseReference record. replaceWarehouseReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a WarehouseReference record. updateWarehouseReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/warehouse-references/{warehouseReferenceKey}</span> <br/>
        <span class="api-summary">Delete a WarehouseReference Record deleteWarehouseReferenceRecord</span>
    </span>
</div>

### /receipts/{receiptKey}/financial-track-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialTrackReference records scoped by receiptKey. getFinancialTrackReferencesByReceiptKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references</span> <br/>
        <span class="api-summary">Create a new FinancialTrackReference record. createFinancialTrackReference</span>
    </span>
</div>

### /receipts/{receiptKey}/financial-track-references/{financialTrackReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialTrackReference record. getinancialTrackReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialTrackReference record. replaceFinancialTrackReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialTrackReference record. updateFinancialTrackReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/receipts/{receiptKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialTrackReference Record deleteFinancialTrackReferenceRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Receiptroot with key {ReceiptKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **receipt** | /receipts | listReceipts | createReceipt | getReceipts | updateReceipts | deleteReceipts |
    | **shipment-reference** | /receipts/{receiptKey}/shipment-references | listShipmentReferencesByReceiptKey | createShipmentReference | getShipmentReferencesByReceiptKey | updateShipmentReferencesByReceiptKey | deleteShipmentReferencesByReceiptKey |
    | **unit-of-measure** | /receipts/{receiptKey}/unit-of-measures | listUnitOfMeasuresByReceiptKey |  | getUnitOfMeasuresByReceiptKey | updateUnitOfMeasuresByReceiptKey | deleteUnitOfMeasuresByReceiptKey |
    | **position** | /receipts/{receiptKey}/positions | listPositionsByReceiptKey | createPosition | getPositionsByReceiptKey | updatePositionsByReceiptKey | deletePositionsByReceiptKey |
    | **time-slot** | /receipts/{receiptKey}/time-slots | listTimeSlotsByReceiptKey |  | getTimeSlotsByReceiptKey | updateTimeSlotsByReceiptKey | deleteTimeSlotsByReceiptKey |
    | **address-reference** | /receipts/{receiptKey}/address-references | listAddressReferencesByReceiptKey | createAddressReference | getAddressReferencesByReceiptKey | updateAddressReferencesByReceiptKey | deleteAddressReferencesByReceiptKey |
    | **party-reference** | /receipts/{receiptKey}/party-references | listPartyReferencesByReceiptKey | createPartyReference | getPartyReferencesByReceiptKey | updatePartyReferencesByReceiptKey | deletePartyReferencesByReceiptKey |
    | **staff-assignment-reference** | /receipts/{receiptKey}/staff-assignment-references | listStaffAssignmentReferencesByReceiptKey | createStaffAssignmentReference | getStaffAssignmentReferencesByReceiptKey | updateStaffAssignmentReferencesByReceiptKey | deleteStaffAssignmentReferencesByReceiptKey |
    | **shipment-event** | /receipts/{receiptKey}/shipment-events | listShipmentEventsByReceiptKey | createShipmentEvent | getShipmentEventsByReceiptKey | updateShipmentEventsByReceiptKey | deleteShipmentEventsByReceiptKey |
    | **identifier** | /receipts/{receiptKey}/identifiers | listIdentifiersByReceiptKey | createIdentifier | getIdentifiersByReceiptKey | updateIdentifiersByReceiptKey | deleteIdentifiersByReceiptKey |
    | **price** | /receipts/{receiptKey}/prices | listPricesByReceiptKey | createPrice | getPricesByReceiptKey | updatePricesByReceiptKey | deletePricesByReceiptKey |
    | **purchase-order-reference** | /receipts/{receiptKey}/purchase-order-references | listPurchaseOrderReferencesByReceiptKey | createPurchaseOrderReference | getPurchaseOrderReferencesByReceiptKey | updatePurchaseOrderReferencesByReceiptKey | deletePurchaseOrderReferencesByReceiptKey |
    | **receipt-line-item** | /receipts/{receiptKey}/receipt-line-items | listReceiptLineItemsByReceiptKey | createReceiptLineItem | getReceiptLineItemsByReceiptKey | updateReceiptLineItemsByReceiptKey | deleteReceiptLineItemsByReceiptKey |
    | **part-reference** | /receipts/{receiptKey}/part-references | listPartReferencesByReceiptKey | createPartReference | getPartReferencesByReceiptKey | updatePartReferencesByReceiptKey | deletePartReferencesByReceiptKey |
    | **effective-period** | /receipts/{receiptKey}/effective-periods | listEffectivePeriodsByReceiptKey |  | getEffectivePeriodsByReceiptKey | updateEffectivePeriodsByReceiptKey | deleteEffectivePeriodsByReceiptKey |
    | **lifecycle-event** | /receipts/{receiptKey}/lifecycle-events | listLifecycleEventsByReceiptKey | createLifecycleEvent | getLifecycleEventsByReceiptKey | updateLifecycleEventsByReceiptKey | deleteLifecycleEventsByReceiptKey |
    | **warehouse-reference** | /receipts/{receiptKey}/warehouse-references | listWarehouseReferencesByReceiptKey | createWarehouseReference | getWarehouseReferencesByReceiptKey | updateWarehouseReferencesByReceiptKey | deleteWarehouseReferencesByReceiptKey |
    | **financial-track-reference** | /receipts/{receiptKey}/financial-track-references | listFinancialTrackReferencesByReceiptKey | createFinancialTrackReference | getFinancialTrackReferencesByReceiptKey | updateFinancialTrackReferencesByReceiptKey | deleteFinancialTrackReferencesByReceiptKey |

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