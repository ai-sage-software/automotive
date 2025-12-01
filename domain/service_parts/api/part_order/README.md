## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **AddressReference**, **ControlAccountReference**, **CreditReference**, **CustomerOrderReference**, **DiscountReference**, **FeeReference**, **FinancialCategoryReference**, **FinancialEvent**, **FinancialSplit**, **FinancialTrackReference**, **Identifier**, **LenderReference**, **PartOrder**, **PartOrderItem**, **PartReference**, **PartyIdentifier**, **PaymentScheduleReference**, **PaymentTermReference**, **Price**, **PricePlanReference**, **RebateReference**, **RewardReference**, **SalesProfileReference**, **ShipmentReference**, **StaffAssignmentReference**, **TaxSplit**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service_parts** and **PartOrder** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PartOrder** | /part-orders | Manages PartOrders |
    | **PaymentTermReference** | /part-orders/{partOrderKey}/payment-term-references | Manages PaymentTermReferences belonging to PartOrders |
    | **DiscountReference** | /part-orders/{partOrderKey}/discount-references | Manages DiscountReferences belonging to PartOrders |
    | **AddressReference** | /part-orders/{partOrderKey}/address-references | Manages AddressReferences belonging to PartOrders |
    | **FinancialCategoryReference** | /part-orders/{partOrderKey}/financial-category-references | Manages FinancialCategoryReferences belonging to PartOrders |
    | **StaffAssignmentReference** | /part-orders/{partOrderKey}/staff-assignment-references | Manages StaffAssignmentReferences belonging to PartOrders |
    | **FeeReference** | /part-orders/{partOrderKey}/fee-references | Manages FeeReferences belonging to PartOrders |
    | **Identifier** | /part-orders/{partOrderKey}/identifiers | Manages Identifiers belonging to PartOrders |
    | **PartReference** | /part-orders/{partOrderKey}/part-references | Manages PartReferences belonging to PartOrders |
    | **EffectivePeriod** | /part-orders/{partOrderKey}/effective-periods | Manages EffectivePeriods belonging to PartOrders |
    | **PartOrderItem** | /part-orders/{partOrderKey}/part-order-items | Manages PartOrderItems belonging to PartOrders |
    | **CreditReference** | /part-orders/{partOrderKey}/credit-references | Manages CreditReferences belonging to PartOrders |
    | **SalesProfileReference** | /part-orders/{partOrderKey}/sales-profile-references | Manages SalesProfileReferences belonging to PartOrders |
    | **RebateReference** | /part-orders/{partOrderKey}/rebate-references | Manages RebateReferences belonging to PartOrders |
    | **ShipmentReference** | /part-orders/{partOrderKey}/shipment-references | Manages ShipmentReferences belonging to PartOrders |
    | **TaxSplit** | /part-orders/{partOrderKey}/tax-splits | Manages TaxSplits belonging to PartOrders |
    | **PaymentScheduleReference** | /part-orders/{partOrderKey}/payment-schedule-references | Manages PaymentScheduleReferences belonging to PartOrders |
    | **PricePlanReference** | /part-orders/{partOrderKey}/price-plan-references | Manages PricePlanReferences belonging to PartOrders |
    | **ControlAccountReference** | /part-orders/{partOrderKey}/control-account-references | Manages ControlAccountReferences belonging to PartOrders |
    | **RewardReference** | /part-orders/{partOrderKey}/reward-references | Manages RewardReferences belonging to PartOrders |
    | **CustomerOrderReference** | /part-orders/{partOrderKey}/customer-order-references | Manages CustomerOrderReferences belonging to PartOrders |
    | **PartyIdentifier** | /part-orders/{partOrderKey}/party-identifiers | Manages PartyIdentifiers belonging to PartOrders |
    | **Price** | /part-orders/{partOrderKey}/prices | Manages Prices belonging to PartOrders |
    | **FinancialEvent** | /part-orders/{partOrderKey}/financial-events | Manages FinancialEvents belonging to PartOrders |
    | **TextualDetail** | /part-orders/{partOrderKey}/textual-details | Manages TextualDetails belonging to PartOrders |
    | **LenderReference** | /part-orders/{partOrderKey}/lender-references | Manages LenderReferences belonging to PartOrders |
    | **FinancialTrackReference** | /part-orders/{partOrderKey}/financial-track-references | Manages FinancialTrackReferences belonging to PartOrders |
    | **FinancialSplit** | /part-orders/{partOrderKey}/financial-splits | Manages FinancialSplits belonging to PartOrders |


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
> `https://[Your-API-Host]/part-order`

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
💠 **ExitConsiderationTypes** : types of exit considerations.<br/>
💠 **FinancialEventTypes** : types of financial events.<br/>
💠 **FinancialTransactionTypes** : types of financial transactions.<br/>
💠 **LedgerActionTypes** : types of ledger actions.<br/>
💠 **OrderCategoryTypes** : types of order categorys.<br/>
💠 **OrderTypes** : types of orders.<br/>
💠 **PartInvoiceStatusTypes** : types of part invoice status.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PaymentMethodTypes** : types of payment methods.<br/>
💠 **PaymentTransactionStatusTypes** : types of payment transaction status.<br/>
💠 **PaymentTypes** : types of payments.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductPriceItemTypes** : types of product price items.<br/>
💠 **ProductTypes** : types of products.<br/>
💠 **ResourceTypes** : types of resources.<br/>
💠 **SalesPipelineStageTypes** : types of sales pipeline stages.<br/>
💠 **TaxTypes** : types of taxs.<br/>
💠 **UOMQuantityCategoryTypes** : entity<br/>
💠 **DaysOfWeekTypes** : Status of the account<br/>
💠 **TimeslotDirectiveTypes** : Represents the directive for a timeslot.<br/>

## ✅ Entities

---

✅ **AddressReferences** : List of AddressReference<br/>
✅ **Codes** : List of Codes<br/>
✅ **CreditReferences** : List of CreditReference<br/>
✅ **CustomerOrderReferences** : List of CustomerOrderReference<br/>
✅ **DiscountReferences** : List of DiscountReference<br/>
✅ **EffectivePeriod** : Effective Period<br/>
✅ **FeeReferences** : List of FeeReference<br/>
✅ **FinancialCategoryReferences** : List of FinancialCategoryReference<br/>
✅ **FinancialEvents** : List of FinancialEvent<br/>
✅ **FinancialSplits** : List of FinancialSplit<br/>
✅ **FinancialTrackReferences** : List of FinancialTrackReference<br/>
✅ **Identifiers** : List of Identifier<br/>
✅ **LenderReferences** : List of LenderReference<br/>
✅ **Link** : Quick Link<br/>
✅ **Links** : List of Links<br/>
✅ **List** : List of PaymentTransactionStatusTypes<br/>
✅ **Memo** : List of String<br/>
✅ **PartOrderItems** : List of PartOrderItem<br/>
✅ **PartReferences** : List of PartReference<br/>
✅ **PartyIdentifiers** : List of PartyIdentifier<br/>
✅ **PaymentScheduleReferences** : List of PaymentScheduleReference<br/>
✅ **PaymentTermReferences** : List of PaymentTermReference<br/>
✅ **PricePlanReferences** : List of PricePlanReference<br/>
✅ **RebateReferences** : List of RebateReference<br/>
✅ **RewardReferences** : List of RewardReference<br/>
✅ **SalesProfileReferences** : List of SalesProfileReference<br/>
✅ **ShipmentReferences** : List of ShipmentReference<br/>
✅ **StaffAssignmentReferences** : List of StaffAssignmentReference<br/>
✅ **TaxSplits** : List of TaxSplit<br/>
✅ **TextualDetail** : not nullable<br/>
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


### /part-orders
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders</span> <br/>
        <span class="api-summary">Retrieve a list of all PartOrder records. getPartOrders</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders</span> <br/>
        <span class="api-summary">Create a new PartOrder record. createPartOrder</span>
    </span>
</div>

### /part-orders/{partOrderKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartOrder record. getartOrderById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}</span> <br/>
        <span class="api-summary">Replace a PartOrder record. replacePartOrder</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}</span> <br/>
        <span class="api-summary">Partially update a PartOrder record. updatePartOrder</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}</span> <br/>
        <span class="api-summary">Delete a PartOrder Record deletePartOrderRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/payment-term-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-term-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentTermReference records scoped by partOrderKey. getPaymentTermReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-term-references</span> <br/>
        <span class="api-summary">Create a new PaymentTermReference record. createPaymentTermReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/payment-term-references/{paymentTermReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentTermReference record. getaymentTermReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentTermReference record. replacePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentTermReference record. updatePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentTermReference Record deletePaymentTermReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/discount-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/discount-references</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountReference records scoped by partOrderKey. getDiscountReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/discount-references</span> <br/>
        <span class="api-summary">Create a new DiscountReference record. createDiscountReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/discount-references/{discountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountReference record. getiscountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a DiscountReference record. replaceDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountReference record. updateDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a DiscountReference Record deleteDiscountReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference records scoped by partOrderKey. getAddressReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference record. createAddressReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference record. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference record. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference record. updateAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference Record deleteAddressReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/financial-category-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-category-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialCategoryReference records scoped by partOrderKey. getFinancialCategoryReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-category-references</span> <br/>
        <span class="api-summary">Create a new FinancialCategoryReference record. createFinancialCategoryReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/financial-category-references/{financialCategoryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialCategoryReference record. getinancialCategoryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialCategoryReference record. replaceFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialCategoryReference record. updateFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialCategoryReference Record deleteFinancialCategoryReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/staff-assignment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Retrieve a list of StaffAssignmentReference records scoped by partOrderKey. getStaffAssignmentReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Create a new StaffAssignmentReference record. createStaffAssignmentReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/staff-assignment-references/{staffAssignmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffAssignmentReference record. gettaffAssignmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a StaffAssignmentReference record. replaceStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a StaffAssignmentReference record. updateStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a StaffAssignmentReference Record deleteStaffAssignmentReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/fee-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/fee-references</span> <br/>
        <span class="api-summary">Retrieve a list of FeeReference records scoped by partOrderKey. getFeeReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/fee-references</span> <br/>
        <span class="api-summary">Create a new FeeReference record. createFeeReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/fee-references/{feeReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FeeReference record. geteeReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FeeReference record. replaceFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FeeReference record. updateFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FeeReference Record deleteFeeReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by partOrderKey. getIdentifiersByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /part-orders/{partOrderKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/part-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartReference records scoped by partOrderKey. getPartReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-references</span> <br/>
        <span class="api-summary">Create a new PartReference record. createPartReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/part-references/{partReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartReference record. getartReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartReference record. replacePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartReference record. updatePartReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-references/{partReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartReference Record deletePartReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by partOrderKey. getEffectivePeriodsByPartOrderKey</span>
    </span>
</div>

### /part-orders/{partOrderKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /part-orders/{partOrderKey}/part-order-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-order-items</span> <br/>
        <span class="api-summary">Retrieve a list of PartOrderItem records scoped by partOrderKey. getPartOrderItemsByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-order-items</span> <br/>
        <span class="api-summary">Create a new PartOrderItem record. createPartOrderItem</span>
    </span>
</div>

### /part-orders/{partOrderKey}/part-order-items/{partOrderItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-order-items/{partOrderItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartOrderItem record. getartOrderItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-order-items/{partOrderItemKey}</span> <br/>
        <span class="api-summary">Replace a PartOrderItem record. replacePartOrderItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-order-items/{partOrderItemKey}</span> <br/>
        <span class="api-summary">Partially update a PartOrderItem record. updatePartOrderItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/part-order-items/{partOrderItemKey}</span> <br/>
        <span class="api-summary">Delete a PartOrderItem Record deletePartOrderItemRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/credit-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/credit-references</span> <br/>
        <span class="api-summary">Retrieve a list of CreditReference records scoped by partOrderKey. getCreditReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/credit-references</span> <br/>
        <span class="api-summary">Create a new CreditReference record. createCreditReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/credit-references/{creditReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditReference record. getreditReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Replace a CreditReference record. replaceCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a CreditReference record. updateCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Delete a CreditReference Record deleteCreditReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/sales-profile-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/sales-profile-references</span> <br/>
        <span class="api-summary">Retrieve a list of SalesProfileReference records scoped by partOrderKey. getSalesProfileReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/sales-profile-references</span> <br/>
        <span class="api-summary">Create a new SalesProfileReference record. createSalesProfileReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/sales-profile-references/{salesProfileReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/sales-profile-references/{salesProfileReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific SalesProfileReference record. getalesProfileReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/sales-profile-references/{salesProfileReferenceKey}</span> <br/>
        <span class="api-summary">Replace a SalesProfileReference record. replaceSalesProfileReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/sales-profile-references/{salesProfileReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a SalesProfileReference record. updateSalesProfileReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/sales-profile-references/{salesProfileReferenceKey}</span> <br/>
        <span class="api-summary">Delete a SalesProfileReference Record deleteSalesProfileReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/rebate-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/rebate-references</span> <br/>
        <span class="api-summary">Retrieve a list of RebateReference records scoped by partOrderKey. getRebateReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/rebate-references</span> <br/>
        <span class="api-summary">Create a new RebateReference record. createRebateReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/rebate-references/{rebateReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RebateReference record. getebateReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RebateReference record. replaceRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RebateReference record. updateRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RebateReference Record deleteRebateReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/shipment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/shipment-references</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentReference records scoped by partOrderKey. getShipmentReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/shipment-references</span> <br/>
        <span class="api-summary">Create a new ShipmentReference record. createShipmentReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/shipment-references/{shipmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentReference record. gethipmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentReference record. replaceShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentReference record. updateShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentReference Record deleteShipmentReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/tax-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/tax-splits</span> <br/>
        <span class="api-summary">Retrieve a list of TaxSplit records scoped by partOrderKey. getTaxSplitsByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/tax-splits</span> <br/>
        <span class="api-summary">Create a new TaxSplit record. createTaxSplit</span>
    </span>
</div>

### /part-orders/{partOrderKey}/tax-splits/{taxSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TaxSplit record. getaxSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Replace a TaxSplit record. replaceTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Partially update a TaxSplit record. updateTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Delete a TaxSplit Record deleteTaxSplitRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/payment-schedule-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-schedule-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentScheduleReference records scoped by partOrderKey. getPaymentScheduleReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-schedule-references</span> <br/>
        <span class="api-summary">Create a new PaymentScheduleReference record. createPaymentScheduleReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/payment-schedule-references/{paymentScheduleReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentScheduleReference record. getaymentScheduleReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentScheduleReference record. replacePaymentScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentScheduleReference record. updatePaymentScheduleReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/payment-schedule-references/{paymentScheduleReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentScheduleReference Record deletePaymentScheduleReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/price-plan-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/price-plan-references</span> <br/>
        <span class="api-summary">Retrieve a list of PricePlanReference records scoped by partOrderKey. getPricePlanReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/price-plan-references</span> <br/>
        <span class="api-summary">Create a new PricePlanReference record. createPricePlanReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/price-plan-references/{pricePlanReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlanReference record. getricePlanReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PricePlanReference record. replacePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlanReference record. updatePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PricePlanReference Record deletePricePlanReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference records scoped by partOrderKey. getControlAccountReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference record. createControlAccountReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference record. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference record. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference record. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference Record deleteControlAccountReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/reward-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/reward-references</span> <br/>
        <span class="api-summary">Retrieve a list of RewardReference records scoped by partOrderKey. getRewardReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/reward-references</span> <br/>
        <span class="api-summary">Create a new RewardReference record. createRewardReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/reward-references/{rewardReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RewardReference record. getewardReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RewardReference record. replaceRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RewardReference record. updateRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RewardReference Record deleteRewardReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/customer-order-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/customer-order-references</span> <br/>
        <span class="api-summary">Retrieve a list of CustomerOrderReference records scoped by partOrderKey. getCustomerOrderReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/customer-order-references</span> <br/>
        <span class="api-summary">Create a new CustomerOrderReference record. createCustomerOrderReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/customer-order-references/{customerOrderReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/customer-order-references/{customerOrderReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CustomerOrderReference record. getustomerOrderReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/customer-order-references/{customerOrderReferenceKey}</span> <br/>
        <span class="api-summary">Replace a CustomerOrderReference record. replaceCustomerOrderReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/customer-order-references/{customerOrderReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a CustomerOrderReference record. updateCustomerOrderReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/customer-order-references/{customerOrderReferenceKey}</span> <br/>
        <span class="api-summary">Delete a CustomerOrderReference Record deleteCustomerOrderReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/party-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/party-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartyIdentifier records scoped by partOrderKey. getPartyIdentifiersByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/party-identifiers</span> <br/>
        <span class="api-summary">Create a new PartyIdentifier record. createPartyIdentifier</span>
    </span>
</div>

### /part-orders/{partOrderKey}/party-identifiers/{partyIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyIdentifier record. getartyIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartyIdentifier record. replacePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartyIdentifier record. updatePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartyIdentifier Record deletePartyIdentifierRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price records scoped by partOrderKey. getPricesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price record. createPrice</span>
    </span>
</div>

### /part-orders/{partOrderKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price record. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price record. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price record. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price Record deletePriceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/financial-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-events</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialEvent records scoped by partOrderKey. getFinancialEventsByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-events</span> <br/>
        <span class="api-summary">Create a new FinancialEvent record. createFinancialEvent</span>
    </span>
</div>

### /part-orders/{partOrderKey}/financial-events/{financialEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialEvent record. getinancialEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Replace a FinancialEvent record. replaceFinancialEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialEvent record. updateFinancialEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-events/{financialEventKey}</span> <br/>
        <span class="api-summary">Delete a FinancialEvent Record deleteFinancialEventRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail records scoped by partOrderKey. getTextualDetailsByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/textual-details</span> <br/>
        <span class="api-summary">Create a new TextualDetail record. createTextualDetail</span>
    </span>
</div>

### /part-orders/{partOrderKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail record. getextualDetailById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Replace a TextualDetail record. replaceTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Partially update a TextualDetail record. updateTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Delete a TextualDetail Record deleteTextualDetailRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/lender-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/lender-references</span> <br/>
        <span class="api-summary">Retrieve a list of LenderReference records scoped by partOrderKey. getLenderReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/lender-references</span> <br/>
        <span class="api-summary">Create a new LenderReference record. createLenderReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/lender-references/{lenderReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/lender-references/{lenderReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LenderReference record. getenderReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/lender-references/{lenderReferenceKey}</span> <br/>
        <span class="api-summary">Replace a LenderReference record. replaceLenderReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/lender-references/{lenderReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a LenderReference record. updateLenderReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/lender-references/{lenderReferenceKey}</span> <br/>
        <span class="api-summary">Delete a LenderReference Record deleteLenderReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/financial-track-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-track-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialTrackReference records scoped by partOrderKey. getFinancialTrackReferencesByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-track-references</span> <br/>
        <span class="api-summary">Create a new FinancialTrackReference record. createFinancialTrackReference</span>
    </span>
</div>

### /part-orders/{partOrderKey}/financial-track-references/{financialTrackReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialTrackReference record. getinancialTrackReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialTrackReference record. replaceFinancialTrackReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialTrackReference record. updateFinancialTrackReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-track-references/{financialTrackReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialTrackReference Record deleteFinancialTrackReferenceRecord</span>
    </span>
</div>

### /part-orders/{partOrderKey}/financial-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-splits</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplit records scoped by partOrderKey. getFinancialSplitsByPartOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-splits</span> <br/>
        <span class="api-summary">Create a new FinancialSplit record. createFinancialSplit</span>
    </span>
</div>

### /part-orders/{partOrderKey}/financial-splits/{financialSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplit record. getinancialSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplit record. replaceFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplit record. updateFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/part-orders/{partOrderKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplit Record deleteFinancialSplitRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PartOrderroot with key {PartOrderKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **part-order** | /part-orders | listPartOrders | createPartOrder | getPartOrders | updatePartOrders | deletePartOrders |
    | **payment-term-reference** | /part-orders/{partOrderKey}/payment-term-references | listPaymentTermReferencesByPartOrderKey | createPaymentTermReference | getPaymentTermReferencesByPartOrderKey | updatePaymentTermReferencesByPartOrderKey | deletePaymentTermReferencesByPartOrderKey |
    | **discount-reference** | /part-orders/{partOrderKey}/discount-references | listDiscountReferencesByPartOrderKey | createDiscountReference | getDiscountReferencesByPartOrderKey | updateDiscountReferencesByPartOrderKey | deleteDiscountReferencesByPartOrderKey |
    | **address-reference** | /part-orders/{partOrderKey}/address-references | listAddressReferencesByPartOrderKey | createAddressReference | getAddressReferencesByPartOrderKey | updateAddressReferencesByPartOrderKey | deleteAddressReferencesByPartOrderKey |
    | **financial-category-reference** | /part-orders/{partOrderKey}/financial-category-references | listFinancialCategoryReferencesByPartOrderKey | createFinancialCategoryReference | getFinancialCategoryReferencesByPartOrderKey | updateFinancialCategoryReferencesByPartOrderKey | deleteFinancialCategoryReferencesByPartOrderKey |
    | **staff-assignment-reference** | /part-orders/{partOrderKey}/staff-assignment-references | listStaffAssignmentReferencesByPartOrderKey | createStaffAssignmentReference | getStaffAssignmentReferencesByPartOrderKey | updateStaffAssignmentReferencesByPartOrderKey | deleteStaffAssignmentReferencesByPartOrderKey |
    | **fee-reference** | /part-orders/{partOrderKey}/fee-references | listFeeReferencesByPartOrderKey | createFeeReference | getFeeReferencesByPartOrderKey | updateFeeReferencesByPartOrderKey | deleteFeeReferencesByPartOrderKey |
    | **identifier** | /part-orders/{partOrderKey}/identifiers | listIdentifiersByPartOrderKey | createIdentifier | getIdentifiersByPartOrderKey | updateIdentifiersByPartOrderKey | deleteIdentifiersByPartOrderKey |
    | **part-reference** | /part-orders/{partOrderKey}/part-references | listPartReferencesByPartOrderKey | createPartReference | getPartReferencesByPartOrderKey | updatePartReferencesByPartOrderKey | deletePartReferencesByPartOrderKey |
    | **effective-period** | /part-orders/{partOrderKey}/effective-periods | listEffectivePeriodsByPartOrderKey |  | getEffectivePeriodsByPartOrderKey | updateEffectivePeriodsByPartOrderKey | deleteEffectivePeriodsByPartOrderKey |
    | **part-order-item** | /part-orders/{partOrderKey}/part-order-items | listPartOrderItemsByPartOrderKey | createPartOrderItem | getPartOrderItemsByPartOrderKey | updatePartOrderItemsByPartOrderKey | deletePartOrderItemsByPartOrderKey |
    | **credit-reference** | /part-orders/{partOrderKey}/credit-references | listCreditReferencesByPartOrderKey | createCreditReference | getCreditReferencesByPartOrderKey | updateCreditReferencesByPartOrderKey | deleteCreditReferencesByPartOrderKey |
    | **sales-profile-reference** | /part-orders/{partOrderKey}/sales-profile-references | listSalesProfileReferencesByPartOrderKey | createSalesProfileReference | getSalesProfileReferencesByPartOrderKey | updateSalesProfileReferencesByPartOrderKey | deleteSalesProfileReferencesByPartOrderKey |
    | **rebate-reference** | /part-orders/{partOrderKey}/rebate-references | listRebateReferencesByPartOrderKey | createRebateReference | getRebateReferencesByPartOrderKey | updateRebateReferencesByPartOrderKey | deleteRebateReferencesByPartOrderKey |
    | **shipment-reference** | /part-orders/{partOrderKey}/shipment-references | listShipmentReferencesByPartOrderKey | createShipmentReference | getShipmentReferencesByPartOrderKey | updateShipmentReferencesByPartOrderKey | deleteShipmentReferencesByPartOrderKey |
    | **tax-split** | /part-orders/{partOrderKey}/tax-splits | listTaxSplitsByPartOrderKey | createTaxSplit | getTaxSplitsByPartOrderKey | updateTaxSplitsByPartOrderKey | deleteTaxSplitsByPartOrderKey |
    | **payment-schedule-reference** | /part-orders/{partOrderKey}/payment-schedule-references | listPaymentScheduleReferencesByPartOrderKey | createPaymentScheduleReference | getPaymentScheduleReferencesByPartOrderKey | updatePaymentScheduleReferencesByPartOrderKey | deletePaymentScheduleReferencesByPartOrderKey |
    | **price-plan-reference** | /part-orders/{partOrderKey}/price-plan-references | listPricePlanReferencesByPartOrderKey | createPricePlanReference | getPricePlanReferencesByPartOrderKey | updatePricePlanReferencesByPartOrderKey | deletePricePlanReferencesByPartOrderKey |
    | **control-account-reference** | /part-orders/{partOrderKey}/control-account-references | listControlAccountReferencesByPartOrderKey | createControlAccountReference | getControlAccountReferencesByPartOrderKey | updateControlAccountReferencesByPartOrderKey | deleteControlAccountReferencesByPartOrderKey |
    | **reward-reference** | /part-orders/{partOrderKey}/reward-references | listRewardReferencesByPartOrderKey | createRewardReference | getRewardReferencesByPartOrderKey | updateRewardReferencesByPartOrderKey | deleteRewardReferencesByPartOrderKey |
    | **customer-order-reference** | /part-orders/{partOrderKey}/customer-order-references | listCustomerOrderReferencesByPartOrderKey | createCustomerOrderReference | getCustomerOrderReferencesByPartOrderKey | updateCustomerOrderReferencesByPartOrderKey | deleteCustomerOrderReferencesByPartOrderKey |
    | **party-identifier** | /part-orders/{partOrderKey}/party-identifiers | listPartyIdentifiersByPartOrderKey | createPartyIdentifier | getPartyIdentifiersByPartOrderKey | updatePartyIdentifiersByPartOrderKey | deletePartyIdentifiersByPartOrderKey |
    | **price** | /part-orders/{partOrderKey}/prices | listPricesByPartOrderKey | createPrice | getPricesByPartOrderKey | updatePricesByPartOrderKey | deletePricesByPartOrderKey |
    | **financial-event** | /part-orders/{partOrderKey}/financial-events | listFinancialEventsByPartOrderKey | createFinancialEvent | getFinancialEventsByPartOrderKey | updateFinancialEventsByPartOrderKey | deleteFinancialEventsByPartOrderKey |
    | **textual-detail** | /part-orders/{partOrderKey}/textual-details | listTextualDetailsByPartOrderKey | createTextualDetail | getTextualDetailsByPartOrderKey | updateTextualDetailsByPartOrderKey | deleteTextualDetailsByPartOrderKey |
    | **lender-reference** | /part-orders/{partOrderKey}/lender-references | listLenderReferencesByPartOrderKey | createLenderReference | getLenderReferencesByPartOrderKey | updateLenderReferencesByPartOrderKey | deleteLenderReferencesByPartOrderKey |
    | **financial-track-reference** | /part-orders/{partOrderKey}/financial-track-references | listFinancialTrackReferencesByPartOrderKey | createFinancialTrackReference | getFinancialTrackReferencesByPartOrderKey | updateFinancialTrackReferencesByPartOrderKey | deleteFinancialTrackReferencesByPartOrderKey |
    | **financial-split** | /part-orders/{partOrderKey}/financial-splits | listFinancialSplitsByPartOrderKey | createFinancialSplit | getFinancialSplitsByPartOrderKey | updateFinancialSplitsByPartOrderKey | deleteFinancialSplitsByPartOrderKey |

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