## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **AddressReference**, **ControlAccountReference**, **CreditReference**, **DiscountReference**, **FeeReference**, **FinancialCategoryReference**, **FinancialEvent**, **FinancialSplit**, **FinancialTrack**, **Identifier**, **Invoice**, **InvoiceItem**, **PartReference**, **PaymentAuthorization**, **PaymentMethodReference**, **PaymentScheduleReference**, **PaymentTermReference**, **Price**, **PricePlanReference**, **RebateReference**, **RewardReference**, **ShipmentReference**, **TaxSplit**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **finance** and **Invoice** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Invoice** | /invoices | Manages Invoices |
    | **PaymentTermReference** | /invoices/{invoiceKey}/payment-term-references | Manages PaymentTermReferences belonging to Invoices |
    | **InvoiceItem** | /invoices/{invoiceKey}/invoice-items | Manages InvoiceItems belonging to Invoices |
    | **DiscountReference** | /invoices/{invoiceKey}/discount-references | Manages DiscountReferences belonging to Invoices |
    | **AddressReference** | /invoices/{invoiceKey}/address-references | Manages AddressReferences belonging to Invoices |
    | **FinancialCategoryReference** | /invoices/{invoiceKey}/financial-category-references | Manages FinancialCategoryReferences belonging to Invoices |
    | **FeeReference** | /invoices/{invoiceKey}/fee-references | Manages FeeReferences belonging to Invoices |
    | **Money** | /invoices/{invoiceKey}/money | Manages Money belonging to Invoices |
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
    | **PaymentAuthorization** | /invoices/{invoiceKey}/payment-authorizations | Manages PaymentAuthorizations belonging to Invoices |
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
> `https://[Your-API-Host]/invoices`

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
💠 **PartConditionGradeTypes** : types of part condition grades.<br/>
💠 **PartInvoiceStatusTypes** : types of part invoice status.<br/>
💠 **PaymentMethodTypes** : types of payment methods.<br/>
💠 **PaymentStatusTypes** : types of payment status.<br/>
💠 **PaymentTransactionStatusTypes** : types of payment transaction status.<br/>
💠 **PaymentTypes** : types of payments.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductPriceItemTypes** : types of product price items.<br/>
💠 **ProductTypes** : types of products.<br/>
💠 **ResourceTypes** : types of resources.<br/>
💠 **TaxTypes** : types of taxs.<br/>
💠 **UOMQuantityCategoryTypes** : types of u o m quantity categorys.<br/>
💠 **DaysOfWeekTypes** : Undocumented Enum<br/>
💠 **TimeslotDirectiveTypes** : Undocumented Enum<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : effective.period.desc<br/>
✅ **Money** : money.desc<br/>
✅ **TextualDetail** : not nullable<br/>
✅ **TimeSlot** : time.slot.desc<br/>
✅ **UnitOfMeasure** : unit.of.measure.desc<br/>

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
        <span class="api-summary">Retrieve a list of Invoice entities. getInvoice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices</span> <br/>
        <span class="api-summary">Create a new Invoice entity. createInvoice</span>
    </span>
</div>

### /invoices/{invoiceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Invoice entity. getnvoiceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}</span> <br/>
        <span class="api-summary">Replace a Invoice entity. replaceInvoice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}</span> <br/>
        <span class="api-summary">Partially update a Invoice entity. updateInvoice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}</span> <br/>
        <span class="api-summary">Delete a Invoice entity deleteInvoiceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-term-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentTermReference entities scoped by invoiceKey. getPaymentTermReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references</span> <br/>
        <span class="api-summary">Create a new PaymentTermReference entity. createPaymentTermReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-term-references/{paymentTermReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentTermReference entity. getaymentTermReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentTermReference entity. replacePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentTermReference entity. updatePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentTermReference entity deletePaymentTermReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/invoice-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items</span> <br/>
        <span class="api-summary">Retrieve a list of InvoiceItem entities scoped by invoiceKey. getInvoiceItemByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items</span> <br/>
        <span class="api-summary">Create a new InvoiceItem entity. createInvoiceItem</span>
    </span>
</div>

### /invoices/{invoiceKey}/invoice-items/{invoiceItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items/{invoiceItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific InvoiceItem entity. getnvoiceItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items/{invoiceItemKey}</span> <br/>
        <span class="api-summary">Replace a InvoiceItem entity. replaceInvoiceItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items/{invoiceItemKey}</span> <br/>
        <span class="api-summary">Partially update a InvoiceItem entity. updateInvoiceItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/invoice-items/{invoiceItemKey}</span> <br/>
        <span class="api-summary">Delete a InvoiceItem entity deleteInvoiceItemEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/discount-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountReference entities scoped by invoiceKey. getDiscountReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references</span> <br/>
        <span class="api-summary">Create a new DiscountReference entity. createDiscountReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/discount-references/{discountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountReference entity. getiscountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a DiscountReference entity. replaceDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountReference entity. updateDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a DiscountReference entity deleteDiscountReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference entities scoped by invoiceKey. getAddressReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference entity. createAddressReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference entity. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference entity. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference entity. updateAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference entity deleteAddressReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-category-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialCategoryReference entities scoped by invoiceKey. getFinancialCategoryReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references</span> <br/>
        <span class="api-summary">Create a new FinancialCategoryReference entity. createFinancialCategoryReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-category-references/{financialCategoryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialCategoryReference entity. getinancialCategoryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialCategoryReference entity. replaceFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialCategoryReference entity. updateFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialCategoryReference entity deleteFinancialCategoryReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/fee-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references</span> <br/>
        <span class="api-summary">Retrieve a list of FeeReference entities scoped by invoiceKey. getFeeReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references</span> <br/>
        <span class="api-summary">Create a new FeeReference entity. createFeeReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/fee-references/{feeReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FeeReference entity. geteeReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FeeReference entity. replaceFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FeeReference entity. updateFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FeeReference entity deleteFeeReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/money
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/money</span> <br/>
        <span class="api-summary">Retrieve a list of Money entities scoped by invoiceKey. getMoneyByInvoiceKey</span>
    </span>
</div>

### /invoices/{invoiceKey}/money/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/money/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money entity. getoneyById</span>
    </span>
</div>

### /invoices/{invoiceKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by invoiceKey. getIdentifierByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /invoices/{invoiceKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/part-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartReference entities scoped by invoiceKey. getPartReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references</span> <br/>
        <span class="api-summary">Create a new PartReference entity. createPartReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/part-references/{partReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartReference entity. getartReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartReference entity. replacePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartReference entity. updatePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartReference entity deletePartReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by invoiceKey. getEffectivePeriodByInvoiceKey</span>
    </span>
</div>

### /invoices/{invoiceKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /invoices/{invoiceKey}/credit-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references</span> <br/>
        <span class="api-summary">Retrieve a list of CreditReference entities scoped by invoiceKey. getCreditReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references</span> <br/>
        <span class="api-summary">Create a new CreditReference entity. createCreditReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/credit-references/{creditReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditReference entity. getreditReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Replace a CreditReference entity. replaceCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a CreditReference entity. updateCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Delete a CreditReference entity deleteCreditReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/rebate-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references</span> <br/>
        <span class="api-summary">Retrieve a list of RebateReference entities scoped by invoiceKey. getRebateReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references</span> <br/>
        <span class="api-summary">Create a new RebateReference entity. createRebateReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/rebate-references/{rebateReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RebateReference entity. getebateReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RebateReference entity. replaceRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RebateReference entity. updateRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RebateReference entity deleteRebateReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/shipment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentReference entities scoped by invoiceKey. getShipmentReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references</span> <br/>
        <span class="api-summary">Create a new ShipmentReference entity. createShipmentReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/shipment-references/{shipmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentReference entity. gethipmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentReference entity. replaceShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentReference entity. updateShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentReference entity deleteShipmentReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure entities scoped by invoiceKey. getUnitOfMeasureByInvoiceKey</span>
    </span>
</div>

### /invoices/{invoiceKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure entity. getnitOfMeasureById</span>
    </span>
</div>

### /invoices/{invoiceKey}/tax-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits</span> <br/>
        <span class="api-summary">Retrieve a list of TaxSplit entities scoped by invoiceKey. getTaxSplitByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits</span> <br/>
        <span class="api-summary">Create a new TaxSplit entity. createTaxSplit</span>
    </span>
</div>

### /invoices/{invoiceKey}/tax-splits/{taxSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TaxSplit entity. getaxSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Replace a TaxSplit entity. replaceTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Partially update a TaxSplit entity. updateTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Delete a TaxSplit entity deleteTaxSplitEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-schedule-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentScheduleReference entities scoped by invoiceKey. getPaymentScheduleReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references</span> <br/>
        <span class="api-summary">Create a new PaymentScheduleReference entity. createPaymentScheduleReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentScheduleReference entity. getaymentScheduleReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentScheduleReference entity. replacePaymentScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentScheduleReference entity. updatePaymentScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentScheduleReference entity deletePaymentScheduleReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/price-plan-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references</span> <br/>
        <span class="api-summary">Retrieve a list of PricePlanReference entities scoped by invoiceKey. getPricePlanReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references</span> <br/>
        <span class="api-summary">Create a new PricePlanReference entity. createPricePlanReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/price-plan-references/{pricePlanReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlanReference entity. getricePlanReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PricePlanReference entity. replacePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlanReference entity. updatePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PricePlanReference entity deletePricePlanReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference entities scoped by invoiceKey. getControlAccountReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference entity. createControlAccountReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference entity. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference entity. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference entity. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference entity deleteControlAccountReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/reward-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references</span> <br/>
        <span class="api-summary">Retrieve a list of RewardReference entities scoped by invoiceKey. getRewardReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references</span> <br/>
        <span class="api-summary">Create a new RewardReference entity. createRewardReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/reward-references/{rewardReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RewardReference entity. getewardReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RewardReference entity. replaceRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RewardReference entity. updateRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RewardReference entity deleteRewardReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-authorizations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-authorizations</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentAuthorization entities scoped by invoiceKey. getPaymentAuthorizationByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-authorizations</span> <br/>
        <span class="api-summary">Create a new PaymentAuthorization entity. createPaymentAuthorization</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-authorizations/{paymentAuthorizationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-authorizations/{paymentAuthorizationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentAuthorization entity. getaymentAuthorizationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-authorizations/{paymentAuthorizationKey}</span> <br/>
        <span class="api-summary">Replace a PaymentAuthorization entity. replacePaymentAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-authorizations/{paymentAuthorizationKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentAuthorization entity. updatePaymentAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-authorizations/{paymentAuthorizationKey}</span> <br/>
        <span class="api-summary">Delete a PaymentAuthorization entity deletePaymentAuthorizationEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by invoiceKey. getPriceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price entity. createPrice</span>
    </span>
</div>

### /invoices/{invoiceKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price entity. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price entity. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price entity deletePriceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialEvent entities scoped by invoiceKey. getFinancialEventByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events</span> <br/>
        <span class="api-summary">Create a new FinancialEvent entity. createFinancialEvent</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-events/{financialEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialEvent entity. getinancialEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Replace a FinancialEvent entity. replaceFinancialEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialEvent entity. updateFinancialEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Delete a FinancialEvent entity deleteFinancialEventEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-method-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentMethodReference entities scoped by invoiceKey. getPaymentMethodReferenceByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references</span> <br/>
        <span class="api-summary">Create a new PaymentMethodReference entity. createPaymentMethodReference</span>
    </span>
</div>

### /invoices/{invoiceKey}/payment-method-references/{paymentMethodReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentMethodReference entity. getaymentMethodReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentMethodReference entity. replacePaymentMethodReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentMethodReference entity. updatePaymentMethodReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/payment-method-references/{paymentMethodReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentMethodReference entity deletePaymentMethodReferenceEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail entities scoped by invoiceKey. getTextualDetailByInvoiceKey</span>
    </span>
</div>

### /invoices/{invoiceKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail entity. getextualDetailById</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplit entities scoped by invoiceKey. getFinancialSplitByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits</span> <br/>
        <span class="api-summary">Create a new FinancialSplit entity. createFinancialSplit</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-splits/{financialSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplit entity. getinancialSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplit entity. replaceFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplit entity. updateFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplit entity deleteFinancialSplitEntity</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-tracks
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialTrack entities scoped by invoiceKey. getFinancialTrackByInvoiceKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks</span> <br/>
        <span class="api-summary">Create a new FinancialTrack entity. createFinancialTrack</span>
    </span>
</div>

### /invoices/{invoiceKey}/financial-tracks/{financialTrackKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialTrack entity. getinancialTrackById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Replace a FinancialTrack entity. replaceFinancialTrack</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialTrack entity. updateFinancialTrack</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/invoices/{invoiceKey}/financial-tracks/{financialTrackKey}</span> <br/>
        <span class="api-summary">Delete a FinancialTrack entity deleteFinancialTrackEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Invoiceroot with key {InvoiceKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **invoice** | /invoices | listInvoice | createInvoice | getInvoice | updateInvoice | deleteInvoice |
    | **payment-term-reference** | /invoices/{invoiceKey}/payment-term-references | listPaymentTermReferenceByInvoiceKey | createPaymentTermReference | getPaymentTermReferenceByInvoiceKey | updatePaymentTermReferenceByInvoiceKey | deletePaymentTermReferenceByInvoiceKey |
    | **invoice-item** | /invoices/{invoiceKey}/invoice-items | listInvoiceItemByInvoiceKey | createInvoiceItem | getInvoiceItemByInvoiceKey | updateInvoiceItemByInvoiceKey | deleteInvoiceItemByInvoiceKey |
    | **discount-reference** | /invoices/{invoiceKey}/discount-references | listDiscountReferenceByInvoiceKey | createDiscountReference | getDiscountReferenceByInvoiceKey | updateDiscountReferenceByInvoiceKey | deleteDiscountReferenceByInvoiceKey |
    | **address-reference** | /invoices/{invoiceKey}/address-references | listAddressReferenceByInvoiceKey | createAddressReference | getAddressReferenceByInvoiceKey | updateAddressReferenceByInvoiceKey | deleteAddressReferenceByInvoiceKey |
    | **financial-category-reference** | /invoices/{invoiceKey}/financial-category-references | listFinancialCategoryReferenceByInvoiceKey | createFinancialCategoryReference | getFinancialCategoryReferenceByInvoiceKey | updateFinancialCategoryReferenceByInvoiceKey | deleteFinancialCategoryReferenceByInvoiceKey |
    | **fee-reference** | /invoices/{invoiceKey}/fee-references | listFeeReferenceByInvoiceKey | createFeeReference | getFeeReferenceByInvoiceKey | updateFeeReferenceByInvoiceKey | deleteFeeReferenceByInvoiceKey |
    | **money** | /invoices/{invoiceKey}/money | listMoneyByInvoiceKey |  | getMoneyByInvoiceKey | updateMoneyByInvoiceKey | deleteMoneyByInvoiceKey |
    | **identifier** | /invoices/{invoiceKey}/identifiers | listIdentifierByInvoiceKey | createIdentifier | getIdentifierByInvoiceKey | updateIdentifierByInvoiceKey | deleteIdentifierByInvoiceKey |
    | **part-reference** | /invoices/{invoiceKey}/part-references | listPartReferenceByInvoiceKey | createPartReference | getPartReferenceByInvoiceKey | updatePartReferenceByInvoiceKey | deletePartReferenceByInvoiceKey |
    | **effective-period** | /invoices/{invoiceKey}/effective-periods | listEffectivePeriodByInvoiceKey |  | getEffectivePeriodByInvoiceKey | updateEffectivePeriodByInvoiceKey | deleteEffectivePeriodByInvoiceKey |
    | **credit-reference** | /invoices/{invoiceKey}/credit-references | listCreditReferenceByInvoiceKey | createCreditReference | getCreditReferenceByInvoiceKey | updateCreditReferenceByInvoiceKey | deleteCreditReferenceByInvoiceKey |
    | **rebate-reference** | /invoices/{invoiceKey}/rebate-references | listRebateReferenceByInvoiceKey | createRebateReference | getRebateReferenceByInvoiceKey | updateRebateReferenceByInvoiceKey | deleteRebateReferenceByInvoiceKey |
    | **shipment-reference** | /invoices/{invoiceKey}/shipment-references | listShipmentReferenceByInvoiceKey | createShipmentReference | getShipmentReferenceByInvoiceKey | updateShipmentReferenceByInvoiceKey | deleteShipmentReferenceByInvoiceKey |
    | **unit-of-measure** | /invoices/{invoiceKey}/unit-of-measures | listUnitOfMeasureByInvoiceKey |  | getUnitOfMeasureByInvoiceKey | updateUnitOfMeasureByInvoiceKey | deleteUnitOfMeasureByInvoiceKey |
    | **tax-split** | /invoices/{invoiceKey}/tax-splits | listTaxSplitByInvoiceKey | createTaxSplit | getTaxSplitByInvoiceKey | updateTaxSplitByInvoiceKey | deleteTaxSplitByInvoiceKey |
    | **payment-schedule-reference** | /invoices/{invoiceKey}/payment-schedule-references | listPaymentScheduleReferenceByInvoiceKey | createPaymentScheduleReference | getPaymentScheduleReferenceByInvoiceKey | updatePaymentScheduleReferenceByInvoiceKey | deletePaymentScheduleReferenceByInvoiceKey |
    | **price-plan-reference** | /invoices/{invoiceKey}/price-plan-references | listPricePlanReferenceByInvoiceKey | createPricePlanReference | getPricePlanReferenceByInvoiceKey | updatePricePlanReferenceByInvoiceKey | deletePricePlanReferenceByInvoiceKey |
    | **control-account-reference** | /invoices/{invoiceKey}/control-account-references | listControlAccountReferenceByInvoiceKey | createControlAccountReference | getControlAccountReferenceByInvoiceKey | updateControlAccountReferenceByInvoiceKey | deleteControlAccountReferenceByInvoiceKey |
    | **reward-reference** | /invoices/{invoiceKey}/reward-references | listRewardReferenceByInvoiceKey | createRewardReference | getRewardReferenceByInvoiceKey | updateRewardReferenceByInvoiceKey | deleteRewardReferenceByInvoiceKey |
    | **payment-authorization** | /invoices/{invoiceKey}/payment-authorizations | listPaymentAuthorizationByInvoiceKey | createPaymentAuthorization | getPaymentAuthorizationByInvoiceKey | updatePaymentAuthorizationByInvoiceKey | deletePaymentAuthorizationByInvoiceKey |
    | **price** | /invoices/{invoiceKey}/prices | listPriceByInvoiceKey | createPrice | getPriceByInvoiceKey | updatePriceByInvoiceKey | deletePriceByInvoiceKey |
    | **financial-event** | /invoices/{invoiceKey}/financial-events | listFinancialEventByInvoiceKey | createFinancialEvent | getFinancialEventByInvoiceKey | updateFinancialEventByInvoiceKey | deleteFinancialEventByInvoiceKey |
    | **payment-method-reference** | /invoices/{invoiceKey}/payment-method-references | listPaymentMethodReferenceByInvoiceKey | createPaymentMethodReference | getPaymentMethodReferenceByInvoiceKey | updatePaymentMethodReferenceByInvoiceKey | deletePaymentMethodReferenceByInvoiceKey |
    | **textual-detail** | /invoices/{invoiceKey}/textual-details | listTextualDetailByInvoiceKey |  | getTextualDetailByInvoiceKey | updateTextualDetailByInvoiceKey | deleteTextualDetailByInvoiceKey |
    | **financial-split** | /invoices/{invoiceKey}/financial-splits | listFinancialSplitByInvoiceKey | createFinancialSplit | getFinancialSplitByInvoiceKey | updateFinancialSplitByInvoiceKey | deleteFinancialSplitByInvoiceKey |
    | **financial-track** | /invoices/{invoiceKey}/financial-tracks | listFinancialTrackByInvoiceKey | createFinancialTrack | getFinancialTrackByInvoiceKey | updateFinancialTrackByInvoiceKey | deleteFinancialTrackByInvoiceKey |

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

## Bulk Create Invoice (`POST /invoices/batch`)

The `/invoices/batch` endpoint allows you to create multiple Invoice entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of Invoice and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `InvoiceCreate` schema.

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

Contains the full objects of the Invoice that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A Invoice with SKU W-002 already exists."
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

## Health Check (`GET /invoices/health`)

The `/invoices/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the Invoice aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## Invoice Commands and State Management

The invoices API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /invoices/{InvoiceKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a Invoice (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /invoices/{InvoiceKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /invoices/capabilities`)

Before sending a command, you can "discover" what actions are valid for a Invoice based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the Invoice must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelInvoice` | `CREATED`, `ACTIVE` | `DELETED` | Voids the Invoice . |
| `ActivateInvoice` | `PENDING` | `ACTIVE` | Moves a Invoice into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |