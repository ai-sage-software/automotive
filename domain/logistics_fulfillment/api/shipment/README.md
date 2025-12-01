## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **AddressReference**, **Identifier**, **InvoiceReference**, **PartyIdentifier**, **Position**, **Shipment**, **ShipmentEvent**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **logistics_fulfillment** and **Shipment** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Shipment** | /shipments | Manages Shipments |
    | **InvoiceReference** | /shipments/{shipmentKey}/invoice-references | Manages InvoiceReferences belonging to Shipments |
    | **ShipmentEvent** | /shipments/{shipmentKey}/shipment-events | Manages ShipmentEvents belonging to Shipments |
    | **Identifier** | /shipments/{shipmentKey}/identifiers | Manages Identifiers belonging to Shipments |
    | **UnitOfMeasure** | /shipments/{shipmentKey}/unit-of-measures | Manages UnitOfMeasures belonging to Shipments |
    | **Position** | /shipments/{shipmentKey}/positions | Manages Positions belonging to Shipments |
    | **EffectivePeriod** | /shipments/{shipmentKey}/effective-periods | Manages EffectivePeriods belonging to Shipments |
    | **PartyIdentifier** | /shipments/{shipmentKey}/party-identifiers | Manages PartyIdentifiers belonging to Shipments |
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
> `https://[Your-API-Host]/shipment`

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
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **InvoiceTypes** : types of invoices.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **ShipmentStateTypes** : types of shipment states.<br/>
💠 **ShippingMethodTypes** : types of shipping methods.<br/>
💠 **UOMQuantityCategoryTypes** : types of u o m quantity categorys.<br/>
💠 **DaysOfWeekTypes** : Status of the account<br/>
💠 **TimeslotDirectiveTypes** : Represents the directive for a timeslot.<br/>

## ✅ Entities

---

✅ **AddressReferences** : List of AddressReference<br/>
✅ **Codes** : List of Codes<br/>
✅ **EffectivePeriod** : Effective Period<br/>
✅ **InvoiceReferences** : List of InvoiceReference<br/>
✅ **Link** : Quick Link<br/>
✅ **Links** : List of Links<br/>
✅ **List** : List of String<br/>
✅ **PartyIdentifiers** : List of PartyIdentifier<br/>
✅ **ShipmentEvents** : List of ShipmentEvent<br/>
✅ **TimeSlot** : Range of time for the appointment including start/end times, recurring patterns, and directives.<br/>
✅ **UnitOfMeasure** : value price with unit of measure<br/>
✅ **UnitOfMeasures** : List of UnitOfMeasure<br/>

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
        <span class="api-summary">Retrieve a list of all Shipment records. getShipments</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments</span> <br/>
        <span class="api-summary">Create a new Shipment record. createShipment</span>
    </span>
</div>

### /shipments/{shipmentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Shipment record. gethipmentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}</span> <br/>
        <span class="api-summary">Replace a Shipment record. replaceShipment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}</span> <br/>
        <span class="api-summary">Partially update a Shipment record. updateShipment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}</span> <br/>
        <span class="api-summary">Delete a Shipment Record deleteShipmentRecord</span>
    </span>
</div>

### /shipments/{shipmentKey}/invoice-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references</span> <br/>
        <span class="api-summary">Retrieve a list of InvoiceReference records scoped by shipmentKey. getInvoiceReferencesByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references</span> <br/>
        <span class="api-summary">Create a new InvoiceReference record. createInvoiceReference</span>
    </span>
</div>

### /shipments/{shipmentKey}/invoice-references/{invoiceReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references/{invoiceReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific InvoiceReference record. getnvoiceReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references/{invoiceReferenceKey}</span> <br/>
        <span class="api-summary">Replace a InvoiceReference record. replaceInvoiceReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references/{invoiceReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a InvoiceReference record. updateInvoiceReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/invoice-references/{invoiceReferenceKey}</span> <br/>
        <span class="api-summary">Delete a InvoiceReference Record deleteInvoiceReferenceRecord</span>
    </span>
</div>

### /shipments/{shipmentKey}/shipment-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentEvent records scoped by shipmentKey. getShipmentEventsByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events</span> <br/>
        <span class="api-summary">Create a new ShipmentEvent record. createShipmentEvent</span>
    </span>
</div>

### /shipments/{shipmentKey}/shipment-events/{shipmentEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentEvent record. gethipmentEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentEvent record. replaceShipmentEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentEvent record. updateShipmentEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/shipment-events/{shipmentEventKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentEvent Record deleteShipmentEventRecord</span>
    </span>
</div>

### /shipments/{shipmentKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by shipmentKey. getIdentifiersByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /shipments/{shipmentKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /shipments/{shipmentKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure records scoped by shipmentKey. getUnitOfMeasuresByShipmentKey</span>
    </span>
</div>

### /shipments/{shipmentKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure record. getnitOfMeasureById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Replace a UnitOfMeasure record. replaceUnitOfMeasure</span>
    </span>
</div>

### /shipments/{shipmentKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position records scoped by shipmentKey. getPositionsByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position record. createPosition</span>
    </span>
</div>

### /shipments/{shipmentKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position record. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position record. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position record. updatePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position Record deletePositionRecord</span>
    </span>
</div>

### /shipments/{shipmentKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by shipmentKey. getEffectivePeriodsByShipmentKey</span>
    </span>
</div>

### /shipments/{shipmentKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /shipments/{shipmentKey}/party-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartyIdentifier records scoped by shipmentKey. getPartyIdentifiersByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-identifiers</span> <br/>
        <span class="api-summary">Create a new PartyIdentifier record. createPartyIdentifier</span>
    </span>
</div>

### /shipments/{shipmentKey}/party-identifiers/{partyIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyIdentifier record. getartyIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartyIdentifier record. replacePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartyIdentifier record. updatePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartyIdentifier Record deletePartyIdentifierRecord</span>
    </span>
</div>

### /shipments/{shipmentKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference records scoped by shipmentKey. getAddressReferencesByShipmentKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference record. createAddressReference</span>
    </span>
</div>

### /shipments/{shipmentKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference record. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference record. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference record. updateAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/shipments/{shipmentKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference Record deleteAddressReferenceRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Shipmentroot with key {ShipmentKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **shipment** | /shipments | listShipments | createShipment | getShipments | updateShipments | deleteShipments |
    | **invoice-reference** | /shipments/{shipmentKey}/invoice-references | listInvoiceReferencesByShipmentKey | createInvoiceReference | getInvoiceReferencesByShipmentKey | updateInvoiceReferencesByShipmentKey | deleteInvoiceReferencesByShipmentKey |
    | **shipment-event** | /shipments/{shipmentKey}/shipment-events | listShipmentEventsByShipmentKey | createShipmentEvent | getShipmentEventsByShipmentKey | updateShipmentEventsByShipmentKey | deleteShipmentEventsByShipmentKey |
    | **identifier** | /shipments/{shipmentKey}/identifiers | listIdentifiersByShipmentKey | createIdentifier | getIdentifiersByShipmentKey | updateIdentifiersByShipmentKey | deleteIdentifiersByShipmentKey |
    | **unit-of-measure** | /shipments/{shipmentKey}/unit-of-measures | listUnitOfMeasuresByShipmentKey |  | getUnitOfMeasuresByShipmentKey | updateUnitOfMeasuresByShipmentKey | deleteUnitOfMeasuresByShipmentKey |
    | **position** | /shipments/{shipmentKey}/positions | listPositionsByShipmentKey | createPosition | getPositionsByShipmentKey | updatePositionsByShipmentKey | deletePositionsByShipmentKey |
    | **effective-period** | /shipments/{shipmentKey}/effective-periods | listEffectivePeriodsByShipmentKey |  | getEffectivePeriodsByShipmentKey | updateEffectivePeriodsByShipmentKey | deleteEffectivePeriodsByShipmentKey |
    | **party-identifier** | /shipments/{shipmentKey}/party-identifiers | listPartyIdentifiersByShipmentKey | createPartyIdentifier | getPartyIdentifiersByShipmentKey | updatePartyIdentifiersByShipmentKey | deletePartyIdentifiersByShipmentKey |
    | **address-reference** | /shipments/{shipmentKey}/address-references | listAddressReferencesByShipmentKey | createAddressReference | getAddressReferencesByShipmentKey | updateAddressReferencesByShipmentKey | deleteAddressReferencesByShipmentKey |

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