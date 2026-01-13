## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **Address**, **AddressLocale**, **Authorization**, **CommunicationChannel**, **ControlAccount**, **DailyHour**, **Department**, **Identifier**, **MetricNameValue**, **PayrollRate**, **Person**, **PersonName**, **Position**, **PrivacyEvent**, **PrivacyItem**, **StaffMember**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **finance** and **StaffMember** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **StaffMember** | /staff-members | Manages StaffMembers |
    | **PersonName** | /staff-members/{staffMemberKey}/person-names | Manages PersonNames belonging to StaffMembers |
    | **PayrollRate** | /staff-members/{staffMemberKey}/payroll-rates | Manages PayrollRates belonging to StaffMembers |
    | **Addresse** | /staff-members/{staffMemberKey}/addresses | Manages Addresses belonging to StaffMembers |
    | **Position** | /staff-members/{staffMemberKey}/positions | Manages Positions belonging to StaffMembers |
    | **PrivacyEvent** | /staff-members/{staffMemberKey}/privacy-events | Manages PrivacyEvents belonging to StaffMembers |
    | **TimeSlot** | /staff-members/{staffMemberKey}/time-slots | Manages TimeSlots belonging to StaffMembers |
    | **ControlAccount** | /staff-members/{staffMemberKey}/control-accounts | Manages ControlAccounts belonging to StaffMembers |
    | **CommunicationChannel** | /staff-members/{staffMemberKey}/communication-channels | Manages CommunicationChannels belonging to StaffMembers |
    | **AddressLocale** | /staff-members/{staffMemberKey}/address-locales | Manages AddressLocales belonging to StaffMembers |
    | **Authorization** | /staff-members/{staffMemberKey}/authorizations | Manages Authorizations belonging to StaffMembers |
    | **Money** | /staff-members/{staffMemberKey}/money | Manages Money belonging to StaffMembers |
    | **Department** | /staff-members/{staffMemberKey}/departments | Manages Departments belonging to StaffMembers |
    | **MetricNameValue** | /staff-members/{staffMemberKey}/metric-name-values | Manages MetricNameValues belonging to StaffMembers |
    | **Identifier** | /staff-members/{staffMemberKey}/identifiers | Manages Identifiers belonging to StaffMembers |
    | **EffectivePeriod** | /staff-members/{staffMemberKey}/effective-periods | Manages EffectivePeriods belonging to StaffMembers |
    | **PrivacyItem** | /staff-members/{staffMemberKey}/privacy-items | Manages PrivacyItems belonging to StaffMembers |
    | **TextualDetail** | /staff-members/{staffMemberKey}/textual-details | Manages TextualDetails belonging to StaffMembers |
    | **People** | /staff-members/{staffMemberKey}/people | Manages People belonging to StaffMembers |


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
> `https://[Your-API-Host]/staffmembers`

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
💠 **CommunicationChannelTypes** : types of communication channels.<br/>
💠 **ControlAccountRoleTypes** : types of control account roles.<br/>
💠 **ControlAccountStatusTypes** : types of control account status.<br/>
💠 **ControlAccountTypes** : types of control accounts.<br/>
💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DepartmentTypes** : types of departments.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **FinancialCategoryTypes** : types of financial categorys.<br/>
💠 **GenderTypes** : types of genders.<br/>
💠 **LocationTypes** : types of locations.<br/>
💠 **MaritalStatusTypes** : types of marital status.<br/>
💠 **NarrativeUomTypes** : types of narrative uoms.<br/>
💠 **PartyTypes** : types of partys.<br/>
💠 **PayrollCycleFrequencyTypes** : types of payroll cycle frequencys.<br/>
💠 **PrivacyContextTypes** : types of privacy contexts.<br/>
💠 **PrivacyLegalBasisTypes** : types of privacy legal basis.<br/>
💠 **PrivacyStateTypes** : types of privacy states.<br/>
💠 **PrivacyTypes** : types of privacys.<br/>
💠 **RoleTypes** : types of roles.<br/>
💠 **StaffPayTypes** : types of staff pays.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : The date range during which this record is valid.<br/>
✅ **Link** : Link<br/>
✅ **Money** : Monetary value and currency information.<br/>
✅ **TextualDetail** : not nullable<br/>
✅ **TimeSlot** : Designated window of time for the activity.<br/>

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


### /staff-members
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members</span> <br/>
        <span class="api-summary">Retrieve a list of StaffMember entities. getStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members</span> <br/>
        <span class="api-summary">Create a new StaffMember entity. createStaffMember</span>
    </span>
</div>

### /staff-members/{staffMemberKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffMember entity. gettaffMemberById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Replace a StaffMember entity. replaceStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Partially update a StaffMember entity. updateStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Delete a StaffMember entity deleteStaffMemberEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/person-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names</span> <br/>
        <span class="api-summary">Retrieve a list of PersonName entities scoped by staffMemberKey. getPersonNameByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names</span> <br/>
        <span class="api-summary">Create a new PersonName entity. createPersonName</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/person-names/{personNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PersonName entity. getersonNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Replace a PersonName entity. replacePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Partially update a PersonName entity. updatePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Delete a PersonName entity deletePersonNameEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/payroll-rates
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates</span> <br/>
        <span class="api-summary">Retrieve a list of PayrollRate entities scoped by staffMemberKey. getPayrollRateByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates</span> <br/>
        <span class="api-summary">Create a new PayrollRate entity. createPayrollRate</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/payroll-rates/{payrollRateKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PayrollRate entity. getayrollRateById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Replace a PayrollRate entity. replacePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Partially update a PayrollRate entity. updatePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Delete a PayrollRate entity deletePayrollRateEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/addresses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses</span> <br/>
        <span class="api-summary">Retrieve a list of Address entities scoped by staffMemberKey. getAddressByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses</span> <br/>
        <span class="api-summary">Create a new Address entity. createAddress</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/addresses/{addressKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Address entity. getddressById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Replace a Address entity. replaceAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Partially update a Address entity. updateAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Delete a Address entity deleteAddressEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position entities scoped by staffMemberKey. getPositionByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position entity. createPosition</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position entity. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position entity. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position entity. updatePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position entity deletePositionEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/privacy-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyEvent entities scoped by staffMemberKey. getPrivacyEventByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events</span> <br/>
        <span class="api-summary">Create a new PrivacyEvent entity. createPrivacyEvent</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/privacy-events/{privacyEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyEvent entity. getrivacyEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyEvent entity. replacePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyEvent entity. updatePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyEvent entity deletePrivacyEventEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by staffMemberKey. getTimeSlotByStaffMemberKey</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/control-accounts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccount entities scoped by staffMemberKey. getControlAccountByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts</span> <br/>
        <span class="api-summary">Create a new ControlAccount entity. createControlAccount</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/control-accounts/{controlAccountKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccount entity. getontrolAccountById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccount entity. replaceControlAccount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccount entity. updateControlAccount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccount entity deleteControlAccountEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/communication-channels
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels</span> <br/>
        <span class="api-summary">Retrieve a list of CommunicationChannel entities scoped by staffMemberKey. getCommunicationChannelByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels</span> <br/>
        <span class="api-summary">Create a new CommunicationChannel entity. createCommunicationChannel</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/communication-channels/{communicationChannelKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CommunicationChannel entity. getommunicationChannelById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Replace a CommunicationChannel entity. replaceCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Partially update a CommunicationChannel entity. updateCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Delete a CommunicationChannel entity deleteCommunicationChannelEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/address-locales
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales</span> <br/>
        <span class="api-summary">Retrieve a list of AddressLocale entities scoped by staffMemberKey. getAddressLocaleByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales</span> <br/>
        <span class="api-summary">Create a new AddressLocale entity. createAddressLocale</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/address-locales/{addressLocaleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressLocale entity. getddressLocaleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Replace a AddressLocale entity. replaceAddressLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Partially update a AddressLocale entity. updateAddressLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Delete a AddressLocale entity deleteAddressLocaleEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/authorizations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations</span> <br/>
        <span class="api-summary">Retrieve a list of Authorization entities scoped by staffMemberKey. getAuthorizationByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations</span> <br/>
        <span class="api-summary">Create a new Authorization entity. createAuthorization</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/authorizations/{authorizationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Authorization entity. getuthorizationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Replace a Authorization entity. replaceAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Partially update a Authorization entity. updateAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Delete a Authorization entity deleteAuthorizationEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/money
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/money</span> <br/>
        <span class="api-summary">Retrieve a list of Money entities scoped by staffMemberKey. getMoneyByStaffMemberKey</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/money/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/money/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money entity. getoneyById</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/departments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments</span> <br/>
        <span class="api-summary">Retrieve a list of Department entities scoped by staffMemberKey. getDepartmentByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments</span> <br/>
        <span class="api-summary">Create a new Department entity. createDepartment</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/departments/{departmentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Department entity. getepartmentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Replace a Department entity. replaceDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Partially update a Department entity. updateDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Delete a Department entity deleteDepartmentEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/metric-name-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricNameValue entities scoped by staffMemberKey. getMetricNameValueByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values</span> <br/>
        <span class="api-summary">Create a new MetricNameValue entity. createMetricNameValue</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/metric-name-values/{metricNameValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricNameValue entity. getetricNameValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricNameValue entity. replaceMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricNameValue entity. updateMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricNameValue entity deleteMetricNameValueEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by staffMemberKey. getIdentifierByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by staffMemberKey. getEffectivePeriodByStaffMemberKey</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/privacy-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyItem entities scoped by staffMemberKey. getPrivacyItemByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items</span> <br/>
        <span class="api-summary">Create a new PrivacyItem entity. createPrivacyItem</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/privacy-items/{privacyItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyItem entity. getrivacyItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyItem entity. replacePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyItem entity. updatePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyItem entity deletePrivacyItemEntity</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail entities scoped by staffMemberKey. getTextualDetailByStaffMemberKey</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail entity. getextualDetailById</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/people
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people</span> <br/>
        <span class="api-summary">Retrieve a list of Person entities scoped by staffMemberKey. getPersonByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people</span> <br/>
        <span class="api-summary">Create a new Person entity. createPerson</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/people/{personKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Person entity. getersonById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Replace a Person entity. replacePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Partially update a Person entity. updatePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Delete a Person entity deletePersonEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under StaffMemberroot with key {StaffMemberKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **staff-member** | /staff-members | listStaffMember | createStaffMember | getStaffMember | updateStaffMember | deleteStaffMember |
    | **person-name** | /staff-members/{staffMemberKey}/person-names | listPersonNameByStaffMemberKey | createPersonName | getPersonNameByStaffMemberKey | updatePersonNameByStaffMemberKey | deletePersonNameByStaffMemberKey |
    | **payroll-rate** | /staff-members/{staffMemberKey}/payroll-rates | listPayrollRateByStaffMemberKey | createPayrollRate | getPayrollRateByStaffMemberKey | updatePayrollRateByStaffMemberKey | deletePayrollRateByStaffMemberKey |
    | **addresse** | /staff-members/{staffMemberKey}/addresses | listAddressByStaffMemberKey | createAddress | getAddressByStaffMemberKey | updateAddressByStaffMemberKey | deleteAddressByStaffMemberKey |
    | **position** | /staff-members/{staffMemberKey}/positions | listPositionByStaffMemberKey | createPosition | getPositionByStaffMemberKey | updatePositionByStaffMemberKey | deletePositionByStaffMemberKey |
    | **privacy-event** | /staff-members/{staffMemberKey}/privacy-events | listPrivacyEventByStaffMemberKey | createPrivacyEvent | getPrivacyEventByStaffMemberKey | updatePrivacyEventByStaffMemberKey | deletePrivacyEventByStaffMemberKey |
    | **time-slot** | /staff-members/{staffMemberKey}/time-slots | listTimeSlotByStaffMemberKey |  | getTimeSlotByStaffMemberKey | updateTimeSlotByStaffMemberKey | deleteTimeSlotByStaffMemberKey |
    | **control-account** | /staff-members/{staffMemberKey}/control-accounts | listControlAccountByStaffMemberKey | createControlAccount | getControlAccountByStaffMemberKey | updateControlAccountByStaffMemberKey | deleteControlAccountByStaffMemberKey |
    | **communication-channel** | /staff-members/{staffMemberKey}/communication-channels | listCommunicationChannelByStaffMemberKey | createCommunicationChannel | getCommunicationChannelByStaffMemberKey | updateCommunicationChannelByStaffMemberKey | deleteCommunicationChannelByStaffMemberKey |
    | **address-locale** | /staff-members/{staffMemberKey}/address-locales | listAddressLocaleByStaffMemberKey | createAddressLocale | getAddressLocaleByStaffMemberKey | updateAddressLocaleByStaffMemberKey | deleteAddressLocaleByStaffMemberKey |
    | **authorization** | /staff-members/{staffMemberKey}/authorizations | listAuthorizationByStaffMemberKey | createAuthorization | getAuthorizationByStaffMemberKey | updateAuthorizationByStaffMemberKey | deleteAuthorizationByStaffMemberKey |
    | **money** | /staff-members/{staffMemberKey}/money | listMoneyByStaffMemberKey |  | getMoneyByStaffMemberKey | updateMoneyByStaffMemberKey | deleteMoneyByStaffMemberKey |
    | **department** | /staff-members/{staffMemberKey}/departments | listDepartmentByStaffMemberKey | createDepartment | getDepartmentByStaffMemberKey | updateDepartmentByStaffMemberKey | deleteDepartmentByStaffMemberKey |
    | **metric-name-value** | /staff-members/{staffMemberKey}/metric-name-values | listMetricNameValueByStaffMemberKey | createMetricNameValue | getMetricNameValueByStaffMemberKey | updateMetricNameValueByStaffMemberKey | deleteMetricNameValueByStaffMemberKey |
    | **identifier** | /staff-members/{staffMemberKey}/identifiers | listIdentifierByStaffMemberKey | createIdentifier | getIdentifierByStaffMemberKey | updateIdentifierByStaffMemberKey | deleteIdentifierByStaffMemberKey |
    | **effective-period** | /staff-members/{staffMemberKey}/effective-periods | listEffectivePeriodByStaffMemberKey |  | getEffectivePeriodByStaffMemberKey | updateEffectivePeriodByStaffMemberKey | deleteEffectivePeriodByStaffMemberKey |
    | **privacy-item** | /staff-members/{staffMemberKey}/privacy-items | listPrivacyItemByStaffMemberKey | createPrivacyItem | getPrivacyItemByStaffMemberKey | updatePrivacyItemByStaffMemberKey | deletePrivacyItemByStaffMemberKey |
    | **textual-detail** | /staff-members/{staffMemberKey}/textual-details | listTextualDetailByStaffMemberKey |  | getTextualDetailByStaffMemberKey | updateTextualDetailByStaffMemberKey | deleteTextualDetailByStaffMemberKey |
    | **people** | /staff-members/{staffMemberKey}/people | listPersonByStaffMemberKey | createPerson | getPersonByStaffMemberKey | updatePersonByStaffMemberKey | deletePersonByStaffMemberKey |

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

## Bulk Create StaffMember (`POST /staffmembers/batch`)

The `/staffmembers/batch` endpoint allows you to create multiple StaffMember entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of StaffMember and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `StaffMemberCreate` schema.

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

Contains the full objects of the StaffMember that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A StaffMember with SKU W-002 already exists."
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

## Health Check (`GET /staffmembers/health`)

The `/staffmembers/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the StaffMember aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## StaffMember Commands and State Management

The staffmembers API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /staffmembers/{StaffMemberKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a StaffMember (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /staffmembers/{StaffMemberKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /staffmembers/capabilities`)

Before sending a command, you can "discover" what actions are valid for a StaffMember based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the StaffMember must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelStaffMember` | `CREATED`, `ACTIVE` | `DELETED` | Voids the StaffMember . |
| `ActivateStaffMember` | `PENDING` | `ACTIVE` | Moves a StaffMember into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |