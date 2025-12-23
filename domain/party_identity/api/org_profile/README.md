## 🚗 STAR Automotive Retail Systems API (This API provides a standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration between Master Catalog systems, Inventory Management, and Financial Invoicing workflows. 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **Address**, **AddressLocale**, **Authorization**, **CommunicationChannel**, **ControlAccount**, **ControlAccountReference**, **DailyHour**, **Department**, **Discount**, **DiscountMetricValue**, **DiscountPolicy**, **Identifier**, **MetricNameValue**, **OrgName**, **OrgProfile**, **PaymentTermReference**, **PayrollRate**, **Person**, **PersonName**, **Position**, **Price**, **PrivacyEvent**, **PrivacyItem**, **StaffMember**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **party_identity** and **OrgProfile** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **OrgProfile** | /org-profiles | Manages OrgProfiles |
    | **PaymentTermReference** | /org-profiles/{orgProfileKey}/payment-term-references | Manages PaymentTermReferences belonging to OrgProfiles |
    | **Discount** | /org-profiles/{orgProfileKey}/discounts | Manages Discounts belonging to OrgProfiles |
    | **Addresse** | /org-profiles/{orgProfileKey}/addresses | Manages Addresses belonging to OrgProfiles |
    | **OrgName** | /org-profiles/{orgProfileKey}/org-names | Manages OrgNames belonging to OrgProfiles |
    | **StaffMember** | /org-profiles/{orgProfileKey}/staff-members | Manages StaffMembers belonging to OrgProfiles |
    | **PrivacyEvent** | /org-profiles/{orgProfileKey}/privacy-events | Manages PrivacyEvents belonging to OrgProfiles |
    | **TimeSlot** | /org-profiles/{orgProfileKey}/time-slots | Manages TimeSlots belonging to OrgProfiles |
    | **ControlAccount** | /org-profiles/{orgProfileKey}/control-accounts | Manages ControlAccounts belonging to OrgProfiles |
    | **Authorization** | /org-profiles/{orgProfileKey}/authorizations | Manages Authorizations belonging to OrgProfiles |
    | **Money** | /org-profiles/{orgProfileKey}/moneys | Manages Moneys belonging to OrgProfiles |
    | **Department** | /org-profiles/{orgProfileKey}/departments | Manages Departments belonging to OrgProfiles |
    | **MetricNameValue** | /org-profiles/{orgProfileKey}/metric-name-values | Manages MetricNameValues belonging to OrgProfiles |
    | **Identifier** | /org-profiles/{orgProfileKey}/identifiers | Manages Identifiers belonging to OrgProfiles |
    | **EffectivePeriod** | /org-profiles/{orgProfileKey}/effective-periods | Manages EffectivePeriods belonging to OrgProfiles |
    | **DiscountPolicie** | /org-profiles/{orgProfileKey}/discount-policies | Manages DiscountPolicies belonging to OrgProfiles |
    | **PrivacyItem** | /org-profiles/{orgProfileKey}/privacy-items | Manages PrivacyItems belonging to OrgProfiles |
    | **PersonName** | /org-profiles/{orgProfileKey}/person-names | Manages PersonNames belonging to OrgProfiles |
    | **PayrollRate** | /org-profiles/{orgProfileKey}/payroll-rates | Manages PayrollRates belonging to OrgProfiles |
    | **ControlAccountReference** | /org-profiles/{orgProfileKey}/control-account-references | Manages ControlAccountReferences belonging to OrgProfiles |
    | **CommunicationChannel** | /org-profiles/{orgProfileKey}/communication-channels | Manages CommunicationChannels belonging to OrgProfiles |
    | **DiscountMetricValue** | /org-profiles/{orgProfileKey}/discount-metric-values | Manages DiscountMetricValues belonging to OrgProfiles |
    | **Price** | /org-profiles/{orgProfileKey}/prices | Manages Prices belonging to OrgProfiles |
    | **TextualDetail** | /org-profiles/{orgProfileKey}/textual-details | Manages TextualDetails belonging to OrgProfiles |
    | **People** | /org-profiles/{orgProfileKey}/people | Manages People belonging to OrgProfiles |


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
> `https://[Your-API-Host]/org-profile`

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
💠 **BusinessTypes** : types of business.<br/>
💠 **CommunicationChannelTypes** : types of communication channels.<br/>
💠 **ControlAccountRoleTypes** : types of control account roles.<br/>
💠 **ControlAccountStatusTypes** : types of control account status.<br/>
💠 **ControlAccountTypes** : types of control accounts.<br/>
💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DepartmentTypes** : types of departments.<br/>
💠 **DiscountTypes** : types of discounts.<br/>
💠 **DueOnTypes** : types of due ons.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **FinancialCategoryTypes** : types of financial categorys.<br/>
💠 **GenderTypes** : types of genders.<br/>
💠 **MaritalStatusTypes** : types of marital status.<br/>
💠 **NarrativeUomTypes** : types of narrative uoms.<br/>
💠 **OperatingStatusTypes** : types of operating status.<br/>
💠 **OrderCategoryTypes** : types of order categorys.<br/>
💠 **PartIdentifierTypes** : types of part identifiers.<br/>
💠 **PartyTypes** : types of partys.<br/>
💠 **PaymentTypes** : types of payments.<br/>
💠 **PayrollCycleFrequencyTypes** : types of payroll cycle frequencys.<br/>
💠 **PriceTypes** : types of prices.<br/>
💠 **PrivacyContextTypes** : types of privacy contexts.<br/>
💠 **PrivacyLegalBasisTypes** : types of privacy legal basis.<br/>
💠 **PrivacyStateTypes** : types of privacy states.<br/>
💠 **PrivacyTypes** : types of privacys.<br/>
💠 **ProductStateTypes** : types of product states.<br/>
💠 **ProductViewTypes** : types of product views.<br/>
💠 **RoleTypes** : types of roles.<br/>
💠 **StaffPayTypes** : types of staff pays.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>
💠 **UnitOfMeasureTypes** : types of unit of measures.<br/>
💠 **ValidationTypes** : types of validations.<br/>
💠 **LocationTypes** : Defines various types of geographical or logist...<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : Effective Period<br/>
✅ **Link** : Represents a Hypermedia as the Engine of Application State (HATEOS) link, providing information on how to interact with a related resource.<br/>
✅ **Money** : Represents a monetary value, including its currency, locale, and display format.<br/>
✅ **TextualDetail** : not nullable<br/>
✅ **TimeSlot** : Range of time for the appointment including start/end times, recurring patterns, and directives.<br/>

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


### /org-profiles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles</span> <br/>
        <span class="api-summary">Retrieve a list of OrgProfile entities. getOrgProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles</span> <br/>
        <span class="api-summary">Create a new OrgProfile entity. createOrgProfile</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Retrieve a specific OrgProfile entity. getrgProfileById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Replace a OrgProfile entity. replaceOrgProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Partially update a OrgProfile entity. updateOrgProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Delete a OrgProfile entity deleteOrgProfileEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/payment-term-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentTermReference entities scoped by orgProfileKey. getPaymentTermReferenceByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references</span> <br/>
        <span class="api-summary">Create a new PaymentTermReference entity. createPaymentTermReference</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/payment-term-references/{paymentTermReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentTermReference entity. getaymentTermReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentTermReference entity. replacePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentTermReference entity. updatePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentTermReference entity deletePaymentTermReferenceEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discounts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts</span> <br/>
        <span class="api-summary">Retrieve a list of Discount entities scoped by orgProfileKey. getDiscountByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts</span> <br/>
        <span class="api-summary">Create a new Discount entity. createDiscount</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discounts/{discountKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Discount entity. getiscountById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Replace a Discount entity. replaceDiscount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Partially update a Discount entity. updateDiscount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Delete a Discount entity deleteDiscountEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/addresses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses</span> <br/>
        <span class="api-summary">Retrieve a list of Address entities scoped by orgProfileKey. getAddressByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses</span> <br/>
        <span class="api-summary">Create a new Address entity. createAddress</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/addresses/{addressKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Address entity. getddressById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Replace a Address entity. replaceAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Partially update a Address entity. updateAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Delete a Address entity deleteAddressEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/org-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names</span> <br/>
        <span class="api-summary">Retrieve a list of OrgName entities scoped by orgProfileKey. getOrgNameByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names</span> <br/>
        <span class="api-summary">Create a new OrgName entity. createOrgName</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/org-names/{orgNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific OrgName entity. getrgNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Replace a OrgName entity. replaceOrgName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Partially update a OrgName entity. updateOrgName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Delete a OrgName entity deleteOrgNameEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/staff-members
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members</span> <br/>
        <span class="api-summary">Retrieve a list of StaffMember entities scoped by orgProfileKey. getStaffMemberByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members</span> <br/>
        <span class="api-summary">Create a new StaffMember entity. createStaffMember</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/staff-members/{staffMemberKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffMember entity. gettaffMemberById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Replace a StaffMember entity. replaceStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Partially update a StaffMember entity. updateStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Delete a StaffMember entity deleteStaffMemberEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/privacy-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyEvent entities scoped by orgProfileKey. getPrivacyEventByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events</span> <br/>
        <span class="api-summary">Create a new PrivacyEvent entity. createPrivacyEvent</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/privacy-events/{privacyEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyEvent entity. getrivacyEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyEvent entity. replacePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyEvent entity. updatePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyEvent entity deletePrivacyEventEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by orgProfileKey. getTimeSlotByOrgProfileKey</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot entity. replaceTimeSlot</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/control-accounts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccount entities scoped by orgProfileKey. getControlAccountByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts</span> <br/>
        <span class="api-summary">Create a new ControlAccount entity. createControlAccount</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/control-accounts/{controlAccountKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccount entity. getontrolAccountById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccount entity. replaceControlAccount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccount entity. updateControlAccount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccount entity deleteControlAccountEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/authorizations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations</span> <br/>
        <span class="api-summary">Retrieve a list of Authorization entities scoped by orgProfileKey. getAuthorizationByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations</span> <br/>
        <span class="api-summary">Create a new Authorization entity. createAuthorization</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/authorizations/{authorizationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Authorization entity. getuthorizationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Replace a Authorization entity. replaceAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Partially update a Authorization entity. updateAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Delete a Authorization entity deleteAuthorizationEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/moneys
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/moneys</span> <br/>
        <span class="api-summary">Retrieve a list of Money entities scoped by orgProfileKey. getMoneyByOrgProfileKey</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/moneys/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money entity. getoneyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Replace a Money entity. replaceMoney</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/departments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments</span> <br/>
        <span class="api-summary">Retrieve a list of Department entities scoped by orgProfileKey. getDepartmentByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments</span> <br/>
        <span class="api-summary">Create a new Department entity. createDepartment</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/departments/{departmentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Department entity. getepartmentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Replace a Department entity. replaceDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Partially update a Department entity. updateDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Delete a Department entity deleteDepartmentEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/metric-name-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricNameValue entities scoped by orgProfileKey. getMetricNameValueByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values</span> <br/>
        <span class="api-summary">Create a new MetricNameValue entity. createMetricNameValue</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/metric-name-values/{metricNameValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricNameValue entity. getetricNameValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricNameValue entity. replaceMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricNameValue entity. updateMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricNameValue entity deleteMetricNameValueEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by orgProfileKey. getIdentifierByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by orgProfileKey. getEffectivePeriodByOrgProfileKey</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod entity. replaceEffectivePeriod</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discount-policies
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountPolicy entities scoped by orgProfileKey. getDiscountPolicyByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies</span> <br/>
        <span class="api-summary">Create a new DiscountPolicy entity. createDiscountPolicy</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discount-policies/{discountPolicyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountPolicy entity. getiscountPolicyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Replace a DiscountPolicy entity. replaceDiscountPolicy</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountPolicy entity. updateDiscountPolicy</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Delete a DiscountPolicy entity deleteDiscountPolicyEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/privacy-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyItem entities scoped by orgProfileKey. getPrivacyItemByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items</span> <br/>
        <span class="api-summary">Create a new PrivacyItem entity. createPrivacyItem</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/privacy-items/{privacyItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyItem entity. getrivacyItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyItem entity. replacePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyItem entity. updatePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyItem entity deletePrivacyItemEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/person-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names</span> <br/>
        <span class="api-summary">Retrieve a list of PersonName entities scoped by orgProfileKey. getPersonNameByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names</span> <br/>
        <span class="api-summary">Create a new PersonName entity. createPersonName</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/person-names/{personNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PersonName entity. getersonNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Replace a PersonName entity. replacePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Partially update a PersonName entity. updatePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Delete a PersonName entity deletePersonNameEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/payroll-rates
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates</span> <br/>
        <span class="api-summary">Retrieve a list of PayrollRate entities scoped by orgProfileKey. getPayrollRateByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates</span> <br/>
        <span class="api-summary">Create a new PayrollRate entity. createPayrollRate</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/payroll-rates/{payrollRateKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PayrollRate entity. getayrollRateById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Replace a PayrollRate entity. replacePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Partially update a PayrollRate entity. updatePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Delete a PayrollRate entity deletePayrollRateEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference entities scoped by orgProfileKey. getControlAccountReferenceByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference entity. createControlAccountReference</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference entity. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference entity. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference entity. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference entity deleteControlAccountReferenceEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/communication-channels
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels</span> <br/>
        <span class="api-summary">Retrieve a list of CommunicationChannel entities scoped by orgProfileKey. getCommunicationChannelByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels</span> <br/>
        <span class="api-summary">Create a new CommunicationChannel entity. createCommunicationChannel</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/communication-channels/{communicationChannelKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CommunicationChannel entity. getommunicationChannelById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Replace a CommunicationChannel entity. replaceCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Partially update a CommunicationChannel entity. updateCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Delete a CommunicationChannel entity deleteCommunicationChannelEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discount-metric-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountMetricValue entities scoped by orgProfileKey. getDiscountMetricValueByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values</span> <br/>
        <span class="api-summary">Create a new DiscountMetricValue entity. createDiscountMetricValue</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discount-metric-values/{discountMetricValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountMetricValue entity. getiscountMetricValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Replace a DiscountMetricValue entity. replaceDiscountMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountMetricValue entity. updateDiscountMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Delete a DiscountMetricValue entity deleteDiscountMetricValueEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price entities scoped by orgProfileKey. getPriceByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price entity. createPrice</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price entity. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price entity. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price entity. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price entity deletePriceEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail entities scoped by orgProfileKey. getTextualDetailByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details</span> <br/>
        <span class="api-summary">Create a new TextualDetail entity. createTextualDetail</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail entity. getextualDetailById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Replace a TextualDetail entity. replaceTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Partially update a TextualDetail entity. updateTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Delete a TextualDetail entity deleteTextualDetailEntity</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/people
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people</span> <br/>
        <span class="api-summary">Retrieve a list of Person entities scoped by orgProfileKey. getPersonByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people</span> <br/>
        <span class="api-summary">Create a new Person entity. createPerson</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/people/{personKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Person entity. getersonById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Replace a Person entity. replacePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Partially update a Person entity. updatePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Delete a Person entity deletePersonEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under OrgProfileroot with key {OrgProfileKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **org-profile** | /org-profiles | listOrgProfile | createOrgProfile | getOrgProfile | updateOrgProfile | deleteOrgProfile |
    | **payment-term-reference** | /org-profiles/{orgProfileKey}/payment-term-references | listPaymentTermReferenceByOrgProfileKey | createPaymentTermReference | getPaymentTermReferenceByOrgProfileKey | updatePaymentTermReferenceByOrgProfileKey | deletePaymentTermReferenceByOrgProfileKey |
    | **discount** | /org-profiles/{orgProfileKey}/discounts | listDiscountByOrgProfileKey | createDiscount | getDiscountByOrgProfileKey | updateDiscountByOrgProfileKey | deleteDiscountByOrgProfileKey |
    | **addresse** | /org-profiles/{orgProfileKey}/addresses | listAddressByOrgProfileKey | createAddress | getAddressByOrgProfileKey | updateAddressByOrgProfileKey | deleteAddressByOrgProfileKey |
    | **org-name** | /org-profiles/{orgProfileKey}/org-names | listOrgNameByOrgProfileKey | createOrgName | getOrgNameByOrgProfileKey | updateOrgNameByOrgProfileKey | deleteOrgNameByOrgProfileKey |
    | **staff-member** | /org-profiles/{orgProfileKey}/staff-members | listStaffMemberByOrgProfileKey | createStaffMember | getStaffMemberByOrgProfileKey | updateStaffMemberByOrgProfileKey | deleteStaffMemberByOrgProfileKey |
    | **privacy-event** | /org-profiles/{orgProfileKey}/privacy-events | listPrivacyEventByOrgProfileKey | createPrivacyEvent | getPrivacyEventByOrgProfileKey | updatePrivacyEventByOrgProfileKey | deletePrivacyEventByOrgProfileKey |
    | **time-slot** | /org-profiles/{orgProfileKey}/time-slots | listTimeSlotByOrgProfileKey |  | getTimeSlotByOrgProfileKey | updateTimeSlotByOrgProfileKey | deleteTimeSlotByOrgProfileKey |
    | **control-account** | /org-profiles/{orgProfileKey}/control-accounts | listControlAccountByOrgProfileKey | createControlAccount | getControlAccountByOrgProfileKey | updateControlAccountByOrgProfileKey | deleteControlAccountByOrgProfileKey |
    | **authorization** | /org-profiles/{orgProfileKey}/authorizations | listAuthorizationByOrgProfileKey | createAuthorization | getAuthorizationByOrgProfileKey | updateAuthorizationByOrgProfileKey | deleteAuthorizationByOrgProfileKey |
    | **money** | /org-profiles/{orgProfileKey}/moneys | listMoneyByOrgProfileKey |  | getMoneyByOrgProfileKey | updateMoneyByOrgProfileKey | deleteMoneyByOrgProfileKey |
    | **department** | /org-profiles/{orgProfileKey}/departments | listDepartmentByOrgProfileKey | createDepartment | getDepartmentByOrgProfileKey | updateDepartmentByOrgProfileKey | deleteDepartmentByOrgProfileKey |
    | **metric-name-value** | /org-profiles/{orgProfileKey}/metric-name-values | listMetricNameValueByOrgProfileKey | createMetricNameValue | getMetricNameValueByOrgProfileKey | updateMetricNameValueByOrgProfileKey | deleteMetricNameValueByOrgProfileKey |
    | **identifier** | /org-profiles/{orgProfileKey}/identifiers | listIdentifierByOrgProfileKey | createIdentifier | getIdentifierByOrgProfileKey | updateIdentifierByOrgProfileKey | deleteIdentifierByOrgProfileKey |
    | **effective-period** | /org-profiles/{orgProfileKey}/effective-periods | listEffectivePeriodByOrgProfileKey |  | getEffectivePeriodByOrgProfileKey | updateEffectivePeriodByOrgProfileKey | deleteEffectivePeriodByOrgProfileKey |
    | **discount-policie** | /org-profiles/{orgProfileKey}/discount-policies | listDiscountPolicyByOrgProfileKey | createDiscountPolicy | getDiscountPolicyByOrgProfileKey | updateDiscountPolicyByOrgProfileKey | deleteDiscountPolicyByOrgProfileKey |
    | **privacy-item** | /org-profiles/{orgProfileKey}/privacy-items | listPrivacyItemByOrgProfileKey | createPrivacyItem | getPrivacyItemByOrgProfileKey | updatePrivacyItemByOrgProfileKey | deletePrivacyItemByOrgProfileKey |
    | **person-name** | /org-profiles/{orgProfileKey}/person-names | listPersonNameByOrgProfileKey | createPersonName | getPersonNameByOrgProfileKey | updatePersonNameByOrgProfileKey | deletePersonNameByOrgProfileKey |
    | **payroll-rate** | /org-profiles/{orgProfileKey}/payroll-rates | listPayrollRateByOrgProfileKey | createPayrollRate | getPayrollRateByOrgProfileKey | updatePayrollRateByOrgProfileKey | deletePayrollRateByOrgProfileKey |
    | **control-account-reference** | /org-profiles/{orgProfileKey}/control-account-references | listControlAccountReferenceByOrgProfileKey | createControlAccountReference | getControlAccountReferenceByOrgProfileKey | updateControlAccountReferenceByOrgProfileKey | deleteControlAccountReferenceByOrgProfileKey |
    | **communication-channel** | /org-profiles/{orgProfileKey}/communication-channels | listCommunicationChannelByOrgProfileKey | createCommunicationChannel | getCommunicationChannelByOrgProfileKey | updateCommunicationChannelByOrgProfileKey | deleteCommunicationChannelByOrgProfileKey |
    | **discount-metric-value** | /org-profiles/{orgProfileKey}/discount-metric-values | listDiscountMetricValueByOrgProfileKey | createDiscountMetricValue | getDiscountMetricValueByOrgProfileKey | updateDiscountMetricValueByOrgProfileKey | deleteDiscountMetricValueByOrgProfileKey |
    | **price** | /org-profiles/{orgProfileKey}/prices | listPriceByOrgProfileKey | createPrice | getPriceByOrgProfileKey | updatePriceByOrgProfileKey | deletePriceByOrgProfileKey |
    | **textual-detail** | /org-profiles/{orgProfileKey}/textual-details | listTextualDetailByOrgProfileKey | createTextualDetail | getTextualDetailByOrgProfileKey | updateTextualDetailByOrgProfileKey | deleteTextualDetailByOrgProfileKey |
    | **people** | /org-profiles/{orgProfileKey}/people | listPersonByOrgProfileKey | createPerson | getPersonByOrgProfileKey | updatePersonByOrgProfileKey | deletePersonByOrgProfileKey |

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