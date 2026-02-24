## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **AddressReference**, **AppointmentReference**, **BillOfMaterialReference**, **FinancialSplitReference**, **GeographicBoundaryReference**, **Inspection**, **LaborOperation**, **LaborOperationEvent**, **LaborResource**, **Locale**, **Manifest**, **ManifestItem**, **Media**, **MediaAccessMetric**, **MetricValue**, **MultiPointInspection**, **PartIdentifier**, **PartyReference**, **PricePlanReference**, **ServiceCatalogReferences**, **StaffAssignmentReference**, **StaffSkill**, **VehicleIdentifier**, **VehicleLicense**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **service** and **MultiPointInspection** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **MultiPointInspection** | /multi-point-inspections | Manages MultiPointInspections |
    | **Locale** | /multi-point-inspections/{multiPointInspectionKey}/locales | Manages Locales belonging to MultiPointInspections |
    | **ManifestItem** | /multi-point-inspections/{multiPointInspectionKey}/manifest-items | Manages ManifestItems belonging to MultiPointInspections |
    | **TimeSlot** | /multi-point-inspections/{multiPointInspectionKey}/time-slots | Manages TimeSlots belonging to MultiPointInspections |
    | **AddressReference** | /multi-point-inspections/{multiPointInspectionKey}/address-references | Manages AddressReferences belonging to MultiPointInspections |
    | **PartyReference** | /multi-point-inspections/{multiPointInspectionKey}/party-references | Manages PartyReferences belonging to MultiPointInspections |
    | **StaffAssignmentReference** | /multi-point-inspections/{multiPointInspectionKey}/staff-assignment-references | Manages StaffAssignmentReferences belonging to MultiPointInspections |
    | **Money** | /multi-point-inspections/{multiPointInspectionKey}/money | Manages Money belonging to MultiPointInspections |
    | **MetricValue** | /multi-point-inspections/{multiPointInspectionKey}/metric-values | Manages MetricValues belonging to MultiPointInspections |
    | **Identifier** | /multi-point-inspections/{multiPointInspectionKey}/identifiers | Manages Identifiers belonging to MultiPointInspections |
    | **EffectivePeriod** | /multi-point-inspections/{multiPointInspectionKey}/effective-periods | Manages EffectivePeriods belonging to MultiPointInspections |
    | **LaborOperation** | /multi-point-inspections/{multiPointInspectionKey}/labor-operations | Manages LaborOperations belonging to MultiPointInspections |
    | **VehicleLicense** | /multi-point-inspections/{multiPointInspectionKey}/vehicle-licenses | Manages VehicleLicenses belonging to MultiPointInspections |
    | **LaborOperationEvent** | /multi-point-inspections/{multiPointInspectionKey}/labor-operation-events | Manages LaborOperationEvents belonging to MultiPointInspections |
    | **LaborResource** | /multi-point-inspections/{multiPointInspectionKey}/labor-resources | Manages LaborResources belonging to MultiPointInspections |
    | **Media** | /multi-point-inspections/{multiPointInspectionKey}/medias | Manages Medias belonging to MultiPointInspections |
    | **PricePlanReference** | /multi-point-inspections/{multiPointInspectionKey}/price-plan-references | Manages PricePlanReferences belonging to MultiPointInspections |
    | **Inspection** | /multi-point-inspections/{multiPointInspectionKey}/inspections | Manages Inspections belonging to MultiPointInspections |
    | **CurrencyExchange** | /multi-point-inspections/{multiPointInspectionKey}/currency-exchanges | Manages CurrencyExchanges belonging to MultiPointInspections |
    | **Manifest** | /multi-point-inspections/{multiPointInspectionKey}/manifests | Manages Manifests belonging to MultiPointInspections |
    | **MediaAccessMetric** | /multi-point-inspections/{multiPointInspectionKey}/media-access-metrics | Manages MediaAccessMetrics belonging to MultiPointInspections |
    | **BillOfMaterialReference** | /multi-point-inspections/{multiPointInspectionKey}/bill-of-material-references | Manages BillOfMaterialReferences belonging to MultiPointInspections |
    | **AppointmentReference** | /multi-point-inspections/{multiPointInspectionKey}/appointment-references | Manages AppointmentReferences belonging to MultiPointInspections |
    | **FinancialSplitReference** | /multi-point-inspections/{multiPointInspectionKey}/financial-split-references | Manages FinancialSplitReferences belonging to MultiPointInspections |
    | **TextualDetail** | /multi-point-inspections/{multiPointInspectionKey}/textual-details | Manages TextualDetails belonging to MultiPointInspections |
    | **VehicleIdentifier** | /multi-point-inspections/{multiPointInspectionKey}/vehicle-identifiers | Manages VehicleIdentifiers belonging to MultiPointInspections |


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
> `https://[Your-API-Host]/multipointinspections`

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
💠 **AppointmentStatusTypes** : types of appointment status.<br/>
💠 **AppointmentTypes** : types of appointments.<br/>
💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DeviceTypes** : types of devices.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **LaborLocationTypes** : types of labor locations.<br/>
💠 **LaborOperationStatusTypes** : types of labor operation status.<br/>
💠 **LaborOperationTypes** : types of labor operations.<br/>
💠 **LaborResourceTypes** : types of labor resources.<br/>
💠 **MediaDeliveryMethodTypes** : types of media delivery methods.<br/>
💠 **MediaFormatTypes** : types of media formats.<br/>
💠 **MediaTypes** : types of medias.<br/>
💠 **MediaUsageTypes** : types of media usages.<br/>
💠 **NarrativeUomTypes** : types of narrative uoms.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PayTypes** : types of pays.<br/>
💠 **PayeeTypes** : types of payees.<br/>
💠 **RepairStatusTypes** : types of repair status.<br/>
💠 **RoleTypes** : types of roles.<br/>
💠 **ServiceJobTypes** : types of service jobs.<br/>
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


### /multi-point-inspections
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections</span> <br/>
        <span class="api-summary">Retrieve a list of MultiPointInspection entities. getMultiPointInspection</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections</span> <br/>
        <span class="api-summary">Create a new MultiPointInspection entity. createMultiPointInspection</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MultiPointInspection entity. getultiPointInspectionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}</span> <br/>
        <span class="api-summary">Replace a MultiPointInspection entity. replaceMultiPointInspection</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}</span> <br/>
        <span class="api-summary">Partially update a MultiPointInspection entity. updatePartialMultiPointInspection</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}</span> <br/>
        <span class="api-summary">Delete a MultiPointInspection entity deleteMultiPointInspectionEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/locales
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/locales</span> <br/>
        <span class="api-summary">Retrieve a list of Locale entities scoped by multiPointInspectionKey. getLocaleByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/locales</span> <br/>
        <span class="api-summary">Create a new Locale entity. createLocale</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/locales/{localeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Locale entity. getocaleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Replace a Locale entity. replaceLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Partially update a Locale entity. updatePartialLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/locales/{localeKey}</span> <br/>
        <span class="api-summary">Delete a Locale entity deleteLocaleEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/manifest-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifest-items</span> <br/>
        <span class="api-summary">Retrieve a list of ManifestItem entities scoped by multiPointInspectionKey. getManifestItemByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifest-items</span> <br/>
        <span class="api-summary">Create a new ManifestItem entity. createManifestItem</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/manifest-items/{manifestItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ManifestItem entity. getanifestItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Replace a ManifestItem entity. replaceManifestItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Partially update a ManifestItem entity. updatePartialManifestItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifest-items/{manifestItemKey}</span> <br/>
        <span class="api-summary">Delete a ManifestItem entity deleteManifestItemEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by multiPointInspectionKey. getTimeSlotByMultiPointInspectionKey</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/address-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/address-references</span> <br/>
        <span class="api-summary">Retrieve a list of AddressReference entities scoped by multiPointInspectionKey. getAddressReferenceByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/address-references</span> <br/>
        <span class="api-summary">Create a new AddressReference entity. createAddressReference</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/address-references/{addressReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressReference entity. getddressReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AddressReference entity. replaceAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AddressReference entity. updatePartialAddressReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/address-references/{addressReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AddressReference entity deleteAddressReferenceEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/party-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/party-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartyReference entities scoped by multiPointInspectionKey. getPartyReferenceByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/party-references</span> <br/>
        <span class="api-summary">Create a new PartyReference entity. createPartyReference</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/party-references/{partyReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyReference entity. getartyReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartyReference entity. replacePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartyReference entity. updatePartialPartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartyReference entity deletePartyReferenceEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/staff-assignment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Retrieve a list of StaffAssignmentReference entities scoped by multiPointInspectionKey. getStaffAssignmentReferenceByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/staff-assignment-references</span> <br/>
        <span class="api-summary">Create a new StaffAssignmentReference entity. createStaffAssignmentReference</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/staff-assignment-references/{staffAssignmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffAssignmentReference entity. gettaffAssignmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a StaffAssignmentReference entity. replaceStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a StaffAssignmentReference entity. updatePartialStaffAssignmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/staff-assignment-references/{staffAssignmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a StaffAssignmentReference entity deleteStaffAssignmentReferenceEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/money
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/money</span> <br/>
        <span class="api-summary">Retrieve a list of Money entities scoped by multiPointInspectionKey. getMoneyByMultiPointInspectionKey</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/money/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/money/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money entity. getoneyById</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/metric-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/metric-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricValue entities scoped by multiPointInspectionKey. getMetricValueByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/metric-values</span> <br/>
        <span class="api-summary">Create a new MetricValue entity. createMetricValue</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/metric-values/{metricValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricValue entity. getetricValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricValue entity. replaceMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricValue entity. updatePartialMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/metric-values/{metricValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricValue entity deleteMetricValueEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by multiPointInspectionKey. getIdentifierByMultiPointInspectionKey</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by multiPointInspectionKey. getEffectivePeriodByMultiPointInspectionKey</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/labor-operations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operations</span> <br/>
        <span class="api-summary">Retrieve a list of LaborOperation entities scoped by multiPointInspectionKey. getLaborOperationByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operations</span> <br/>
        <span class="api-summary">Create a new LaborOperation entity. createLaborOperation</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/labor-operations/{laborOperationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LaborOperation entity. getaborOperationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Replace a LaborOperation entity. replaceLaborOperation</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Partially update a LaborOperation entity. updatePartialLaborOperation</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operations/{laborOperationKey}</span> <br/>
        <span class="api-summary">Delete a LaborOperation entity deleteLaborOperationEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/vehicle-licenses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-licenses</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleLicense entities scoped by multiPointInspectionKey. getVehicleLicenseByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-licenses</span> <br/>
        <span class="api-summary">Create a new VehicleLicense entity. createVehicleLicense</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/vehicle-licenses/{vehicleLicenseKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleLicense entity. getehicleLicenseById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Replace a VehicleLicense entity. replaceVehicleLicense</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleLicense entity. updatePartialVehicleLicense</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-licenses/{vehicleLicenseKey}</span> <br/>
        <span class="api-summary">Delete a VehicleLicense entity deleteVehicleLicenseEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/labor-operation-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operation-events</span> <br/>
        <span class="api-summary">Retrieve a list of LaborOperationEvent entities scoped by multiPointInspectionKey. getLaborOperationEventByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operation-events</span> <br/>
        <span class="api-summary">Create a new LaborOperationEvent entity. createLaborOperationEvent</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/labor-operation-events/{laborOperationEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LaborOperationEvent entity. getaborOperationEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Replace a LaborOperationEvent entity. replaceLaborOperationEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Partially update a LaborOperationEvent entity. updatePartialLaborOperationEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-operation-events/{laborOperationEventKey}</span> <br/>
        <span class="api-summary">Delete a LaborOperationEvent entity deleteLaborOperationEventEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/labor-resources
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-resources</span> <br/>
        <span class="api-summary">Retrieve a list of LaborResource entities scoped by multiPointInspectionKey. getLaborResourceByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-resources</span> <br/>
        <span class="api-summary">Create a new LaborResource entity. createLaborResource</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/labor-resources/{laborResourceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific LaborResource entity. getaborResourceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Replace a LaborResource entity. replaceLaborResource</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Partially update a LaborResource entity. updatePartialLaborResource</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/labor-resources/{laborResourceKey}</span> <br/>
        <span class="api-summary">Delete a LaborResource entity deleteLaborResourceEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/medias
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/medias</span> <br/>
        <span class="api-summary">Retrieve a list of Media entities scoped by multiPointInspectionKey. getMediaByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/medias</span> <br/>
        <span class="api-summary">Create a new Media entity. createMedia</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/medias/{mediaKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Media entity. getediaById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Replace a Media entity. replaceMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Partially update a Media entity. updatePartialMedia</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/medias/{mediaKey}</span> <br/>
        <span class="api-summary">Delete a Media entity deleteMediaEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/price-plan-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/price-plan-references</span> <br/>
        <span class="api-summary">Retrieve a list of PricePlanReference entities scoped by multiPointInspectionKey. getPricePlanReferenceByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/price-plan-references</span> <br/>
        <span class="api-summary">Create a new PricePlanReference entity. createPricePlanReference</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/price-plan-references/{pricePlanReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PricePlanReference entity. getricePlanReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PricePlanReference entity. replacePricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PricePlanReference entity. updatePartialPricePlanReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/price-plan-references/{pricePlanReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PricePlanReference entity deletePricePlanReferenceEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/inspections
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/inspections</span> <br/>
        <span class="api-summary">Retrieve a list of Inspection entities scoped by multiPointInspectionKey. getInspectionByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/inspections</span> <br/>
        <span class="api-summary">Create a new Inspection entity. createInspection</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/inspections/{inspectionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/inspections/{inspectionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Inspection entity. getnspectionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/inspections/{inspectionKey}</span> <br/>
        <span class="api-summary">Replace a Inspection entity. replaceInspection</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/inspections/{inspectionKey}</span> <br/>
        <span class="api-summary">Partially update a Inspection entity. updatePartialInspection</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/inspections/{inspectionKey}</span> <br/>
        <span class="api-summary">Delete a Inspection entity deleteInspectionEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/currency-exchanges
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/currency-exchanges</span> <br/>
        <span class="api-summary">Retrieve a list of CurrencyExchange entities scoped by multiPointInspectionKey. getCurrencyExchangeByMultiPointInspectionKey</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/currency-exchanges/{currencyExchangeKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/currency-exchanges/{currencyExchangeKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CurrencyExchange entity. geturrencyExchangeById</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/manifests
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifests</span> <br/>
        <span class="api-summary">Retrieve a list of Manifest entities scoped by multiPointInspectionKey. getManifestByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifests</span> <br/>
        <span class="api-summary">Create a new Manifest entity. createManifest</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/manifests/{manifestKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifests/{manifestKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Manifest entity. getanifestById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifests/{manifestKey}</span> <br/>
        <span class="api-summary">Replace a Manifest entity. replaceManifest</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifests/{manifestKey}</span> <br/>
        <span class="api-summary">Partially update a Manifest entity. updatePartialManifest</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/manifests/{manifestKey}</span> <br/>
        <span class="api-summary">Delete a Manifest entity deleteManifestEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/media-access-metrics
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/media-access-metrics</span> <br/>
        <span class="api-summary">Retrieve a list of MediaAccessMetric entities scoped by multiPointInspectionKey. getMediaAccessMetricByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/media-access-metrics</span> <br/>
        <span class="api-summary">Create a new MediaAccessMetric entity. createMediaAccessMetric</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/media-access-metrics/{mediaAccessMetricKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/media-access-metrics/{mediaAccessMetricKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MediaAccessMetric entity. getediaAccessMetricById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/media-access-metrics/{mediaAccessMetricKey}</span> <br/>
        <span class="api-summary">Replace a MediaAccessMetric entity. replaceMediaAccessMetric</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/media-access-metrics/{mediaAccessMetricKey}</span> <br/>
        <span class="api-summary">Partially update a MediaAccessMetric entity. updatePartialMediaAccessMetric</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/media-access-metrics/{mediaAccessMetricKey}</span> <br/>
        <span class="api-summary">Delete a MediaAccessMetric entity deleteMediaAccessMetricEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/bill-of-material-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/bill-of-material-references</span> <br/>
        <span class="api-summary">Retrieve a list of BillOfMaterialReference entities scoped by multiPointInspectionKey. getBillOfMaterialReferenceByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/bill-of-material-references</span> <br/>
        <span class="api-summary">Create a new BillOfMaterialReference entity. createBillOfMaterialReference</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/bill-of-material-references/{billOfMaterialReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific BillOfMaterialReference entity. getillOfMaterialReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Replace a BillOfMaterialReference entity. replaceBillOfMaterialReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a BillOfMaterialReference entity. updatePartialBillOfMaterialReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/bill-of-material-references/{billOfMaterialReferenceKey}</span> <br/>
        <span class="api-summary">Delete a BillOfMaterialReference entity deleteBillOfMaterialReferenceEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/appointment-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/appointment-references</span> <br/>
        <span class="api-summary">Retrieve a list of AppointmentReference entities scoped by multiPointInspectionKey. getAppointmentReferenceByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/appointment-references</span> <br/>
        <span class="api-summary">Create a new AppointmentReference entity. createAppointmentReference</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/appointment-references/{appointmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/appointment-references/{appointmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AppointmentReference entity. getppointmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/appointment-references/{appointmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a AppointmentReference entity. replaceAppointmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/appointment-references/{appointmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a AppointmentReference entity. updatePartialAppointmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/appointment-references/{appointmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a AppointmentReference entity deleteAppointmentReferenceEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/financial-split-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/financial-split-references</span> <br/>
        <span class="api-summary">Retrieve a list of FinancialSplitReference entities scoped by multiPointInspectionKey. getFinancialSplitReferenceByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/financial-split-references</span> <br/>
        <span class="api-summary">Create a new FinancialSplitReference entity. createFinancialSplitReference</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/financial-split-references/{financialSplitReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific FinancialSplitReference entity. getinancialSplitReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Replace a FinancialSplitReference entity. replaceFinancialSplitReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a FinancialSplitReference entity. updatePartialFinancialSplitReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/financial-split-references/{financialSplitReferenceKey}</span> <br/>
        <span class="api-summary">Delete a FinancialSplitReference entity deleteFinancialSplitReferenceEntity</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail entities scoped by multiPointInspectionKey. getTextualDetailByMultiPointInspectionKey</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail entity. getextualDetailById</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/vehicle-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleIdentifier entities scoped by multiPointInspectionKey. getVehicleIdentifierByMultiPointInspectionKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Create a new VehicleIdentifier entity. createVehicleIdentifier</span>
    </span>
</div>

### /multi-point-inspections/{multiPointInspectionKey}/vehicle-identifiers/{vehicleIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleIdentifier entity. getehicleIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a VehicleIdentifier entity. replaceVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleIdentifier entity. updatePartialVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/multi-point-inspections/{multiPointInspectionKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a VehicleIdentifier entity deleteVehicleIdentifierEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under MultiPointInspectionroot with key {MultiPointInspectionKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **multi-point-inspection** | /multi-point-inspections | listMultiPointInspection | createMultiPointInspection | getMultiPointInspection | updateMultiPointInspection | deleteMultiPointInspection |
    | **locale** | /multi-point-inspections/{multiPointInspectionKey}/locales | listLocaleByMultiPointInspectionKey | createLocale | getLocaleByMultiPointInspectionKey | updateLocaleByMultiPointInspectionKey | deleteLocaleByMultiPointInspectionKey |
    | **manifest-item** | /multi-point-inspections/{multiPointInspectionKey}/manifest-items | listManifestItemByMultiPointInspectionKey | createManifestItem | getManifestItemByMultiPointInspectionKey | updateManifestItemByMultiPointInspectionKey | deleteManifestItemByMultiPointInspectionKey |
    | **time-slot** | /multi-point-inspections/{multiPointInspectionKey}/time-slots | listTimeSlotByMultiPointInspectionKey |  | getTimeSlotByMultiPointInspectionKey | updateTimeSlotByMultiPointInspectionKey | deleteTimeSlotByMultiPointInspectionKey |
    | **address-reference** | /multi-point-inspections/{multiPointInspectionKey}/address-references | listAddressReferenceByMultiPointInspectionKey | createAddressReference | getAddressReferenceByMultiPointInspectionKey | updateAddressReferenceByMultiPointInspectionKey | deleteAddressReferenceByMultiPointInspectionKey |
    | **party-reference** | /multi-point-inspections/{multiPointInspectionKey}/party-references | listPartyReferenceByMultiPointInspectionKey | createPartyReference | getPartyReferenceByMultiPointInspectionKey | updatePartyReferenceByMultiPointInspectionKey | deletePartyReferenceByMultiPointInspectionKey |
    | **staff-assignment-reference** | /multi-point-inspections/{multiPointInspectionKey}/staff-assignment-references | listStaffAssignmentReferenceByMultiPointInspectionKey | createStaffAssignmentReference | getStaffAssignmentReferenceByMultiPointInspectionKey | updateStaffAssignmentReferenceByMultiPointInspectionKey | deleteStaffAssignmentReferenceByMultiPointInspectionKey |
    | **money** | /multi-point-inspections/{multiPointInspectionKey}/money | listMoneyByMultiPointInspectionKey |  | getMoneyByMultiPointInspectionKey | updateMoneyByMultiPointInspectionKey | deleteMoneyByMultiPointInspectionKey |
    | **metric-value** | /multi-point-inspections/{multiPointInspectionKey}/metric-values | listMetricValueByMultiPointInspectionKey | createMetricValue | getMetricValueByMultiPointInspectionKey | updateMetricValueByMultiPointInspectionKey | deleteMetricValueByMultiPointInspectionKey |
    | **identifier** | /multi-point-inspections/{multiPointInspectionKey}/identifiers | listIdentifierByMultiPointInspectionKey |  | getIdentifierByMultiPointInspectionKey | updateIdentifierByMultiPointInspectionKey | deleteIdentifierByMultiPointInspectionKey |
    | **effective-period** | /multi-point-inspections/{multiPointInspectionKey}/effective-periods | listEffectivePeriodByMultiPointInspectionKey |  | getEffectivePeriodByMultiPointInspectionKey | updateEffectivePeriodByMultiPointInspectionKey | deleteEffectivePeriodByMultiPointInspectionKey |
    | **labor-operation** | /multi-point-inspections/{multiPointInspectionKey}/labor-operations | listLaborOperationByMultiPointInspectionKey | createLaborOperation | getLaborOperationByMultiPointInspectionKey | updateLaborOperationByMultiPointInspectionKey | deleteLaborOperationByMultiPointInspectionKey |
    | **vehicle-license** | /multi-point-inspections/{multiPointInspectionKey}/vehicle-licenses | listVehicleLicenseByMultiPointInspectionKey | createVehicleLicense | getVehicleLicenseByMultiPointInspectionKey | updateVehicleLicenseByMultiPointInspectionKey | deleteVehicleLicenseByMultiPointInspectionKey |
    | **labor-operation-event** | /multi-point-inspections/{multiPointInspectionKey}/labor-operation-events | listLaborOperationEventByMultiPointInspectionKey | createLaborOperationEvent | getLaborOperationEventByMultiPointInspectionKey | updateLaborOperationEventByMultiPointInspectionKey | deleteLaborOperationEventByMultiPointInspectionKey |
    | **labor-resource** | /multi-point-inspections/{multiPointInspectionKey}/labor-resources | listLaborResourceByMultiPointInspectionKey | createLaborResource | getLaborResourceByMultiPointInspectionKey | updateLaborResourceByMultiPointInspectionKey | deleteLaborResourceByMultiPointInspectionKey |
    | **media** | /multi-point-inspections/{multiPointInspectionKey}/medias | listMediaByMultiPointInspectionKey | createMedia | getMediaByMultiPointInspectionKey | updateMediaByMultiPointInspectionKey | deleteMediaByMultiPointInspectionKey |
    | **price-plan-reference** | /multi-point-inspections/{multiPointInspectionKey}/price-plan-references | listPricePlanReferenceByMultiPointInspectionKey | createPricePlanReference | getPricePlanReferenceByMultiPointInspectionKey | updatePricePlanReferenceByMultiPointInspectionKey | deletePricePlanReferenceByMultiPointInspectionKey |
    | **inspection** | /multi-point-inspections/{multiPointInspectionKey}/inspections | listInspectionByMultiPointInspectionKey | createInspection | getInspectionByMultiPointInspectionKey | updateInspectionByMultiPointInspectionKey | deleteInspectionByMultiPointInspectionKey |
    | **currency-exchange** | /multi-point-inspections/{multiPointInspectionKey}/currency-exchanges | listCurrencyExchangeByMultiPointInspectionKey |  | getCurrencyExchangeByMultiPointInspectionKey | updateCurrencyExchangeByMultiPointInspectionKey | deleteCurrencyExchangeByMultiPointInspectionKey |
    | **manifest** | /multi-point-inspections/{multiPointInspectionKey}/manifests | listManifestByMultiPointInspectionKey | createManifest | getManifestByMultiPointInspectionKey | updateManifestByMultiPointInspectionKey | deleteManifestByMultiPointInspectionKey |
    | **media-access-metric** | /multi-point-inspections/{multiPointInspectionKey}/media-access-metrics | listMediaAccessMetricByMultiPointInspectionKey | createMediaAccessMetric | getMediaAccessMetricByMultiPointInspectionKey | updateMediaAccessMetricByMultiPointInspectionKey | deleteMediaAccessMetricByMultiPointInspectionKey |
    | **bill-of-material-reference** | /multi-point-inspections/{multiPointInspectionKey}/bill-of-material-references | listBillOfMaterialReferenceByMultiPointInspectionKey | createBillOfMaterialReference | getBillOfMaterialReferenceByMultiPointInspectionKey | updateBillOfMaterialReferenceByMultiPointInspectionKey | deleteBillOfMaterialReferenceByMultiPointInspectionKey |
    | **appointment-reference** | /multi-point-inspections/{multiPointInspectionKey}/appointment-references | listAppointmentReferenceByMultiPointInspectionKey | createAppointmentReference | getAppointmentReferenceByMultiPointInspectionKey | updateAppointmentReferenceByMultiPointInspectionKey | deleteAppointmentReferenceByMultiPointInspectionKey |
    | **financial-split-reference** | /multi-point-inspections/{multiPointInspectionKey}/financial-split-references | listFinancialSplitReferenceByMultiPointInspectionKey | createFinancialSplitReference | getFinancialSplitReferenceByMultiPointInspectionKey | updateFinancialSplitReferenceByMultiPointInspectionKey | deleteFinancialSplitReferenceByMultiPointInspectionKey |
    | **textual-detail** | /multi-point-inspections/{multiPointInspectionKey}/textual-details | listTextualDetailByMultiPointInspectionKey |  | getTextualDetailByMultiPointInspectionKey | updateTextualDetailByMultiPointInspectionKey | deleteTextualDetailByMultiPointInspectionKey |
    | **vehicle-identifier** | /multi-point-inspections/{multiPointInspectionKey}/vehicle-identifiers | listVehicleIdentifierByMultiPointInspectionKey | createVehicleIdentifier | getVehicleIdentifierByMultiPointInspectionKey | updateVehicleIdentifierByMultiPointInspectionKey | deleteVehicleIdentifierByMultiPointInspectionKey |

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

## Bulk Create MultiPointInspection (`POST /multipointinspections/batch`)

The `/multipointinspections/batch` endpoint allows you to create multiple MultiPointInspection entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of MultiPointInspection and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `MultiPointInspectionCreate` schema.

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

Contains the full objects of the MultiPointInspection that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A MultiPointInspection with SKU W-002 already exists."
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

## Health Check (`GET /multipointinspections/health`)

The `/multipointinspections/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the MultiPointInspection aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## MultiPointInspection Commands and State Management

The multipointinspections API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /multipointinspections/{MultiPointInspectionKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a MultiPointInspection (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /multipointinspections/{MultiPointInspectionKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /multipointinspections/capabilities`)

Before sending a command, you can "discover" what actions are valid for a MultiPointInspection based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the MultiPointInspection must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelMultiPointInspection` | `CREATED`, `ACTIVE` | `DELETED` | Voids the MultiPointInspection . |
| `ActivateMultiPointInspection` | `PENDING` | `ACTIVE` | Moves a MultiPointInspection into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |
