## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **Address**, **AddressLocale**, **Authorization**, **CommunicationChannel**, **ContactMethod**, **ControlAccount**, **ControlAccountReference**, **DailyHour**, **Department**, **Discount**, **DiscountMetricValue**, **DiscountPolicy**, **Garage**, **GarageItem**, **Identifier**, **MetricNameValue**, **MetricValue**, **OrgName**, **OrgProfile**, **Party**, **PaymentTermReference**, **PayrollRate**, **Person**, **PersonName**, **Position**, **Price**, **PrivacyEvent**, **PrivacyItem**, **StaffMember**, **Vehicle**, **VehicleIdentifier**, **VehicleLicense**.

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
💠 **VehicleHistoryEventTypes** : Represents a historical event or significant ch...<br/>
💠 **ControlAccountTypes** : entity<br/>
💠 **InventoryStatusTypes** : entity<br/>
💠 **UnitOfMeasureTypes** : Represents a comprehensive list of units of mea...<br/>
💠 **PriceTypes** : entity<br/>
💠 **FinancialCategoryTypes** : Financial Category Types<br/>
💠 **ControlAccountRoleTypes** : Control Account Role.<br/>
💠 **ControlAccountStatusTypes** : Defines the various states or statuses for a fi...<br/>

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
        <span class="api-summary">Retrieve a list of all Party records. getPartys</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties</span> <br/>
        <span class="api-summary">Create a new Party record. createParty</span>
    </span>
</div>

### /parties/{partyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Party record. getartyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}</span> <br/>
        <span class="api-summary">Replace a Party record. replaceParty</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}</span> <br/>
        <span class="api-summary">Partially update a Party record. updateParty</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}</span> <br/>
        <span class="api-summary">Delete a Party Record deletePartyRecord</span>
    </span>
</div>

### /parties/{partyKey}/payment-term-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentTermReference records scoped by partyKey. getPaymentTermReferencesByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references</span> <br/>
        <span class="api-summary">Create a new PaymentTermReference record. createPaymentTermReference</span>
    </span>
</div>

### /parties/{partyKey}/payment-term-references/{paymentTermReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentTermReference record. getaymentTermReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentTermReference record. replacePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentTermReference record. updatePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentTermReference Record deletePaymentTermReferenceRecord</span>
    </span>
</div>

### /parties/{partyKey}/discounts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts</span> <br/>
        <span class="api-summary">Retrieve a list of Discount records scoped by partyKey. getDiscountsByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts</span> <br/>
        <span class="api-summary">Create a new Discount record. createDiscount</span>
    </span>
</div>

### /parties/{partyKey}/discounts/{discountKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Discount record. getiscountById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Replace a Discount record. replaceDiscount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Partially update a Discount record. updateDiscount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Delete a Discount Record deleteDiscountRecord</span>
    </span>
</div>

### /parties/{partyKey}/addresses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses</span> <br/>
        <span class="api-summary">Retrieve a list of Address records scoped by partyKey. getAddresssByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses</span> <br/>
        <span class="api-summary">Create a new Address record. createAddress</span>
    </span>
</div>

### /parties/{partyKey}/addresses/{addressKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Address record. getddressById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Replace a Address record. replaceAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Partially update a Address record. updateAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Delete a Address Record deleteAddressRecord</span>
    </span>
</div>

### /parties/{partyKey}/org-profiles
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles</span> <br/>
        <span class="api-summary">Retrieve a list of OrgProfile records scoped by partyKey. getOrgProfilesByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles</span> <br/>
        <span class="api-summary">Create a new OrgProfile record. createOrgProfile</span>
    </span>
</div>

### /parties/{partyKey}/org-profiles/{orgProfileKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Retrieve a specific OrgProfile record. getrgProfileById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Replace a OrgProfile record. replaceOrgProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Partially update a OrgProfile record. updateOrgProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Delete a OrgProfile Record deleteOrgProfileRecord</span>
    </span>
</div>

### /parties/{partyKey}/org-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names</span> <br/>
        <span class="api-summary">Retrieve a list of OrgName records scoped by partyKey. getOrgNamesByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names</span> <br/>
        <span class="api-summary">Create a new OrgName record. createOrgName</span>
    </span>
</div>

### /parties/{partyKey}/org-names/{orgNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific OrgName record. getrgNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Replace a OrgName record. replaceOrgName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Partially update a OrgName record. updateOrgName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Delete a OrgName Record deleteOrgNameRecord</span>
    </span>
</div>

### /parties/{partyKey}/staff-members
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members</span> <br/>
        <span class="api-summary">Retrieve a list of StaffMember records scoped by partyKey. getStaffMembersByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members</span> <br/>
        <span class="api-summary">Create a new StaffMember record. createStaffMember</span>
    </span>
</div>

### /parties/{partyKey}/staff-members/{staffMemberKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffMember record. gettaffMemberById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Replace a StaffMember record. replaceStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Partially update a StaffMember record. updateStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Delete a StaffMember Record deleteStaffMemberRecord</span>
    </span>
</div>

### /parties/{partyKey}/privacy-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyEvent records scoped by partyKey. getPrivacyEventsByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events</span> <br/>
        <span class="api-summary">Create a new PrivacyEvent record. createPrivacyEvent</span>
    </span>
</div>

### /parties/{partyKey}/privacy-events/{privacyEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyEvent record. getrivacyEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyEvent record. replacePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyEvent record. updatePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyEvent Record deletePrivacyEventRecord</span>
    </span>
</div>

### /parties/{partyKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot records scoped by partyKey. getTimeSlotsByPartyKey</span>
    </span>
</div>

### /parties/{partyKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot record. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot record. replaceTimeSlot</span>
    </span>
</div>

### /parties/{partyKey}/address-locales
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales</span> <br/>
        <span class="api-summary">Retrieve a list of AddressLocale records scoped by partyKey. getAddressLocalesByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales</span> <br/>
        <span class="api-summary">Create a new AddressLocale record. createAddressLocale</span>
    </span>
</div>

### /parties/{partyKey}/address-locales/{addressLocaleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressLocale record. getddressLocaleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Replace a AddressLocale record. replaceAddressLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Partially update a AddressLocale record. updateAddressLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Delete a AddressLocale Record deleteAddressLocaleRecord</span>
    </span>
</div>

### /parties/{partyKey}/authorizations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations</span> <br/>
        <span class="api-summary">Retrieve a list of Authorization records scoped by partyKey. getAuthorizationsByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations</span> <br/>
        <span class="api-summary">Create a new Authorization record. createAuthorization</span>
    </span>
</div>

### /parties/{partyKey}/authorizations/{authorizationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Authorization record. getuthorizationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Replace a Authorization record. replaceAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Partially update a Authorization record. updateAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Delete a Authorization Record deleteAuthorizationRecord</span>
    </span>
</div>

### /parties/{partyKey}/metric-name-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricNameValue records scoped by partyKey. getMetricNameValuesByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values</span> <br/>
        <span class="api-summary">Create a new MetricNameValue record. createMetricNameValue</span>
    </span>
</div>

### /parties/{partyKey}/metric-name-values/{metricNameValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricNameValue record. getetricNameValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricNameValue record. replaceMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricNameValue record. updateMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricNameValue Record deleteMetricNameValueRecord</span>
    </span>
</div>

### /parties/{partyKey}/departments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments</span> <br/>
        <span class="api-summary">Retrieve a list of Department records scoped by partyKey. getDepartmentsByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments</span> <br/>
        <span class="api-summary">Create a new Department record. createDepartment</span>
    </span>
</div>

### /parties/{partyKey}/departments/{departmentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Department record. getepartmentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Replace a Department record. replaceDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Partially update a Department record. updateDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Delete a Department Record deleteDepartmentRecord</span>
    </span>
</div>

### /parties/{partyKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by partyKey. getIdentifiersByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /parties/{partyKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /parties/{partyKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by partyKey. getEffectivePeriodsByPartyKey</span>
    </span>
</div>

### /parties/{partyKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /parties/{partyKey}/discount-policies
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountPolicy records scoped by partyKey. getDiscountPolicysByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies</span> <br/>
        <span class="api-summary">Create a new DiscountPolicy record. createDiscountPolicy</span>
    </span>
</div>

### /parties/{partyKey}/discount-policies/{discountPolicyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountPolicy record. getiscountPolicyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Replace a DiscountPolicy record. replaceDiscountPolicy</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountPolicy record. updateDiscountPolicy</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Delete a DiscountPolicy Record deleteDiscountPolicyRecord</span>
    </span>
</div>

### /parties/{partyKey}/privacy-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyItem records scoped by partyKey. getPrivacyItemsByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items</span> <br/>
        <span class="api-summary">Create a new PrivacyItem record. createPrivacyItem</span>
    </span>
</div>

### /parties/{partyKey}/privacy-items/{privacyItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyItem record. getrivacyItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyItem record. replacePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyItem record. updatePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyItem Record deletePrivacyItemRecord</span>
    </span>
</div>

### /parties/{partyKey}/contact-methods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods</span> <br/>
        <span class="api-summary">Retrieve a list of ContactMethod records scoped by partyKey. getContactMethodsByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods</span> <br/>
        <span class="api-summary">Create a new ContactMethod record. createContactMethod</span>
    </span>
</div>

### /parties/{partyKey}/contact-methods/{contactMethodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods/{contactMethodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ContactMethod record. getontactMethodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods/{contactMethodKey}</span> <br/>
        <span class="api-summary">Replace a ContactMethod record. replaceContactMethod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods/{contactMethodKey}</span> <br/>
        <span class="api-summary">Partially update a ContactMethod record. updateContactMethod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/contact-methods/{contactMethodKey}</span> <br/>
        <span class="api-summary">Delete a ContactMethod Record deleteContactMethodRecord</span>
    </span>
</div>

### /parties/{partyKey}/person-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names</span> <br/>
        <span class="api-summary">Retrieve a list of PersonName records scoped by partyKey. getPersonNamesByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names</span> <br/>
        <span class="api-summary">Create a new PersonName record. createPersonName</span>
    </span>
</div>

### /parties/{partyKey}/person-names/{personNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PersonName record. getersonNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Replace a PersonName record. replacePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Partially update a PersonName record. updatePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Delete a PersonName Record deletePersonNameRecord</span>
    </span>
</div>

### /parties/{partyKey}/payroll-rates
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates</span> <br/>
        <span class="api-summary">Retrieve a list of PayrollRate records scoped by partyKey. getPayrollRatesByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates</span> <br/>
        <span class="api-summary">Create a new PayrollRate record. createPayrollRate</span>
    </span>
</div>

### /parties/{partyKey}/payroll-rates/{payrollRateKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PayrollRate record. getayrollRateById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Replace a PayrollRate record. replacePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Partially update a PayrollRate record. updatePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Delete a PayrollRate Record deletePayrollRateRecord</span>
    </span>
</div>

### /parties/{partyKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position records scoped by partyKey. getPositionsByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position record. createPosition</span>
    </span>
</div>

### /parties/{partyKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position record. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position record. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position record. updatePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position Record deletePositionRecord</span>
    </span>
</div>

### /parties/{partyKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference records scoped by partyKey. getControlAccountReferencesByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference record. createControlAccountReference</span>
    </span>
</div>

### /parties/{partyKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference record. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference record. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference record. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference Record deleteControlAccountReferenceRecord</span>
    </span>
</div>

### /parties/{partyKey}/communication-channels
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels</span> <br/>
        <span class="api-summary">Retrieve a list of CommunicationChannel records scoped by partyKey. getCommunicationChannelsByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels</span> <br/>
        <span class="api-summary">Create a new CommunicationChannel record. createCommunicationChannel</span>
    </span>
</div>

### /parties/{partyKey}/communication-channels/{communicationChannelKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CommunicationChannel record. getommunicationChannelById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Replace a CommunicationChannel record. replaceCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Partially update a CommunicationChannel record. updateCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Delete a CommunicationChannel Record deleteCommunicationChannelRecord</span>
    </span>
</div>

### /parties/{partyKey}/garages
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages</span> <br/>
        <span class="api-summary">Retrieve a list of Garage records scoped by partyKey. getGaragesByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages</span> <br/>
        <span class="api-summary">Create a new Garage record. createGarage</span>
    </span>
</div>

### /parties/{partyKey}/garages/{garageKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages/{garageKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Garage record. getarageById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages/{garageKey}</span> <br/>
        <span class="api-summary">Replace a Garage record. replaceGarage</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages/{garageKey}</span> <br/>
        <span class="api-summary">Partially update a Garage record. updateGarage</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garages/{garageKey}</span> <br/>
        <span class="api-summary">Delete a Garage Record deleteGarageRecord</span>
    </span>
</div>

### /parties/{partyKey}/people
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people</span> <br/>
        <span class="api-summary">Retrieve a list of Person records scoped by partyKey. getPersonsByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people</span> <br/>
        <span class="api-summary">Create a new Person record. createPerson</span>
    </span>
</div>

### /parties/{partyKey}/people/{personKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Person record. getersonById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Replace a Person record. replacePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Partially update a Person record. updatePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Delete a Person Record deletePersonRecord</span>
    </span>
</div>

### /parties/{partyKey}/garage-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items</span> <br/>
        <span class="api-summary">Retrieve a list of GarageItem records scoped by partyKey. getGarageItemsByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items</span> <br/>
        <span class="api-summary">Create a new GarageItem record. createGarageItem</span>
    </span>
</div>

### /parties/{partyKey}/garage-items/{garageItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items/{garageItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific GarageItem record. getarageItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items/{garageItemKey}</span> <br/>
        <span class="api-summary">Replace a GarageItem record. replaceGarageItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items/{garageItemKey}</span> <br/>
        <span class="api-summary">Partially update a GarageItem record. updateGarageItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/garage-items/{garageItemKey}</span> <br/>
        <span class="api-summary">Delete a GarageItem Record deleteGarageItemRecord</span>
    </span>
</div>

### /parties/{partyKey}/vehicle-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of VehicleIdentifier records scoped by partyKey. getVehicleIdentifiersByPartyKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers</span> <br/>
        <span class="api-summary">Create a new VehicleIdentifier record. createVehicleIdentifier</span>
    </span>
</div>

### /parties/{partyKey}/vehicle-identifiers/{vehicleIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific VehicleIdentifier record. getehicleIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a VehicleIdentifier record. replaceVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a VehicleIdentifier record. updateVehicleIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/parties/{partyKey}/vehicle-identifiers/{vehicleIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a VehicleIdentifier Record deleteVehicleIdentifierRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Partyroot with key {PartyKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **partie** | /parties | listPartys | createParty | getPartys | updatePartys | deletePartys |
    | **payment-term-reference** | /parties/{partyKey}/payment-term-references | listPaymentTermReferencesByPartyKey | createPaymentTermReference | getPaymentTermReferencesByPartyKey | updatePaymentTermReferencesByPartyKey | deletePaymentTermReferencesByPartyKey |
    | **discount** | /parties/{partyKey}/discounts | listDiscountsByPartyKey | createDiscount | getDiscountsByPartyKey | updateDiscountsByPartyKey | deleteDiscountsByPartyKey |
    | **addresse** | /parties/{partyKey}/addresses | listAddresssByPartyKey | createAddress | getAddresssByPartyKey | updateAddresssByPartyKey | deleteAddresssByPartyKey |
    | **org-profile** | /parties/{partyKey}/org-profiles | listOrgProfilesByPartyKey | createOrgProfile | getOrgProfilesByPartyKey | updateOrgProfilesByPartyKey | deleteOrgProfilesByPartyKey |
    | **org-name** | /parties/{partyKey}/org-names | listOrgNamesByPartyKey | createOrgName | getOrgNamesByPartyKey | updateOrgNamesByPartyKey | deleteOrgNamesByPartyKey |
    | **staff-member** | /parties/{partyKey}/staff-members | listStaffMembersByPartyKey | createStaffMember | getStaffMembersByPartyKey | updateStaffMembersByPartyKey | deleteStaffMembersByPartyKey |
    | **privacy-event** | /parties/{partyKey}/privacy-events | listPrivacyEventsByPartyKey | createPrivacyEvent | getPrivacyEventsByPartyKey | updatePrivacyEventsByPartyKey | deletePrivacyEventsByPartyKey |
    | **time-slot** | /parties/{partyKey}/time-slots | listTimeSlotsByPartyKey |  | getTimeSlotsByPartyKey | updateTimeSlotsByPartyKey | deleteTimeSlotsByPartyKey |
    | **address-locale** | /parties/{partyKey}/address-locales | listAddressLocalesByPartyKey | createAddressLocale | getAddressLocalesByPartyKey | updateAddressLocalesByPartyKey | deleteAddressLocalesByPartyKey |
    | **authorization** | /parties/{partyKey}/authorizations | listAuthorizationsByPartyKey | createAuthorization | getAuthorizationsByPartyKey | updateAuthorizationsByPartyKey | deleteAuthorizationsByPartyKey |
    | **metric-name-value** | /parties/{partyKey}/metric-name-values | listMetricNameValuesByPartyKey | createMetricNameValue | getMetricNameValuesByPartyKey | updateMetricNameValuesByPartyKey | deleteMetricNameValuesByPartyKey |
    | **department** | /parties/{partyKey}/departments | listDepartmentsByPartyKey | createDepartment | getDepartmentsByPartyKey | updateDepartmentsByPartyKey | deleteDepartmentsByPartyKey |
    | **identifier** | /parties/{partyKey}/identifiers | listIdentifiersByPartyKey | createIdentifier | getIdentifiersByPartyKey | updateIdentifiersByPartyKey | deleteIdentifiersByPartyKey |
    | **effective-period** | /parties/{partyKey}/effective-periods | listEffectivePeriodsByPartyKey |  | getEffectivePeriodsByPartyKey | updateEffectivePeriodsByPartyKey | deleteEffectivePeriodsByPartyKey |
    | **discount-policie** | /parties/{partyKey}/discount-policies | listDiscountPolicysByPartyKey | createDiscountPolicy | getDiscountPolicysByPartyKey | updateDiscountPolicysByPartyKey | deleteDiscountPolicysByPartyKey |
    | **privacy-item** | /parties/{partyKey}/privacy-items | listPrivacyItemsByPartyKey | createPrivacyItem | getPrivacyItemsByPartyKey | updatePrivacyItemsByPartyKey | deletePrivacyItemsByPartyKey |
    | **contact-method** | /parties/{partyKey}/contact-methods | listContactMethodsByPartyKey | createContactMethod | getContactMethodsByPartyKey | updateContactMethodsByPartyKey | deleteContactMethodsByPartyKey |
    | **person-name** | /parties/{partyKey}/person-names | listPersonNamesByPartyKey | createPersonName | getPersonNamesByPartyKey | updatePersonNamesByPartyKey | deletePersonNamesByPartyKey |
    | **payroll-rate** | /parties/{partyKey}/payroll-rates | listPayrollRatesByPartyKey | createPayrollRate | getPayrollRatesByPartyKey | updatePayrollRatesByPartyKey | deletePayrollRatesByPartyKey |
    | **position** | /parties/{partyKey}/positions | listPositionsByPartyKey | createPosition | getPositionsByPartyKey | updatePositionsByPartyKey | deletePositionsByPartyKey |
    | **control-account-reference** | /parties/{partyKey}/control-account-references | listControlAccountReferencesByPartyKey | createControlAccountReference | getControlAccountReferencesByPartyKey | updateControlAccountReferencesByPartyKey | deleteControlAccountReferencesByPartyKey |
    | **communication-channel** | /parties/{partyKey}/communication-channels | listCommunicationChannelsByPartyKey | createCommunicationChannel | getCommunicationChannelsByPartyKey | updateCommunicationChannelsByPartyKey | deleteCommunicationChannelsByPartyKey |
    | **garage** | /parties/{partyKey}/garages | listGaragesByPartyKey | createGarage | getGaragesByPartyKey | updateGaragesByPartyKey | deleteGaragesByPartyKey |
    | **people** | /parties/{partyKey}/people | listPersonsByPartyKey | createPerson | getPersonsByPartyKey | updatePersonsByPartyKey | deletePersonsByPartyKey |
    | **garage-item** | /parties/{partyKey}/garage-items | listGarageItemsByPartyKey | createGarageItem | getGarageItemsByPartyKey | updateGarageItemsByPartyKey | deleteGarageItemsByPartyKey |
    | **vehicle-identifier** | /parties/{partyKey}/vehicle-identifiers | listVehicleIdentifiersByPartyKey | createVehicleIdentifier | getVehicleIdentifiersByPartyKey | updateVehicleIdentifiersByPartyKey | deleteVehicleIdentifiersByPartyKey |

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