## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **Address**, **AddressLocale**, **Authorization**, **CommunicationChannel**, **ContactMethod**, **ControlAccount**, **ControlAccountReference**, **DailyHour**, **Department**, **Discount**, **DiscountMetricValue**, **DiscountPolicy**, **Garage**, **GarageItem**, **Identifier**, **MetricNameValue**, **OrgName**, **OrgProfile**, **Party**, **PaymentTermReference**, **PayrollRate**, **Person**, **PersonName**, **Position**, **Price**, **PrivacyEvent**, **PrivacyItem**, **StaffMember**, **VehicleIdentifier**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **party_identity** and **Party** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Partie** | /parties | Manages Parties |
    | **PaymentTermReference** | /parties/{partyKey}/payment-term-references | Manages PaymentTermReferences belonging to Parties |
    | **Discount** | /parties/{partyKey}/discounts | Manages Discounts belonging to Parties |
    | **Addresse** | /parties/{partyKey}/addresses | Manages Addresses belonging to Parties |
    | **OrgProfile** | /parties/{partyKey}/org-profiles | Manages OrgProfiles belonging to Parties |
    | **OrgName** | /parties/{partyKey}/org-names | Manages OrgNames belonging to Parties |
    | **StaffMember** | /parties/{partyKey}/staff-members | Manages StaffMembers belonging to Parties |
    | **PrivacyEvent** | /parties/{partyKey}/privacy-events | Manages PrivacyEvents belonging to Parties |
    | **TimeSlot** | /parties/{partyKey}/time-slots | Manages TimeSlots belonging to Parties |
    | **AddressLocale** | /parties/{partyKey}/address-locales | Manages AddressLocales belonging to Parties |
    | **Authorization** | /parties/{partyKey}/authorizations | Manages Authorizations belonging to Parties |
    | **MetricNameValue** | /parties/{partyKey}/metric-name-values | Manages MetricNameValues belonging to Parties |
    | **Department** | /parties/{partyKey}/departments | Manages Departments belonging to Parties |
    | **Identifier** | /parties/{partyKey}/identifiers | Manages Identifiers belonging to Parties |
    | **EffectivePeriod** | /parties/{partyKey}/effective-periods | Manages EffectivePeriods belonging to Parties |
    | **DiscountPolicie** | /parties/{partyKey}/discount-policies | Manages DiscountPolicies belonging to Parties |
    | **PrivacyItem** | /parties/{partyKey}/privacy-items | Manages PrivacyItems belonging to Parties |
    | **ContactMethod** | /parties/{partyKey}/contact-methods | Manages ContactMethods belonging to Parties |
    | **PersonName** | /parties/{partyKey}/person-names | Manages PersonNames belonging to Parties |
    | **PayrollRate** | /parties/{partyKey}/payroll-rates | Manages PayrollRates belonging to Parties |
    | **Position** | /parties/{partyKey}/positions | Manages Positions belonging to Parties |
    | **ControlAccountReference** | /parties/{partyKey}/control-account-references | Manages ControlAccountReferences belonging to Parties |
    | **CommunicationChannel** | /parties/{partyKey}/communication-channels | Manages CommunicationChannels belonging to Parties |
    | **Garage** | /parties/{partyKey}/garages | Manages Garages belonging to Parties |
    | **People** | /parties/{partyKey}/people | Manages People belonging to Parties |
    | **GarageItem** | /parties/{partyKey}/garage-items | Manages GarageItems belonging to Parties |
    | **VehicleIdentifier** | /parties/{partyKey}/vehicle-identifiers | Manages VehicleIdentifiers belonging to Parties |


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
> `https://[Your-API-Host]/party`

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
💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DepartmentTypes** : types of departments.<br/>
💠 **DiscountTypes** : types of discounts.<br/>
💠 **DueOnTypes** : types of due ons.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **GenderTypes** : types of genders.<br/>
💠 **LocationTypes** : types of locations.<br/>
💠 **MaritalStatusTypes** : types of marital status.<br/>
💠 **NarrativeUomTypes** : types of narrative uoms.<br/>
💠 **OperatingStatusTypes** : types of operating status.<br/>
💠 **OrderCategoryTypes** : types of order categorys.<br/>
💠 **PartIdentifierTypes** : types of part identifiers.<br/>
💠 **PartyServiceTypes** : types of party services.<br/>
💠 **PartyTypes** : types of partys.<br/>
💠 **PaymentTypes** : types of payments.<br/>
💠 **PayrollCycleFrequencyTypes** : types of payroll cycle frequencys.<br/>
💠 **PrivacyContextTypes** : types of privacy contexts.<br/>
💠 **PrivacyLegalBasisTypes** : types of privacy legal basis.<br/>
💠 **PrivacyStateTypes** : types of privacy states.<br/>
💠 **PrivacyTypes** : types of privacys.<br/>
💠 **ProductStateTypes** : types of product states.<br/>
💠 **ProductViewTypes** : types of product views.<br/>
💠 **RoleTypes** : types of roles.<br/>
💠 **StaffPayTypes** : types of staff pays.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>
💠 **ValidationTypes** : types of validations.<br/>
💠 **PriceTypes** : entity<br/>
💠 **FinancialCategoryTypes** : Financial Category Types<br/>
💠 **ControlAccountTypes** : entity<br/>
💠 **ControlAccountRoleTypes** : Control Account Role.<br/>
💠 **ControlAccountStatusTypes** : Defines the various states or statuses for a fi...<br/>
💠 **UnitOfMeasureTypes** : Represents a comprehensive list of units of mea...<br/>

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


### /parties
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties</span> <br/>
        <span class="api-summary">Retrieve a list of Party entities. getParty</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties</span> <br/>
        <span class="api-summary">Create a new Party entity. createParty</span>
    </span>
</div>

### /parties/{partyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Party entity. getartyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}</span> <br/>
        <span class="api-summary">Replace a Party entity. replaceParty</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}</span> <br/>
        <span class="api-summary">Partially update a Party entity. updateParty</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}</span> <br/>
        <span class="api-summary">Delete a Party entity deletePartyEntity</span>
    </span>
</div>

### /parties/{partyKey}/payment-term-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentTermReference entities scoped by partyKey. getPaymentTermReferenceByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references</span> <br/>
        <span class="api-summary">Create a new PaymentTermReference entity. createPaymentTermReference</span>
    </span>
</div>

### /parties/{partyKey}/payment-term-references/{paymentTermReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentTermReference entity. getaymentTermReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentTermReference entity. replacePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentTermReference entity. updatePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentTermReference entity deletePaymentTermReferenceEntity</span>
    </span>
</div>

### /parties/{partyKey}/discounts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts</span> <br/>
        <span class="api-summary">Retrieve a list of Discount entities scoped by partyKey. getDiscountByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts</span> <br/>
        <span class="api-summary">Create a new Discount entity. createDiscount</span>
    </span>
</div>

### /parties/{partyKey}/discounts/{discountKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Discount entity. getiscountById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Replace a Discount entity. replaceDiscount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Partially update a Discount entity. updateDiscount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Delete a Discount entity deleteDiscountEntity</span>
    </span>
</div>

### /parties/{partyKey}/addresses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses</span> <br/>
        <span class="api-summary">Retrieve a list of Address entities scoped by partyKey. getAddressByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses</span> <br/>
        <span class="api-summary">Create a new Address entity. createAddress</span>
    </span>
</div>

### /parties/{partyKey}/addresses/{addressKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Address entity. getddressById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Replace a Address entity. replaceAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Partially update a Address entity. updateAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Delete a Address entity deleteAddressEntity</span>
    </span>
</div>

### /parties/{partyKey}/org-profiles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles</span> <br/>
        <span class="api-summary">Retrieve a list of OrgProfile entities scoped by partyKey. getOrgProfileByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles</span> <br/>
        <span class="api-summary">Create a new OrgProfile entity. createOrgProfile</span>
    </span>
</div>

### /parties/{partyKey}/org-profiles/{orgProfileKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Retrieve a specific OrgProfile entity. getrgProfileById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Replace a OrgProfile entity. replaceOrgProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Partially update a OrgProfile entity. updateOrgProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Delete a OrgProfile entity deleteOrgProfileEntity</span>
    </span>
</div>

### /parties/{partyKey}/org-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names</span> <br/>
        <span class="api-summary">Retrieve a list of OrgName entities scoped by partyKey. getOrgNameByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names</span> <br/>
        <span class="api-summary">Create a new OrgName entity. createOrgName</span>
    </span>
</div>

### /parties/{partyKey}/org-names/{orgNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific OrgName entity. getrgNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Replace a OrgName entity. replaceOrgName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Partially update a OrgName entity. updateOrgName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Delete a OrgName entity deleteOrgNameEntity</span>
    </span>
</div>

### /parties/{partyKey}/staff-members
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members</span> <br/>
        <span class="api-summary">Retrieve a list of StaffMember entities scoped by partyKey. getStaffMemberByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members</span> <br/>
        <span class="api-summary">Create a new StaffMember entity. createStaffMember</span>
    </span>
</div>

### /parties/{partyKey}/staff-members/{staffMemberKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffMember entity. gettaffMemberById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Replace a StaffMember entity. replaceStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Partially update a StaffMember entity. updateStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Delete a StaffMember entity deleteStaffMemberEntity</span>
    </span>
</div>

### /parties/{partyKey}/privacy-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyEvent entities scoped by partyKey. getPrivacyEventByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events</span> <br/>
        <span class="api-summary">Create a new PrivacyEvent entity. createPrivacyEvent</span>
    </span>
</div>

### /parties/{partyKey}/privacy-events/{privacyEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyEvent entity. getrivacyEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyEvent entity. replacePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyEvent entity. updatePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyEvent entity deletePrivacyEventEntity</span>
    </span>
</div>

### /parties/{partyKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by partyKey. getTimeSlotByPartyKey</span>
    </span>
</div>

### /parties/{partyKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### /parties/{partyKey}/address-locales
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales</span> <br/>
        <span class="api-summary">Retrieve a list of AddressLocale entities scoped by partyKey. getAddressLocaleByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales</span> <br/>
        <span class="api-summary">Create a new AddressLocale entity. createAddressLocale</span>
    </span>
</div>

### /parties/{partyKey}/address-locales/{addressLocaleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressLocale entity. getddressLocaleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Replace a AddressLocale entity. replaceAddressLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Partially update a AddressLocale entity. updateAddressLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Delete a AddressLocale entity deleteAddressLocaleEntity</span>
    </span>
</div>

### /parties/{partyKey}/authorizations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations</span> <br/>
        <span class="api-summary">Retrieve a list of Authorization entities scoped by partyKey. getAuthorizationByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations</span> <br/>
        <span class="api-summary">Create a new Authorization entity. createAuthorization</span>
    </span>
</div>

### /parties/{partyKey}/authorizations/{authorizationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Authorization entity. getuthorizationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Replace a Authorization entity. replaceAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Partially update a Authorization entity. updateAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Delete a Authorization entity deleteAuthorizationEntity</span>
    </span>
</div>

### /parties/{partyKey}/metric-name-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricNameValue entities scoped by partyKey. getMetricNameValueByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values</span> <br/>
        <span class="api-summary">Create a new MetricNameValue entity. createMetricNameValue</span>
    </span>
</div>

### /parties/{partyKey}/metric-name-values/{metricNameValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricNameValue entity. getetricNameValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricNameValue entity. replaceMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricNameValue entity. updateMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricNameValue entity deleteMetricNameValueEntity</span>
    </span>
</div>

### /parties/{partyKey}/departments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments</span> <br/>
        <span class="api-summary">Retrieve a list of Department entities scoped by partyKey. getDepartmentByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments</span> <br/>
        <span class="api-summary">Create a new Department entity. createDepartment</span>
    </span>
</div>

### /parties/{partyKey}/departments/{departmentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Department entity. getepartmentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Replace a Department entity. replaceDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Partially update a Department entity. updateDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Delete a Department entity deleteDepartmentEntity</span>
    </span>
</div>

### /parties/{partyKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by partyKey. getIdentifierByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /parties/{partyKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /parties/{partyKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by partyKey. getEffectivePeriodByPartyKey</span>
    </span>
</div>

### /parties/{partyKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /parties/{partyKey}/discount-policies
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountPolicy entities scoped by partyKey. getDiscountPolicyByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies</span> <br/>
        <span class="api-summary">Create a new DiscountPolicy entity. createDiscountPolicy</span>
    </span>
</div>

### /parties/{partyKey}/discount-policies/{discountPolicyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountPolicy entity. getiscountPolicyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Replace a DiscountPolicy entity. replaceDiscountPolicy</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountPolicy entity. updateDiscountPolicy</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Delete a DiscountPolicy entity deleteDiscountPolicyEntity</span>
    </span>
</div>

### /parties/{partyKey}/privacy-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyItem entities scoped by partyKey. getPrivacyItemByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items</span> <br/>
        <span class="api-summary">Create a new PrivacyItem entity. createPrivacyItem</span>
    </span>
</div>

### /parties/{partyKey}/privacy-items/{privacyItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyItem entity. getrivacyItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyItem entity. replacePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyItem entity. updatePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyItem entity deletePrivacyItemEntity</span>
    </span>
</div>

### /parties/{partyKey}/contact-methods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods</span> <br/>
        <span class="api-summary">Retrieve a list of ContactMethod entities scoped by partyKey. getContactMethodByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods</span> <br/>
        <span class="api-summary">Create a new ContactMethod entity. createContactMethod</span>
    </span>
</div>

### /parties/{partyKey}/contact-methods/{contactMethodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods/{contactMethodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ContactMethod entity. getontactMethodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods/{contactMethodKey}</span> <br/>
        <span class="api-summary">Replace a ContactMethod entity. replaceContactMethod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods/{contactMethodKey}</span> <br/>
        <span class="api-summary">Partially update a ContactMethod entity. updateContactMethod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods/{contactMethodKey}</span> <br/>
        <span class="api-summary">Delete a ContactMethod entity deleteContactMethodEntity</span>
    </span>
</div>

### /parties/{partyKey}/person-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names</span> <br/>
        <span class="api-summary">Retrieve a list of PersonName entities scoped by partyKey. getPersonNameByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names</span> <br/>
        <span class="api-summary">Create a new PersonName entity. createPersonName</span>
    </span>
</div>

### /parties/{partyKey}/person-names/{personNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PersonName entity. getersonNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Replace a PersonName entity. replacePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Partially update a PersonName entity. updatePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Delete a PersonName entity deletePersonNameEntity</span>
    </span>
</div>

### /parties/{partyKey}/payroll-rates
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates</span> <br/>
        <span class="api-summary">Retrieve a list of PayrollRate entities scoped by partyKey. getPayrollRateByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates</span> <br/>
        <span class="api-summary">Create a new PayrollRate entity. createPayrollRate</span>
    </span>
</div>

### /parties/{partyKey}/payroll-rates/{payrollRateKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PayrollRate entity. getayrollRateById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Replace a PayrollRate entity. replacePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Partially update a PayrollRate entity. updatePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Delete a PayrollRate entity deletePayrollRateEntity</span>
    </span>
</div>

### /parties/{partyKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position entities scoped by partyKey. getPositionByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position entity. createPosition</span>
    </span>
</div>

### /parties/{partyKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position entity. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position entity. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position entity. updatePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position entity deletePositionEntity</span>
    </span>
</div>

### /parties/{partyKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference entities scoped by partyKey. getControlAccountReferenceByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference entity. createControlAccountReference</span>
    </span>
</div>

### /parties/{partyKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference entity. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference entity. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference entity. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference entity deleteControlAccountReferenceEntity</span>
    </span>
</div>

### /parties/{partyKey}/communication-channels
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels</span> <br/>
        <span class="api-summary">Retrieve a list of CommunicationChannel entities scoped by partyKey. getCommunicationChannelByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels</span> <br/>
        <span class="api-summary">Create a new CommunicationChannel entity. createCommunicationChannel</span>
    </span>
</div>

### /parties/{partyKey}/communication-channels/{communicationChannelKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CommunicationChannel entity. getommunicationChannelById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Replace a CommunicationChannel entity. replaceCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Partially update a CommunicationChannel entity. updateCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Delete a CommunicationChannel entity deleteCommunicationChannelEntity</span>
    </span>
</div>

### /parties/{partyKey}/garages
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages</span> <br/>
        <span class="api-summary">Retrieve a list of Garage entities scoped by partyKey. getGarageByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages</span> <br/>
        <span class="api-summary">Create a new Garage entity. createGarage</span>
    </span>
</div>

### /parties/{partyKey}/garages/{garageKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages/{garageKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Garage entity. getarageById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages/{garageKey}</span> <br/>
        <span class="api-summary">Replace a Garage entity. replaceGarage</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages/{garageKey}</span> <br/>
        <span class="api-summary">Partially update a Garage entity. updateGarage</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages/{garageKey}</span> <br/>
        <span class="api-summary">Delete a Garage entity deleteGarageEntity</span>
    </span>
</div>

### /parties/{partyKey}/people
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people</span> <br/>
        <span class="api-summary">Retrieve a list of Person entities scoped by partyKey. getPersonByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people</span> <br/>
        <span class="api-summary">Create a new Person entity. createPerson</span>
    </span>
</div>

### /parties/{partyKey}/people/{personKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Person entity. getersonById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Replace a Person entity. replacePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Partially update a Person entity. updatePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Delete a Person entity deletePersonEntity</span>
    </span>
</div>

### /parties/{partyKey}/garage-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items</span> <br/>
        <span class="api-summary">Retrieve a list of GarageItem entities scoped by partyKey. getGarageItemByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items</span> <br/>
        <span class="api-summary">Create a new GarageItem entity. createGarageItem</span>
    </span>
</div>

### /parties/{partyKey}/garage-items/{garageItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items/{garageItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific GarageItem entity. getarageItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items/{garageItemKey}</span> <br/>
        <span class="api-summary">Replace a GarageItem entity. replaceGarageItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items/{garageItemKey}</span> <br/>
        <span class="api-summary">Partially update a GarageItem entity. updateGarageItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items/{garageItemKey}</span> <br/>
        <span class="api-summary">Delete a GarageItem entity deleteGarageItemEntity</span>
    </span>
</div>

### /parties/{partyKey}/vehicle-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleIdentifier entities scoped by partyKey. getVehicleIdentifierByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Create a new VehicleIdentifier entity. createVehicleIdentifier</span>
    </span>
</div>

### /parties/{partyKey}/vehicle-identifiers/{vehicleIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleIdentifier entity. getehicleIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a VehicleIdentifier entity. replaceVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleIdentifier entity. updateVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a VehicleIdentifier entity deleteVehicleIdentifierEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Partyroot with key {PartyKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **partie** | /parties | listParty | createParty | getParty | updateParty | deleteParty |
    | **payment-term-reference** | /parties/{partyKey}/payment-term-references | listPaymentTermReferenceByPartyKey | createPaymentTermReference | getPaymentTermReferenceByPartyKey | updatePaymentTermReferenceByPartyKey | deletePaymentTermReferenceByPartyKey |
    | **discount** | /parties/{partyKey}/discounts | listDiscountByPartyKey | createDiscount | getDiscountByPartyKey | updateDiscountByPartyKey | deleteDiscountByPartyKey |
    | **addresse** | /parties/{partyKey}/addresses | listAddressByPartyKey | createAddress | getAddressByPartyKey | updateAddressByPartyKey | deleteAddressByPartyKey |
    | **org-profile** | /parties/{partyKey}/org-profiles | listOrgProfileByPartyKey | createOrgProfile | getOrgProfileByPartyKey | updateOrgProfileByPartyKey | deleteOrgProfileByPartyKey |
    | **org-name** | /parties/{partyKey}/org-names | listOrgNameByPartyKey | createOrgName | getOrgNameByPartyKey | updateOrgNameByPartyKey | deleteOrgNameByPartyKey |
    | **staff-member** | /parties/{partyKey}/staff-members | listStaffMemberByPartyKey | createStaffMember | getStaffMemberByPartyKey | updateStaffMemberByPartyKey | deleteStaffMemberByPartyKey |
    | **privacy-event** | /parties/{partyKey}/privacy-events | listPrivacyEventByPartyKey | createPrivacyEvent | getPrivacyEventByPartyKey | updatePrivacyEventByPartyKey | deletePrivacyEventByPartyKey |
    | **time-slot** | /parties/{partyKey}/time-slots | listTimeSlotByPartyKey |  | getTimeSlotByPartyKey | updateTimeSlotByPartyKey | deleteTimeSlotByPartyKey |
    | **address-locale** | /parties/{partyKey}/address-locales | listAddressLocaleByPartyKey | createAddressLocale | getAddressLocaleByPartyKey | updateAddressLocaleByPartyKey | deleteAddressLocaleByPartyKey |
    | **authorization** | /parties/{partyKey}/authorizations | listAuthorizationByPartyKey | createAuthorization | getAuthorizationByPartyKey | updateAuthorizationByPartyKey | deleteAuthorizationByPartyKey |
    | **metric-name-value** | /parties/{partyKey}/metric-name-values | listMetricNameValueByPartyKey | createMetricNameValue | getMetricNameValueByPartyKey | updateMetricNameValueByPartyKey | deleteMetricNameValueByPartyKey |
    | **department** | /parties/{partyKey}/departments | listDepartmentByPartyKey | createDepartment | getDepartmentByPartyKey | updateDepartmentByPartyKey | deleteDepartmentByPartyKey |
    | **identifier** | /parties/{partyKey}/identifiers | listIdentifierByPartyKey | createIdentifier | getIdentifierByPartyKey | updateIdentifierByPartyKey | deleteIdentifierByPartyKey |
    | **effective-period** | /parties/{partyKey}/effective-periods | listEffectivePeriodByPartyKey |  | getEffectivePeriodByPartyKey | updateEffectivePeriodByPartyKey | deleteEffectivePeriodByPartyKey |
    | **discount-policie** | /parties/{partyKey}/discount-policies | listDiscountPolicyByPartyKey | createDiscountPolicy | getDiscountPolicyByPartyKey | updateDiscountPolicyByPartyKey | deleteDiscountPolicyByPartyKey |
    | **privacy-item** | /parties/{partyKey}/privacy-items | listPrivacyItemByPartyKey | createPrivacyItem | getPrivacyItemByPartyKey | updatePrivacyItemByPartyKey | deletePrivacyItemByPartyKey |
    | **contact-method** | /parties/{partyKey}/contact-methods | listContactMethodByPartyKey | createContactMethod | getContactMethodByPartyKey | updateContactMethodByPartyKey | deleteContactMethodByPartyKey |
    | **person-name** | /parties/{partyKey}/person-names | listPersonNameByPartyKey | createPersonName | getPersonNameByPartyKey | updatePersonNameByPartyKey | deletePersonNameByPartyKey |
    | **payroll-rate** | /parties/{partyKey}/payroll-rates | listPayrollRateByPartyKey | createPayrollRate | getPayrollRateByPartyKey | updatePayrollRateByPartyKey | deletePayrollRateByPartyKey |
    | **position** | /parties/{partyKey}/positions | listPositionByPartyKey | createPosition | getPositionByPartyKey | updatePositionByPartyKey | deletePositionByPartyKey |
    | **control-account-reference** | /parties/{partyKey}/control-account-references | listControlAccountReferenceByPartyKey | createControlAccountReference | getControlAccountReferenceByPartyKey | updateControlAccountReferenceByPartyKey | deleteControlAccountReferenceByPartyKey |
    | **communication-channel** | /parties/{partyKey}/communication-channels | listCommunicationChannelByPartyKey | createCommunicationChannel | getCommunicationChannelByPartyKey | updateCommunicationChannelByPartyKey | deleteCommunicationChannelByPartyKey |
    | **garage** | /parties/{partyKey}/garages | listGarageByPartyKey | createGarage | getGarageByPartyKey | updateGarageByPartyKey | deleteGarageByPartyKey |
    | **people** | /parties/{partyKey}/people | listPersonByPartyKey | createPerson | getPersonByPartyKey | updatePersonByPartyKey | deletePersonByPartyKey |
    | **garage-item** | /parties/{partyKey}/garage-items | listGarageItemByPartyKey | createGarageItem | getGarageItemByPartyKey | updateGarageItemByPartyKey | deleteGarageItemByPartyKey |
    | **vehicle-identifier** | /parties/{partyKey}/vehicle-identifiers | listVehicleIdentifierByPartyKey | createVehicleIdentifier | getVehicleIdentifierByPartyKey | updateVehicleIdentifierByPartyKey | deleteVehicleIdentifierByPartyKey |

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