## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **Address**, **AddressLocale**, **Authorization**, **CommunicationChannel**, **ControlAccount**, **DailyHour**, **Department**, **Identifier**, **MetricNameValue**, **PayrollRate**, **Person**, **PersonName**, **Position**, **PrivacyEvent**, **PrivacyItem**, **StaffMember**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **human_resources** and **StaffMember** resource as the primary entity, with several resources scoped under it via various path parameters.

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
    | **Money** | /staff-members/{staffMemberKey}/moneys | Manages Moneys belonging to StaffMembers |
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
> `https://[Your-API-Host]/staff-member`

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


### /staff-members
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members</span> <br/>
        <span class="api-summary">Retrieve a list of all StaffMember records. getStaffMembers</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members</span> <br/>
        <span class="api-summary">Create a new StaffMember record. createStaffMember</span>
    </span>
</div>

### /staff-members/{staffMemberKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffMember record. gettaffMemberById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Replace a StaffMember record. replaceStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Partially update a StaffMember record. updateStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Delete a StaffMember Record deleteStaffMemberRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/person-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names</span> <br/>
        <span class="api-summary">Retrieve a list of PersonName records scoped by staffMemberKey. getPersonNamesByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names</span> <br/>
        <span class="api-summary">Create a new PersonName record. createPersonName</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/person-names/{personNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PersonName record. getersonNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Replace a PersonName record. replacePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Partially update a PersonName record. updatePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Delete a PersonName Record deletePersonNameRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/payroll-rates
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates</span> <br/>
        <span class="api-summary">Retrieve a list of PayrollRate records scoped by staffMemberKey. getPayrollRatesByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates</span> <br/>
        <span class="api-summary">Create a new PayrollRate record. createPayrollRate</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/payroll-rates/{payrollRateKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PayrollRate record. getayrollRateById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Replace a PayrollRate record. replacePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Partially update a PayrollRate record. updatePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Delete a PayrollRate Record deletePayrollRateRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/addresses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses</span> <br/>
        <span class="api-summary">Retrieve a list of Address records scoped by staffMemberKey. getAddresssByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses</span> <br/>
        <span class="api-summary">Create a new Address record. createAddress</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/addresses/{addressKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Address record. getddressById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Replace a Address record. replaceAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Partially update a Address record. updateAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Delete a Address Record deleteAddressRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position records scoped by staffMemberKey. getPositionsByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position record. createPosition</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position record. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position record. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position record. updatePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position Record deletePositionRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/privacy-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyEvent records scoped by staffMemberKey. getPrivacyEventsByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events</span> <br/>
        <span class="api-summary">Create a new PrivacyEvent record. createPrivacyEvent</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/privacy-events/{privacyEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyEvent record. getrivacyEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyEvent record. replacePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyEvent record. updatePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyEvent Record deletePrivacyEventRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot records scoped by staffMemberKey. getTimeSlotsByStaffMemberKey</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot record. getimeSlotById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Replace a TimeSlot record. replaceTimeSlot</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/control-accounts
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts</span> <br/>
        <span class="api-summary">Retrieve a list of ControlAccount records scoped by staffMemberKey. getControlAccountsByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts</span> <br/>
        <span class="api-summary">Create a new ControlAccount record. createControlAccount</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/control-accounts/{controlAccountKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ControlAccount record. getontrolAccountById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Replace a ControlAccount record. replaceControlAccount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Partially update a ControlAccount record. updateControlAccount</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/control-accounts/{controlAccountKey}</span> <br/>
        <span class="api-summary">Delete a ControlAccount Record deleteControlAccountRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/communication-channels
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels</span> <br/>
        <span class="api-summary">Retrieve a list of CommunicationChannel records scoped by staffMemberKey. getCommunicationChannelsByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels</span> <br/>
        <span class="api-summary">Create a new CommunicationChannel record. createCommunicationChannel</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/communication-channels/{communicationChannelKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CommunicationChannel record. getommunicationChannelById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Replace a CommunicationChannel record. replaceCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Partially update a CommunicationChannel record. updateCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Delete a CommunicationChannel Record deleteCommunicationChannelRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/address-locales
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales</span> <br/>
        <span class="api-summary">Retrieve a list of AddressLocale records scoped by staffMemberKey. getAddressLocalesByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales</span> <br/>
        <span class="api-summary">Create a new AddressLocale record. createAddressLocale</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/address-locales/{addressLocaleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressLocale record. getddressLocaleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Replace a AddressLocale record. replaceAddressLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Partially update a AddressLocale record. updateAddressLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Delete a AddressLocale Record deleteAddressLocaleRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/authorizations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations</span> <br/>
        <span class="api-summary">Retrieve a list of Authorization records scoped by staffMemberKey. getAuthorizationsByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations</span> <br/>
        <span class="api-summary">Create a new Authorization record. createAuthorization</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/authorizations/{authorizationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Authorization record. getuthorizationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Replace a Authorization record. replaceAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Partially update a Authorization record. updateAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Delete a Authorization Record deleteAuthorizationRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/moneys
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/moneys</span> <br/>
        <span class="api-summary">Retrieve a list of Money records scoped by staffMemberKey. getMoneysByStaffMemberKey</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/moneys/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money record. getoneyById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/moneys/{moneyKey}</span> <br/>
        <span class="api-summary">Replace a Money record. replaceMoney</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/departments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments</span> <br/>
        <span class="api-summary">Retrieve a list of Department records scoped by staffMemberKey. getDepartmentsByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments</span> <br/>
        <span class="api-summary">Create a new Department record. createDepartment</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/departments/{departmentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Department record. getepartmentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Replace a Department record. replaceDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Partially update a Department record. updateDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Delete a Department Record deleteDepartmentRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/metric-name-values
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values</span> <br/>
        <span class="api-summary">Retrieve a list of MetricNameValue records scoped by staffMemberKey. getMetricNameValuesByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values</span> <br/>
        <span class="api-summary">Create a new MetricNameValue record. createMetricNameValue</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/metric-name-values/{metricNameValueKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Retrieve a specific MetricNameValue record. getetricNameValueById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Replace a MetricNameValue record. replaceMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Partially update a MetricNameValue record. updateMetricNameValue</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/metric-name-values/{metricNameValueKey}</span> <br/>
        <span class="api-summary">Delete a MetricNameValue Record deleteMetricNameValueRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by staffMemberKey. getIdentifiersByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod records scoped by staffMemberKey. getEffectivePeriodsByStaffMemberKey</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod record. getffectivePeriodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Replace a EffectivePeriod record. replaceEffectivePeriod</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/privacy-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyItem records scoped by staffMemberKey. getPrivacyItemsByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items</span> <br/>
        <span class="api-summary">Create a new PrivacyItem record. createPrivacyItem</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/privacy-items/{privacyItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyItem record. getrivacyItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyItem record. replacePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyItem record. updatePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyItem Record deletePrivacyItemRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail records scoped by staffMemberKey. getTextualDetailsByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/textual-details</span> <br/>
        <span class="api-summary">Create a new TextualDetail record. createTextualDetail</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail record. getextualDetailById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Replace a TextualDetail record. replaceTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Partially update a TextualDetail record. updateTextualDetail</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Delete a TextualDetail Record deleteTextualDetailRecord</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/people
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people</span> <br/>
        <span class="api-summary">Retrieve a list of Person records scoped by staffMemberKey. getPersonsByStaffMemberKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people</span> <br/>
        <span class="api-summary">Create a new Person record. createPerson</span>
    </span>
</div>

### /staff-members/{staffMemberKey}/people/{personKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Person record. getersonById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Replace a Person record. replacePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Partially update a Person record. updatePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/staff-members/{staffMemberKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Delete a Person Record deletePersonRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under StaffMemberroot with key {StaffMemberKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **staff-member** | /staff-members | listStaffMembers | createStaffMember | getStaffMembers | updateStaffMembers | deleteStaffMembers |
    | **person-name** | /staff-members/{staffMemberKey}/person-names | listPersonNamesByStaffMemberKey | createPersonName | getPersonNamesByStaffMemberKey | updatePersonNamesByStaffMemberKey | deletePersonNamesByStaffMemberKey |
    | **payroll-rate** | /staff-members/{staffMemberKey}/payroll-rates | listPayrollRatesByStaffMemberKey | createPayrollRate | getPayrollRatesByStaffMemberKey | updatePayrollRatesByStaffMemberKey | deletePayrollRatesByStaffMemberKey |
    | **addresse** | /staff-members/{staffMemberKey}/addresses | listAddresssByStaffMemberKey | createAddress | getAddresssByStaffMemberKey | updateAddresssByStaffMemberKey | deleteAddresssByStaffMemberKey |
    | **position** | /staff-members/{staffMemberKey}/positions | listPositionsByStaffMemberKey | createPosition | getPositionsByStaffMemberKey | updatePositionsByStaffMemberKey | deletePositionsByStaffMemberKey |
    | **privacy-event** | /staff-members/{staffMemberKey}/privacy-events | listPrivacyEventsByStaffMemberKey | createPrivacyEvent | getPrivacyEventsByStaffMemberKey | updatePrivacyEventsByStaffMemberKey | deletePrivacyEventsByStaffMemberKey |
    | **time-slot** | /staff-members/{staffMemberKey}/time-slots | listTimeSlotsByStaffMemberKey |  | getTimeSlotsByStaffMemberKey | updateTimeSlotsByStaffMemberKey | deleteTimeSlotsByStaffMemberKey |
    | **control-account** | /staff-members/{staffMemberKey}/control-accounts | listControlAccountsByStaffMemberKey | createControlAccount | getControlAccountsByStaffMemberKey | updateControlAccountsByStaffMemberKey | deleteControlAccountsByStaffMemberKey |
    | **communication-channel** | /staff-members/{staffMemberKey}/communication-channels | listCommunicationChannelsByStaffMemberKey | createCommunicationChannel | getCommunicationChannelsByStaffMemberKey | updateCommunicationChannelsByStaffMemberKey | deleteCommunicationChannelsByStaffMemberKey |
    | **address-locale** | /staff-members/{staffMemberKey}/address-locales | listAddressLocalesByStaffMemberKey | createAddressLocale | getAddressLocalesByStaffMemberKey | updateAddressLocalesByStaffMemberKey | deleteAddressLocalesByStaffMemberKey |
    | **authorization** | /staff-members/{staffMemberKey}/authorizations | listAuthorizationsByStaffMemberKey | createAuthorization | getAuthorizationsByStaffMemberKey | updateAuthorizationsByStaffMemberKey | deleteAuthorizationsByStaffMemberKey |
    | **money** | /staff-members/{staffMemberKey}/moneys | listMoneysByStaffMemberKey |  | getMoneysByStaffMemberKey | updateMoneysByStaffMemberKey | deleteMoneysByStaffMemberKey |
    | **department** | /staff-members/{staffMemberKey}/departments | listDepartmentsByStaffMemberKey | createDepartment | getDepartmentsByStaffMemberKey | updateDepartmentsByStaffMemberKey | deleteDepartmentsByStaffMemberKey |
    | **metric-name-value** | /staff-members/{staffMemberKey}/metric-name-values | listMetricNameValuesByStaffMemberKey | createMetricNameValue | getMetricNameValuesByStaffMemberKey | updateMetricNameValuesByStaffMemberKey | deleteMetricNameValuesByStaffMemberKey |
    | **identifier** | /staff-members/{staffMemberKey}/identifiers | listIdentifiersByStaffMemberKey | createIdentifier | getIdentifiersByStaffMemberKey | updateIdentifiersByStaffMemberKey | deleteIdentifiersByStaffMemberKey |
    | **effective-period** | /staff-members/{staffMemberKey}/effective-periods | listEffectivePeriodsByStaffMemberKey |  | getEffectivePeriodsByStaffMemberKey | updateEffectivePeriodsByStaffMemberKey | deleteEffectivePeriodsByStaffMemberKey |
    | **privacy-item** | /staff-members/{staffMemberKey}/privacy-items | listPrivacyItemsByStaffMemberKey | createPrivacyItem | getPrivacyItemsByStaffMemberKey | updatePrivacyItemsByStaffMemberKey | deletePrivacyItemsByStaffMemberKey |
    | **textual-detail** | /staff-members/{staffMemberKey}/textual-details | listTextualDetailsByStaffMemberKey | createTextualDetail | getTextualDetailsByStaffMemberKey | updateTextualDetailsByStaffMemberKey | deleteTextualDetailsByStaffMemberKey |
    | **people** | /staff-members/{staffMemberKey}/people | listPersonsByStaffMemberKey | createPerson | getPersonsByStaffMemberKey | updatePersonsByStaffMemberKey | deletePersonsByStaffMemberKey |

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