## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **AppointmentReference**, **BillOfMaterialReference**, **ControlAccountReference**, **CreditReference**, **DiscountReference**, **FeeReference**, **FinancialCategoryReference**, **FinancialSplit**, **FinancialSplitReference**, **GeographicBoundaryReference**, **Inspection**, **LaborOperation**, **LaborOperationEvent**, **LaborResource**, **Locale**, **Media**, **MediaAccessMetric**, **MetricValue**, **PartIdentifier**, **PartyReference**, **PricePlanReference**, **RebateReference**, **RepairOrder**, **RewardReference**, **ServiceCatalogReferences**, **StaffAssignmentReference**, **StaffSkill**, **TaxSplit**, **VehicleIdentifier**, **VehicleLicense**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service** and **RepairOrder** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **RepairOrder** | /repair-orders | Manages RepairOrders |
    | **Locale** | /repair-orders/{repairOrderKey}/locales | Manages Locales belonging to RepairOrders |
    | **DiscountReference** | /repair-orders/{repairOrderKey}/discount-references | Manages DiscountReferences belonging to RepairOrders |
    | **TimeSlot** | /repair-orders/{repairOrderKey}/time-slots | Manages TimeSlots belonging to RepairOrders |
    | **FinancialCategoryReference** | /repair-orders/{repairOrderKey}/financial-category-references | Manages FinancialCategoryReferences belonging to RepairOrders |
    | **FeeReference** | /repair-orders/{repairOrderKey}/fee-references | Manages FeeReferences belonging to RepairOrders |
    | **PartyReference** | /repair-orders/{repairOrderKey}/party-references | Manages PartyReferences belonging to RepairOrders |
    | **StaffAssignmentReference** | /repair-orders/{repairOrderKey}/staff-assignment-references | Manages StaffAssignmentReferences belonging to RepairOrders |
    | **Money** | /repair-orders/{repairOrderKey}/money | Manages Money belonging to RepairOrders |
    | **MetricValue** | /repair-orders/{repairOrderKey}/metric-values | Manages MetricValues belonging to RepairOrders |
    | **Identifier** | /repair-orders/{repairOrderKey}/identifiers | Manages Identifiers belonging to RepairOrders |
    | **EffectivePeriod** | /repair-orders/{repairOrderKey}/effective-periods | Manages EffectivePeriods belonging to RepairOrders |
    | **CreditReference** | /repair-orders/{repairOrderKey}/credit-references | Manages CreditReferences belonging to RepairOrders |
    | **LaborOperation** | /repair-orders/{repairOrderKey}/labor-operations | Manages LaborOperations belonging to RepairOrders |
    | **RebateReference** | /repair-orders/{repairOrderKey}/rebate-references | Manages RebateReferences belonging to RepairOrders |
    | **VehicleLicense** | /repair-orders/{repairOrderKey}/vehicle-licenses | Manages VehicleLicenses belonging to RepairOrders |
    | **LaborOperationEvent** | /repair-orders/{repairOrderKey}/labor-operation-events | Manages LaborOperationEvents belonging to RepairOrders |
    | **TaxSplit** | /repair-orders/{repairOrderKey}/tax-splits | Manages TaxSplits belonging to RepairOrders |
    | **LaborResource** | /repair-orders/{repairOrderKey}/labor-resources | Manages LaborResources belonging to RepairOrders |
    | **Media** | /repair-orders/{repairOrderKey}/medias | Manages Medias belonging to RepairOrders |
    | **PricePlanReference** | /repair-orders/{repairOrderKey}/price-plan-references | Manages PricePlanReferences belonging to RepairOrders |
    | **Inspection** | /repair-orders/{repairOrderKey}/inspections | Manages Inspections belonging to RepairOrders |
    | **ControlAccountReference** | /repair-orders/{repairOrderKey}/control-account-references | Manages ControlAccountReferences belonging to RepairOrders |
    | **RewardReference** | /repair-orders/{repairOrderKey}/reward-references | Manages RewardReferences belonging to RepairOrders |
    | **CurrencyExchange** | /repair-orders/{repairOrderKey}/currency-exchanges | Manages CurrencyExchanges belonging to RepairOrders |
    | **MediaAccessMetric** | /repair-orders/{repairOrderKey}/media-access-metrics | Manages MediaAccessMetrics belonging to RepairOrders |
    | **BillOfMaterialReference** | /repair-orders/{repairOrderKey}/bill-of-material-references | Manages BillOfMaterialReferences belonging to RepairOrders |
    | **Price** | /repair-orders/{repairOrderKey}/prices | Manages Prices belonging to RepairOrders |
    | **AppointmentReference** | /repair-orders/{repairOrderKey}/appointment-references | Manages AppointmentReferences belonging to RepairOrders |
    | **FinancialSplitReference** | /repair-orders/{repairOrderKey}/financial-split-references | Manages FinancialSplitReferences belonging to RepairOrders |
    | **TextualDetail** | /repair-orders/{repairOrderKey}/textual-details | Manages TextualDetails belonging to RepairOrders |
    | **FinancialSplit** | /repair-orders/{repairOrderKey}/financial-splits | Manages FinancialSplits belonging to RepairOrders |
    | **VehicleIdentifier** | /repair-orders/{repairOrderKey}/vehicle-identifiers | Manages VehicleIdentifiers belonging to RepairOrders |


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
> `https://[Your-API-Host]/repairorders`

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

💠 **AppointmentStatusTypes** : types of appointment status.<br/>
💠 **AppointmentTypes** : types of appointments.<br/>
💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DeviceTypes** : types of devices.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **FinancialTransactionTypes** : types of financial transactions.<br/>
💠 **LaborLocationTypes** : types of labor locations.<br/>
💠 **LaborOperationStatusTypes** : types of labor operation status.<br/>
💠 **LaborOperationTypes** : types of labor operations.<br/>
💠 **LaborResourceTypes** : types of labor resources.<br/>
💠 **LedgerActionTypes** : types of ledger actions.<br/>
💠 **MediaDeliveryMethodTypes** : types of media delivery methods.<br/>
💠 **MediaFormatTypes** : types of media formats.<br/>
💠 **MediaTypes** : types of medias.<br/>
💠 **MediaUsageTypes** : types of media usages.<br/>
💠 **NarrativeUomTypes** : types of narrative uoms.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PayTypes** : types of pays.<br/>
💠 **PayeeTypes** : types of payees.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductPriceItemTypes** : types of product price items.<br/>
💠 **RepairStatusTypes** : types of repair status.<br/>
💠 **RoleTypes** : types of roles.<br/>
💠 **ServiceJobTypes** : types of service jobs.<br/>
💠 **TaxTypes** : types of taxs.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>
💠 **SkillCategoryTypes** : Undocumented Enum<br/>
💠 **PartIdentifierTypes** : entity<br/>
💠 **PartStatusTypes** : Metrics for a single execution run of a critica...<br/>

## ✅ Entities

---

✅ **CurrencyExchange** : currency.exchange.desc<br/>
✅ **EffectivePeriod** : effective.period.desc<br/>
✅ **Identifier** : identifier.desc<br/>
✅ **Money** : money.desc<br/>
✅ **Price** : price.desc<br/>
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


### /repair-orders
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders</span> <br/>
        <span class="api-summary">Retrieve a list of RepairOrder entities. getRepairOrder</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders</span> <br/>
        <span class="api-summary">Create a new RepairOrder entity. createRepairOrder</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RepairOrder entity. getepairOrderById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}</span> <br/>
        <span class="api-summary">Replace a RepairOrder entity. replaceRepairOrder</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}</span> <br/>
        <span class="api-summary">Partially update a RepairOrder entity. updatePartialRepairOrder</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}</span> <br/>
        <span class="api-summary">Delete a RepairOrder entity deleteRepairOrderEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/locales
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/locales</span> <br/>
        <span class="api-summary">Retrieve a list of Locale entities scoped by repairOrderKey. getLocaleByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/locales</span> <br/>
        <span class="api-summary">Create a new Locale entity. createLocale</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/locales/{localeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Locale entity. getocaleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Replace a Locale entity. replaceLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Partially update a Locale entity. updatePartialLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Delete a Locale entity deleteLocaleEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/discount-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/discount-references</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountReference entities scoped by repairOrderKey. getDiscountReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/discount-references</span> <br/>
        <span class="api-summary">Create a new DiscountReference entity. createDiscountReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/discount-references/{discountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountReference entity. getiscountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a DiscountReference entity. replaceDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountReference entity. updatePartialDiscountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/discount-references/{discountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a DiscountReference entity deleteDiscountReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by repairOrderKey. getTimeSlotByRepairOrderKey</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/financial-category-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-category-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialCategoryReference entities scoped by repairOrderKey. getFinancialCategoryReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-category-references</span> <br/>
        <span class="api-summary">Create a new FinancialCategoryReference entity. createFinancialCategoryReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/financial-category-references/{financialCategoryReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialCategoryReference entity. getinancialCategoryReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialCategoryReference entity. replaceFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialCategoryReference entity. updatePartialFinancialCategoryReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-category-references/{financialCategoryReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialCategoryReference entity deleteFinancialCategoryReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/fee-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/fee-references</span> <br/>
        <span class="api-summary">Retrieve a list of FeeReference entities scoped by repairOrderKey. getFeeReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/fee-references</span> <br/>
        <span class="api-summary">Create a new FeeReference entity. createFeeReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/fee-references/{feeReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FeeReference entity. geteeReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FeeReference entity. replaceFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FeeReference entity. updatePartialFeeReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/fee-references/{feeReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FeeReference entity deleteFeeReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/party-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/party-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartyReference entities scoped by repairOrderKey. getPartyReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/party-references</span> <br/>
        <span class="api-summary">Create a new PartyReference entity. createPartyReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/party-references/{partyReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyReference entity. getartyReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartyReference entity. replacePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartyReference entity. updatePartialPartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartyReference entity deletePartyReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/staff-assignment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Retrieve a list of StaffAssignmentReference entities scoped by repairOrderKey. getStaffAssignmentReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Create a new StaffAssignmentReference entity. createStaffAssignmentReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/staff-assignment-references/{staffAssignmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffAssignmentReference entity. gettaffAssignmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a StaffAssignmentReference entity. replaceStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a StaffAssignmentReference entity. updatePartialStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a StaffAssignmentReference entity deleteStaffAssignmentReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/money
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/money</span> <br/>
        <span class="api-summary">Retrieve a list of Money entities scoped by repairOrderKey. getMoneyByRepairOrderKey</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/money/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/money/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money entity. getoneyById</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/metric-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/metric-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricValue entities scoped by repairOrderKey. getMetricValueByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/metric-values</span> <br/>
        <span class="api-summary">Create a new MetricValue entity. createMetricValue</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/metric-values/{metricValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricValue entity. getetricValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricValue entity. replaceMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricValue entity. updatePartialMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricValue entity deleteMetricValueEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by repairOrderKey. getIdentifierByRepairOrderKey</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by repairOrderKey. getEffectivePeriodByRepairOrderKey</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/credit-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/credit-references</span> <br/>
        <span class="api-summary">Retrieve a list of CreditReference entities scoped by repairOrderKey. getCreditReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/credit-references</span> <br/>
        <span class="api-summary">Create a new CreditReference entity. createCreditReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/credit-references/{creditReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditReference entity. getreditReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Replace a CreditReference entity. replaceCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a CreditReference entity. updatePartialCreditReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/credit-references/{creditReferenceKey}</span> <br/>
        <span class="api-summary">Delete a CreditReference entity deleteCreditReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/labor-operations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operations</span> <br/>
        <span class="api-summary">Retrieve a list of LaborOperation entities scoped by repairOrderKey. getLaborOperationByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operations</span> <br/>
        <span class="api-summary">Create a new LaborOperation entity. createLaborOperation</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/labor-operations/{laborOperationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LaborOperation entity. getaborOperationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Replace a LaborOperation entity. replaceLaborOperation</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Partially update a LaborOperation entity. updatePartialLaborOperation</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Delete a LaborOperation entity deleteLaborOperationEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/rebate-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/rebate-references</span> <br/>
        <span class="api-summary">Retrieve a list of RebateReference entities scoped by repairOrderKey. getRebateReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/rebate-references</span> <br/>
        <span class="api-summary">Create a new RebateReference entity. createRebateReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/rebate-references/{rebateReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RebateReference entity. getebateReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RebateReference entity. replaceRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RebateReference entity. updatePartialRebateReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/rebate-references/{rebateReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RebateReference entity deleteRebateReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/vehicle-licenses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-licenses</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleLicense entities scoped by repairOrderKey. getVehicleLicenseByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-licenses</span> <br/>
        <span class="api-summary">Create a new VehicleLicense entity. createVehicleLicense</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/vehicle-licenses/{vehicleLicenseKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleLicense entity. getehicleLicenseById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Replace a VehicleLicense entity. replaceVehicleLicense</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleLicense entity. updatePartialVehicleLicense</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Delete a VehicleLicense entity deleteVehicleLicenseEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/labor-operation-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operation-events</span> <br/>
        <span class="api-summary">Retrieve a list of LaborOperationEvent entities scoped by repairOrderKey. getLaborOperationEventByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operation-events</span> <br/>
        <span class="api-summary">Create a new LaborOperationEvent entity. createLaborOperationEvent</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/labor-operation-events/{laborOperationEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LaborOperationEvent entity. getaborOperationEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Replace a LaborOperationEvent entity. replaceLaborOperationEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Partially update a LaborOperationEvent entity. updatePartialLaborOperationEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Delete a LaborOperationEvent entity deleteLaborOperationEventEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/tax-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/tax-splits</span> <br/>
        <span class="api-summary">Retrieve a list of TaxSplit entities scoped by repairOrderKey. getTaxSplitByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/tax-splits</span> <br/>
        <span class="api-summary">Create a new TaxSplit entity. createTaxSplit</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/tax-splits/{taxSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TaxSplit entity. getaxSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Replace a TaxSplit entity. replaceTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Partially update a TaxSplit entity. updatePartialTaxSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/tax-splits/{taxSplitKey}</span> <br/>
        <span class="api-summary">Delete a TaxSplit entity deleteTaxSplitEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/labor-resources
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-resources</span> <br/>
        <span class="api-summary">Retrieve a list of LaborResource entities scoped by repairOrderKey. getLaborResourceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-resources</span> <br/>
        <span class="api-summary">Create a new LaborResource entity. createLaborResource</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/labor-resources/{laborResourceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LaborResource entity. getaborResourceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Replace a LaborResource entity. replaceLaborResource</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Partially update a LaborResource entity. updatePartialLaborResource</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Delete a LaborResource entity deleteLaborResourceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/medias
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/medias</span> <br/>
        <span class="api-summary">Retrieve a list of Media entities scoped by repairOrderKey. getMediaByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/medias</span> <br/>
        <span class="api-summary">Create a new Media entity. createMedia</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/medias/{mediaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Media entity. getediaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Replace a Media entity. replaceMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Partially update a Media entity. updatePartialMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Delete a Media entity deleteMediaEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/price-plan-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/price-plan-references</span> <br/>
        <span class="api-summary">Retrieve a list of PricePlanReference entities scoped by repairOrderKey. getPricePlanReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/price-plan-references</span> <br/>
        <span class="api-summary">Create a new PricePlanReference entity. createPricePlanReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/price-plan-references/{pricePlanReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlanReference entity. getricePlanReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PricePlanReference entity. replacePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlanReference entity. updatePartialPricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PricePlanReference entity deletePricePlanReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/inspections
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/inspections</span> <br/>
        <span class="api-summary">Retrieve a list of Inspection entities scoped by repairOrderKey. getInspectionByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/inspections</span> <br/>
        <span class="api-summary">Create a new Inspection entity. createInspection</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/inspections/{inspectionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/inspections/{inspectionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Inspection entity. getnspectionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/inspections/{inspectionKey}</span> <br/>
        <span class="api-summary">Replace a Inspection entity. replaceInspection</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/inspections/{inspectionKey}</span> <br/>
        <span class="api-summary">Partially update a Inspection entity. updatePartialInspection</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/inspections/{inspectionKey}</span> <br/>
        <span class="api-summary">Delete a Inspection entity deleteInspectionEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference entities scoped by repairOrderKey. getControlAccountReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference entity. createControlAccountReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference entity. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference entity. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference entity. updatePartialControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference entity deleteControlAccountReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/reward-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/reward-references</span> <br/>
        <span class="api-summary">Retrieve a list of RewardReference entities scoped by repairOrderKey. getRewardReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/reward-references</span> <br/>
        <span class="api-summary">Create a new RewardReference entity. createRewardReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/reward-references/{rewardReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RewardReference entity. getewardReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Replace a RewardReference entity. replaceRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a RewardReference entity. updatePartialRewardReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/reward-references/{rewardReferenceKey}</span> <br/>
        <span class="api-summary">Delete a RewardReference entity deleteRewardReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/currency-exchanges
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/currency-exchanges</span> <br/>
        <span class="api-summary">Retrieve a list of CurrencyExchange entities scoped by repairOrderKey. getCurrencyExchangeByRepairOrderKey</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/currency-exchanges/{currencyExchangeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/currency-exchanges/{currencyExchangeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CurrencyExchange entity. geturrencyExchangeById</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/media-access-metrics
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/media-access-metrics</span> <br/>
        <span class="api-summary">Retrieve a list of MediaAccessMetric entities scoped by repairOrderKey. getMediaAccessMetricByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/media-access-metrics</span> <br/>
        <span class="api-summary">Create a new MediaAccessMetric entity. createMediaAccessMetric</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/media-access-metrics/{mediaAccessMetricKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/media-access-metrics/{mediaAccessMetricKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MediaAccessMetric entity. getediaAccessMetricById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/media-access-metrics/{mediaAccessMetricKey}</span> <br/>
        <span class="api-summary">Replace a MediaAccessMetric entity. replaceMediaAccessMetric</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/media-access-metrics/{mediaAccessMetricKey}</span> <br/>
        <span class="api-summary">Partially update a MediaAccessMetric entity. updatePartialMediaAccessMetric</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/media-access-metrics/{mediaAccessMetricKey}</span> <br/>
        <span class="api-summary">Delete a MediaAccessMetric entity deleteMediaAccessMetricEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/bill-of-material-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/bill-of-material-references</span> <br/>
        <span class="api-summary">Retrieve a list of BillOfMaterialReference entities scoped by repairOrderKey. getBillOfMaterialReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/bill-of-material-references</span> <br/>
        <span class="api-summary">Create a new BillOfMaterialReference entity. createBillOfMaterialReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/bill-of-material-references/{billOfMaterialReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific BillOfMaterialReference entity. getillOfMaterialReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Replace a BillOfMaterialReference entity. replaceBillOfMaterialReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a BillOfMaterialReference entity. updatePartialBillOfMaterialReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Delete a BillOfMaterialReference entity deleteBillOfMaterialReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by repairOrderKey. getPriceByRepairOrderKey</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/appointment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/appointment-references</span> <br/>
        <span class="api-summary">Retrieve a list of AppointmentReference entities scoped by repairOrderKey. getAppointmentReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/appointment-references</span> <br/>
        <span class="api-summary">Create a new AppointmentReference entity. createAppointmentReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/appointment-references/{appointmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/appointment-references/{appointmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AppointmentReference entity. getppointmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/appointment-references/{appointmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AppointmentReference entity. replaceAppointmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/appointment-references/{appointmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AppointmentReference entity. updatePartialAppointmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/appointment-references/{appointmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AppointmentReference entity deleteAppointmentReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/financial-split-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-split-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplitReference entities scoped by repairOrderKey. getFinancialSplitReferenceByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-split-references</span> <br/>
        <span class="api-summary">Create a new FinancialSplitReference entity. createFinancialSplitReference</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/financial-split-references/{financialSplitReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplitReference entity. getinancialSplitReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplitReference entity. replaceFinancialSplitReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplitReference entity. updatePartialFinancialSplitReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplitReference entity deleteFinancialSplitReferenceEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail entities scoped by repairOrderKey. getTextualDetailByRepairOrderKey</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail entity. getextualDetailById</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/financial-splits
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-splits</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplit entities scoped by repairOrderKey. getFinancialSplitByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-splits</span> <br/>
        <span class="api-summary">Create a new FinancialSplit entity. createFinancialSplit</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/financial-splits/{financialSplitKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplit entity. getinancialSplitById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplit entity. replaceFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplit entity. updatePartialFinancialSplit</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/financial-splits/{financialSplitKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplit entity deleteFinancialSplitEntity</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/vehicle-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleIdentifier entities scoped by repairOrderKey. getVehicleIdentifierByRepairOrderKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Create a new VehicleIdentifier entity. createVehicleIdentifier</span>
    </span>
</div>

### /repair-orders/{repairOrderKey}/vehicle-identifiers/{vehicleIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleIdentifier entity. getehicleIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a VehicleIdentifier entity. replaceVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleIdentifier entity. updatePartialVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/repair-orders/{repairOrderKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a VehicleIdentifier entity deleteVehicleIdentifierEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under RepairOrderroot with key {RepairOrderKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **repair-order** | /repair-orders | listRepairOrder | createRepairOrder | getRepairOrder | updateRepairOrder | deleteRepairOrder |
    | **locale** | /repair-orders/{repairOrderKey}/locales | listLocaleByRepairOrderKey | createLocale | getLocaleByRepairOrderKey | updateLocaleByRepairOrderKey | deleteLocaleByRepairOrderKey |
    | **discount-reference** | /repair-orders/{repairOrderKey}/discount-references | listDiscountReferenceByRepairOrderKey | createDiscountReference | getDiscountReferenceByRepairOrderKey | updateDiscountReferenceByRepairOrderKey | deleteDiscountReferenceByRepairOrderKey |
    | **time-slot** | /repair-orders/{repairOrderKey}/time-slots | listTimeSlotByRepairOrderKey |  | getTimeSlotByRepairOrderKey | updateTimeSlotByRepairOrderKey | deleteTimeSlotByRepairOrderKey |
    | **financial-category-reference** | /repair-orders/{repairOrderKey}/financial-category-references | listFinancialCategoryReferenceByRepairOrderKey | createFinancialCategoryReference | getFinancialCategoryReferenceByRepairOrderKey | updateFinancialCategoryReferenceByRepairOrderKey | deleteFinancialCategoryReferenceByRepairOrderKey |
    | **fee-reference** | /repair-orders/{repairOrderKey}/fee-references | listFeeReferenceByRepairOrderKey | createFeeReference | getFeeReferenceByRepairOrderKey | updateFeeReferenceByRepairOrderKey | deleteFeeReferenceByRepairOrderKey |
    | **party-reference** | /repair-orders/{repairOrderKey}/party-references | listPartyReferenceByRepairOrderKey | createPartyReference | getPartyReferenceByRepairOrderKey | updatePartyReferenceByRepairOrderKey | deletePartyReferenceByRepairOrderKey |
    | **staff-assignment-reference** | /repair-orders/{repairOrderKey}/staff-assignment-references | listStaffAssignmentReferenceByRepairOrderKey | createStaffAssignmentReference | getStaffAssignmentReferenceByRepairOrderKey | updateStaffAssignmentReferenceByRepairOrderKey | deleteStaffAssignmentReferenceByRepairOrderKey |
    | **money** | /repair-orders/{repairOrderKey}/money | listMoneyByRepairOrderKey |  | getMoneyByRepairOrderKey | updateMoneyByRepairOrderKey | deleteMoneyByRepairOrderKey |
    | **metric-value** | /repair-orders/{repairOrderKey}/metric-values | listMetricValueByRepairOrderKey | createMetricValue | getMetricValueByRepairOrderKey | updateMetricValueByRepairOrderKey | deleteMetricValueByRepairOrderKey |
    | **identifier** | /repair-orders/{repairOrderKey}/identifiers | listIdentifierByRepairOrderKey |  | getIdentifierByRepairOrderKey | updateIdentifierByRepairOrderKey | deleteIdentifierByRepairOrderKey |
    | **effective-period** | /repair-orders/{repairOrderKey}/effective-periods | listEffectivePeriodByRepairOrderKey |  | getEffectivePeriodByRepairOrderKey | updateEffectivePeriodByRepairOrderKey | deleteEffectivePeriodByRepairOrderKey |
    | **credit-reference** | /repair-orders/{repairOrderKey}/credit-references | listCreditReferenceByRepairOrderKey | createCreditReference | getCreditReferenceByRepairOrderKey | updateCreditReferenceByRepairOrderKey | deleteCreditReferenceByRepairOrderKey |
    | **labor-operation** | /repair-orders/{repairOrderKey}/labor-operations | listLaborOperationByRepairOrderKey | createLaborOperation | getLaborOperationByRepairOrderKey | updateLaborOperationByRepairOrderKey | deleteLaborOperationByRepairOrderKey |
    | **rebate-reference** | /repair-orders/{repairOrderKey}/rebate-references | listRebateReferenceByRepairOrderKey | createRebateReference | getRebateReferenceByRepairOrderKey | updateRebateReferenceByRepairOrderKey | deleteRebateReferenceByRepairOrderKey |
    | **vehicle-license** | /repair-orders/{repairOrderKey}/vehicle-licenses | listVehicleLicenseByRepairOrderKey | createVehicleLicense | getVehicleLicenseByRepairOrderKey | updateVehicleLicenseByRepairOrderKey | deleteVehicleLicenseByRepairOrderKey |
    | **labor-operation-event** | /repair-orders/{repairOrderKey}/labor-operation-events | listLaborOperationEventByRepairOrderKey | createLaborOperationEvent | getLaborOperationEventByRepairOrderKey | updateLaborOperationEventByRepairOrderKey | deleteLaborOperationEventByRepairOrderKey |
    | **tax-split** | /repair-orders/{repairOrderKey}/tax-splits | listTaxSplitByRepairOrderKey | createTaxSplit | getTaxSplitByRepairOrderKey | updateTaxSplitByRepairOrderKey | deleteTaxSplitByRepairOrderKey |
    | **labor-resource** | /repair-orders/{repairOrderKey}/labor-resources | listLaborResourceByRepairOrderKey | createLaborResource | getLaborResourceByRepairOrderKey | updateLaborResourceByRepairOrderKey | deleteLaborResourceByRepairOrderKey |
    | **media** | /repair-orders/{repairOrderKey}/medias | listMediaByRepairOrderKey | createMedia | getMediaByRepairOrderKey | updateMediaByRepairOrderKey | deleteMediaByRepairOrderKey |
    | **price-plan-reference** | /repair-orders/{repairOrderKey}/price-plan-references | listPricePlanReferenceByRepairOrderKey | createPricePlanReference | getPricePlanReferenceByRepairOrderKey | updatePricePlanReferenceByRepairOrderKey | deletePricePlanReferenceByRepairOrderKey |
    | **inspection** | /repair-orders/{repairOrderKey}/inspections | listInspectionByRepairOrderKey | createInspection | getInspectionByRepairOrderKey | updateInspectionByRepairOrderKey | deleteInspectionByRepairOrderKey |
    | **control-account-reference** | /repair-orders/{repairOrderKey}/control-account-references | listControlAccountReferenceByRepairOrderKey | createControlAccountReference | getControlAccountReferenceByRepairOrderKey | updateControlAccountReferenceByRepairOrderKey | deleteControlAccountReferenceByRepairOrderKey |
    | **reward-reference** | /repair-orders/{repairOrderKey}/reward-references | listRewardReferenceByRepairOrderKey | createRewardReference | getRewardReferenceByRepairOrderKey | updateRewardReferenceByRepairOrderKey | deleteRewardReferenceByRepairOrderKey |
    | **currency-exchange** | /repair-orders/{repairOrderKey}/currency-exchanges | listCurrencyExchangeByRepairOrderKey |  | getCurrencyExchangeByRepairOrderKey | updateCurrencyExchangeByRepairOrderKey | deleteCurrencyExchangeByRepairOrderKey |
    | **media-access-metric** | /repair-orders/{repairOrderKey}/media-access-metrics | listMediaAccessMetricByRepairOrderKey | createMediaAccessMetric | getMediaAccessMetricByRepairOrderKey | updateMediaAccessMetricByRepairOrderKey | deleteMediaAccessMetricByRepairOrderKey |
    | **bill-of-material-reference** | /repair-orders/{repairOrderKey}/bill-of-material-references | listBillOfMaterialReferenceByRepairOrderKey | createBillOfMaterialReference | getBillOfMaterialReferenceByRepairOrderKey | updateBillOfMaterialReferenceByRepairOrderKey | deleteBillOfMaterialReferenceByRepairOrderKey |
    | **price** | /repair-orders/{repairOrderKey}/prices | listPriceByRepairOrderKey |  | getPriceByRepairOrderKey | updatePriceByRepairOrderKey | deletePriceByRepairOrderKey |
    | **appointment-reference** | /repair-orders/{repairOrderKey}/appointment-references | listAppointmentReferenceByRepairOrderKey | createAppointmentReference | getAppointmentReferenceByRepairOrderKey | updateAppointmentReferenceByRepairOrderKey | deleteAppointmentReferenceByRepairOrderKey |
    | **financial-split-reference** | /repair-orders/{repairOrderKey}/financial-split-references | listFinancialSplitReferenceByRepairOrderKey | createFinancialSplitReference | getFinancialSplitReferenceByRepairOrderKey | updateFinancialSplitReferenceByRepairOrderKey | deleteFinancialSplitReferenceByRepairOrderKey |
    | **textual-detail** | /repair-orders/{repairOrderKey}/textual-details | listTextualDetailByRepairOrderKey |  | getTextualDetailByRepairOrderKey | updateTextualDetailByRepairOrderKey | deleteTextualDetailByRepairOrderKey |
    | **financial-split** | /repair-orders/{repairOrderKey}/financial-splits | listFinancialSplitByRepairOrderKey | createFinancialSplit | getFinancialSplitByRepairOrderKey | updateFinancialSplitByRepairOrderKey | deleteFinancialSplitByRepairOrderKey |
    | **vehicle-identifier** | /repair-orders/{repairOrderKey}/vehicle-identifiers | listVehicleIdentifierByRepairOrderKey | createVehicleIdentifier | getVehicleIdentifierByRepairOrderKey | updateVehicleIdentifierByRepairOrderKey | deleteVehicleIdentifierByRepairOrderKey |

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

## Bulk Create RepairOrder (`POST /repairorders/batch`)

The `/repairorders/batch` endpoint allows you to create multiple RepairOrder entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of RepairOrder and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `RepairOrderCreate` schema.

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

Contains the full objects of the RepairOrder that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A RepairOrder with SKU W-002 already exists."
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

## Health Check (`GET /repairorders/health`)

The `/repairorders/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the RepairOrder aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## RepairOrder Commands and State Management

The repairorders API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /repairorders/{RepairOrderKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a RepairOrder (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /repairorders/{RepairOrderKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /repairorders/capabilities`)

Before sending a command, you can "discover" what actions are valid for a RepairOrder based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the RepairOrder must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelRepairOrder` | `CREATED`, `ACTIVE` | `DELETED` | Voids the RepairOrder . |
| `ActivateRepairOrder` | `PENDING` | `ACTIVE` | Moves a RepairOrder into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |
