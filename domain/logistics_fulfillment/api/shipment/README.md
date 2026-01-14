## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **AddressReference**, **Identifier**, **InvoiceReference**, **PartyReference**, **Position**, **Shipment**, **ShipmentEvent**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **logistics_fulfillment** and **Shipment** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Shipment** | /shipments | Manages Shipments |
    | **InvoiceReference** | /shipments/{shipmentKey}/invoice-references | Manages InvoiceReferences belonging to Shipments |
    | **PartyReference** | /shipments/{shipmentKey}/party-references | Manages PartyReferences belonging to Shipments |
    | **ShipmentEvent** | /shipments/{shipmentKey}/shipment-events | Manages ShipmentEvents belonging to Shipments |
    | **Identifier** | /shipments/{shipmentKey}/identifiers | Manages Identifiers belonging to Shipments |
    | **UnitOfMeasure** | /shipments/{shipmentKey}/unit-of-measures | Manages UnitOfMeasures belonging to Shipments |
    | **Position** | /shipments/{shipmentKey}/positions | Manages Positions belonging to Shipments |
    | **EffectivePeriod** | /shipments/{shipmentKey}/effective-periods | Manages EffectivePeriods belonging to Shipments |
    | **TimeSlot** | /shipments/{shipmentKey}/time-slots | Manages TimeSlots belonging to Shipments |
    | **AddressReference** | /shipments/{shipmentKey}/address-references | Manages AddressReferences belonging to Shipments |


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
> `https://[Your-API-Host]/shipments`

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
💠 **InvoiceTypes** : types of invoices.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **ShipmentStateTypes** : types of shipment states.<br/>
💠 **ShippingMethodTypes** : types of shipping methods.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>
💠 **UOMQuantityCategoryTypes** : types of u o m quantity categorys.<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : The date range during which this record is valid.<br/>
✅ **TimeSlot** : Designated window of time for the activity.<br/>
✅ **UnitOfMeasure** : Standard unit used for quantity (e.g., kg, liters, units).<br/>

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


### /shipments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments</span> <br/>
        <span class="api-summary">Retrieve a list of Shipment entities. getShipment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments</span> <br/>
        <span class="api-summary">Create a new Shipment entity. createShipment</span>
    </span>
</div>

### /shipments/{shipmentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Shipment entity. gethipmentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}</span> <br/>
        <span class="api-summary">Replace a Shipment entity. replaceShipment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}</span> <br/>
        <span class="api-summary">Partially update a Shipment entity. updatePartialShipment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}</span> <br/>
        <span class="api-summary">Delete a Shipment entity deleteShipmentEntity</span>
    </span>
</div>

### /shipments/{shipmentKey}/invoice-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references</span> <br/>
        <span class="api-summary">Retrieve a list of InvoiceReference entities scoped by shipmentKey. getInvoiceReferenceByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references</span> <br/>
        <span class="api-summary">Create a new InvoiceReference entity. createInvoiceReference</span>
    </span>
</div>

### /shipments/{shipmentKey}/invoice-references/{invoiceReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references/{invoiceReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific InvoiceReference entity. getnvoiceReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references/{invoiceReferenceKey}</span> <br/>
        <span class="api-summary">Replace a InvoiceReference entity. replaceInvoiceReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references/{invoiceReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a InvoiceReference entity. updatePartialInvoiceReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references/{invoiceReferenceKey}</span> <br/>
        <span class="api-summary">Delete a InvoiceReference entity deleteInvoiceReferenceEntity</span>
    </span>
</div>

### /shipments/{shipmentKey}/party-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartyReference entities scoped by shipmentKey. getPartyReferenceByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-references</span> <br/>
        <span class="api-summary">Create a new PartyReference entity. createPartyReference</span>
    </span>
</div>

### /shipments/{shipmentKey}/party-references/{partyReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyReference entity. getartyReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartyReference entity. replacePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartyReference entity. updatePartialPartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartyReference entity deletePartyReferenceEntity</span>
    </span>
</div>

### /shipments/{shipmentKey}/shipment-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentEvent entities scoped by shipmentKey. getShipmentEventByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events</span> <br/>
        <span class="api-summary">Create a new ShipmentEvent entity. createShipmentEvent</span>
    </span>
</div>

### /shipments/{shipmentKey}/shipment-events/{shipmentEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentEvent entity. gethipmentEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentEvent entity. replaceShipmentEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentEvent entity. updatePartialShipmentEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentEvent entity deleteShipmentEventEntity</span>
    </span>
</div>

### /shipments/{shipmentKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by shipmentKey. getIdentifierByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /shipments/{shipmentKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updatePartialIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /shipments/{shipmentKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure entities scoped by shipmentKey. getUnitOfMeasureByShipmentKey</span>
    </span>
</div>

### /shipments/{shipmentKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure entity. getnitOfMeasureById</span>
    </span>
</div>

### /shipments/{shipmentKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position entities scoped by shipmentKey. getPositionByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position entity. createPosition</span>
    </span>
</div>

### /shipments/{shipmentKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position entity. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position entity. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position entity. updatePartialPosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position entity deletePositionEntity</span>
    </span>
</div>

### /shipments/{shipmentKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by shipmentKey. getEffectivePeriodByShipmentKey</span>
    </span>
</div>

### /shipments/{shipmentKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /shipments/{shipmentKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by shipmentKey. getTimeSlotByShipmentKey</span>
    </span>
</div>

### /shipments/{shipmentKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### /shipments/{shipmentKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference entities scoped by shipmentKey. getAddressReferenceByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference entity. createAddressReference</span>
    </span>
</div>

### /shipments/{shipmentKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference entity. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference entity. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference entity. updatePartialAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference entity deleteAddressReferenceEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Shipmentroot with key {ShipmentKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **shipment** | /shipments | listShipment | createShipment | getShipment | updateShipment | deleteShipment |
    | **invoice-reference** | /shipments/{shipmentKey}/invoice-references | listInvoiceReferenceByShipmentKey | createInvoiceReference | getInvoiceReferenceByShipmentKey | updateInvoiceReferenceByShipmentKey | deleteInvoiceReferenceByShipmentKey |
    | **party-reference** | /shipments/{shipmentKey}/party-references | listPartyReferenceByShipmentKey | createPartyReference | getPartyReferenceByShipmentKey | updatePartyReferenceByShipmentKey | deletePartyReferenceByShipmentKey |
    | **shipment-event** | /shipments/{shipmentKey}/shipment-events | listShipmentEventByShipmentKey | createShipmentEvent | getShipmentEventByShipmentKey | updateShipmentEventByShipmentKey | deleteShipmentEventByShipmentKey |
    | **identifier** | /shipments/{shipmentKey}/identifiers | listIdentifierByShipmentKey | createIdentifier | getIdentifierByShipmentKey | updateIdentifierByShipmentKey | deleteIdentifierByShipmentKey |
    | **unit-of-measure** | /shipments/{shipmentKey}/unit-of-measures | listUnitOfMeasureByShipmentKey |  | getUnitOfMeasureByShipmentKey | updateUnitOfMeasureByShipmentKey | deleteUnitOfMeasureByShipmentKey |
    | **position** | /shipments/{shipmentKey}/positions | listPositionByShipmentKey | createPosition | getPositionByShipmentKey | updatePositionByShipmentKey | deletePositionByShipmentKey |
    | **effective-period** | /shipments/{shipmentKey}/effective-periods | listEffectivePeriodByShipmentKey |  | getEffectivePeriodByShipmentKey | updateEffectivePeriodByShipmentKey | deleteEffectivePeriodByShipmentKey |
    | **time-slot** | /shipments/{shipmentKey}/time-slots | listTimeSlotByShipmentKey |  | getTimeSlotByShipmentKey | updateTimeSlotByShipmentKey | deleteTimeSlotByShipmentKey |
    | **address-reference** | /shipments/{shipmentKey}/address-references | listAddressReferenceByShipmentKey | createAddressReference | getAddressReferenceByShipmentKey | updateAddressReferenceByShipmentKey | deleteAddressReferenceByShipmentKey |

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

## Bulk Create Shipment (`POST /shipments/batch`)

The `/shipments/batch` endpoint allows you to create multiple Shipment entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of Shipment and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `ShipmentCreate` schema.

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

Contains the full objects of the Shipment that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A Shipment with SKU W-002 already exists."
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

## Health Check (`GET /shipments/health`)

The `/shipments/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the Shipment aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## Shipment Commands and State Management

The shipments API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /shipments/{ShipmentKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a Shipment (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /shipments/{ShipmentKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /shipments/capabilities`)

Before sending a command, you can "discover" what actions are valid for a Shipment based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the Shipment must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelShipment` | `CREATED`, `ACTIVE` | `DELETED` | Voids the Shipment . |
| `ActivateShipment` | `PENDING` | `ACTIVE` | Moves a Shipment into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |