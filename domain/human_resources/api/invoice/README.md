## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **AddressReference**, **ControlAccountReference**, **CreditReference**, **DiscountReference**, **FeeReference**, **FinancialCategoryReference**, **FinancialEvent**, **FinancialSplit**, **FinancialTrack**, **Identifier**, **Invoice**, **InvoiceItem**, **PartReference**, **PartyIdentifier**, **PaymentMethodReference**, **PaymentScheduleReference**, **PaymentTermReference**, **Price**, **PricePlanReference**, **RebateReference**, **RewardReference**, **ShipmentReference**, **TaxSplit**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **human_resources** and **Invoice** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Invoice** | /invoices | Manages Invoices |
    | **PaymentTermReference** | /invoices/{invoiceKey}/payment-term-references | Manages PaymentTermReferences belonging to Invoices |
    | **InvoiceItem** | /invoices/{invoiceKey}/invoice-items | Manages InvoiceItems belonging to Invoices |
    | **DiscountReference** | /invoices/{invoiceKey}/discount-references | Manages DiscountReferences belonging to Invoices |
    | **TimeSlot** | /invoices/{invoiceKey}/time-slots | Manages TimeSlots belonging to Invoices |
    | **AddressReference** | /invoices/{invoiceKey}/address-references | Manages AddressReferences belonging to Invoices |
    | **FinancialCategoryReference** | /invoices/{invoiceKey}/financial-category-references | Manages FinancialCategoryReferences belonging to Invoices |
    | **FeeReference** | /invoices/{invoiceKey}/fee-references | Manages FeeReferences belonging to Invoices |
    | **Identifier** | /invoices/{invoiceKey}/identifiers | Manages Identifiers belonging to Invoices |
    | **PartReference** | /invoices/{invoiceKey}/part-references | Manages PartReferences belonging to Invoices |
    | **EffectivePeriod** | /invoices/{invoiceKey}/effective-periods | Manages EffectivePeriods belonging to Invoices |
    | **CreditReference** | /invoices/{invoiceKey}/credit-references | Manages CreditReferences belonging to Invoices |
    | **RebateReference** | /invoices/{invoiceKey}/rebate-references | Manages RebateReferences belonging to Invoices |
    | **ShipmentReference** | /invoices/{invoiceKey}/shipment-references | Manages ShipmentReferences belonging to Invoices |
    | **UnitOfMeasure** | /invoices/{invoiceKey}/unit-of-measures | Manages UnitOfMeasures belonging to Invoices |
    | **TaxSplit** | /invoices/{invoiceKey}/tax-splits | Manages TaxSplits belonging to Invoices |
    | **PaymentScheduleReference** | /invoices/{invoiceKey}/payment-schedule-references | Manages PaymentScheduleReferences belonging to Invoices |
    | **PricePlanReference** | /invoices/{invoiceKey}/price-plan-references | Manages PricePlanReferences belonging to Invoices |
    | **ControlAccountReference** | /invoices/{invoiceKey}/control-account-references | Manages ControlAccountReferences belonging to Invoices |
    | **RewardReference** | /invoices/{invoiceKey}/reward-references | Manages RewardReferences belonging to Invoices |
    | **PartyIdentifier** | /invoices/{invoiceKey}/party-identifiers | Manages PartyIdentifiers belonging to Invoices |
    | **Price** | /invoices/{invoiceKey}/prices | Manages Prices belonging to Invoices |
    | **FinancialEvent** | /invoices/{invoiceKey}/financial-events | Manages FinancialEvents belonging to Invoices |
    | **PaymentMethodReference** | /invoices/{invoiceKey}/payment-method-references | Manages PaymentMethodReferences belonging to Invoices |
    | **TextualDetail** | /invoices/{invoiceKey}/textual-details | Manages TextualDetails belonging to Invoices |
    | **FinancialSplit** | /invoices/{invoiceKey}/financial-splits | Manages FinancialSplits belonging to Invoices |
    | **FinancialTrack** | /invoices/{invoiceKey}/financial-tracks | Manages FinancialTracks belonging to Invoices |


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
> `https://[Your-API-Host]/invoice`

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
💠 **ExitConsiderationTypes** : types of exit considerations.<br/>
💠 **FinancialEventTypes** : types of financial events.<br/>
💠 **FinancialTransactionTypes** : types of financial transactions.<br/>
💠 **InvoiceStatusTypes** : types of invoice status.<br/>
💠 **InvoiceTypes** : types of invoices.<br/>
💠 **LedgerActionTypes** : types of ledger actions.<br/>
💠 **OrderCategoryTypes** : types of order categorys.<br/>
💠 **OrderStageTypes** : types of order stages.<br/>
💠 **OrderTypes** : types of orders.<br/>
💠 **PartInvoiceStatusTypes** : types of part invoice status.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PaymentMethodTypes** : types of payment methods.<br/>
💠 **PaymentStatusTypes** : types of payment status.<br/>
💠 **PaymentTransactionStatusTypes** : types of payment transaction status.<br/>
💠 **PaymentTypes** : types of payments.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductPriceItemTypes** : types of product price items.<br/>
💠 **ProductTypes** : types of products.<br/>
💠 **ResourceTypes** : types of resources.<br/>
💠 **TaxTypes** : types of taxs.<br/>
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


### /invoices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices</span> <br/>
        <span class="api-summary">Retrieve a list of all Invoice records. getInvoices</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices</span> <br/>
        <span class="api-summary">Create a new Invoice record. createInvoice</span>
    </span>
</div>

### /invoices/{invoiceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Invoice record. getnvoiceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}</span> <br/>
        <span class="api-summary">Replace a Invoice record. replaceInvoice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}</span> <br/>
        <span class="api-summary">Partially update a Invoice record. updateInvoice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}</span> <br/>
        <span class="api-summary">Delete a Invoice Record deleteInvoiceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-term-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentTermReference records scoped by invoiceKey. getPaymentTermReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references</span> <br/>
        <span class="api-summary">Create a new PaymentTermReference record. createPaymentTermReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-term-references/{paymentTermReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentTermReference record. getaymentTermReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentTermReference record. replacePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentTermReference record. updatePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentTermReference Record deletePaymentTermReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/invoice-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items</span> <br/>
        <span class="api-summary">Retrieve a list of InvoiceItem records scoped by invoiceKey. getInvoiceItemsByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items</span> <br/>
        <span class="api-summary">Create a new InvoiceItem record. createInvoiceItem</span>
    </span>
</div>

### /invoices/{invoiceKey}/invoice-items/{invoiceItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items/{invoiceItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific InvoiceItem record. getnvoiceItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items/{invoiceItemKey}</span> <br/>
        <span class="api-summary">Replace a InvoiceItem record. replaceInvoiceItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items/{invoiceItemKey}</span> <br/>
        <span class="api-summary">Partially update a InvoiceItem record. updateInvoiceItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items/{invoiceItemKey}</span> <br/>
        <span class="api-summary">Delete a InvoiceItem Record deleteInvoiceItemRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/discount-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountReference records scoped by invoiceKey. getDiscountReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references</span> <br/>
        <span class="api-summary">Create a new DiscountReference record. createDiscountReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/discount-references/{discountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountReference record. getiscountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a DiscountReference record. replaceDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountReference record. updateDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a DiscountReference Record deleteDiscountReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot records scoped by invoiceKey. getTimeSlotsByInvoiceKey</span>
    </span>
</div>

### /invoices/{invoiceKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot record. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot record. replaceTimeSlot</span>
    </span>
</div>

### /invoices/{invoiceKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference records scoped by invoiceKey. getAddressReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference record. createAddressReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference record. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference record. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference record. updateAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference Record deleteAddressReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-category-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialCategoryReference records scoped by invoiceKey. getFinancialCategoryReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references</span> <br/>
        <span class="api-summary">Create a new FinancialCategoryReference record. createFinancialCategoryReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-category-references/{financialCategoryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialCategoryReference record. getinancialCategoryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialCategoryReference record. replaceFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialCategoryReference record. updateFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialCategoryReference Record deleteFinancialCategoryReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/fee-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references</span> <br/>
        <span class="api-summary">Retrieve a list of FeeReference records scoped by invoiceKey. getFeeReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references</span> <br/>
        <span class="api-summary">Create a new FeeReference record. createFeeReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/fee-references/{feeReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FeeReference record. geteeReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FeeReference record. replaceFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FeeReference record. updateFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FeeReference Record deleteFeeReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by invoiceKey. getIdentifiersByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /invoices/{invoiceKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/part-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartReference records scoped by invoiceKey. getPartReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references</span> <br/>
        <span class="api-summary">Create a new PartReference record. createPartReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/part-references/{partReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartReference record. getartReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartReference record. replacePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartReference record. updatePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartReference Record deletePartReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by invoiceKey. getEffectivePeriodsByInvoiceKey</span>
    </span>
</div>

### /invoices/{invoiceKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /invoices/{invoiceKey}/credit-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references</span> <br/>
        <span class="api-summary">Retrieve a list of CreditReference records scoped by invoiceKey. getCreditReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references</span> <br/>
        <span class="api-summary">Create a new CreditReference record. createCreditReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/credit-references/{creditReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditReference record. getreditReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Replace a CreditReference record. replaceCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a CreditReference record. updateCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Delete a CreditReference Record deleteCreditReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/rebate-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references</span> <br/>
        <span class="api-summary">Retrieve a list of RebateReference records scoped by invoiceKey. getRebateReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references</span> <br/>
        <span class="api-summary">Create a new RebateReference record. createRebateReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/rebate-references/{rebateReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RebateReference record. getebateReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RebateReference record. replaceRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RebateReference record. updateRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RebateReference Record deleteRebateReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/shipment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentReference records scoped by invoiceKey. getShipmentReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references</span> <br/>
        <span class="api-summary">Create a new ShipmentReference record. createShipmentReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/shipment-references/{shipmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentReference record. gethipmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentReference record. replaceShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentReference record. updateShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentReference Record deleteShipmentReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure records scoped by invoiceKey. getUnitOfMeasuresByInvoiceKey</span>
    </span>
</div>

### /invoices/{invoiceKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure record. getnitOfMeasureById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Replace a UnitOfMeasure record. replaceUnitOfMeasure</span>
    </span>
</div>

### /invoices/{invoiceKey}/tax-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits</span> <br/>
        <span class="api-summary">Retrieve a list of TaxSplit records scoped by invoiceKey. getTaxSplitsByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits</span> <br/>
        <span class="api-summary">Create a new TaxSplit record. createTaxSplit</span>
    </span>
</div>

### /invoices/{invoiceKey}/tax-splits/{taxSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TaxSplit record. getaxSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Replace a TaxSplit record. replaceTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Partially update a TaxSplit record. updateTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Delete a TaxSplit Record deleteTaxSplitRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-schedule-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentScheduleReference records scoped by invoiceKey. getPaymentScheduleReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references</span> <br/>
        <span class="api-summary">Create a new PaymentScheduleReference record. createPaymentScheduleReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentScheduleReference record. getaymentScheduleReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentScheduleReference record. replacePaymentScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentScheduleReference record. updatePaymentScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentScheduleReference Record deletePaymentScheduleReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/price-plan-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references</span> <br/>
        <span class="api-summary">Retrieve a list of PricePlanReference records scoped by invoiceKey. getPricePlanReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references</span> <br/>
        <span class="api-summary">Create a new PricePlanReference record. createPricePlanReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/price-plan-references/{pricePlanReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlanReference record. getricePlanReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PricePlanReference record. replacePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlanReference record. updatePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PricePlanReference Record deletePricePlanReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference records scoped by invoiceKey. getControlAccountReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference record. createControlAccountReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference record. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference record. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference record. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference Record deleteControlAccountReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/reward-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references</span> <br/>
        <span class="api-summary">Retrieve a list of RewardReference records scoped by invoiceKey. getRewardReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references</span> <br/>
        <span class="api-summary">Create a new RewardReference record. createRewardReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/reward-references/{rewardReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RewardReference record. getewardReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RewardReference record. replaceRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RewardReference record. updateRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RewardReference Record deleteRewardReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/party-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/party-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartyIdentifier records scoped by invoiceKey. getPartyIdentifiersByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/party-identifiers</span> <br/>
        <span class="api-summary">Create a new PartyIdentifier record. createPartyIdentifier</span>
    </span>
</div>

### /invoices/{invoiceKey}/party-identifiers/{partyIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyIdentifier record. getartyIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartyIdentifier record. replacePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartyIdentifier record. updatePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartyIdentifier Record deletePartyIdentifierRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price records scoped by invoiceKey. getPricesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price record. createPrice</span>
    </span>
</div>

### /invoices/{invoiceKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price record. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price record. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price record. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price Record deletePriceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialEvent records scoped by invoiceKey. getFinancialEventsByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events</span> <br/>
        <span class="api-summary">Create a new FinancialEvent record. createFinancialEvent</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-events/{financialEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialEvent record. getinancialEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Replace a FinancialEvent record. replaceFinancialEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialEvent record. updateFinancialEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Delete a FinancialEvent Record deleteFinancialEventRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-method-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentMethodReference records scoped by invoiceKey. getPaymentMethodReferencesByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references</span> <br/>
        <span class="api-summary">Create a new PaymentMethodReference record. createPaymentMethodReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-method-references/{paymentMethodReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentMethodReference record. getaymentMethodReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentMethodReference record. replacePaymentMethodReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentMethodReference record. updatePaymentMethodReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentMethodReference Record deletePaymentMethodReferenceRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail records scoped by invoiceKey. getTextualDetailsByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/textual-details</span> <br/>
        <span class="api-summary">Create a new TextualDetail record. createTextualDetail</span>
    </span>
</div>

### /invoices/{invoiceKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail record. getextualDetailById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Replace a TextualDetail record. replaceTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Partially update a TextualDetail record. updateTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Delete a TextualDetail Record deleteTextualDetailRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplit records scoped by invoiceKey. getFinancialSplitsByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits</span> <br/>
        <span class="api-summary">Create a new FinancialSplit record. createFinancialSplit</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-splits/{financialSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplit record. getinancialSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplit record. replaceFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplit record. updateFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplit Record deleteFinancialSplitRecord</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-tracks
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialTrack records scoped by invoiceKey. getFinancialTracksByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks</span> <br/>
        <span class="api-summary">Create a new FinancialTrack record. createFinancialTrack</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-tracks/{financialTrackKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialTrack record. getinancialTrackById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Replace a FinancialTrack record. replaceFinancialTrack</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialTrack record. updateFinancialTrack</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Delete a FinancialTrack Record deleteFinancialTrackRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Invoiceroot with key {InvoiceKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **invoice** | /invoices | listInvoices | createInvoice | getInvoices | updateInvoices | deleteInvoices |
    | **payment-term-reference** | /invoices/{invoiceKey}/payment-term-references | listPaymentTermReferencesByInvoiceKey | createPaymentTermReference | getPaymentTermReferencesByInvoiceKey | updatePaymentTermReferencesByInvoiceKey | deletePaymentTermReferencesByInvoiceKey |
    | **invoice-item** | /invoices/{invoiceKey}/invoice-items | listInvoiceItemsByInvoiceKey | createInvoiceItem | getInvoiceItemsByInvoiceKey | updateInvoiceItemsByInvoiceKey | deleteInvoiceItemsByInvoiceKey |
    | **discount-reference** | /invoices/{invoiceKey}/discount-references | listDiscountReferencesByInvoiceKey | createDiscountReference | getDiscountReferencesByInvoiceKey | updateDiscountReferencesByInvoiceKey | deleteDiscountReferencesByInvoiceKey |
    | **time-slot** | /invoices/{invoiceKey}/time-slots | listTimeSlotsByInvoiceKey |  | getTimeSlotsByInvoiceKey | updateTimeSlotsByInvoiceKey | deleteTimeSlotsByInvoiceKey |
    | **address-reference** | /invoices/{invoiceKey}/address-references | listAddressReferencesByInvoiceKey | createAddressReference | getAddressReferencesByInvoiceKey | updateAddressReferencesByInvoiceKey | deleteAddressReferencesByInvoiceKey |
    | **financial-category-reference** | /invoices/{invoiceKey}/financial-category-references | listFinancialCategoryReferencesByInvoiceKey | createFinancialCategoryReference | getFinancialCategoryReferencesByInvoiceKey | updateFinancialCategoryReferencesByInvoiceKey | deleteFinancialCategoryReferencesByInvoiceKey |
    | **fee-reference** | /invoices/{invoiceKey}/fee-references | listFeeReferencesByInvoiceKey | createFeeReference | getFeeReferencesByInvoiceKey | updateFeeReferencesByInvoiceKey | deleteFeeReferencesByInvoiceKey |
    | **identifier** | /invoices/{invoiceKey}/identifiers | listIdentifiersByInvoiceKey | createIdentifier | getIdentifiersByInvoiceKey | updateIdentifiersByInvoiceKey | deleteIdentifiersByInvoiceKey |
    | **part-reference** | /invoices/{invoiceKey}/part-references | listPartReferencesByInvoiceKey | createPartReference | getPartReferencesByInvoiceKey | updatePartReferencesByInvoiceKey | deletePartReferencesByInvoiceKey |
    | **effective-period** | /invoices/{invoiceKey}/effective-periods | listEffectivePeriodsByInvoiceKey |  | getEffectivePeriodsByInvoiceKey | updateEffectivePeriodsByInvoiceKey | deleteEffectivePeriodsByInvoiceKey |
    | **credit-reference** | /invoices/{invoiceKey}/credit-references | listCreditReferencesByInvoiceKey | createCreditReference | getCreditReferencesByInvoiceKey | updateCreditReferencesByInvoiceKey | deleteCreditReferencesByInvoiceKey |
    | **rebate-reference** | /invoices/{invoiceKey}/rebate-references | listRebateReferencesByInvoiceKey | createRebateReference | getRebateReferencesByInvoiceKey | updateRebateReferencesByInvoiceKey | deleteRebateReferencesByInvoiceKey |
    | **shipment-reference** | /invoices/{invoiceKey}/shipment-references | listShipmentReferencesByInvoiceKey | createShipmentReference | getShipmentReferencesByInvoiceKey | updateShipmentReferencesByInvoiceKey | deleteShipmentReferencesByInvoiceKey |
    | **unit-of-measure** | /invoices/{invoiceKey}/unit-of-measures | listUnitOfMeasuresByInvoiceKey |  | getUnitOfMeasuresByInvoiceKey | updateUnitOfMeasuresByInvoiceKey | deleteUnitOfMeasuresByInvoiceKey |
    | **tax-split** | /invoices/{invoiceKey}/tax-splits | listTaxSplitsByInvoiceKey | createTaxSplit | getTaxSplitsByInvoiceKey | updateTaxSplitsByInvoiceKey | deleteTaxSplitsByInvoiceKey |
    | **payment-schedule-reference** | /invoices/{invoiceKey}/payment-schedule-references | listPaymentScheduleReferencesByInvoiceKey | createPaymentScheduleReference | getPaymentScheduleReferencesByInvoiceKey | updatePaymentScheduleReferencesByInvoiceKey | deletePaymentScheduleReferencesByInvoiceKey |
    | **price-plan-reference** | /invoices/{invoiceKey}/price-plan-references | listPricePlanReferencesByInvoiceKey | createPricePlanReference | getPricePlanReferencesByInvoiceKey | updatePricePlanReferencesByInvoiceKey | deletePricePlanReferencesByInvoiceKey |
    | **control-account-reference** | /invoices/{invoiceKey}/control-account-references | listControlAccountReferencesByInvoiceKey | createControlAccountReference | getControlAccountReferencesByInvoiceKey | updateControlAccountReferencesByInvoiceKey | deleteControlAccountReferencesByInvoiceKey |
    | **reward-reference** | /invoices/{invoiceKey}/reward-references | listRewardReferencesByInvoiceKey | createRewardReference | getRewardReferencesByInvoiceKey | updateRewardReferencesByInvoiceKey | deleteRewardReferencesByInvoiceKey |
    | **party-identifier** | /invoices/{invoiceKey}/party-identifiers | listPartyIdentifiersByInvoiceKey | createPartyIdentifier | getPartyIdentifiersByInvoiceKey | updatePartyIdentifiersByInvoiceKey | deletePartyIdentifiersByInvoiceKey |
    | **price** | /invoices/{invoiceKey}/prices | listPricesByInvoiceKey | createPrice | getPricesByInvoiceKey | updatePricesByInvoiceKey | deletePricesByInvoiceKey |
    | **financial-event** | /invoices/{invoiceKey}/financial-events | listFinancialEventsByInvoiceKey | createFinancialEvent | getFinancialEventsByInvoiceKey | updateFinancialEventsByInvoiceKey | deleteFinancialEventsByInvoiceKey |
    | **payment-method-reference** | /invoices/{invoiceKey}/payment-method-references | listPaymentMethodReferencesByInvoiceKey | createPaymentMethodReference | getPaymentMethodReferencesByInvoiceKey | updatePaymentMethodReferencesByInvoiceKey | deletePaymentMethodReferencesByInvoiceKey |
    | **textual-detail** | /invoices/{invoiceKey}/textual-details | listTextualDetailsByInvoiceKey | createTextualDetail | getTextualDetailsByInvoiceKey | updateTextualDetailsByInvoiceKey | deleteTextualDetailsByInvoiceKey |
    | **financial-split** | /invoices/{invoiceKey}/financial-splits | listFinancialSplitsByInvoiceKey | createFinancialSplit | getFinancialSplitsByInvoiceKey | updateFinancialSplitsByInvoiceKey | deleteFinancialSplitsByInvoiceKey |
    | **financial-track** | /invoices/{invoiceKey}/financial-tracks | listFinancialTracksByInvoiceKey | createFinancialTrack | getFinancialTracksByInvoiceKey | updateFinancialTracksByInvoiceKey | deleteFinancialTracksByInvoiceKey |

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