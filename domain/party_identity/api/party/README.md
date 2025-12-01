## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **Address**, **AddressLocale**, **Authorization**, **CommunicationChannel**, **ContactMethod**, **ControlAccountReference**, **Department**, **Discount**, **DiscountPolicy**, **Garage**, **GarageItem**, **Identifier**, **MetricNameValue**, **OrgName**, **OrgProfile**, **Party**, **PartyIdentifier**, **PaymentTermReference**, **PayrollRate**, **Person**, **PersonName**, **Position**, **PrivacyEvent**, **PrivacyItem**, **StaffMember**, **VehicleIdentifier**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **party_identity** and **Party** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **Partie** | /parties | Manages Parties |
    | **PaymentTermReference** | /parties/{partyKey}/payment-term-references | Manages PaymentTermReferences belonging to Parties |
    | **PersonName** | /parties/{partyKey}/person-names | Manages PersonNames belonging to Parties |
    | **Addresse** | /parties/{partyKey}/addresses | Manages Addresses belonging to Parties |
    | **OrgProfile** | /parties/{partyKey}/org-profiles | Manages OrgProfiles belonging to Parties |
    | **ControlAccountReference** | /parties/{partyKey}/control-account-references | Manages ControlAccountReferences belonging to Parties |
    | **OrgName** | /parties/{partyKey}/org-names | Manages OrgNames belonging to Parties |
    | **StaffMember** | /parties/{partyKey}/staff-members | Manages StaffMembers belonging to Parties |
    | **CommunicationChannel** | /parties/{partyKey}/communication-channels | Manages CommunicationChannels belonging to Parties |
    | **MetricNameValue** | /parties/{partyKey}/metric-name-values | Manages MetricNameValues belonging to Parties |
    | **Garage** | /parties/{partyKey}/garages | Manages Garages belonging to Parties |
    | **Identifier** | /parties/{partyKey}/identifiers | Manages Identifiers belonging to Parties |
    | **PrivacyItem** | /parties/{partyKey}/privacy-items | Manages PrivacyItems belonging to Parties |
    | **ContactMethod** | /parties/{partyKey}/contact-methods | Manages ContactMethods belonging to Parties |
    | **People** | /parties/{partyKey}/people | Manages People belonging to Parties |
    | **GarageItem** | /parties/{partyKey}/garage-items | Manages GarageItems belonging to Parties |


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
💠 **GenderTypes** : types of genders.<br/>
💠 **MaritalStatusTypes** : types of marital status.<br/>
💠 **NarrativeUomTypes** : types of narrative uoms.<br/>
💠 **OperatingStatusTypes** : types of operating status.<br/>
💠 **PartIdentifierTypes** : types of part identifiers.<br/>
💠 **PartyServiceTypes** : types of party services.<br/>
💠 **PartyTypes** : types of partys.<br/>
💠 **PrivacyTypes** : types of privacys.<br/>
💠 **RoleTypes** : types of roles.<br/>
💠 **DepartmentTypes** : Defines the various types of departments within...<br/>
💠 **PaymentTypes** : Undocumented Enum<br/>
💠 **OrderCategoryTypes** : Undocumented Enum<br/>
💠 **ProductViewTypes** : Undocumented Enum<br/>
💠 **ProductStateTypes** : Undocumented Enum<br/>
💠 **DiscountTypes** : Defines various types of discounts, such as per...<br/>
💠 **ValidationTypes** : Represents the level and type of validation an ...<br/>
💠 **DueOnTypes** : Defines various types of events or triggers on ...<br/>
💠 **PayrollCycleFrequencyTypes** : Undocumented Enum<br/>
💠 **StaffPayTypes** : Undocumented Enum<br/>
💠 **DurationUOMTypes** : Units of Measure for Durations<br/>
💠 **PartyRelationshipTypes** : Party Relationship<br/>
💠 **DaysOfWeekTypes** : Status of the account<br/>
💠 **TimeslotDirectiveTypes** : Represents the directive for a timeslot.<br/>
💠 **PrivacyContextTypes** : Undocumented Enum<br/>
💠 **PrivacyLegalBasisTypes** : Defines the legal basis for processing personal...<br/>
💠 **PrivacyStateTypes** : Undocumented Enum<br/>
💠 **LocationTypes** : Defines various types of geographical or logist...<br/>

## ✅ Entities

---

✅ **AddressLocales** : List of AddressLocale<br/>
✅ **Addresses** : List of Address<br/>
✅ **Authorizations** : List of Authorization<br/>
✅ **Codes** : List of Codes<br/>
✅ **CommunicationChannels** : List of CommunicationChannel<br/>
✅ **ContactMethods** : List of ContactMethod<br/>
✅ **ControlAccountReferences** : List of ControlAccountReference<br/>
✅ **Discounts** : List of Discount<br/>
✅ **EffectivePeriod** : Effective Period<br/>
✅ **GarageItems** : List of GarageItem<br/>
✅ **Identifiers** : List of Identifier<br/>
✅ **Link** : Quick Link<br/>
✅ **Links** : List of Links<br/>
✅ **List** : List of RoleTypes<br/>
✅ **MetricNameValues** : List of MetricNameValue<br/>
✅ **OrgProfiles** : List of OrgProfile<br/>
✅ **PartyIdentifiers** : List of PartyIdentifier<br/>
✅ **PaymentTermReferences** : List of PaymentTermReference<br/>
✅ **PayrollRates** : List of PayrollRate<br/>
✅ **Persons** : List of Person<br/>
✅ **PrivacyEvents** : List of PrivacyEvent<br/>
✅ **PrivacyItems** : List of PrivacyItem<br/>
✅ **Staff** : List of StaffMember<br/>
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

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under Partyroot with key {PartyKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **partie** | /parties | listPartys | createParty | getPartys | updatePartys | deletePartys |
    | **payment-term-reference** | /parties/{partyKey}/payment-term-references | listPaymentTermReferencesByPartyKey | createPaymentTermReference | getPaymentTermReferencesByPartyKey | updatePaymentTermReferencesByPartyKey | deletePaymentTermReferencesByPartyKey |
    | **person-name** | /parties/{partyKey}/person-names | listPersonNamesByPartyKey | createPersonName | getPersonNamesByPartyKey | updatePersonNamesByPartyKey | deletePersonNamesByPartyKey |
    | **addresse** | /parties/{partyKey}/addresses | listAddresssByPartyKey | createAddress | getAddresssByPartyKey | updateAddresssByPartyKey | deleteAddresssByPartyKey |
    | **org-profile** | /parties/{partyKey}/org-profiles | listOrgProfilesByPartyKey | createOrgProfile | getOrgProfilesByPartyKey | updateOrgProfilesByPartyKey | deleteOrgProfilesByPartyKey |
    | **control-account-reference** | /parties/{partyKey}/control-account-references | listControlAccountReferencesByPartyKey | createControlAccountReference | getControlAccountReferencesByPartyKey | updateControlAccountReferencesByPartyKey | deleteControlAccountReferencesByPartyKey |
    | **org-name** | /parties/{partyKey}/org-names | listOrgNamesByPartyKey | createOrgName | getOrgNamesByPartyKey | updateOrgNamesByPartyKey | deleteOrgNamesByPartyKey |
    | **staff-member** | /parties/{partyKey}/staff-members | listStaffMembersByPartyKey | createStaffMember | getStaffMembersByPartyKey | updateStaffMembersByPartyKey | deleteStaffMembersByPartyKey |
    | **communication-channel** | /parties/{partyKey}/communication-channels | listCommunicationChannelsByPartyKey | createCommunicationChannel | getCommunicationChannelsByPartyKey | updateCommunicationChannelsByPartyKey | deleteCommunicationChannelsByPartyKey |
    | **metric-name-value** | /parties/{partyKey}/metric-name-values | listMetricNameValuesByPartyKey | createMetricNameValue | getMetricNameValuesByPartyKey | updateMetricNameValuesByPartyKey | deleteMetricNameValuesByPartyKey |
    | **garage** | /parties/{partyKey}/garages | listGaragesByPartyKey | createGarage | getGaragesByPartyKey | updateGaragesByPartyKey | deleteGaragesByPartyKey |
    | **identifier** | /parties/{partyKey}/identifiers | listIdentifiersByPartyKey | createIdentifier | getIdentifiersByPartyKey | updateIdentifiersByPartyKey | deleteIdentifiersByPartyKey |
    | **privacy-item** | /parties/{partyKey}/privacy-items | listPrivacyItemsByPartyKey | createPrivacyItem | getPrivacyItemsByPartyKey | updatePrivacyItemsByPartyKey | deletePrivacyItemsByPartyKey |
    | **contact-method** | /parties/{partyKey}/contact-methods | listContactMethodsByPartyKey | createContactMethod | getContactMethodsByPartyKey | updateContactMethodsByPartyKey | deleteContactMethodsByPartyKey |
    | **people** | /parties/{partyKey}/people | listPersonsByPartyKey | createPerson | getPersonsByPartyKey | updatePersonsByPartyKey | deletePersonsByPartyKey |
    | **garage-item** | /parties/{partyKey}/garage-items | listGarageItemsByPartyKey | createGarageItem | getGarageItemsByPartyKey | updateGarageItemsByPartyKey | deleteGarageItemsByPartyKey |

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