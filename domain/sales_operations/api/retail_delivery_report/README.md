## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **AddressReference**, **ColorDetail**, **CreditApplicationReference**, **Efficiency**, **Insurance**, **InsuranceTerm**, **LeaseTerm**, **ManifestItem**, **Media**, **MediaAccessMetric**, **MetricValue**, **PartyReference**, **PolicyHolder**, **Position**, **RetailDeliveryReport**, **ShipmentReference**, **Vehicle**, **VehicleComponent**, **VehicleEconomy**, **VehicleIdentifier**, **VehicleLicense**, **VehicleMedia**, **VehicleOption**, **VehiclePriceSummary**, **VehicleSpecification**, **Warranty**, **WarrantyCoverage**, **WarrantyTerm**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **sales_operations** and **RetailDeliveryReport** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **RetailDeliveryReport** | /retail-delivery-reports | Manages RetailDeliveryReports |
    | **Locale** | /retail-delivery-reports/{retailDeliveryReportKey}/locales | Manages Locales belonging to RetailDeliveryReports |
    | **VehicleComponent** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-components | Manages VehicleComponents belonging to RetailDeliveryReports |
    | **ManifestItem** | /retail-delivery-reports/{retailDeliveryReportKey}/manifest-items | Manages ManifestItems belonging to RetailDeliveryReports |
    | **VehicleEconomie** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-economies | Manages VehicleEconomies belonging to RetailDeliveryReports |
    | **VehiclePriceSummarie** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-price-summaries | Manages VehiclePriceSummaries belonging to RetailDeliveryReports |
    | **VehicleEvent** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-events | Manages VehicleEvents belonging to RetailDeliveryReports |
    | **AddressReference** | /retail-delivery-reports/{retailDeliveryReportKey}/address-references | Manages AddressReferences belonging to RetailDeliveryReports |
    | **Vehicle** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicles | Manages Vehicles belonging to RetailDeliveryReports |
    | **PartyReference** | /retail-delivery-reports/{retailDeliveryReportKey}/party-references | Manages PartyReferences belonging to RetailDeliveryReports |
    | **MetricValue** | /retail-delivery-reports/{retailDeliveryReportKey}/metric-values | Manages MetricValues belonging to RetailDeliveryReports |
    | **Identifier** | /retail-delivery-reports/{retailDeliveryReportKey}/identifiers | Manages Identifiers belonging to RetailDeliveryReports |
    | **EffectivePeriod** | /retail-delivery-reports/{retailDeliveryReportKey}/effective-periods | Manages EffectivePeriods belonging to RetailDeliveryReports |
    | **LifecycleEvent** | /retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-events | Manages LifecycleEvents belonging to RetailDeliveryReports |
    | **VehicleSpecification** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-specifications | Manages VehicleSpecifications belonging to RetailDeliveryReports |
    | **LeaseTerm** | /retail-delivery-reports/{retailDeliveryReportKey}/lease-terms | Manages LeaseTerms belonging to RetailDeliveryReports |
    | **Warrantie** | /retail-delivery-reports/{retailDeliveryReportKey}/warranties | Manages Warranties belonging to RetailDeliveryReports |
    | **ShipmentReference** | /retail-delivery-reports/{retailDeliveryReportKey}/shipment-references | Manages ShipmentReferences belonging to RetailDeliveryReports |
    | **VehicleLicense** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-licenses | Manages VehicleLicenses belonging to RetailDeliveryReports |
    | **UnitOfMeasure** | /retail-delivery-reports/{retailDeliveryReportKey}/unit-of-measures | Manages UnitOfMeasures belonging to RetailDeliveryReports |
    | **Position** | /retail-delivery-reports/{retailDeliveryReportKey}/positions | Manages Positions belonging to RetailDeliveryReports |
    | **Media** | /retail-delivery-reports/{retailDeliveryReportKey}/medias | Manages Medias belonging to RetailDeliveryReports |
    | **LifecyclePulse** | /retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-pulses | Manages LifecyclePulses belonging to RetailDeliveryReports |
    | **Manifest** | /retail-delivery-reports/{retailDeliveryReportKey}/manifests | Manages Manifests belonging to RetailDeliveryReports |
    | **VehicleMedia** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-medias | Manages VehicleMedias belonging to RetailDeliveryReports |
    | **CreditApplicationReference** | /retail-delivery-reports/{retailDeliveryReportKey}/credit-application-references | Manages CreditApplicationReferences belonging to RetailDeliveryReports |
    | **EventMessage** | /retail-delivery-reports/{retailDeliveryReportKey}/event-messages | Manages EventMessages belonging to RetailDeliveryReports |
    | **Price** | /retail-delivery-reports/{retailDeliveryReportKey}/prices | Manages Prices belonging to RetailDeliveryReports |
    | **Insurance** | /retail-delivery-reports/{retailDeliveryReportKey}/insurances | Manages Insurances belonging to RetailDeliveryReports |
    | **PriceSummarie** | /retail-delivery-reports/{retailDeliveryReportKey}/price-summaries | Manages PriceSummaries belonging to RetailDeliveryReports |
    | **VehicleOption** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-options | Manages VehicleOptions belonging to RetailDeliveryReports |
    | **ColorDetail** | /retail-delivery-reports/{retailDeliveryReportKey}/color-details | Manages ColorDetails belonging to RetailDeliveryReports |
    | **VehicleIdentifier** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-identifiers | Manages VehicleIdentifiers belonging to RetailDeliveryReports |


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
> `https://[Your-API-Host]/retaildeliveryreports`

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
💠 **ApplicationStatusTypes** : types of application status.<br/>
💠 **CabTypes** : types of cabs.<br/>
💠 **ControlAccountTypes** : types of control accounts.<br/>
💠 **DealStatusTypes** : types of deal status.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **EngineTypes** : types of engines.<br/>
💠 **EventMessageTypes** : types of event messages.<br/>
💠 **FuelTypes** : types of fuels.<br/>
💠 **InsuranceTypes** : types of insurances.<br/>
💠 **LeadStatusTypes** : types of lead status.<br/>
💠 **LifecycleEventTypes** : types of lifecycle events.<br/>
💠 **LifecyclePulseTypes** : types of lifecycle pulses.<br/>
💠 **MediaDeliveryMethodTypes** : types of media delivery methods.<br/>
💠 **MediaFormatTypes** : types of media formats.<br/>
💠 **MediaTypes** : types of medias.<br/>
💠 **MediaUsageTypes** : types of media usages.<br/>
💠 **NarrativeUomTypes** : types of narrative uoms.<br/>
💠 **OemRdrStatusTypes** : types of oem rdr status.<br/>
💠 **OptionTypes** : types of options.<br/>
💠 **OrderCategoryTypes** : types of order categorys.<br/>
💠 **PartConditionTypes** : types of part conditions.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PartyTypes** : types of partys.<br/>
💠 **PayTypes** : types of pays.<br/>
💠 **PaymentTypes** : types of payments.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **ProductStateTypes** : types of product states.<br/>
💠 **ProductTypes** : types of products.<br/>
💠 **PurchaseTypes** : types of purchases.<br/>
💠 **ResourceTypes** : types of resources.<br/>
💠 **StaffRoleTypes** : types of staff roles.<br/>
💠 **UOMLengthTypes** : types of u o m lengths.<br/>
💠 **UOMQuantityCategoryTypes** : types of u o m quantity categorys.<br/>
💠 **VehicleBodyStyleTypes** : types of vehicle body styles.<br/>
💠 **VehicleCategoryTypes** : types of vehicle categorys.<br/>
💠 **VehicleHistoryEventTypes** : types of vehicle history events.<br/>
💠 **VehicleResourceTypes** : types of vehicle resources.<br/>
💠 **InventoryStatusTypes** : entity<br/>
💠 **DeviceTypes** : entity<br/>
💠 **DaysOfWeekTypes** : Status of the account<br/>
💠 **TimeslotDirectiveTypes** : Represents the directive for a timeslot.<br/>
💠 **WarrantyTermTypes** : Types of warranty options or contracts.<br/>
💠 **WarrantyOptionTypes** : Types of warranty options or contracts.<br/>

