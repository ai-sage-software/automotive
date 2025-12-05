## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **Address**, **AddressLocale**, **Authorization**, **CommunicationChannel**, **ControlAccount**, **ControlAccountReference**, **DailyHour**, **Department**, **Discount**, **DiscountMetricValue**, **DiscountPolicy**, **Identifier**, **MetricNameValue**, **OrgName**, **OrgProfile**, **PaymentTermReference**, **PayrollRate**, **Person**, **PersonName**, **Position**, **Price**, **PrivacyEvent**, **PrivacyItem**, **StaffMember**.

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
        <span class="api-summary">Retrieve a list of all OrgProfile records. getOrgProfiles</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles</span> <br/>
        <span class="api-summary">Create a new OrgProfile record. createOrgProfile</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Retrieve a specific OrgProfile record. getrgProfileById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Replace a OrgProfile record. replaceOrgProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Partially update a OrgProfile record. updateOrgProfile</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}</span> <br/>
        <span class="api-summary">Delete a OrgProfile Record deleteOrgProfileRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/payment-term-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references</span> <br/>
        <span class="api-summary">Retrieve a list of PaymentTermReference records scoped by orgProfileKey. getPaymentTermReferencesByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references</span> <br/>
        <span class="api-summary">Create a new PaymentTermReference record. createPaymentTermReference</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/payment-term-references/{paymentTermReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentTermReference record. getaymentTermReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PaymentTermReference record. replacePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentTermReference record. updatePaymentTermReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payment-term-references/{paymentTermReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PaymentTermReference Record deletePaymentTermReferenceRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discounts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts</span> <br/>
        <span class="api-summary">Retrieve a list of Discount records scoped by orgProfileKey. getDiscountsByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts</span> <br/>
        <span class="api-summary">Create a new Discount record. createDiscount</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discounts/{discountKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Discount record. getiscountById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Replace a Discount record. replaceDiscount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Partially update a Discount record. updateDiscount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discounts/{discountKey}</span> <br/>
        <span class="api-summary">Delete a Discount Record deleteDiscountRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/addresses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses</span> <br/>
        <span class="api-summary">Retrieve a list of Address records scoped by orgProfileKey. getAddresssByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses</span> <br/>
        <span class="api-summary">Create a new Address record. createAddress</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/addresses/{addressKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Address record. getddressById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Replace a Address record. replaceAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Partially update a Address record. updateAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Delete a Address Record deleteAddressRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/org-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names</span> <br/>
        <span class="api-summary">Retrieve a list of OrgName records scoped by orgProfileKey. getOrgNamesByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names</span> <br/>
        <span class="api-summary">Create a new OrgName record. createOrgName</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/org-names/{orgNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific OrgName record. getrgNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Replace a OrgName record. replaceOrgName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Partially update a OrgName record. updateOrgName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/org-names/{orgNameKey}</span> <br/>
        <span class="api-summary">Delete a OrgName Record deleteOrgNameRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/staff-members
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members</span> <br/>
        <span class="api-summary">Retrieve a list of StaffMember records scoped by orgProfileKey. getStaffMembersByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members</span> <br/>
        <span class="api-summary">Create a new StaffMember record. createStaffMember</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/staff-members/{staffMemberKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffMember record. gettaffMemberById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Replace a StaffMember record. replaceStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Partially update a StaffMember record. updateStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Delete a StaffMember Record deleteStaffMemberRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/privacy-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyEvent records scoped by orgProfileKey. getPrivacyEventsByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events</span> <br/>
        <span class="api-summary">Create a new PrivacyEvent record. createPrivacyEvent</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/privacy-events/{privacyEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyEvent record. getrivacyEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyEvent record. replacePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyEvent record. updatePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyEvent Record deletePrivacyEventRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot records scoped by orgProfileKey. getTimeSlotsByOrgProfileKey</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot record. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot record. replaceTimeSlot</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/control-accounts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccount records scoped by orgProfileKey. getControlAccountsByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts</span> <br/>
        <span class="api-summary">Create a new ControlAccount record. createControlAccount</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/control-accounts/{controlAccountKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccount record. getontrolAccountById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccount record. replaceControlAccount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccount record. updateControlAccount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccount Record deleteControlAccountRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/authorizations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations</span> <br/>
        <span class="api-summary">Retrieve a list of Authorization records scoped by orgProfileKey. getAuthorizationsByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations</span> <br/>
        <span class="api-summary">Create a new Authorization record. createAuthorization</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/authorizations/{authorizationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Authorization record. getuthorizationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Replace a Authorization record. replaceAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Partially update a Authorization record. updateAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Delete a Authorization Record deleteAuthorizationRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/moneys
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/moneys</span> <br/>
        <span class="api-summary">Retrieve a list of Money records scoped by orgProfileKey. getMoneysByOrgProfileKey</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/moneys/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money record. getoneyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Replace a Money record. replaceMoney</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/departments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments</span> <br/>
        <span class="api-summary">Retrieve a list of Department records scoped by orgProfileKey. getDepartmentsByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments</span> <br/>
        <span class="api-summary">Create a new Department record. createDepartment</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/departments/{departmentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Department record. getepartmentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Replace a Department record. replaceDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Partially update a Department record. updateDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Delete a Department Record deleteDepartmentRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/metric-name-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricNameValue records scoped by orgProfileKey. getMetricNameValuesByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values</span> <br/>
        <span class="api-summary">Create a new MetricNameValue record. createMetricNameValue</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/metric-name-values/{metricNameValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricNameValue record. getetricNameValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricNameValue record. replaceMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricNameValue record. updateMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricNameValue Record deleteMetricNameValueRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by orgProfileKey. getIdentifiersByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by orgProfileKey. getEffectivePeriodsByOrgProfileKey</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discount-policies
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountPolicy records scoped by orgProfileKey. getDiscountPolicysByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies</span> <br/>
        <span class="api-summary">Create a new DiscountPolicy record. createDiscountPolicy</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discount-policies/{discountPolicyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountPolicy record. getiscountPolicyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Replace a DiscountPolicy record. replaceDiscountPolicy</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountPolicy record. updateDiscountPolicy</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-policies/{discountPolicyKey}</span> <br/>
        <span class="api-summary">Delete a DiscountPolicy Record deleteDiscountPolicyRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/privacy-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyItem records scoped by orgProfileKey. getPrivacyItemsByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items</span> <br/>
        <span class="api-summary">Create a new PrivacyItem record. createPrivacyItem</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/privacy-items/{privacyItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyItem record. getrivacyItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyItem record. replacePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyItem record. updatePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyItem Record deletePrivacyItemRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/person-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names</span> <br/>
        <span class="api-summary">Retrieve a list of PersonName records scoped by orgProfileKey. getPersonNamesByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names</span> <br/>
        <span class="api-summary">Create a new PersonName record. createPersonName</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/person-names/{personNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PersonName record. getersonNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Replace a PersonName record. replacePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Partially update a PersonName record. updatePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Delete a PersonName Record deletePersonNameRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/payroll-rates
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates</span> <br/>
        <span class="api-summary">Retrieve a list of PayrollRate records scoped by orgProfileKey. getPayrollRatesByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates</span> <br/>
        <span class="api-summary">Create a new PayrollRate record. createPayrollRate</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/payroll-rates/{payrollRateKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PayrollRate record. getayrollRateById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Replace a PayrollRate record. replacePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Partially update a PayrollRate record. updatePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Delete a PayrollRate Record deletePayrollRateRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/control-account-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccountReference records scoped by orgProfileKey. getControlAccountReferencesByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references</span> <br/>
        <span class="api-summary">Create a new ControlAccountReference record. createControlAccountReference</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/control-account-references/{controlAccountReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccountReference record. getontrolAccountReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccountReference record. replaceControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccountReference record. updateControlAccountReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/control-account-references/{controlAccountReferenceKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccountReference Record deleteControlAccountReferenceRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/communication-channels
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels</span> <br/>
        <span class="api-summary">Retrieve a list of CommunicationChannel records scoped by orgProfileKey. getCommunicationChannelsByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels</span> <br/>
        <span class="api-summary">Create a new CommunicationChannel record. createCommunicationChannel</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/communication-channels/{communicationChannelKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CommunicationChannel record. getommunicationChannelById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Replace a CommunicationChannel record. replaceCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Partially update a CommunicationChannel record. updateCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Delete a CommunicationChannel Record deleteCommunicationChannelRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discount-metric-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values</span> <br/>
        <span class="api-summary">Retrieve a list of DiscountMetricValue records scoped by orgProfileKey. getDiscountMetricValuesByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values</span> <br/>
        <span class="api-summary">Create a new DiscountMetricValue record. createDiscountMetricValue</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/discount-metric-values/{discountMetricValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DiscountMetricValue record. getiscountMetricValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Replace a DiscountMetricValue record. replaceDiscountMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Partially update a DiscountMetricValue record. updateDiscountMetricValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/discount-metric-values/{discountMetricValueKey}</span> <br/>
        <span class="api-summary">Delete a DiscountMetricValue Record deleteDiscountMetricValueRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/prices
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices</span> <br/>
        <span class="api-summary">Retrieve a list of Price records scoped by orgProfileKey. getPricesByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices</span> <br/>
        <span class="api-summary">Create a new Price record. createPrice</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/prices/{priceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Price record. getriceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Replace a Price record. replacePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Partially update a Price record. updatePrice</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/prices/{priceKey}</span> <br/>
        <span class="api-summary">Delete a Price Record deletePriceRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail records scoped by orgProfileKey. getTextualDetailsByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details</span> <br/>
        <span class="api-summary">Create a new TextualDetail record. createTextualDetail</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail record. getextualDetailById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Replace a TextualDetail record. replaceTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Partially update a TextualDetail record. updateTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Delete a TextualDetail Record deleteTextualDetailRecord</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/people
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people</span> <br/>
        <span class="api-summary">Retrieve a list of Person records scoped by orgProfileKey. getPersonsByOrgProfileKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people</span> <br/>
        <span class="api-summary">Create a new Person record. createPerson</span>
    </span>
</div>

### /org-profiles/{orgProfileKey}/people/{personKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Person record. getersonById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Replace a Person record. replacePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Partially update a Person record. updatePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/org-profiles/{orgProfileKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Delete a Person Record deletePersonRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under OrgProfileroot with key {OrgProfileKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **org-profile** | /org-profiles | listOrgProfiles | createOrgProfile | getOrgProfiles | updateOrgProfiles | deleteOrgProfiles |
    | **payment-term-reference** | /org-profiles/{orgProfileKey}/payment-term-references | listPaymentTermReferencesByOrgProfileKey | createPaymentTermReference | getPaymentTermReferencesByOrgProfileKey | updatePaymentTermReferencesByOrgProfileKey | deletePaymentTermReferencesByOrgProfileKey |
    | **discount** | /org-profiles/{orgProfileKey}/discounts | listDiscountsByOrgProfileKey | createDiscount | getDiscountsByOrgProfileKey | updateDiscountsByOrgProfileKey | deleteDiscountsByOrgProfileKey |
    | **addresse** | /org-profiles/{orgProfileKey}/addresses | listAddresssByOrgProfileKey | createAddress | getAddresssByOrgProfileKey | updateAddresssByOrgProfileKey | deleteAddresssByOrgProfileKey |
    | **org-name** | /org-profiles/{orgProfileKey}/org-names | listOrgNamesByOrgProfileKey | createOrgName | getOrgNamesByOrgProfileKey | updateOrgNamesByOrgProfileKey | deleteOrgNamesByOrgProfileKey |
    | **staff-member** | /org-profiles/{orgProfileKey}/staff-members | listStaffMembersByOrgProfileKey | createStaffMember | getStaffMembersByOrgProfileKey | updateStaffMembersByOrgProfileKey | deleteStaffMembersByOrgProfileKey |
    | **privacy-event** | /org-profiles/{orgProfileKey}/privacy-events | listPrivacyEventsByOrgProfileKey | createPrivacyEvent | getPrivacyEventsByOrgProfileKey | updatePrivacyEventsByOrgProfileKey | deletePrivacyEventsByOrgProfileKey |
    | **time-slot** | /org-profiles/{orgProfileKey}/time-slots | listTimeSlotsByOrgProfileKey |  | getTimeSlotsByOrgProfileKey | updateTimeSlotsByOrgProfileKey | deleteTimeSlotsByOrgProfileKey |
    | **control-account** | /org-profiles/{orgProfileKey}/control-accounts | listControlAccountsByOrgProfileKey | createControlAccount | getControlAccountsByOrgProfileKey | updateControlAccountsByOrgProfileKey | deleteControlAccountsByOrgProfileKey |
    | **authorization** | /org-profiles/{orgProfileKey}/authorizations | listAuthorizationsByOrgProfileKey | createAuthorization | getAuthorizationsByOrgProfileKey | updateAuthorizationsByOrgProfileKey | deleteAuthorizationsByOrgProfileKey |
    | **money** | /org-profiles/{orgProfileKey}/moneys | listMoneysByOrgProfileKey |  | getMoneysByOrgProfileKey | updateMoneysByOrgProfileKey | deleteMoneysByOrgProfileKey |
    | **department** | /org-profiles/{orgProfileKey}/departments | listDepartmentsByOrgProfileKey | createDepartment | getDepartmentsByOrgProfileKey | updateDepartmentsByOrgProfileKey | deleteDepartmentsByOrgProfileKey |
    | **metric-name-value** | /org-profiles/{orgProfileKey}/metric-name-values | listMetricNameValuesByOrgProfileKey | createMetricNameValue | getMetricNameValuesByOrgProfileKey | updateMetricNameValuesByOrgProfileKey | deleteMetricNameValuesByOrgProfileKey |
    | **identifier** | /org-profiles/{orgProfileKey}/identifiers | listIdentifiersByOrgProfileKey | createIdentifier | getIdentifiersByOrgProfileKey | updateIdentifiersByOrgProfileKey | deleteIdentifiersByOrgProfileKey |
    | **effective-period** | /org-profiles/{orgProfileKey}/effective-periods | listEffectivePeriodsByOrgProfileKey |  | getEffectivePeriodsByOrgProfileKey | updateEffectivePeriodsByOrgProfileKey | deleteEffectivePeriodsByOrgProfileKey |
    | **discount-policie** | /org-profiles/{orgProfileKey}/discount-policies | listDiscountPolicysByOrgProfileKey | createDiscountPolicy | getDiscountPolicysByOrgProfileKey | updateDiscountPolicysByOrgProfileKey | deleteDiscountPolicysByOrgProfileKey |
    | **privacy-item** | /org-profiles/{orgProfileKey}/privacy-items | listPrivacyItemsByOrgProfileKey | createPrivacyItem | getPrivacyItemsByOrgProfileKey | updatePrivacyItemsByOrgProfileKey | deletePrivacyItemsByOrgProfileKey |
    | **person-name** | /org-profiles/{orgProfileKey}/person-names | listPersonNamesByOrgProfileKey | createPersonName | getPersonNamesByOrgProfileKey | updatePersonNamesByOrgProfileKey | deletePersonNamesByOrgProfileKey |
    | **payroll-rate** | /org-profiles/{orgProfileKey}/payroll-rates | listPayrollRatesByOrgProfileKey | createPayrollRate | getPayrollRatesByOrgProfileKey | updatePayrollRatesByOrgProfileKey | deletePayrollRatesByOrgProfileKey |
    | **control-account-reference** | /org-profiles/{orgProfileKey}/control-account-references | listControlAccountReferencesByOrgProfileKey | createControlAccountReference | getControlAccountReferencesByOrgProfileKey | updateControlAccountReferencesByOrgProfileKey | deleteControlAccountReferencesByOrgProfileKey |
    | **communication-channel** | /org-profiles/{orgProfileKey}/communication-channels | listCommunicationChannelsByOrgProfileKey | createCommunicationChannel | getCommunicationChannelsByOrgProfileKey | updateCommunicationChannelsByOrgProfileKey | deleteCommunicationChannelsByOrgProfileKey |
    | **discount-metric-value** | /org-profiles/{orgProfileKey}/discount-metric-values | listDiscountMetricValuesByOrgProfileKey | createDiscountMetricValue | getDiscountMetricValuesByOrgProfileKey | updateDiscountMetricValuesByOrgProfileKey | deleteDiscountMetricValuesByOrgProfileKey |
    | **price** | /org-profiles/{orgProfileKey}/prices | listPricesByOrgProfileKey | createPrice | getPricesByOrgProfileKey | updatePricesByOrgProfileKey | deletePricesByOrgProfileKey |
    | **textual-detail** | /org-profiles/{orgProfileKey}/textual-details | listTextualDetailsByOrgProfileKey | createTextualDetail | getTextualDetailsByOrgProfileKey | updateTextualDetailsByOrgProfileKey | deleteTextualDetailsByOrgProfileKey |
    | **people** | /org-profiles/{orgProfileKey}/people | listPersonsByOrgProfileKey | createPerson | getPersonsByOrgProfileKey | updatePersonsByOrgProfileKey | deletePersonsByOrgProfileKey |

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