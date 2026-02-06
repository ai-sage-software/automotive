## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **Authorization**, **CommunicationChannel**, **Dealer**, **DealerService**, **DepartmentReference**, **Identifier**, **PartyReference**, **PayrollRate**, **PersonReference**, **PrivacyEvent**, **PrivacyItem**, **StaffAffinity**, **StaffCertification**, **StaffMember**, **StaffSkill**, **Team**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **party_identity** and **Dealer** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Dealer** | /dealers | Manages Dealers |
    | **StaffSkill** | /dealers/{dealerKey}/staff-skills | Manages StaffSkills belonging to Dealers |
    | **PayrollRate** | /dealers/{dealerKey}/payroll-rates | Manages PayrollRates belonging to Dealers |
    | **PersonReference** | /dealers/{dealerKey}/person-references | Manages PersonReferences belonging to Dealers |
    | **StaffMember** | /dealers/{dealerKey}/staff-members | Manages StaffMembers belonging to Dealers |
    | **TimeSlot** | /dealers/{dealerKey}/time-slots | Manages TimeSlots belonging to Dealers |
    | **PrivacyEvent** | /dealers/{dealerKey}/privacy-events | Manages PrivacyEvents belonging to Dealers |
    | **DepartmentReference** | /dealers/{dealerKey}/department-references | Manages DepartmentReferences belonging to Dealers |
    | **CommunicationChannel** | /dealers/{dealerKey}/communication-channels | Manages CommunicationChannels belonging to Dealers |
    | **Authorization** | /dealers/{dealerKey}/authorizations | Manages Authorizations belonging to Dealers |
    | **PartyReference** | /dealers/{dealerKey}/party-references | Manages PartyReferences belonging to Dealers |
    | **Money** | /dealers/{dealerKey}/money | Manages Money belonging to Dealers |
    | **StaffAffinitie** | /dealers/{dealerKey}/staff-affinities | Manages StaffAffinities belonging to Dealers |
    | **Identifier** | /dealers/{dealerKey}/identifiers | Manages Identifiers belonging to Dealers |
    | **StaffCertification** | /dealers/{dealerKey}/staff-certifications | Manages StaffCertifications belonging to Dealers |
    | **DealerService** | /dealers/{dealerKey}/dealer-services | Manages DealerServices belonging to Dealers |
    | **EffectivePeriod** | /dealers/{dealerKey}/effective-periods | Manages EffectivePeriods belonging to Dealers |
    | **Team** | /dealers/{dealerKey}/teams | Manages Teams belonging to Dealers |
    | **PrivacyItem** | /dealers/{dealerKey}/privacy-items | Manages PrivacyItems belonging to Dealers |
    | **TextualDetail** | /dealers/{dealerKey}/textual-details | Manages TextualDetails belonging to Dealers |


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
> `https://[Your-API-Host]/dealers`

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

💠 **CommunicationChannelTypes** : types of communication channels.<br/>
💠 **DaysOfWeekTypes** : types of days of weeks.<br/>
💠 **DealerServiceTypes** : types of dealer services.<br/>
💠 **DepartmentTypes** : types of departments.<br/>
💠 **DurationUOMTypes** : types of duration u o ms.<br/>
💠 **PartyRelationshipTypes** : types of party relationships.<br/>
💠 **PayrollCycleFrequencyTypes** : types of payroll cycle frequencys.<br/>
💠 **PrivacyContextTypes** : types of privacy contexts.<br/>
💠 **PrivacyLegalBasisTypes** : types of privacy legal basis.<br/>
💠 **PrivacyStateTypes** : types of privacy states.<br/>
💠 **PrivacyTypes** : types of privacys.<br/>
💠 **RoleTypes** : types of roles.<br/>
💠 **SkillCategoryTypes** : types of skill categorys.<br/>
💠 **StaffPayTypes** : types of staff pays.<br/>
💠 **TimeslotDirectiveTypes** : types of timeslot directives.<br/>

## ✅ Entities

---

✅ **EffectivePeriod** : effective.period.desc<br/>
✅ **Link** : link.desc<br/>
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


### /dealers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers</span> <br/>
        <span class="api-summary">Retrieve a list of Dealer entities. getDealer</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers</span> <br/>
        <span class="api-summary">Create a new Dealer entity. createDealer</span>
    </span>
</div>

### /dealers/{dealerKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Dealer entity. getealerById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}</span> <br/>
        <span class="api-summary">Replace a Dealer entity. replaceDealer</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}</span> <br/>
        <span class="api-summary">Partially update a Dealer entity. updatePartialDealer</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}</span> <br/>
        <span class="api-summary">Delete a Dealer entity deleteDealerEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/staff-skills
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-skills</span> <br/>
        <span class="api-summary">Retrieve a list of StaffSkill entities scoped by dealerKey. getStaffSkillByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-skills</span> <br/>
        <span class="api-summary">Create a new StaffSkill entity. createStaffSkill</span>
    </span>
</div>

### /dealers/{dealerKey}/staff-skills/{staffSkillKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-skills/{staffSkillKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffSkill entity. gettaffSkillById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-skills/{staffSkillKey}</span> <br/>
        <span class="api-summary">Replace a StaffSkill entity. replaceStaffSkill</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-skills/{staffSkillKey}</span> <br/>
        <span class="api-summary">Partially update a StaffSkill entity. updatePartialStaffSkill</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-skills/{staffSkillKey}</span> <br/>
        <span class="api-summary">Delete a StaffSkill entity deleteStaffSkillEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/payroll-rates
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates</span> <br/>
        <span class="api-summary">Retrieve a list of PayrollRate entities scoped by dealerKey. getPayrollRateByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates</span> <br/>
        <span class="api-summary">Create a new PayrollRate entity. createPayrollRate</span>
    </span>
</div>

### /dealers/{dealerKey}/payroll-rates/{payrollRateKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PayrollRate entity. getayrollRateById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Replace a PayrollRate entity. replacePayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Partially update a PayrollRate entity. updatePartialPayrollRate</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/payroll-rates/{payrollRateKey}</span> <br/>
        <span class="api-summary">Delete a PayrollRate entity deletePayrollRateEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/person-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/person-references</span> <br/>
        <span class="api-summary">Retrieve a list of PersonReference entities scoped by dealerKey. getPersonReferenceByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/person-references</span> <br/>
        <span class="api-summary">Create a new PersonReference entity. createPersonReference</span>
    </span>
</div>

### /dealers/{dealerKey}/person-references/{personReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/person-references/{personReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PersonReference entity. getersonReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/person-references/{personReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PersonReference entity. replacePersonReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/person-references/{personReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PersonReference entity. updatePartialPersonReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/person-references/{personReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PersonReference entity deletePersonReferenceEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/staff-members
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members</span> <br/>
        <span class="api-summary">Retrieve a list of StaffMember entities scoped by dealerKey. getStaffMemberByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members</span> <br/>
        <span class="api-summary">Create a new StaffMember entity. createStaffMember</span>
    </span>
</div>

### /dealers/{dealerKey}/staff-members/{staffMemberKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffMember entity. gettaffMemberById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Replace a StaffMember entity. replaceStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Partially update a StaffMember entity. updatePartialStaffMember</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-members/{staffMemberKey}</span> <br/>
        <span class="api-summary">Delete a StaffMember entity deleteStaffMemberEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/time-slots
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/time-slots</span> <br/>
        <span class="api-summary">Retrieve a list of TimeSlot entities scoped by dealerKey. getTimeSlotByDealerKey</span>
    </span>
</div>

### /dealers/{dealerKey}/time-slots/{timeSlotKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/time-slots/{timeSlotKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TimeSlot entity. getimeSlotById</span>
    </span>
</div>

### /dealers/{dealerKey}/privacy-events
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-events</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyEvent entities scoped by dealerKey. getPrivacyEventByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-events</span> <br/>
        <span class="api-summary">Create a new PrivacyEvent entity. createPrivacyEvent</span>
    </span>
</div>

### /dealers/{dealerKey}/privacy-events/{privacyEventKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyEvent entity. getrivacyEventById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyEvent entity. replacePrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyEvent entity. updatePartialPrivacyEvent</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-events/{privacyEventKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyEvent entity deletePrivacyEventEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/department-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/department-references</span> <br/>
        <span class="api-summary">Retrieve a list of DepartmentReference entities scoped by dealerKey. getDepartmentReferenceByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/department-references</span> <br/>
        <span class="api-summary">Create a new DepartmentReference entity. createDepartmentReference</span>
    </span>
</div>

### /dealers/{dealerKey}/department-references/{departmentReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/department-references/{departmentReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DepartmentReference entity. getepartmentReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/department-references/{departmentReferenceKey}</span> <br/>
        <span class="api-summary">Replace a DepartmentReference entity. replaceDepartmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/department-references/{departmentReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a DepartmentReference entity. updatePartialDepartmentReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/department-references/{departmentReferenceKey}</span> <br/>
        <span class="api-summary">Delete a DepartmentReference entity deleteDepartmentReferenceEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/communication-channels
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels</span> <br/>
        <span class="api-summary">Retrieve a list of CommunicationChannel entities scoped by dealerKey. getCommunicationChannelByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels</span> <br/>
        <span class="api-summary">Create a new CommunicationChannel entity. createCommunicationChannel</span>
    </span>
</div>

### /dealers/{dealerKey}/communication-channels/{communicationChannelKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CommunicationChannel entity. getommunicationChannelById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Replace a CommunicationChannel entity. replaceCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Partially update a CommunicationChannel entity. updatePartialCommunicationChannel</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/communication-channels/{communicationChannelKey}</span> <br/>
        <span class="api-summary">Delete a CommunicationChannel entity deleteCommunicationChannelEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/authorizations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/authorizations</span> <br/>
        <span class="api-summary">Retrieve a list of Authorization entities scoped by dealerKey. getAuthorizationByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/authorizations</span> <br/>
        <span class="api-summary">Create a new Authorization entity. createAuthorization</span>
    </span>
</div>

### /dealers/{dealerKey}/authorizations/{authorizationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Authorization entity. getuthorizationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Replace a Authorization entity. replaceAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Partially update a Authorization entity. updatePartialAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Delete a Authorization entity deleteAuthorizationEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/party-references
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-references</span> <br/>
        <span class="api-summary">Retrieve a list of PartyReference entities scoped by dealerKey. getPartyReferenceByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-references</span> <br/>
        <span class="api-summary">Create a new PartyReference entity. createPartyReference</span>
    </span>
</div>

### /dealers/{dealerKey}/party-references/{partyReferenceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PartyReference entity. getartyReferenceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Replace a PartyReference entity. replacePartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Partially update a PartyReference entity. updatePartialPartyReference</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/party-references/{partyReferenceKey}</span> <br/>
        <span class="api-summary">Delete a PartyReference entity deletePartyReferenceEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/money
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/money</span> <br/>
        <span class="api-summary">Retrieve a list of Money entities scoped by dealerKey. getMoneyByDealerKey</span>
    </span>
</div>

### /dealers/{dealerKey}/money/{moneyKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/money/{moneyKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Money entity. getoneyById</span>
    </span>
</div>

### /dealers/{dealerKey}/staff-affinities
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-affinities</span> <br/>
        <span class="api-summary">Retrieve a list of StaffAffinity entities scoped by dealerKey. getStaffAffinityByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-affinities</span> <br/>
        <span class="api-summary">Create a new StaffAffinity entity. createStaffAffinity</span>
    </span>
</div>

### /dealers/{dealerKey}/staff-affinities/{staffAffinityKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-affinities/{staffAffinityKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffAffinity entity. gettaffAffinityById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-affinities/{staffAffinityKey}</span> <br/>
        <span class="api-summary">Replace a StaffAffinity entity. replaceStaffAffinity</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-affinities/{staffAffinityKey}</span> <br/>
        <span class="api-summary">Partially update a StaffAffinity entity. updatePartialStaffAffinity</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-affinities/{staffAffinityKey}</span> <br/>
        <span class="api-summary">Delete a StaffAffinity entity deleteStaffAffinityEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by dealerKey. getIdentifierByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /dealers/{dealerKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updatePartialIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/staff-certifications
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-certifications</span> <br/>
        <span class="api-summary">Retrieve a list of StaffCertification entities scoped by dealerKey. getStaffCertificationByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-certifications</span> <br/>
        <span class="api-summary">Create a new StaffCertification entity. createStaffCertification</span>
    </span>
</div>

### /dealers/{dealerKey}/staff-certifications/{staffCertificationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-certifications/{staffCertificationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific StaffCertification entity. gettaffCertificationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-certifications/{staffCertificationKey}</span> <br/>
        <span class="api-summary">Replace a StaffCertification entity. replaceStaffCertification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-certifications/{staffCertificationKey}</span> <br/>
        <span class="api-summary">Partially update a StaffCertification entity. updatePartialStaffCertification</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/staff-certifications/{staffCertificationKey}</span> <br/>
        <span class="api-summary">Delete a StaffCertification entity deleteStaffCertificationEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/dealer-services
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services</span> <br/>
        <span class="api-summary">Retrieve a list of DealerService entities scoped by dealerKey. getDealerServiceByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services</span> <br/>
        <span class="api-summary">Create a new DealerService entity. createDealerService</span>
    </span>
</div>

### /dealers/{dealerKey}/dealer-services/{dealerServiceKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services/{dealerServiceKey}</span> <br/>
        <span class="api-summary">Retrieve a specific DealerService entity. getealerServiceById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services/{dealerServiceKey}</span> <br/>
        <span class="api-summary">Replace a DealerService entity. replaceDealerService</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services/{dealerServiceKey}</span> <br/>
        <span class="api-summary">Partially update a DealerService entity. updatePartialDealerService</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/dealer-services/{dealerServiceKey}</span> <br/>
        <span class="api-summary">Delete a DealerService entity deleteDealerServiceEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/effective-periods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/effective-periods</span> <br/>
        <span class="api-summary">Retrieve a list of EffectivePeriod entities scoped by dealerKey. getEffectivePeriodByDealerKey</span>
    </span>
</div>

### /dealers/{dealerKey}/effective-periods/{effectivePeriodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/effective-periods/{effectivePeriodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific EffectivePeriod entity. getffectivePeriodById</span>
    </span>
</div>

### /dealers/{dealerKey}/teams
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/teams</span> <br/>
        <span class="api-summary">Retrieve a list of Team entities scoped by dealerKey. getTeamByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/teams</span> <br/>
        <span class="api-summary">Create a new Team entity. createTeam</span>
    </span>
</div>

### /dealers/{dealerKey}/teams/{teamKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/teams/{teamKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Team entity. geteamById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/teams/{teamKey}</span> <br/>
        <span class="api-summary">Replace a Team entity. replaceTeam</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/teams/{teamKey}</span> <br/>
        <span class="api-summary">Partially update a Team entity. updatePartialTeam</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/teams/{teamKey}</span> <br/>
        <span class="api-summary">Delete a Team entity deleteTeamEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/privacy-items
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items</span> <br/>
        <span class="api-summary">Retrieve a list of PrivacyItem entities scoped by dealerKey. getPrivacyItemByDealerKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items</span> <br/>
        <span class="api-summary">Create a new PrivacyItem entity. createPrivacyItem</span>
    </span>
</div>

### /dealers/{dealerKey}/privacy-items/{privacyItemKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PrivacyItem entity. getrivacyItemById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Replace a PrivacyItem entity. replacePrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Partially update a PrivacyItem entity. updatePartialPrivacyItem</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/privacy-items/{privacyItemKey}</span> <br/>
        <span class="api-summary">Delete a PrivacyItem entity deletePrivacyItemEntity</span>
    </span>
</div>

### /dealers/{dealerKey}/textual-details
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/textual-details</span> <br/>
        <span class="api-summary">Retrieve a list of TextualDetail entities scoped by dealerKey. getTextualDetailByDealerKey</span>
    </span>
</div>

### /dealers/{dealerKey}/textual-details/{textualDetailKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/dealers/{dealerKey}/textual-details/{textualDetailKey}</span> <br/>
        <span class="api-summary">Retrieve a specific TextualDetail entity. getextualDetailById</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Dealerroot with key {DealerKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **dealer** | /dealers | listDealer | createDealer | getDealer | updateDealer | deleteDealer |
    | **staff-skill** | /dealers/{dealerKey}/staff-skills | listStaffSkillByDealerKey | createStaffSkill | getStaffSkillByDealerKey | updateStaffSkillByDealerKey | deleteStaffSkillByDealerKey |
    | **payroll-rate** | /dealers/{dealerKey}/payroll-rates | listPayrollRateByDealerKey | createPayrollRate | getPayrollRateByDealerKey | updatePayrollRateByDealerKey | deletePayrollRateByDealerKey |
    | **person-reference** | /dealers/{dealerKey}/person-references | listPersonReferenceByDealerKey | createPersonReference | getPersonReferenceByDealerKey | updatePersonReferenceByDealerKey | deletePersonReferenceByDealerKey |
    | **staff-member** | /dealers/{dealerKey}/staff-members | listStaffMemberByDealerKey | createStaffMember | getStaffMemberByDealerKey | updateStaffMemberByDealerKey | deleteStaffMemberByDealerKey |
    | **time-slot** | /dealers/{dealerKey}/time-slots | listTimeSlotByDealerKey |  | getTimeSlotByDealerKey | updateTimeSlotByDealerKey | deleteTimeSlotByDealerKey |
    | **privacy-event** | /dealers/{dealerKey}/privacy-events | listPrivacyEventByDealerKey | createPrivacyEvent | getPrivacyEventByDealerKey | updatePrivacyEventByDealerKey | deletePrivacyEventByDealerKey |
    | **department-reference** | /dealers/{dealerKey}/department-references | listDepartmentReferenceByDealerKey | createDepartmentReference | getDepartmentReferenceByDealerKey | updateDepartmentReferenceByDealerKey | deleteDepartmentReferenceByDealerKey |
    | **communication-channel** | /dealers/{dealerKey}/communication-channels | listCommunicationChannelByDealerKey | createCommunicationChannel | getCommunicationChannelByDealerKey | updateCommunicationChannelByDealerKey | deleteCommunicationChannelByDealerKey |
    | **authorization** | /dealers/{dealerKey}/authorizations | listAuthorizationByDealerKey | createAuthorization | getAuthorizationByDealerKey | updateAuthorizationByDealerKey | deleteAuthorizationByDealerKey |
    | **party-reference** | /dealers/{dealerKey}/party-references | listPartyReferenceByDealerKey | createPartyReference | getPartyReferenceByDealerKey | updatePartyReferenceByDealerKey | deletePartyReferenceByDealerKey |
    | **money** | /dealers/{dealerKey}/money | listMoneyByDealerKey |  | getMoneyByDealerKey | updateMoneyByDealerKey | deleteMoneyByDealerKey |
    | **staff-affinitie** | /dealers/{dealerKey}/staff-affinities | listStaffAffinityByDealerKey | createStaffAffinity | getStaffAffinityByDealerKey | updateStaffAffinityByDealerKey | deleteStaffAffinityByDealerKey |
    | **identifier** | /dealers/{dealerKey}/identifiers | listIdentifierByDealerKey | createIdentifier | getIdentifierByDealerKey | updateIdentifierByDealerKey | deleteIdentifierByDealerKey |
    | **staff-certification** | /dealers/{dealerKey}/staff-certifications | listStaffCertificationByDealerKey | createStaffCertification | getStaffCertificationByDealerKey | updateStaffCertificationByDealerKey | deleteStaffCertificationByDealerKey |
    | **dealer-service** | /dealers/{dealerKey}/dealer-services | listDealerServiceByDealerKey | createDealerService | getDealerServiceByDealerKey | updateDealerServiceByDealerKey | deleteDealerServiceByDealerKey |
    | **effective-period** | /dealers/{dealerKey}/effective-periods | listEffectivePeriodByDealerKey |  | getEffectivePeriodByDealerKey | updateEffectivePeriodByDealerKey | deleteEffectivePeriodByDealerKey |
    | **team** | /dealers/{dealerKey}/teams | listTeamByDealerKey | createTeam | getTeamByDealerKey | updateTeamByDealerKey | deleteTeamByDealerKey |
    | **privacy-item** | /dealers/{dealerKey}/privacy-items | listPrivacyItemByDealerKey | createPrivacyItem | getPrivacyItemByDealerKey | updatePrivacyItemByDealerKey | deletePrivacyItemByDealerKey |
    | **textual-detail** | /dealers/{dealerKey}/textual-details | listTextualDetailByDealerKey |  | getTextualDetailByDealerKey | updateTextualDetailByDealerKey | deleteTextualDetailByDealerKey |

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

## Bulk Create Dealer (`POST /dealers/batch`)

The `/dealers/batch` endpoint allows you to create multiple Dealer entities in a single HTTP request. This is significantly more efficient than making individual calls when dealing with large datasets, as it reduces network overhead and connection latency.

### Overview

This endpoint processes an array of Dealer and provides a **partial success** response. This means that if some items in your list are invalid, the valid items will still be created, and the API will return a detailed report of which specific items failed.

---

### Request Structure

The request body must be a JSON object containing an `items` array.

* **Max Items:** 100 per request.
* **Schema:** Each object in the `items` array should follow the `DealerCreate` schema.

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

Contains the full objects of the Dealer that were successfully created, including server-generated fields like `id` or `createdAt`.

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
"message": "A Dealer with SKU W-002 already exists."
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

## Health Check (`GET /dealers/health`)

The `/dealers/health` endpoint is a public diagnostic tool used to verify the current availability and operational state of the service. It is designed to be used by load balancers, monitoring tools, and automated deployment pipelines.

---

### Overview

This endpoint provides a quick "heartbeat" of the Dealer aggregated root. Because it is a public endpoint, it typically does not require authentication, making it ideal for external uptime monitors (like Pingdom or UptimeRobot) to ensure the service is responsive.

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

## Dealer Commands and State Management

The dealers API can handle complex business workflows. Rather than simple attribute updates, state changes are driven by explicit "Commands" that represent business intents.

---

### 1. Executing Commands (`POST /dealers/{DealerKey}/commands`)

This endpoint is the single entry point for all intents that change the state of a Dealer (e.g., rescheduling, cancelling, or deleting).

**Request Components:**

* **`type`**: The specific intent (e.g., `RescheduleSlot`).
* **`workflow_state`**: The target lifecycle state (e.g., `DELETED`).
* **`context`**: A flexible object containing the parameters required for that specific command type.

**Immediate Response:**
The API will return a `status`. If the operation is long-running, you will receive a `PENDING` or `PROCESSING` status along with a `commandId` and a `retry_after` header/property.

---

### 2. Command Polling (`GET /dealers/{DealerKey}/commands/{commandId}`)

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

### 3. Capability Discovery (`GET /dealers/capabilities`)

Before sending a command, you can "discover" what actions are valid for a Dealer based on its current state. This endpoint describes the **State Machine** governing the resource.

**Key Fields:**

* **`from_states`**: The states the Dealer must be in to accept this command.
* **`to_state`**: The resulting state after a successful command execution.
* **`parameters_ref`**: A reference to the data schema required in the `context` of the command.

#### Example Capabilities Table

| Command Type | From States | To State | Description |
| --- | --- | --- | --- |
| `CancelDealer` | `CREATED`, `ACTIVE` | `DELETED` | Voids the Dealer . |
| `ActivateDealer` | `PENDING` | `ACTIVE` | Moves a Dealer into the operational pool. |

---

### Execution Status Summary

| Status | Meaning | Action |
| --- | --- | --- |
| **`SUCCESS`** | Operation complete. | Process the `result` object. |
| **`PENDING` / `PROCESSING**` | Task is in the queue or running. | Poll again after `retry_after` period. |
| **`FAILED` / `VALIDATION_ERROR**` | Request was invalid or failed. | Check `message` and `errors`. Do not retry without changes. |
| **`MITIGATION_APPLIED`** | A failure occurred but was auto-corrected. | Verify the state of the entity. |
| **`REQUIRES_ACTION`** | Workflow is blocked. | Manual intervention or a follow-up command is needed. |