## ✅ Entities

---

✅ **CurrencyExchange** : CurrencyExchange that includes display value, currency, locale, and value, along with tax and cost components.<br/>
✅ **EffectivePeriod** : Effective Period<br/>
✅ **EventMessage** : narrative of conversation<br/>
✅ **Identifier** : External system identifier<br/>
✅ **LifecycleEvent** : Lifecycle Event<br/>
✅ **LifecyclePulse** : Represents a single chronological point in an entity's lifecycle.<br/>
✅ **Link** : Represents a Hypermedia as the Engine of Application State (HATEOS) link, providing information on how to interact with a related resource.<br/>
✅ **Locale** : not nullable<br/>
✅ **Manifest** : External system manifest<br/>
✅ **Price** : Price that includes display value, currency, locale, and value, along with tax and cost components.<br/>
✅ **PriceSummary** : Summarizes the financial totals and pricing components of a payment term.<br/>
✅ **TimeSlot** : Range of time for the appointment including start/end times, recurring patterns, and directives.<br/>
✅ **UnitOfMeasure** : value price with unit of measure<br/>
✅ **VehicleEvent** : Represents a historical event related to a vehicle, such as a maintenance record, a sale, or an accident.<br/>

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


### /retail-delivery-reports
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports</span> <br/>
        <span class="api-summary">Retrieve a list of RetailDeliveryReport entities. getRetailDeliveryReport</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports</span> <br/>
        <span class="api-summary">Create a new RetailDeliveryReport entity. createRetailDeliveryReport</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RetailDeliveryReport entity. getetailDeliveryReportById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}</span> <br/>
        <span class="api-summary">Replace a RetailDeliveryReport entity. replaceRetailDeliveryReport</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}</span> <br/>
        <span class="api-summary">Partially update a RetailDeliveryReport entity. updatePartialRetailDeliveryReport</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}</span> <br/>
        <span class="api-summary">Delete a RetailDeliveryReport entity deleteRetailDeliveryReportEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/locales
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/locales</span> <br/>
        <span class="api-summary">Retrieve a list of Locale entities scoped by retailDeliveryReportKey. getLocaleByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/locales/{localeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Locale entity. getocaleById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-components
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-components</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleComponent entities scoped by retailDeliveryReportKey. getVehicleComponentByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-components</span> <br/>
        <span class="api-summary">Create a new VehicleComponent entity. createVehicleComponent</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-components/{vehicleComponentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-components/{vehicleComponentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleComponent entity. getehicleComponentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-components/{vehicleComponentKey}</span> <br/>
        <span class="api-summary">Replace a VehicleComponent entity. replaceVehicleComponent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-components/{vehicleComponentKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleComponent entity. updatePartialVehicleComponent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-components/{vehicleComponentKey}</span> <br/>
        <span class="api-summary">Delete a VehicleComponent entity deleteVehicleComponentEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/manifest-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/manifest-items</span> <br/>
        <span class="api-summary">Retrieve a list of ManifestItem entities scoped by retailDeliveryReportKey. getManifestItemByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/manifest-items</span> <br/>
        <span class="api-summary">Create a new ManifestItem entity. createManifestItem</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/manifest-items/{manifestItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ManifestItem entity. getanifestItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Replace a ManifestItem entity. replaceManifestItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Partially update a ManifestItem entity. updatePartialManifestItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Delete a ManifestItem entity deleteManifestItemEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-economies
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-economies</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleEconomy entities scoped by retailDeliveryReportKey. getVehicleEconomyByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-economies</span> <br/>
        <span class="api-summary">Create a new VehicleEconomy entity. createVehicleEconomy</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-economies/{vehicleEconomyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-economies/{vehicleEconomyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleEconomy entity. getehicleEconomyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-economies/{vehicleEconomyKey}</span> <br/>
        <span class="api-summary">Replace a VehicleEconomy entity. replaceVehicleEconomy</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-economies/{vehicleEconomyKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleEconomy entity. updatePartialVehicleEconomy</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-economies/{vehicleEconomyKey}</span> <br/>
        <span class="api-summary">Delete a VehicleEconomy entity deleteVehicleEconomyEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-price-summaries
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-price-summaries</span> <br/>
        <span class="api-summary">Retrieve a list of VehiclePriceSummary entities scoped by retailDeliveryReportKey. getVehiclePriceSummaryByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-price-summaries</span> <br/>
        <span class="api-summary">Create a new VehiclePriceSummary entity. createVehiclePriceSummary</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-price-summaries/{vehiclePriceSummaryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-price-summaries/{vehiclePriceSummaryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehiclePriceSummary entity. getehiclePriceSummaryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-price-summaries/{vehiclePriceSummaryKey}</span> <br/>
        <span class="api-summary">Replace a VehiclePriceSummary entity. replaceVehiclePriceSummary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-price-summaries/{vehiclePriceSummaryKey}</span> <br/>
        <span class="api-summary">Partially update a VehiclePriceSummary entity. updatePartialVehiclePriceSummary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-price-summaries/{vehiclePriceSummaryKey}</span> <br/>
        <span class="api-summary">Delete a VehiclePriceSummary entity deleteVehiclePriceSummaryEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-events</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleEvent entities scoped by retailDeliveryReportKey. getVehicleEventByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-events/{vehicleEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-events/{vehicleEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleEvent entity. getehicleEventById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference entities scoped by retailDeliveryReportKey. getAddressReferenceByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference entity. createAddressReference</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference entity. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference entity. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference entity. updatePartialAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference entity deleteAddressReferenceEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicles</span> <br/>
        <span class="api-summary">Retrieve a list of Vehicle entities scoped by retailDeliveryReportKey. getVehicleByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicles</span> <br/>
        <span class="api-summary">Create a new Vehicle entity. createVehicle</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicles/{vehicleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicles/{vehicleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Vehicle entity. getehicleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicles/{vehicleKey}</span> <br/>
        <span class="api-summary">Replace a Vehicle entity. replaceVehicle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicles/{vehicleKey}</span> <br/>
        <span class="api-summary">Partially update a Vehicle entity. updatePartialVehicle</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicles/{vehicleKey}</span> <br/>
        <span class="api-summary">Delete a Vehicle entity deleteVehicleEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/party-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/party-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartyReference entities scoped by retailDeliveryReportKey. getPartyReferenceByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/party-references</span> <br/>
        <span class="api-summary">Create a new PartyReference entity. createPartyReference</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/party-references/{partyReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyReference entity. getartyReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartyReference entity. replacePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartyReference entity. updatePartialPartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartyReference entity deletePartyReferenceEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/metric-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/metric-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricValue entities scoped by retailDeliveryReportKey. getMetricValueByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/metric-values</span> <br/>
        <span class="api-summary">Create a new MetricValue entity. createMetricValue</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/metric-values/{metricValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricValue entity. getetricValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricValue entity. replaceMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricValue entity. updatePartialMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricValue entity deleteMetricValueEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by retailDeliveryReportKey. getIdentifierByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by retailDeliveryReportKey. getEffectivePeriodByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-events</span> <br/>
        <span class="api-summary">Retrieve a list of LifecycleEvent entities scoped by retailDeliveryReportKey. getLifecycleEventByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-events/{lifecycleEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-events/{lifecycleEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LifecycleEvent entity. getifecycleEventById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-specifications
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-specifications</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleSpecification entities scoped by retailDeliveryReportKey. getVehicleSpecificationByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-specifications</span> <br/>
        <span class="api-summary">Create a new VehicleSpecification entity. createVehicleSpecification</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-specifications/{vehicleSpecificationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-specifications/{vehicleSpecificationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleSpecification entity. getehicleSpecificationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-specifications/{vehicleSpecificationKey}</span> <br/>
        <span class="api-summary">Replace a VehicleSpecification entity. replaceVehicleSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-specifications/{vehicleSpecificationKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleSpecification entity. updatePartialVehicleSpecification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-specifications/{vehicleSpecificationKey}</span> <br/>
        <span class="api-summary">Delete a VehicleSpecification entity deleteVehicleSpecificationEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/lease-terms
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/lease-terms</span> <br/>
        <span class="api-summary">Retrieve a list of LeaseTerm entities scoped by retailDeliveryReportKey. getLeaseTermByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/lease-terms</span> <br/>
        <span class="api-summary">Create a new LeaseTerm entity. createLeaseTerm</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/lease-terms/{leaseTermKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/lease-terms/{leaseTermKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LeaseTerm entity. geteaseTermById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/lease-terms/{leaseTermKey}</span> <br/>
        <span class="api-summary">Replace a LeaseTerm entity. replaceLeaseTerm</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/lease-terms/{leaseTermKey}</span> <br/>
        <span class="api-summary">Partially update a LeaseTerm entity. updatePartialLeaseTerm</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/lease-terms/{leaseTermKey}</span> <br/>
        <span class="api-summary">Delete a LeaseTerm entity deleteLeaseTermEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/warranties
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/warranties</span> <br/>
        <span class="api-summary">Retrieve a list of Warranty entities scoped by retailDeliveryReportKey. getWarrantyByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/warranties</span> <br/>
        <span class="api-summary">Create a new Warranty entity. createWarranty</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/warranties/{warrantyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/warranties/{warrantyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Warranty entity. getarrantyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/warranties/{warrantyKey}</span> <br/>
        <span class="api-summary">Replace a Warranty entity. replaceWarranty</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/warranties/{warrantyKey}</span> <br/>
        <span class="api-summary">Partially update a Warranty entity. updatePartialWarranty</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/warranties/{warrantyKey}</span> <br/>
        <span class="api-summary">Delete a Warranty entity deleteWarrantyEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/shipment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/shipment-references</span> <br/>
        <span class="api-summary">Retrieve a list of ShipmentReference entities scoped by retailDeliveryReportKey. getShipmentReferenceByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/shipment-references</span> <br/>
        <span class="api-summary">Create a new ShipmentReference entity. createShipmentReference</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/shipment-references/{shipmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ShipmentReference entity. gethipmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ShipmentReference entity. replaceShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ShipmentReference entity. updatePartialShipmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/shipment-references/{shipmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ShipmentReference entity deleteShipmentReferenceEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-licenses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-licenses</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleLicense entities scoped by retailDeliveryReportKey. getVehicleLicenseByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-licenses</span> <br/>
        <span class="api-summary">Create a new VehicleLicense entity. createVehicleLicense</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-licenses/{vehicleLicenseKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleLicense entity. getehicleLicenseById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Replace a VehicleLicense entity. replaceVehicleLicense</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleLicense entity. updatePartialVehicleLicense</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Delete a VehicleLicense entity deleteVehicleLicenseEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/unit-of-measures
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/unit-of-measures</span> <br/>
        <span class="api-summary">Retrieve a list of UnitOfMeasure entities scoped by retailDeliveryReportKey. getUnitOfMeasureByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/unit-of-measures/{unitOfMeasureKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/unit-of-measures/{unitOfMeasureKey}</span> <br/>
        <span class="api-summary">Retrieve a specific UnitOfMeasure entity. getnitOfMeasureById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position entities scoped by retailDeliveryReportKey. getPositionByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position entity. createPosition</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position entity. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position entity. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position entity. updatePartialPosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position entity deletePositionEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/medias
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/medias</span> <br/>
        <span class="api-summary">Retrieve a list of Media entities scoped by retailDeliveryReportKey. getMediaByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/medias</span> <br/>
        <span class="api-summary">Create a new Media entity. createMedia</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/medias/{mediaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Media entity. getediaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Replace a Media entity. replaceMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Partially update a Media entity. updatePartialMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Delete a Media entity deleteMediaEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-pulses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-pulses</span> <br/>
        <span class="api-summary">Retrieve a list of LifecyclePulse entities scoped by retailDeliveryReportKey. getLifecyclePulseByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-pulses/{lifecyclePulseKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-pulses/{lifecyclePulseKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LifecyclePulse entity. getifecyclePulseById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/manifests
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/manifests</span> <br/>
        <span class="api-summary">Retrieve a list of Manifest entities scoped by retailDeliveryReportKey. getManifestByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/manifests/{manifestKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/manifests/{manifestKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Manifest entity. getanifestById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-medias
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-medias</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleMedia entities scoped by retailDeliveryReportKey. getVehicleMediaByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-medias</span> <br/>
        <span class="api-summary">Create a new VehicleMedia entity. createVehicleMedia</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-medias/{vehicleMediaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-medias/{vehicleMediaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleMedia entity. getehicleMediaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-medias/{vehicleMediaKey}</span> <br/>
        <span class="api-summary">Replace a VehicleMedia entity. replaceVehicleMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-medias/{vehicleMediaKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleMedia entity. updatePartialVehicleMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-medias/{vehicleMediaKey}</span> <br/>
        <span class="api-summary">Delete a VehicleMedia entity deleteVehicleMediaEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/credit-application-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/credit-application-references</span> <br/>
        <span class="api-summary">Retrieve a list of CreditApplicationReference entities scoped by retailDeliveryReportKey. getCreditApplicationReferenceByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/credit-application-references</span> <br/>
        <span class="api-summary">Create a new CreditApplicationReference entity. createCreditApplicationReference</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/credit-application-references/{creditApplicationReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/credit-application-references/{creditApplicationReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditApplicationReference entity. getreditApplicationReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/credit-application-references/{creditApplicationReferenceKey}</span> <br/>
        <span class="api-summary">Replace a CreditApplicationReference entity. replaceCreditApplicationReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/credit-application-references/{creditApplicationReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a CreditApplicationReference entity. updatePartialCreditApplicationReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/credit-application-references/{creditApplicationReferenceKey}</span> <br/>
        <span class="api-summary">Delete a CreditApplicationReference entity deleteCreditApplicationReferenceEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/event-messages
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/event-messages</span> <br/>
        <span class="api-summary">Retrieve a list of EventMessage entities scoped by retailDeliveryReportKey. getEventMessageByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/event-messages/{eventMessageKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/event-messages/{eventMessageKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EventMessage entity. getventMessageById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by retailDeliveryReportKey. getPriceByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/insurances
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/insurances</span> <br/>
        <span class="api-summary">Retrieve a list of Insurance entities scoped by retailDeliveryReportKey. getInsuranceByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/insurances</span> <br/>
        <span class="api-summary">Create a new Insurance entity. createInsurance</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/insurances/{insuranceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/insurances/{insuranceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Insurance entity. getnsuranceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/insurances/{insuranceKey}</span> <br/>
        <span class="api-summary">Replace a Insurance entity. replaceInsurance</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/insurances/{insuranceKey}</span> <br/>
        <span class="api-summary">Partially update a Insurance entity. updatePartialInsurance</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/insurances/{insuranceKey}</span> <br/>
        <span class="api-summary">Delete a Insurance entity deleteInsuranceEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/price-summaries
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/price-summaries</span> <br/>
        <span class="api-summary">Retrieve a list of PriceSummary entities scoped by retailDeliveryReportKey. getPriceSummaryByRetailDeliveryReportKey</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/price-summaries/{priceSummaryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/price-summaries/{priceSummaryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PriceSummary entity. getriceSummaryById</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-options
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-options</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleOption entities scoped by retailDeliveryReportKey. getVehicleOptionByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-options</span> <br/>
        <span class="api-summary">Create a new VehicleOption entity. createVehicleOption</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-options/{vehicleOptionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-options/{vehicleOptionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleOption entity. getehicleOptionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-options/{vehicleOptionKey}</span> <br/>
        <span class="api-summary">Replace a VehicleOption entity. replaceVehicleOption</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-options/{vehicleOptionKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleOption entity. updatePartialVehicleOption</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-options/{vehicleOptionKey}</span> <br/>
        <span class="api-summary">Delete a VehicleOption entity deleteVehicleOptionEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/color-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/color-details</span> <br/>
        <span class="api-summary">Retrieve a list of ColorDetail entities scoped by retailDeliveryReportKey. getColorDetailByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/color-details</span> <br/>
        <span class="api-summary">Create a new ColorDetail entity. createColorDetail</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/color-details/{colorDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/color-details/{colorDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ColorDetail entity. getolorDetailById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/color-details/{colorDetailKey}</span> <br/>
        <span class="api-summary">Replace a ColorDetail entity. replaceColorDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/color-details/{colorDetailKey}</span> <br/>
        <span class="api-summary">Partially update a ColorDetail entity. updatePartialColorDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/color-details/{colorDetailKey}</span> <br/>
        <span class="api-summary">Delete a ColorDetail entity deleteColorDetailEntity</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleIdentifier entities scoped by retailDeliveryReportKey. getVehicleIdentifierByRetailDeliveryReportKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Create a new VehicleIdentifier entity. createVehicleIdentifier</span>
    </span>
</div>

### /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-identifiers/{vehicleIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleIdentifier entity. getehicleIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a VehicleIdentifier entity. replaceVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleIdentifier entity. updatePartialVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/retail-delivery-reports/{retailDeliveryReportKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a VehicleIdentifier entity deleteVehicleIdentifierEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under RetailDeliveryReportroot with key {RetailDeliveryReportKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **retail-delivery-report** | /retail-delivery-reports | listRetailDeliveryReport | createRetailDeliveryReport | getRetailDeliveryReport | updateRetailDeliveryReport | deleteRetailDeliveryReport |
    | **locale** | /retail-delivery-reports/{retailDeliveryReportKey}/locales | listLocaleByRetailDeliveryReportKey |  | getLocaleByRetailDeliveryReportKey | updateLocaleByRetailDeliveryReportKey | deleteLocaleByRetailDeliveryReportKey |
    | **vehicle-component** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-components | listVehicleComponentByRetailDeliveryReportKey | createVehicleComponent | getVehicleComponentByRetailDeliveryReportKey | updateVehicleComponentByRetailDeliveryReportKey | deleteVehicleComponentByRetailDeliveryReportKey |
    | **manifest-item** | /retail-delivery-reports/{retailDeliveryReportKey}/manifest-items | listManifestItemByRetailDeliveryReportKey | createManifestItem | getManifestItemByRetailDeliveryReportKey | updateManifestItemByRetailDeliveryReportKey | deleteManifestItemByRetailDeliveryReportKey |
    | **vehicle-economie** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-economies | listVehicleEconomyByRetailDeliveryReportKey | createVehicleEconomy | getVehicleEconomyByRetailDeliveryReportKey | updateVehicleEconomyByRetailDeliveryReportKey | deleteVehicleEconomyByRetailDeliveryReportKey |
    | **vehicle-price-summarie** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-price-summaries | listVehiclePriceSummaryByRetailDeliveryReportKey | createVehiclePriceSummary | getVehiclePriceSummaryByRetailDeliveryReportKey | updateVehiclePriceSummaryByRetailDeliveryReportKey | deleteVehiclePriceSummaryByRetailDeliveryReportKey |
    | **vehicle-event** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-events | listVehicleEventByRetailDeliveryReportKey |  | getVehicleEventByRetailDeliveryReportKey | updateVehicleEventByRetailDeliveryReportKey | deleteVehicleEventByRetailDeliveryReportKey |
    | **address-reference** | /retail-delivery-reports/{retailDeliveryReportKey}/address-references | listAddressReferenceByRetailDeliveryReportKey | createAddressReference | getAddressReferenceByRetailDeliveryReportKey | updateAddressReferenceByRetailDeliveryReportKey | deleteAddressReferenceByRetailDeliveryReportKey |
    | **vehicle** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicles | listVehicleByRetailDeliveryReportKey | createVehicle | getVehicleByRetailDeliveryReportKey | updateVehicleByRetailDeliveryReportKey | deleteVehicleByRetailDeliveryReportKey |
    | **party-reference** | /retail-delivery-reports/{retailDeliveryReportKey}/party-references | listPartyReferenceByRetailDeliveryReportKey | createPartyReference | getPartyReferenceByRetailDeliveryReportKey | updatePartyReferenceByRetailDeliveryReportKey | deletePartyReferenceByRetailDeliveryReportKey |
    | **metric-value** | /retail-delivery-reports/{retailDeliveryReportKey}/metric-values | listMetricValueByRetailDeliveryReportKey | createMetricValue | getMetricValueByRetailDeliveryReportKey | updateMetricValueByRetailDeliveryReportKey | deleteMetricValueByRetailDeliveryReportKey |
    | **identifier** | /retail-delivery-reports/{retailDeliveryReportKey}/identifiers | listIdentifierByRetailDeliveryReportKey |  | getIdentifierByRetailDeliveryReportKey | updateIdentifierByRetailDeliveryReportKey | deleteIdentifierByRetailDeliveryReportKey |
    | **effective-period** | /retail-delivery-reports/{retailDeliveryReportKey}/effective-periods | listEffectivePeriodByRetailDeliveryReportKey |  | getEffectivePeriodByRetailDeliveryReportKey | updateEffectivePeriodByRetailDeliveryReportKey | deleteEffectivePeriodByRetailDeliveryReportKey |
    | **lifecycle-event** | /retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-events | listLifecycleEventByRetailDeliveryReportKey |  | getLifecycleEventByRetailDeliveryReportKey | updateLifecycleEventByRetailDeliveryReportKey | deleteLifecycleEventByRetailDeliveryReportKey |
    | **vehicle-specification** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-specifications | listVehicleSpecificationByRetailDeliveryReportKey | createVehicleSpecification | getVehicleSpecificationByRetailDeliveryReportKey | updateVehicleSpecificationByRetailDeliveryReportKey | deleteVehicleSpecificationByRetailDeliveryReportKey |
    | **lease-term** | /retail-delivery-reports/{retailDeliveryReportKey}/lease-terms | listLeaseTermByRetailDeliveryReportKey | createLeaseTerm | getLeaseTermByRetailDeliveryReportKey | updateLeaseTermByRetailDeliveryReportKey | deleteLeaseTermByRetailDeliveryReportKey |
    | **warrantie** | /retail-delivery-reports/{retailDeliveryReportKey}/warranties | listWarrantyByRetailDeliveryReportKey | createWarranty | getWarrantyByRetailDeliveryReportKey | updateWarrantyByRetailDeliveryReportKey | deleteWarrantyByRetailDeliveryReportKey |
    | **shipment-reference** | /retail-delivery-reports/{retailDeliveryReportKey}/shipment-references | listShipmentReferenceByRetailDeliveryReportKey | createShipmentReference | getShipmentReferenceByRetailDeliveryReportKey | updateShipmentReferenceByRetailDeliveryReportKey | deleteShipmentReferenceByRetailDeliveryReportKey |
    | **vehicle-license** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-licenses | listVehicleLicenseByRetailDeliveryReportKey | createVehicleLicense | getVehicleLicenseByRetailDeliveryReportKey | updateVehicleLicenseByRetailDeliveryReportKey | deleteVehicleLicenseByRetailDeliveryReportKey |
    | **unit-of-measure** | /retail-delivery-reports/{retailDeliveryReportKey}/unit-of-measures | listUnitOfMeasureByRetailDeliveryReportKey |  | getUnitOfMeasureByRetailDeliveryReportKey | updateUnitOfMeasureByRetailDeliveryReportKey | deleteUnitOfMeasureByRetailDeliveryReportKey |
    | **position** | /retail-delivery-reports/{retailDeliveryReportKey}/positions | listPositionByRetailDeliveryReportKey | createPosition | getPositionByRetailDeliveryReportKey | updatePositionByRetailDeliveryReportKey | deletePositionByRetailDeliveryReportKey |
    | **media** | /retail-delivery-reports/{retailDeliveryReportKey}/medias | listMediaByRetailDeliveryReportKey | createMedia | getMediaByRetailDeliveryReportKey | updateMediaByRetailDeliveryReportKey | deleteMediaByRetailDeliveryReportKey |
    | **lifecycle-pulse** | /retail-delivery-reports/{retailDeliveryReportKey}/lifecycle-pulses | listLifecyclePulseByRetailDeliveryReportKey |  | getLifecyclePulseByRetailDeliveryReportKey | updateLifecyclePulseByRetailDeliveryReportKey | deleteLifecyclePulseByRetailDeliveryReportKey |
    | **manifest** | /retail-delivery-reports/{retailDeliveryReportKey}/manifests | listManifestByRetailDeliveryReportKey |  | getManifestByRetailDeliveryReportKey | updateManifestByRetailDeliveryReportKey | deleteManifestByRetailDeliveryReportKey |
    | **vehicle-media** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-medias | listVehicleMediaByRetailDeliveryReportKey | createVehicleMedia | getVehicleMediaByRetailDeliveryReportKey | updateVehicleMediaByRetailDeliveryReportKey | deleteVehicleMediaByRetailDeliveryReportKey |
    | **credit-application-reference** | /retail-delivery-reports/{retailDeliveryReportKey}/credit-application-references | listCreditApplicationReferenceByRetailDeliveryReportKey | createCreditApplicationReference | getCreditApplicationReferenceByRetailDeliveryReportKey | updateCreditApplicationReferenceByRetailDeliveryReportKey | deleteCreditApplicationReferenceByRetailDeliveryReportKey |
    | **event-message** | /retail-delivery-reports/{retailDeliveryReportKey}/event-messages | listEventMessageByRetailDeliveryReportKey |  | getEventMessageByRetailDeliveryReportKey | updateEventMessageByRetailDeliveryReportKey | deleteEventMessageByRetailDeliveryReportKey |
    | **price** | /retail-delivery-reports/{retailDeliveryReportKey}/prices | listPriceByRetailDeliveryReportKey |  | getPriceByRetailDeliveryReportKey | updatePriceByRetailDeliveryReportKey | deletePriceByRetailDeliveryReportKey |
    | **insurance** | /retail-delivery-reports/{retailDeliveryReportKey}/insurances | listInsuranceByRetailDeliveryReportKey | createInsurance | getInsuranceByRetailDeliveryReportKey | updateInsuranceByRetailDeliveryReportKey | deleteInsuranceByRetailDeliveryReportKey |
    | **price-summarie** | /retail-delivery-reports/{retailDeliveryReportKey}/price-summaries | listPriceSummaryByRetailDeliveryReportKey |  | getPriceSummaryByRetailDeliveryReportKey | updatePriceSummaryByRetailDeliveryReportKey | deletePriceSummaryByRetailDeliveryReportKey |
    | **vehicle-option** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-options | listVehicleOptionByRetailDeliveryReportKey | createVehicleOption | getVehicleOptionByRetailDeliveryReportKey | updateVehicleOptionByRetailDeliveryReportKey | deleteVehicleOptionByRetailDeliveryReportKey |
    | **color-detail** | /retail-delivery-reports/{retailDeliveryReportKey}/color-details | listColorDetailByRetailDeliveryReportKey | createColorDetail | getColorDetailByRetailDeliveryReportKey | updateColorDetailByRetailDeliveryReportKey | deleteColorDetailByRetailDeliveryReportKey |
    | **vehicle-identifier** | /retail-delivery-reports/{retailDeliveryReportKey}/vehicle-identifiers | listVehicleIdentifierByRetailDeliveryReportKey | createVehicleIdentifier | getVehicleIdentifierByRetailDeliveryReportKey | updateVehicleIdentifierByRetailDeliveryReportKey | deleteVehicleIdentifierByRetailDeliveryReportKey |

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

## Bulk Create RetailDeliveryReport (`POST /retaildeliveryreports/batch`)

The `/retaildeliveryreports/batch` endpoint allows you to create multiple RetailDeliveryReport entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of RetailDeliveryReport and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `RetailDeliveryReportCreate` schema.

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

Contains the full objects of the RetailDeliveryReport that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A RetailDeliveryReport with SKU W-002 already exists."
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

## Health Check (`GET /retaildeliveryreports/health`)

The `/retaildeliveryreports/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the RetailDeliveryReport aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## RetailDeliveryReport Commands and State Management

The retaildeliveryreports API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /retaildeliveryreports/{RetailDeliveryReportKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a RetailDeliveryReport (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /retaildeliveryreports/{RetailDeliveryReportKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /retaildeliveryreports/capabilities`)

Before sending a command, you can "discover" what actions are valid for a RetailDeliveryReport based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the RetailDeliveryReport must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelRetailDeliveryReport` | `CREATED`, `ACTIVE` | `DELETED` | Voids the RetailDeliveryReport . |
| `ActivateRetailDeliveryReport` | `PENDING` | `ACTIVE` | Moves a RetailDeliveryReport into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |
