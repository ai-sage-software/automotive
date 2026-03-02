## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **AddressReference**, **AuthorizationReference**, **ControlAccountReference**, **CreditReference**, **DiscountReference**, **FeeReference**, **FinancialCategoryReference**, **FinancialEvent**, **FinancialSplit**, **FinancialSplitReference**, **FinancialTrack**, **GeographicBoundaryReference**, **Locale**, **Manifest**, **ManifestItem**, **MetricNameValue**, **MetricValue**, **Narrative**, **PartInvoice**, **PartInvoiceItem**, **PartReference**, **PartyReference**, **PaymentAuthorization**, **PaymentMethodReference**, **PaymentScheduleReference**, **PaymentTermReference**, **PricePlanReference**, **QuoteReference**, **RebateReference**, **RepairItemReference**, **RewardReference**, **ShipmentReference**, **TaxSplit**, **VehicleIdentifier**, **VehicleLicense**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **part** and **PartInvoice** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PartInvoice** | /part-invoices | Manages PartInvoices |
    | **Locale** | /part-invoices/{partInvoiceKey}/locales | Manages Locales belonging to PartInvoices |
    | **PaymentTermReference** | /part-invoices/{partInvoiceKey}/payment-term-references | Manages PaymentTermReferences belonging to PartInvoices |
    | **ManifestItem** | /part-invoices/{partInvoiceKey}/manifest-items | Manages ManifestItems belonging to PartInvoices |
    | **DiscountReference** | /part-invoices/{partInvoiceKey}/discount-references | Manages DiscountReferences belonging to PartInvoices |
    | **AuthorizationReference** | /part-invoices/{partInvoiceKey}/authorization-references | Manages AuthorizationReferences belonging to PartInvoices |
    | **AddressReference** | /part-invoices/{partInvoiceKey}/address-references | Manages AddressReferences belonging to PartInvoices |
    | **FinancialCategoryReference** | /part-invoices/{partInvoiceKey}/financial-category-references | Manages FinancialCategoryReferences belonging to PartInvoices |
    | **PartyReference** | /part-invoices/{partInvoiceKey}/party-references | Manages PartyReferences belonging to PartInvoices |
    | **FeeReference** | /part-invoices/{partInvoiceKey}/fee-references | Manages FeeReferences belonging to PartInvoices |
    | **Money** | /part-invoices/{partInvoiceKey}/money | Manages Money belonging to PartInvoices |
    | **MetricValue** | /part-invoices/{partInvoiceKey}/metric-values | Manages MetricValues belonging to PartInvoices |
    | **Identifier** | /part-invoices/{partInvoiceKey}/identifiers | Manages Identifiers belonging to PartInvoices |
    | **PartReference** | /part-invoices/{partInvoiceKey}/part-references | Manages PartReferences belonging to PartInvoices |
    | **Narrative** | /part-invoices/{partInvoiceKey}/narratives | Manages Narratives belonging to PartInvoices |
    | **CreditReference** | /part-invoices/{partInvoiceKey}/credit-references | Manages CreditReferences belonging to PartInvoices |
    | **RebateReference** | /part-invoices/{partInvoiceKey}/rebate-references | Manages RebateReferences belonging to PartInvoices |
    | **ShipmentReference** | /part-invoices/{partInvoiceKey}/shipment-references | Manages ShipmentReferences belonging to PartInvoices |
    | **UnitOfMeasure** | /part-invoices/{partInvoiceKey}/unit-of-measures | Manages UnitOfMeasures belonging to PartInvoices |
    | **VehicleLicense** | /part-invoices/{partInvoiceKey}/vehicle-licenses | Manages VehicleLicenses belonging to PartInvoices |
    | **TaxSplit** | /part-invoices/{partInvoiceKey}/tax-splits | Manages TaxSplits belonging to PartInvoices |
    | **PaymentScheduleReference** | /part-invoices/{partInvoiceKey}/payment-schedule-references | Manages PaymentScheduleReferences belonging to PartInvoices |
    | **PricePlanReference** | /part-invoices/{partInvoiceKey}/price-plan-references | Manages PricePlanReferences belonging to PartInvoices |
    | **RepairItemReference** | /part-invoices/{partInvoiceKey}/repair-item-references | Manages RepairItemReferences belonging to PartInvoices |
    | **ControlAccountReference** | /part-invoices/{partInvoiceKey}/control-account-references | Manages ControlAccountReferences belonging to PartInvoices |
    | **RewardReference** | /part-invoices/{partInvoiceKey}/reward-references | Manages RewardReferences belonging to PartInvoices |
    | **Manifest** | /part-invoices/{partInvoiceKey}/manifests | Manages Manifests belonging to PartInvoices |
    | **QuoteReference** | /part-invoices/{partInvoiceKey}/quote-references | Manages QuoteReferences belonging to PartInvoices |
    | **EventMessage** | /part-invoices/{partInvoiceKey}/event-messages | Manages EventMessages belonging to PartInvoices |
    | **PaymentAuthorization** | /part-invoices/{partInvoiceKey}/payment-authorizations | Manages PaymentAuthorizations belonging to PartInvoices |
    | **Price** | /part-invoices/{partInvoiceKey}/prices | Manages Prices belonging to PartInvoices |
    | **PartInvoiceItem** | /part-invoices/{partInvoiceKey}/part-invoice-items | Manages PartInvoiceItems belonging to PartInvoices |
    | **FinancialEvent** | /part-invoices/{partInvoiceKey}/financial-events | Manages FinancialEvents belonging to PartInvoices |
    | **PaymentMethodReference** | /part-invoices/{partInvoiceKey}/payment-method-references | Manages PaymentMethodReferences belonging to PartInvoices |
    | **TextualDetail** | /part-invoices/{partInvoiceKey}/textual-details | Manages TextualDetails belonging to PartInvoices |
    | **FinancialSplit** | /part-invoices/{partInvoiceKey}/financial-splits | Manages FinancialSplits belonging to PartInvoices |
    | **VehicleIdentifier** | /part-invoices/{partInvoiceKey}/vehicle-identifiers | Manages VehicleIdentifiers belonging to PartInvoices |
    | **FinancialTrack** | /part-invoices/{partInvoiceKey}/financial-tracks | Manages FinancialTracks belonging to PartInvoices |


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
> `https://[Your-API-Host]/partinvoices`

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
💠 **EventMessageTypes** : types of event messages.<br/>
💠 **ExitConsiderationTypes** : types of exit considerations.<br/>
💠 **FinancialEventTypes** : types of financial events.<br/>
💠 **FinancialTransactionTypes** : types of financial transactions.<br/>
💠 **InvoiceStatusTypes** : types of invoice status.<br/>
💠 **InvoiceTypes** : types of invoices.<br/>
💠 **LedgerActionTypes** : types of ledger actions.<br/>
💠 **NarrativeTypes** : types of narratives.<br/>
💠 **NarrativeUomTypes** : types of narrative uoms.<br/>
💠 **OrderCategoryTypes** : types of order categorys.<br/>
💠 **OrderStageTypes** : types of order stages.<br/>
💠 **OrderTypes** : types of orders.<br/>
💠 **PartConditionGradeTypes** : types of part condition grades.<br/>
💠 **PartInvoiceStatusTypes** : types of part invoice status.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PayTypes** : types of pays.<br/>
💠 **PaymentMethodTypes** : types of payment methods.<br/>
💠 **PaymentStatusTypes** : types of payment status.<br/>
💠 **PaymentTransactionStatusTypes** : types of payment transaction status.<br/>
💠 **PaymentTypes** : types of payments.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductPriceItemTypes** : types of product price items.<br/>
💠 **ProductTypes** : types of products.<br/>
💠 **ProgramTypes** : types of programs.<br/>
💠 **ResourceTypes** : types of resources.<br/>
💠 **StaffRoleTypes** : types of staff roles.<br/>
💠 **TaxTypes** : types of taxs.<br/>
💠 **UOMQuantityCategoryTypes** : types of u o m quantity categorys.<br/>
💠 **DurationUOMTypes** : Units of Measure for Durations<br/>

## ✅ Entities

---

✅ **CurrencyExchange** : Details concerning the conversion between different currencies.<br/>
✅ **EffectivePeriod** : The date range during which this record is valid.<br/>
✅ **EventMessage** : A descriptive notification regarding a system or business event.<br/>
✅ **Identifier** : Unique identification key for the record.<br/>
✅ **Money** : Monetary value and currency information.<br/>
✅ **Price** : The cost or valuation amount.<br/>
✅ **TextualDetail** : not nullable<br/>
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


### /part-invoices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices</span> <br/>
        <span class="api-summary">Retrieve a list of PartInvoice entities. getPartInvoice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices</span> <br/>
        <span class="api-summary">Create a new PartInvoice entity. createPartInvoice</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartInvoice entity. getartInvoiceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}</span> <br/>
        <span class="api-summary">Replace a PartInvoice entity. replacePartInvoice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}</span> <br/>
        <span class="api-summary">Partially update a PartInvoice entity. updatePartialPartInvoice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}</span> <br/>
        <span class="api-summary">Delete a PartInvoice entity deletePartInvoiceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/locales
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/locales</span> <br/>
        <span class="api-summary">Retrieve a list of Locale entities scoped by partInvoiceKey. getLocaleByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/locales</span> <br/>
        <span class="api-summary">Create a new Locale entity. createLocale</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/locales/{localeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Locale entity. getocaleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Replace a Locale entity. replaceLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Partially update a Locale entity. updatePartialLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Delete a Locale entity deleteLocaleEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/payment-term-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-term-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentTermReference entities scoped by partInvoiceKey. getPaymentTermReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-term-references</span> <br/>
        <span class="api-summary">Create a new PaymentTermReference entity. createPaymentTermReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/payment-term-references/{paymentTermReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentTermReference entity. getaymentTermReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentTermReference entity. replacePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentTermReference entity. updatePartialPaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentTermReference entity deletePaymentTermReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/manifest-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifest-items</span> <br/>
        <span class="api-summary">Retrieve a list of ManifestItem entities scoped by partInvoiceKey. getManifestItemByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifest-items</span> <br/>
        <span class="api-summary">Create a new ManifestItem entity. createManifestItem</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/manifest-items/{manifestItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ManifestItem entity. getanifestItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Replace a ManifestItem entity. replaceManifestItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Partially update a ManifestItem entity. updatePartialManifestItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Delete a ManifestItem entity deleteManifestItemEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/discount-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/discount-references</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountReference entities scoped by partInvoiceKey. getDiscountReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/discount-references</span> <br/>
        <span class="api-summary">Create a new DiscountReference entity. createDiscountReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/discount-references/{discountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountReference entity. getiscountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a DiscountReference entity. replaceDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountReference entity. updatePartialDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a DiscountReference entity deleteDiscountReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/authorization-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/authorization-references</span> <br/>
        <span class="api-summary">Retrieve a list of AuthorizationReference entities scoped by partInvoiceKey. getAuthorizationReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/authorization-references</span> <br/>
        <span class="api-summary">Create a new AuthorizationReference entity. createAuthorizationReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/authorization-references/{authorizationReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/authorization-references/{authorizationReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AuthorizationReference entity. getuthorizationReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/authorization-references/{authorizationReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AuthorizationReference entity. replaceAuthorizationReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/authorization-references/{authorizationReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AuthorizationReference entity. updatePartialAuthorizationReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/authorization-references/{authorizationReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AuthorizationReference entity deleteAuthorizationReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference entities scoped by partInvoiceKey. getAddressReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference entity. createAddressReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference entity. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference entity. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference entity. updatePartialAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference entity deleteAddressReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/financial-category-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-category-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialCategoryReference entities scoped by partInvoiceKey. getFinancialCategoryReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-category-references</span> <br/>
        <span class="api-summary">Create a new FinancialCategoryReference entity. createFinancialCategoryReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/financial-category-references/{financialCategoryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialCategoryReference entity. getinancialCategoryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialCategoryReference entity. replaceFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialCategoryReference entity. updatePartialFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialCategoryReference entity deleteFinancialCategoryReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/party-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/party-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartyReference entities scoped by partInvoiceKey. getPartyReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/party-references</span> <br/>
        <span class="api-summary">Create a new PartyReference entity. createPartyReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/party-references/{partyReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyReference entity. getartyReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartyReference entity. replacePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartyReference entity. updatePartialPartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartyReference entity deletePartyReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/fee-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/fee-references</span> <br/>
        <span class="api-summary">Retrieve a list of FeeReference entities scoped by partInvoiceKey. getFeeReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/fee-references</span> <br/>
        <span class="api-summary">Create a new FeeReference entity. createFeeReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/fee-references/{feeReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FeeReference entity. geteeReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FeeReference entity. replaceFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FeeReference entity. updatePartialFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FeeReference entity deleteFeeReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/money
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/money</span> <br/>
        <span class="api-summary">Retrieve a list of Money entities scoped by partInvoiceKey. getMoneyByPartInvoiceKey</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/money/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/money/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money entity. getoneyById</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/metric-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/metric-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricValue entities scoped by partInvoiceKey. getMetricValueByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/metric-values</span> <br/>
        <span class="api-summary">Create a new MetricValue entity. createMetricValue</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/metric-values/{metricValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricValue entity. getetricValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricValue entity. replaceMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricValue entity. updatePartialMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricValue entity deleteMetricValueEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by partInvoiceKey. getIdentifierByPartInvoiceKey</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/part-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartReference entities scoped by partInvoiceKey. getPartReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-references</span> <br/>
        <span class="api-summary">Create a new PartReference entity. createPartReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/part-references/{partReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartReference entity. getartReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartReference entity. replacePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartReference entity. updatePartialPartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartReference entity deletePartReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/narratives
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/narratives</span> <br/>
        <span class="api-summary">Retrieve a list of Narrative entities scoped by partInvoiceKey. getNarrativeByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/narratives</span> <br/>
        <span class="api-summary">Create a new Narrative entity. createNarrative</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/narratives/{narrativeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/narratives/{narrativeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Narrative entity. getarrativeById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/narratives/{narrativeKey}</span> <br/>
        <span class="api-summary">Replace a Narrative entity. replaceNarrative</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/narratives/{narrativeKey}</span> <br/>
        <span class="api-summary">Partially update a Narrative entity. updatePartialNarrative</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/narratives/{narrativeKey}</span> <br/>
        <span class="api-summary">Delete a Narrative entity deleteNarrativeEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/credit-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/credit-references</span> <br/>
        <span class="api-summary">Retrieve a list of CreditReference entities scoped by partInvoiceKey. getCreditReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/credit-references</span> <br/>
        <span class="api-summary">Create a new CreditReference entity. createCreditReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/credit-references/{creditReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditReference entity. getreditReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Replace a CreditReference entity. replaceCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a CreditReference entity. updatePartialCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Delete a CreditReference entity deleteCreditReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/rebate-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/rebate-references</span> <br/>
        <span class="api-summary">Retrieve a list of RebateReference entities scoped by partInvoiceKey. getRebateReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/rebate-references</span> <br/>
        <span class="api-summary">Create a new RebateReference entity. createRebateReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/rebate-references/{rebateReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RebateReference entity. getebateReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RebateReference entity. replaceRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RebateReference entity. updatePartialRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RebateReference entity deleteRebateReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/shipment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/shipment-references</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentReference entities scoped by partInvoiceKey. getShipmentReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/shipment-references</span> <br/>
        <span class="api-summary">Create a new ShipmentReference entity. createShipmentReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/shipment-references/{shipmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentReference entity. gethipmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentReference entity. replaceShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentReference entity. updatePartialShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentReference entity deleteShipmentReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure entities scoped by partInvoiceKey. getUnitOfMeasureByPartInvoiceKey</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure entity. getnitOfMeasureById</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/vehicle-licenses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-licenses</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleLicense entities scoped by partInvoiceKey. getVehicleLicenseByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-licenses</span> <br/>
        <span class="api-summary">Create a new VehicleLicense entity. createVehicleLicense</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/vehicle-licenses/{vehicleLicenseKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleLicense entity. getehicleLicenseById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Replace a VehicleLicense entity. replaceVehicleLicense</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleLicense entity. updatePartialVehicleLicense</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Delete a VehicleLicense entity deleteVehicleLicenseEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/tax-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/tax-splits</span> <br/>
        <span class="api-summary">Retrieve a list of TaxSplit entities scoped by partInvoiceKey. getTaxSplitByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/tax-splits</span> <br/>
        <span class="api-summary">Create a new TaxSplit entity. createTaxSplit</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/tax-splits/{taxSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TaxSplit entity. getaxSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Replace a TaxSplit entity. replaceTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Partially update a TaxSplit entity. updatePartialTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Delete a TaxSplit entity deleteTaxSplitEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/payment-schedule-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-schedule-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentScheduleReference entities scoped by partInvoiceKey. getPaymentScheduleReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-schedule-references</span> <br/>
        <span class="api-summary">Create a new PaymentScheduleReference entity. createPaymentScheduleReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentScheduleReference entity. getaymentScheduleReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentScheduleReference entity. replacePaymentScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentScheduleReference entity. updatePartialPaymentScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentScheduleReference entity deletePaymentScheduleReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/price-plan-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/price-plan-references</span> <br/>
        <span class="api-summary">Retrieve a list of PricePlanReference entities scoped by partInvoiceKey. getPricePlanReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/price-plan-references</span> <br/>
        <span class="api-summary">Create a new PricePlanReference entity. createPricePlanReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/price-plan-references/{pricePlanReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlanReference entity. getricePlanReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PricePlanReference entity. replacePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlanReference entity. updatePartialPricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PricePlanReference entity deletePricePlanReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/repair-item-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/repair-item-references</span> <br/>
        <span class="api-summary">Retrieve a list of RepairItemReference entities scoped by partInvoiceKey. getRepairItemReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/repair-item-references</span> <br/>
        <span class="api-summary">Create a new RepairItemReference entity. createRepairItemReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/repair-item-references/{repairItemReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/repair-item-references/{repairItemReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RepairItemReference entity. getepairItemReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/repair-item-references/{repairItemReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RepairItemReference entity. replaceRepairItemReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/repair-item-references/{repairItemReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RepairItemReference entity. updatePartialRepairItemReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/repair-item-references/{repairItemReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RepairItemReference entity deleteRepairItemReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference entities scoped by partInvoiceKey. getControlAccountReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference entity. createControlAccountReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference entity. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference entity. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference entity. updatePartialControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference entity deleteControlAccountReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/reward-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/reward-references</span> <br/>
        <span class="api-summary">Retrieve a list of RewardReference entities scoped by partInvoiceKey. getRewardReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/reward-references</span> <br/>
        <span class="api-summary">Create a new RewardReference entity. createRewardReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/reward-references/{rewardReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RewardReference entity. getewardReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RewardReference entity. replaceRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RewardReference entity. updatePartialRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RewardReference entity deleteRewardReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/manifests
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifests</span> <br/>
        <span class="api-summary">Retrieve a list of Manifest entities scoped by partInvoiceKey. getManifestByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifests</span> <br/>
        <span class="api-summary">Create a new Manifest entity. createManifest</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/manifests/{manifestKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifests/{manifestKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Manifest entity. getanifestById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifests/{manifestKey}</span> <br/>
        <span class="api-summary">Replace a Manifest entity. replaceManifest</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifests/{manifestKey}</span> <br/>
        <span class="api-summary">Partially update a Manifest entity. updatePartialManifest</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/manifests/{manifestKey}</span> <br/>
        <span class="api-summary">Delete a Manifest entity deleteManifestEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/quote-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/quote-references</span> <br/>
        <span class="api-summary">Retrieve a list of QuoteReference entities scoped by partInvoiceKey. getQuoteReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/quote-references</span> <br/>
        <span class="api-summary">Create a new QuoteReference entity. createQuoteReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/quote-references/{quoteReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/quote-references/{quoteReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific QuoteReference entity. getuoteReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/quote-references/{quoteReferenceKey}</span> <br/>
        <span class="api-summary">Replace a QuoteReference entity. replaceQuoteReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/quote-references/{quoteReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a QuoteReference entity. updatePartialQuoteReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/quote-references/{quoteReferenceKey}</span> <br/>
        <span class="api-summary">Delete a QuoteReference entity deleteQuoteReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/event-messages
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/event-messages</span> <br/>
        <span class="api-summary">Retrieve a list of EventMessage entities scoped by partInvoiceKey. getEventMessageByPartInvoiceKey</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/event-messages/{eventMessageKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/event-messages/{eventMessageKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EventMessage entity. getventMessageById</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/payment-authorizations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-authorizations</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentAuthorization entities scoped by partInvoiceKey. getPaymentAuthorizationByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-authorizations</span> <br/>
        <span class="api-summary">Create a new PaymentAuthorization entity. createPaymentAuthorization</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/payment-authorizations/{paymentAuthorizationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-authorizations/{paymentAuthorizationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentAuthorization entity. getaymentAuthorizationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-authorizations/{paymentAuthorizationKey}</span> <br/>
        <span class="api-summary">Replace a PaymentAuthorization entity. replacePaymentAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-authorizations/{paymentAuthorizationKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentAuthorization entity. updatePartialPaymentAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-authorizations/{paymentAuthorizationKey}</span> <br/>
        <span class="api-summary">Delete a PaymentAuthorization entity deletePaymentAuthorizationEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by partInvoiceKey. getPriceByPartInvoiceKey</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/part-invoice-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-invoice-items</span> <br/>
        <span class="api-summary">Retrieve a list of PartInvoiceItem entities scoped by partInvoiceKey. getPartInvoiceItemByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-invoice-items</span> <br/>
        <span class="api-summary">Create a new PartInvoiceItem entity. createPartInvoiceItem</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/part-invoice-items/{partInvoiceItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-invoice-items/{partInvoiceItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartInvoiceItem entity. getartInvoiceItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-invoice-items/{partInvoiceItemKey}</span> <br/>
        <span class="api-summary">Replace a PartInvoiceItem entity. replacePartInvoiceItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-invoice-items/{partInvoiceItemKey}</span> <br/>
        <span class="api-summary">Partially update a PartInvoiceItem entity. updatePartialPartInvoiceItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/part-invoice-items/{partInvoiceItemKey}</span> <br/>
        <span class="api-summary">Delete a PartInvoiceItem entity deletePartInvoiceItemEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/financial-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-events</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialEvent entities scoped by partInvoiceKey. getFinancialEventByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-events</span> <br/>
        <span class="api-summary">Create a new FinancialEvent entity. createFinancialEvent</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/financial-events/{financialEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialEvent entity. getinancialEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Replace a FinancialEvent entity. replaceFinancialEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialEvent entity. updatePartialFinancialEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Delete a FinancialEvent entity deleteFinancialEventEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/payment-method-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-method-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentMethodReference entities scoped by partInvoiceKey. getPaymentMethodReferenceByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-method-references</span> <br/>
        <span class="api-summary">Create a new PaymentMethodReference entity. createPaymentMethodReference</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/payment-method-references/{paymentMethodReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentMethodReference entity. getaymentMethodReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentMethodReference entity. replacePaymentMethodReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentMethodReference entity. updatePartialPaymentMethodReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentMethodReference entity deletePaymentMethodReferenceEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail entities scoped by partInvoiceKey. getTextualDetailByPartInvoiceKey</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail entity. getextualDetailById</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/financial-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-splits</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplit entities scoped by partInvoiceKey. getFinancialSplitByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-splits</span> <br/>
        <span class="api-summary">Create a new FinancialSplit entity. createFinancialSplit</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/financial-splits/{financialSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplit entity. getinancialSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplit entity. replaceFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplit entity. updatePartialFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplit entity deleteFinancialSplitEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/vehicle-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleIdentifier entities scoped by partInvoiceKey. getVehicleIdentifierByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Create a new VehicleIdentifier entity. createVehicleIdentifier</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/vehicle-identifiers/{vehicleIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleIdentifier entity. getehicleIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a VehicleIdentifier entity. replaceVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleIdentifier entity. updatePartialVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a VehicleIdentifier entity deleteVehicleIdentifierEntity</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/financial-tracks
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-tracks</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialTrack entities scoped by partInvoiceKey. getFinancialTrackByPartInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-tracks</span> <br/>
        <span class="api-summary">Create a new FinancialTrack entity. createFinancialTrack</span>
    </span>
</div>

### /part-invoices/{partInvoiceKey}/financial-tracks/{financialTrackKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialTrack entity. getinancialTrackById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Replace a FinancialTrack entity. replaceFinancialTrack</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialTrack entity. updatePartialFinancialTrack</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-invoices/{partInvoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Delete a FinancialTrack entity deleteFinancialTrackEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PartInvoiceroot with key {PartInvoiceKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **part-invoice** | /part-invoices | listPartInvoice | createPartInvoice | getPartInvoice | updatePartInvoice | deletePartInvoice |
    | **locale** | /part-invoices/{partInvoiceKey}/locales | listLocaleByPartInvoiceKey | createLocale | getLocaleByPartInvoiceKey | updateLocaleByPartInvoiceKey | deleteLocaleByPartInvoiceKey |
    | **payment-term-reference** | /part-invoices/{partInvoiceKey}/payment-term-references | listPaymentTermReferenceByPartInvoiceKey | createPaymentTermReference | getPaymentTermReferenceByPartInvoiceKey | updatePaymentTermReferenceByPartInvoiceKey | deletePaymentTermReferenceByPartInvoiceKey |
    | **manifest-item** | /part-invoices/{partInvoiceKey}/manifest-items | listManifestItemByPartInvoiceKey | createManifestItem | getManifestItemByPartInvoiceKey | updateManifestItemByPartInvoiceKey | deleteManifestItemByPartInvoiceKey |
    | **discount-reference** | /part-invoices/{partInvoiceKey}/discount-references | listDiscountReferenceByPartInvoiceKey | createDiscountReference | getDiscountReferenceByPartInvoiceKey | updateDiscountReferenceByPartInvoiceKey | deleteDiscountReferenceByPartInvoiceKey |
    | **authorization-reference** | /part-invoices/{partInvoiceKey}/authorization-references | listAuthorizationReferenceByPartInvoiceKey | createAuthorizationReference | getAuthorizationReferenceByPartInvoiceKey | updateAuthorizationReferenceByPartInvoiceKey | deleteAuthorizationReferenceByPartInvoiceKey |
    | **address-reference** | /part-invoices/{partInvoiceKey}/address-references | listAddressReferenceByPartInvoiceKey | createAddressReference | getAddressReferenceByPartInvoiceKey | updateAddressReferenceByPartInvoiceKey | deleteAddressReferenceByPartInvoiceKey |
    | **financial-category-reference** | /part-invoices/{partInvoiceKey}/financial-category-references | listFinancialCategoryReferenceByPartInvoiceKey | createFinancialCategoryReference | getFinancialCategoryReferenceByPartInvoiceKey | updateFinancialCategoryReferenceByPartInvoiceKey | deleteFinancialCategoryReferenceByPartInvoiceKey |
    | **party-reference** | /part-invoices/{partInvoiceKey}/party-references | listPartyReferenceByPartInvoiceKey | createPartyReference | getPartyReferenceByPartInvoiceKey | updatePartyReferenceByPartInvoiceKey | deletePartyReferenceByPartInvoiceKey |
    | **fee-reference** | /part-invoices/{partInvoiceKey}/fee-references | listFeeReferenceByPartInvoiceKey | createFeeReference | getFeeReferenceByPartInvoiceKey | updateFeeReferenceByPartInvoiceKey | deleteFeeReferenceByPartInvoiceKey |
    | **money** | /part-invoices/{partInvoiceKey}/money | listMoneyByPartInvoiceKey |  | getMoneyByPartInvoiceKey | updateMoneyByPartInvoiceKey | deleteMoneyByPartInvoiceKey |
    | **metric-value** | /part-invoices/{partInvoiceKey}/metric-values | listMetricValueByPartInvoiceKey | createMetricValue | getMetricValueByPartInvoiceKey | updateMetricValueByPartInvoiceKey | deleteMetricValueByPartInvoiceKey |
    | **identifier** | /part-invoices/{partInvoiceKey}/identifiers | listIdentifierByPartInvoiceKey |  | getIdentifierByPartInvoiceKey | updateIdentifierByPartInvoiceKey | deleteIdentifierByPartInvoiceKey |
    | **part-reference** | /part-invoices/{partInvoiceKey}/part-references | listPartReferenceByPartInvoiceKey | createPartReference | getPartReferenceByPartInvoiceKey | updatePartReferenceByPartInvoiceKey | deletePartReferenceByPartInvoiceKey |
    | **narrative** | /part-invoices/{partInvoiceKey}/narratives | listNarrativeByPartInvoiceKey | createNarrative | getNarrativeByPartInvoiceKey | updateNarrativeByPartInvoiceKey | deleteNarrativeByPartInvoiceKey |
    | **credit-reference** | /part-invoices/{partInvoiceKey}/credit-references | listCreditReferenceByPartInvoiceKey | createCreditReference | getCreditReferenceByPartInvoiceKey | updateCreditReferenceByPartInvoiceKey | deleteCreditReferenceByPartInvoiceKey |
    | **rebate-reference** | /part-invoices/{partInvoiceKey}/rebate-references | listRebateReferenceByPartInvoiceKey | createRebateReference | getRebateReferenceByPartInvoiceKey | updateRebateReferenceByPartInvoiceKey | deleteRebateReferenceByPartInvoiceKey |
    | **shipment-reference** | /part-invoices/{partInvoiceKey}/shipment-references | listShipmentReferenceByPartInvoiceKey | createShipmentReference | getShipmentReferenceByPartInvoiceKey | updateShipmentReferenceByPartInvoiceKey | deleteShipmentReferenceByPartInvoiceKey |
    | **unit-of-measure** | /part-invoices/{partInvoiceKey}/unit-of-measures | listUnitOfMeasureByPartInvoiceKey |  | getUnitOfMeasureByPartInvoiceKey | updateUnitOfMeasureByPartInvoiceKey | deleteUnitOfMeasureByPartInvoiceKey |
    | **vehicle-license** | /part-invoices/{partInvoiceKey}/vehicle-licenses | listVehicleLicenseByPartInvoiceKey | createVehicleLicense | getVehicleLicenseByPartInvoiceKey | updateVehicleLicenseByPartInvoiceKey | deleteVehicleLicenseByPartInvoiceKey |
    | **tax-split** | /part-invoices/{partInvoiceKey}/tax-splits | listTaxSplitByPartInvoiceKey | createTaxSplit | getTaxSplitByPartInvoiceKey | updateTaxSplitByPartInvoiceKey | deleteTaxSplitByPartInvoiceKey |
    | **payment-schedule-reference** | /part-invoices/{partInvoiceKey}/payment-schedule-references | listPaymentScheduleReferenceByPartInvoiceKey | createPaymentScheduleReference | getPaymentScheduleReferenceByPartInvoiceKey | updatePaymentScheduleReferenceByPartInvoiceKey | deletePaymentScheduleReferenceByPartInvoiceKey |
    | **price-plan-reference** | /part-invoices/{partInvoiceKey}/price-plan-references | listPricePlanReferenceByPartInvoiceKey | createPricePlanReference | getPricePlanReferenceByPartInvoiceKey | updatePricePlanReferenceByPartInvoiceKey | deletePricePlanReferenceByPartInvoiceKey |
    | **repair-item-reference** | /part-invoices/{partInvoiceKey}/repair-item-references | listRepairItemReferenceByPartInvoiceKey | createRepairItemReference | getRepairItemReferenceByPartInvoiceKey | updateRepairItemReferenceByPartInvoiceKey | deleteRepairItemReferenceByPartInvoiceKey |
    | **control-account-reference** | /part-invoices/{partInvoiceKey}/control-account-references | listControlAccountReferenceByPartInvoiceKey | createControlAccountReference | getControlAccountReferenceByPartInvoiceKey | updateControlAccountReferenceByPartInvoiceKey | deleteControlAccountReferenceByPartInvoiceKey |
    | **reward-reference** | /part-invoices/{partInvoiceKey}/reward-references | listRewardReferenceByPartInvoiceKey | createRewardReference | getRewardReferenceByPartInvoiceKey | updateRewardReferenceByPartInvoiceKey | deleteRewardReferenceByPartInvoiceKey |
    | **manifest** | /part-invoices/{partInvoiceKey}/manifests | listManifestByPartInvoiceKey | createManifest | getManifestByPartInvoiceKey | updateManifestByPartInvoiceKey | deleteManifestByPartInvoiceKey |
    | **quote-reference** | /part-invoices/{partInvoiceKey}/quote-references | listQuoteReferenceByPartInvoiceKey | createQuoteReference | getQuoteReferenceByPartInvoiceKey | updateQuoteReferenceByPartInvoiceKey | deleteQuoteReferenceByPartInvoiceKey |
    | **event-message** | /part-invoices/{partInvoiceKey}/event-messages | listEventMessageByPartInvoiceKey |  | getEventMessageByPartInvoiceKey | updateEventMessageByPartInvoiceKey | deleteEventMessageByPartInvoiceKey |
    | **payment-authorization** | /part-invoices/{partInvoiceKey}/payment-authorizations | listPaymentAuthorizationByPartInvoiceKey | createPaymentAuthorization | getPaymentAuthorizationByPartInvoiceKey | updatePaymentAuthorizationByPartInvoiceKey | deletePaymentAuthorizationByPartInvoiceKey |
    | **price** | /part-invoices/{partInvoiceKey}/prices | listPriceByPartInvoiceKey |  | getPriceByPartInvoiceKey | updatePriceByPartInvoiceKey | deletePriceByPartInvoiceKey |
    | **part-invoice-item** | /part-invoices/{partInvoiceKey}/part-invoice-items | listPartInvoiceItemByPartInvoiceKey | createPartInvoiceItem | getPartInvoiceItemByPartInvoiceKey | updatePartInvoiceItemByPartInvoiceKey | deletePartInvoiceItemByPartInvoiceKey |
    | **financial-event** | /part-invoices/{partInvoiceKey}/financial-events | listFinancialEventByPartInvoiceKey | createFinancialEvent | getFinancialEventByPartInvoiceKey | updateFinancialEventByPartInvoiceKey | deleteFinancialEventByPartInvoiceKey |
    | **payment-method-reference** | /part-invoices/{partInvoiceKey}/payment-method-references | listPaymentMethodReferenceByPartInvoiceKey | createPaymentMethodReference | getPaymentMethodReferenceByPartInvoiceKey | updatePaymentMethodReferenceByPartInvoiceKey | deletePaymentMethodReferenceByPartInvoiceKey |
    | **textual-detail** | /part-invoices/{partInvoiceKey}/textual-details | listTextualDetailByPartInvoiceKey |  | getTextualDetailByPartInvoiceKey | updateTextualDetailByPartInvoiceKey | deleteTextualDetailByPartInvoiceKey |
    | **financial-split** | /part-invoices/{partInvoiceKey}/financial-splits | listFinancialSplitByPartInvoiceKey | createFinancialSplit | getFinancialSplitByPartInvoiceKey | updateFinancialSplitByPartInvoiceKey | deleteFinancialSplitByPartInvoiceKey |
    | **vehicle-identifier** | /part-invoices/{partInvoiceKey}/vehicle-identifiers | listVehicleIdentifierByPartInvoiceKey | createVehicleIdentifier | getVehicleIdentifierByPartInvoiceKey | updateVehicleIdentifierByPartInvoiceKey | deleteVehicleIdentifierByPartInvoiceKey |
    | **financial-track** | /part-invoices/{partInvoiceKey}/financial-tracks | listFinancialTrackByPartInvoiceKey | createFinancialTrack | getFinancialTrackByPartInvoiceKey | updateFinancialTrackByPartInvoiceKey | deleteFinancialTrackByPartInvoiceKey |

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

## Bulk Create PartInvoice (`POST /partinvoices/batch`)

The `/partinvoices/batch` endpoint allows you to create multiple PartInvoice entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of PartInvoice and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `PartInvoiceCreate` schema.

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

Contains the full objects of the PartInvoice that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A PartInvoice with SKU W-002 already exists."
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

## Health Check (`GET /partinvoices/health`)

The `/partinvoices/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the PartInvoice aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## PartInvoice Commands and State Management

The partinvoices API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /partinvoices/{PartInvoiceKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a PartInvoice (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /partinvoices/{PartInvoiceKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /partinvoices/capabilities`)

Before sending a command, you can "discover" what actions are valid for a PartInvoice based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the PartInvoice must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelPartInvoice` | `CREATED`, `ACTIVE` | `DELETED` | Voids the PartInvoice . |
| `ActivatePartInvoice` | `PENDING` | `ACTIVE` | Moves a PartInvoice into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |
