## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **Address**, **Authorization**, **CommunicationChannel**, **ControlAccount**, **DailyHour**, **Dealer**, **DealerService**, **Department**, **Identifier**, **MetricNameValue**, **PartyIdentifier**, **PayrollRate**, **Person**, **PersonName**, **PrivacyEvent**, **PrivacyItem**, **StaffMember**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **party_identity** and **Dealer** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Dealer** | /dealers | Manages Dealers |
    | **Department** | /dealers/{dealerKey}/departments | Manages Departments belonging to Dealers |
    | **Identifier** | /dealers/{dealerKey}/identifiers | Manages Identifiers belonging to Dealers |
    | **PayrollRate** | /dealers/{dealerKey}/payroll-rates | Manages PayrollRates belonging to Dealers |
    | **DealerService** | /dealers/{dealerKey}/dealer-services | Manages DealerServices belonging to Dealers |
    | **PartyIdentifier** | /dealers/{dealerKey}/party-identifiers | Manages PartyIdentifiers belonging to Dealers |
    | **PrivacyItem** | /dealers/{dealerKey}/privacy-items | Manages PrivacyItems belonging to Dealers |
    | **StaffMember** | /dealers/{dealerKey}/staff-members | Manages StaffMembers belonging to Dealers |
    | **People** | /dealers/{dealerKey}/people | Manages People belonging to Dealers |
    | **CommunicationChannel** | /dealers/{dealerKey}/communication-channels | Manages CommunicationChannels belonging to Dealers |


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
> `https://[Your-API-Host]/dealer`

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

💠 **CommunicationChannelTypes** : types of communication channels.<br/>
💠 **DealerServiceTypes** : types of dealer services.<br/>
💠 **DepartmentTypes** : types of departments.<br/>
💠 **GenderTypes** : types of genders.<br/>
💠 **MaritalStatusTypes** : types of marital status.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PartyTypes** : types of partys.<br/>
💠 **PayrollCycleFrequencyTypes** : types of payroll cycle frequencys.<br/>
💠 **PrivacyTypes** : types of privacys.<br/>
💠 **RoleTypes** : types of roles.<br/>
💠 **StaffPayTypes** : types of staff pays.<br/>
💠 **NarrativeUomTypes** : entity<br/>
💠 **AddressTypes** : AddressTypes<br/>
💠 **DurationUOMTypes** : Units of Measure for Durations<br/>
💠 **DaysOfWeekTypes** : Status of the account<br/>
💠 **TimeslotDirectiveTypes** : Represents the directive for a timeslot.<br/>
💠 **PrivacyContextTypes** : Undocumented Enum<br/>
💠 **PrivacyLegalBasisTypes** : Defines the legal basis for processing personal...<br/>
💠 **PrivacyStateTypes** : Undocumented Enum<br/>
💠 **FinancialCategoryTypes** : Financial Category Types<br/>
💠 **ControlAccountTypes** : entity<br/>
💠 **ControlAccountRoleTypes** : Control Account Role.<br/>
💠 **ControlAccountStatusTypes** : Defines the various states or statuses for a fi...<br/>

## ✅ Entities

---

✅ **Addresses** : List of Address<br/>
✅ **Authorizations** : List of Authorization<br/>
✅ **Codes** : List of Codes<br/>
✅ **CommunicationChannels** : List of CommunicationChannel<br/>
✅ **ControlAccounts** : List of ControlAccount<br/>
✅ **DealerServices** : List of DealerService<br/>
✅ **EffectivePeriod** : Effective Period<br/>
✅ **Identifiers** : List of Identifier<br/>
✅ **Link** : Quick Link<br/>
✅ **Links** : List of Links<br/>
✅ **List** : List of RoleTypes<br/>
✅ **MetricNameValues** : List of MetricNameValue<br/>
✅ **Money** : Represents a monetary value, including its currency, locale, and display format.<br/>
✅ **PartyIdentifiers** : List of PartyIdentifier<br/>
✅ **PayrollRates** : List of PayrollRate<br/>
✅ **PrivacyEvents** : List of PrivacyEvent<br/>
✅ **PrivacyItems** : List of PrivacyItem<br/>
✅ **Staff** : List of StaffMember<br/>
✅ **TextualDetail** : not nullable<br/>
✅ **TextualDetails** : List of TextualDetail<br/>
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


### /dealers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers</span> <br/>
        <span class="api-summary">Retrieve a list of all Dealer records. getDealers</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers</span> <br/>
        <span class="api-summary">Create a new Dealer record. createDealer</span>
    </span>
</div>

### /dealers/{dealerKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Dealer record. getealerById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}</span> <br/>
        <span class="api-summary">Replace a Dealer record. replaceDealer</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}</span> <br/>
        <span class="api-summary">Partially update a Dealer record. updateDealer</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}</span> <br/>
        <span class="api-summary">Delete a Dealer Record deleteDealerRecord</span>
    </span>
</div>

### /dealers/{dealerKey}/departments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/departments</span> <br/>
        <span class="api-summary">Retrieve a list of Department records scoped by dealerKey. getDepartmentsByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/departments</span> <br/>
        <span class="api-summary">Create a new Department record. createDepartment</span>
    </span>
</div>

### /dealers/{dealerKey}/departments/{departmentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Department record. getepartmentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Replace a Department record. replaceDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Partially update a Department record. updateDepartment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/departments/{departmentKey}</span> <br/>
        <span class="api-summary">Delete a Department Record deleteDepartmentRecord</span>
    </span>
</div>

### /dealers/{dealerKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by dealerKey. getIdentifiersByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /dealers/{dealerKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /dealers/{dealerKey}/payroll-rates
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates</span> <br/>
        <span class="api-summary">Retrieve a list of PayrollRate records scoped by dealerKey. getPayrollRatesByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates</span> <br/>
        <span class="api-summary">Create a new PayrollRate record. createPayrollRate</span>
    </span>
</div>

### /dealers/{dealerKey}/payroll-rates/{payrollRateKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PayrollRate record. getayrollRateById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Replace a PayrollRate record. replacePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Partially update a PayrollRate record. updatePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Delete a PayrollRate Record deletePayrollRateRecord</span>
    </span>
</div>

### /dealers/{dealerKey}/dealer-services
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services</span> <br/>
        <span class="api-summary">Retrieve a list of DealerService records scoped by dealerKey. getDealerServicesByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services</span> <br/>
        <span class="api-summary">Create a new DealerService record. createDealerService</span>
    </span>
</div>

### /dealers/{dealerKey}/dealer-services/{dealerServiceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services/{dealerServiceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DealerService record. getealerServiceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services/{dealerServiceKey}</span> <br/>
        <span class="api-summary">Replace a DealerService record. replaceDealerService</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services/{dealerServiceKey}</span> <br/>
        <span class="api-summary">Partially update a DealerService record. updateDealerService</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services/{dealerServiceKey}</span> <br/>
        <span class="api-summary">Delete a DealerService Record deleteDealerServiceRecord</span>
    </span>
</div>

### /dealers/{dealerKey}/party-identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of PartyIdentifier records scoped by dealerKey. getPartyIdentifiersByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-identifiers</span> <br/>
        <span class="api-summary">Create a new PartyIdentifier record. createPartyIdentifier</span>
    </span>
</div>

### /dealers/{dealerKey}/party-identifiers/{partyIdentifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyIdentifier record. getartyIdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Replace a PartyIdentifier record. replacePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Partially update a PartyIdentifier record. updatePartyIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-identifiers/{partyIdentifierKey}</span> <br/>
        <span class="api-summary">Delete a PartyIdentifier Record deletePartyIdentifierRecord</span>
    </span>
</div>

### /dealers/{dealerKey}/privacy-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyItem records scoped by dealerKey. getPrivacyItemsByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items</span> <br/>
        <span class="api-summary">Create a new PrivacyItem record. createPrivacyItem</span>
    </span>
</div>

### /dealers/{dealerKey}/privacy-items/{privacyItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyItem record. getrivacyItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyItem record. replacePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyItem record. updatePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyItem Record deletePrivacyItemRecord</span>
    </span>
</div>

### /dealers/{dealerKey}/staff-members
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members</span> <br/>
        <span class="api-summary">Retrieve a list of StaffMember records scoped by dealerKey. getStaffMembersByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members</span> <br/>
        <span class="api-summary">Create a new StaffMember record. createStaffMember</span>
    </span>
</div>

### /dealers/{dealerKey}/staff-members/{staffMemberKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffMember record. gettaffMemberById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Replace a StaffMember record. replaceStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Partially update a StaffMember record. updateStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Delete a StaffMember Record deleteStaffMemberRecord</span>
    </span>
</div>

### /dealers/{dealerKey}/people
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/people</span> <br/>
        <span class="api-summary">Retrieve a list of Person records scoped by dealerKey. getPersonsByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/people</span> <br/>
        <span class="api-summary">Create a new Person record. createPerson</span>
    </span>
</div>

### /dealers/{dealerKey}/people/{personKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Person record. getersonById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Replace a Person record. replacePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Partially update a Person record. updatePerson</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/people/{personKey}</span> <br/>
        <span class="api-summary">Delete a Person Record deletePersonRecord</span>
    </span>
</div>

### /dealers/{dealerKey}/communication-channels
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels</span> <br/>
        <span class="api-summary">Retrieve a list of CommunicationChannel records scoped by dealerKey. getCommunicationChannelsByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels</span> <br/>
        <span class="api-summary">Create a new CommunicationChannel record. createCommunicationChannel</span>
    </span>
</div>

### /dealers/{dealerKey}/communication-channels/{communicationChannelKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CommunicationChannel record. getommunicationChannelById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Replace a CommunicationChannel record. replaceCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Partially update a CommunicationChannel record. updateCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Delete a CommunicationChannel Record deleteCommunicationChannelRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Dealerroot with key {DealerKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **dealer** | /dealers | listDealers | createDealer | getDealers | updateDealers | deleteDealers |
    | **department** | /dealers/{dealerKey}/departments | listDepartmentsByDealerKey | createDepartment | getDepartmentsByDealerKey | updateDepartmentsByDealerKey | deleteDepartmentsByDealerKey |
    | **identifier** | /dealers/{dealerKey}/identifiers | listIdentifiersByDealerKey | createIdentifier | getIdentifiersByDealerKey | updateIdentifiersByDealerKey | deleteIdentifiersByDealerKey |
    | **payroll-rate** | /dealers/{dealerKey}/payroll-rates | listPayrollRatesByDealerKey | createPayrollRate | getPayrollRatesByDealerKey | updatePayrollRatesByDealerKey | deletePayrollRatesByDealerKey |
    | **dealer-service** | /dealers/{dealerKey}/dealer-services | listDealerServicesByDealerKey | createDealerService | getDealerServicesByDealerKey | updateDealerServicesByDealerKey | deleteDealerServicesByDealerKey |
    | **party-identifier** | /dealers/{dealerKey}/party-identifiers | listPartyIdentifiersByDealerKey | createPartyIdentifier | getPartyIdentifiersByDealerKey | updatePartyIdentifiersByDealerKey | deletePartyIdentifiersByDealerKey |
    | **privacy-item** | /dealers/{dealerKey}/privacy-items | listPrivacyItemsByDealerKey | createPrivacyItem | getPrivacyItemsByDealerKey | updatePrivacyItemsByDealerKey | deletePrivacyItemsByDealerKey |
    | **staff-member** | /dealers/{dealerKey}/staff-members | listStaffMembersByDealerKey | createStaffMember | getStaffMembersByDealerKey | updateStaffMembersByDealerKey | deleteStaffMembersByDealerKey |
    | **people** | /dealers/{dealerKey}/people | listPersonsByDealerKey | createPerson | getPersonsByDealerKey | updatePersonsByDealerKey | deletePersonsByDealerKey |
    | **communication-channel** | /dealers/{dealerKey}/communication-channels | listCommunicationChannelsByDealerKey | createCommunicationChannel | getCommunicationChannelsByDealerKey | updateCommunicationChannelsByDealerKey | deleteCommunicationChannelsByDealerKey |

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