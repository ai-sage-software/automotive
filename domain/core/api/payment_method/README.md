## 🚗 STAR Domain API Specification (Automotive Retail Ontology.)

This contains the OpenAPI specification for the **Domain API Specification**, which provides an interface for managing automotive retail entities such as **Address**, **AddressLocale**, **Authorization**, **BankBeneficiary**, **BankIntermediary**, **CashPayment**, **CheckPayment**, **CreditCard**, **ElectronicPayment**, **Identifier**, **PaymentMethod**, **PersonName**, **PlatformPayment**, **Position**, **RewardPayment**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **core** and **PaymentMethod** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PaymentMethod** | /payment-methods | Manages PaymentMethods |
    | **BankIntermediarie** | /payment-methods/{paymentMethodKey}/bank-intermediaries | Manages BankIntermediaries belonging to PaymentMethods |
    | **RewardPayment** | /payment-methods/{paymentMethodKey}/reward-payments | Manages RewardPayments belonging to PaymentMethods |
    | **PersonName** | /payment-methods/{paymentMethodKey}/person-names | Manages PersonNames belonging to PaymentMethods |
    | **Identifier** | /payment-methods/{paymentMethodKey}/identifiers | Manages Identifiers belonging to PaymentMethods |
    | **Addresse** | /payment-methods/{paymentMethodKey}/addresses | Manages Addresses belonging to PaymentMethods |
    | **CheckPayment** | /payment-methods/{paymentMethodKey}/check-payments | Manages CheckPayments belonging to PaymentMethods |
    | **CashPayment** | /payment-methods/{paymentMethodKey}/cash-payments | Manages CashPayments belonging to PaymentMethods |
    | **BankBeneficiarie** | /payment-methods/{paymentMethodKey}/bank-beneficiaries | Manages BankBeneficiaries belonging to PaymentMethods |
    | **CreditCard** | /payment-methods/{paymentMethodKey}/credit-cards | Manages CreditCards belonging to PaymentMethods |
    | **ElectronicPayment** | /payment-methods/{paymentMethodKey}/electronic-payments | Manages ElectronicPayments belonging to PaymentMethods |
    | **PlatformPayment** | /payment-methods/{paymentMethodKey}/platform-payments | Manages PlatformPayments belonging to PaymentMethods |


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
> `https://[Your-API-Host]/payment-method`

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
💠 **BankAccountTypes** : types of bank accounts.<br/>
💠 **CreditCardStatusTypes** : types of credit card status.<br/>
💠 **CreditCardTypes** : types of credit cards.<br/>
💠 **FundingTypes** : types of fundings.<br/>
💠 **PaymentStatusTypes** : types of payment status.<br/>
💠 **RewardEventTypes** : types of reward events.<br/>
💠 **LocationTypes** : Defines various types of geographical or logist...<br/>

## ✅ Entities

---

✅ **AddressLocales** : List of AddressLocale<br/>
✅ **Authorizations** : List of Authorization<br/>
✅ **CashPayments** : List of CashPayment<br/>
✅ **CheckPayments** : List of CheckPayment<br/>
✅ **Codes** : List of Codes<br/>
✅ **CreditCards** : List of CreditCard<br/>
✅ **ElectronicPayments** : List of ElectronicPayment<br/>
✅ **Identifiers** : List of Identifier<br/>
✅ **Link** : Quick Link<br/>
✅ **Links** : List of Links<br/>
✅ **List** : List of String<br/>
✅ **Memo** : List of String<br/>
✅ **PlatformPayments** : List of PlatformPayment<br/>
✅ **RewardPayments** : List of RewardPayment<br/>

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


### /payment-methods
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods</span> <br/>
        <span class="api-summary">Retrieve a list of all PaymentMethod records. getPaymentMethods</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods</span> <br/>
        <span class="api-summary">Create a new PaymentMethod record. createPaymentMethod</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentMethod record. getaymentMethodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}</span> <br/>
        <span class="api-summary">Replace a PaymentMethod record. replacePaymentMethod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentMethod record. updatePaymentMethod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}</span> <br/>
        <span class="api-summary">Delete a PaymentMethod Record deletePaymentMethodRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/bank-intermediaries
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries</span> <br/>
        <span class="api-summary">Retrieve a list of BankIntermediary records scoped by paymentMethodKey. getBankIntermediarysByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries</span> <br/>
        <span class="api-summary">Create a new BankIntermediary record. createBankIntermediary</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/bank-intermediaries/{bankIntermediaryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries/{bankIntermediaryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific BankIntermediary record. getankIntermediaryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries/{bankIntermediaryKey}</span> <br/>
        <span class="api-summary">Replace a BankIntermediary record. replaceBankIntermediary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries/{bankIntermediaryKey}</span> <br/>
        <span class="api-summary">Partially update a BankIntermediary record. updateBankIntermediary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries/{bankIntermediaryKey}</span> <br/>
        <span class="api-summary">Delete a BankIntermediary Record deleteBankIntermediaryRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/reward-payments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments</span> <br/>
        <span class="api-summary">Retrieve a list of RewardPayment records scoped by paymentMethodKey. getRewardPaymentsByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments</span> <br/>
        <span class="api-summary">Create a new RewardPayment record. createRewardPayment</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/reward-payments/{rewardPaymentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments/{rewardPaymentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RewardPayment record. getewardPaymentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments/{rewardPaymentKey}</span> <br/>
        <span class="api-summary">Replace a RewardPayment record. replaceRewardPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments/{rewardPaymentKey}</span> <br/>
        <span class="api-summary">Partially update a RewardPayment record. updateRewardPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments/{rewardPaymentKey}</span> <br/>
        <span class="api-summary">Delete a RewardPayment Record deleteRewardPaymentRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/person-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names</span> <br/>
        <span class="api-summary">Retrieve a list of PersonName records scoped by paymentMethodKey. getPersonNamesByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names</span> <br/>
        <span class="api-summary">Create a new PersonName record. createPersonName</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/person-names/{personNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PersonName record. getersonNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Replace a PersonName record. replacePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Partially update a PersonName record. updatePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Delete a PersonName Record deletePersonNameRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier records scoped by paymentMethodKey. getIdentifiersByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier record. createIdentifier</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier record. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier record. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier record. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier Record deleteIdentifierRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/addresses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses</span> <br/>
        <span class="api-summary">Retrieve a list of Address records scoped by paymentMethodKey. getAddresssByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses</span> <br/>
        <span class="api-summary">Create a new Address record. createAddress</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/addresses/{addressKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Address record. getddressById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Replace a Address record. replaceAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Partially update a Address record. updateAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Delete a Address Record deleteAddressRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/check-payments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments</span> <br/>
        <span class="api-summary">Retrieve a list of CheckPayment records scoped by paymentMethodKey. getCheckPaymentsByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments</span> <br/>
        <span class="api-summary">Create a new CheckPayment record. createCheckPayment</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/check-payments/{checkPaymentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments/{checkPaymentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CheckPayment record. getheckPaymentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments/{checkPaymentKey}</span> <br/>
        <span class="api-summary">Replace a CheckPayment record. replaceCheckPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments/{checkPaymentKey}</span> <br/>
        <span class="api-summary">Partially update a CheckPayment record. updateCheckPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments/{checkPaymentKey}</span> <br/>
        <span class="api-summary">Delete a CheckPayment Record deleteCheckPaymentRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/cash-payments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments</span> <br/>
        <span class="api-summary">Retrieve a list of CashPayment records scoped by paymentMethodKey. getCashPaymentsByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments</span> <br/>
        <span class="api-summary">Create a new CashPayment record. createCashPayment</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/cash-payments/{cashPaymentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments/{cashPaymentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CashPayment record. getashPaymentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments/{cashPaymentKey}</span> <br/>
        <span class="api-summary">Replace a CashPayment record. replaceCashPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments/{cashPaymentKey}</span> <br/>
        <span class="api-summary">Partially update a CashPayment record. updateCashPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments/{cashPaymentKey}</span> <br/>
        <span class="api-summary">Delete a CashPayment Record deleteCashPaymentRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/bank-beneficiaries
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries</span> <br/>
        <span class="api-summary">Retrieve a list of BankBeneficiary records scoped by paymentMethodKey. getBankBeneficiarysByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries</span> <br/>
        <span class="api-summary">Create a new BankBeneficiary record. createBankBeneficiary</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/bank-beneficiaries/{bankBeneficiaryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries/{bankBeneficiaryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific BankBeneficiary record. getankBeneficiaryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries/{bankBeneficiaryKey}</span> <br/>
        <span class="api-summary">Replace a BankBeneficiary record. replaceBankBeneficiary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries/{bankBeneficiaryKey}</span> <br/>
        <span class="api-summary">Partially update a BankBeneficiary record. updateBankBeneficiary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries/{bankBeneficiaryKey}</span> <br/>
        <span class="api-summary">Delete a BankBeneficiary Record deleteBankBeneficiaryRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/credit-cards
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards</span> <br/>
        <span class="api-summary">Retrieve a list of CreditCard records scoped by paymentMethodKey. getCreditCardsByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards</span> <br/>
        <span class="api-summary">Create a new CreditCard record. createCreditCard</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/credit-cards/{creditCardKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards/{creditCardKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditCard record. getreditCardById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards/{creditCardKey}</span> <br/>
        <span class="api-summary">Replace a CreditCard record. replaceCreditCard</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards/{creditCardKey}</span> <br/>
        <span class="api-summary">Partially update a CreditCard record. updateCreditCard</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards/{creditCardKey}</span> <br/>
        <span class="api-summary">Delete a CreditCard Record deleteCreditCardRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/electronic-payments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments</span> <br/>
        <span class="api-summary">Retrieve a list of ElectronicPayment records scoped by paymentMethodKey. getElectronicPaymentsByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments</span> <br/>
        <span class="api-summary">Create a new ElectronicPayment record. createElectronicPayment</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/electronic-payments/{electronicPaymentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments/{electronicPaymentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ElectronicPayment record. getlectronicPaymentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments/{electronicPaymentKey}</span> <br/>
        <span class="api-summary">Replace a ElectronicPayment record. replaceElectronicPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments/{electronicPaymentKey}</span> <br/>
        <span class="api-summary">Partially update a ElectronicPayment record. updateElectronicPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments/{electronicPaymentKey}</span> <br/>
        <span class="api-summary">Delete a ElectronicPayment Record deleteElectronicPaymentRecord</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/platform-payments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments</span> <br/>
        <span class="api-summary">Retrieve a list of PlatformPayment records scoped by paymentMethodKey. getPlatformPaymentsByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments</span> <br/>
        <span class="api-summary">Create a new PlatformPayment record. createPlatformPayment</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/platform-payments/{platformPaymentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments/{platformPaymentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PlatformPayment record. getlatformPaymentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments/{platformPaymentKey}</span> <br/>
        <span class="api-summary">Replace a PlatformPayment record. replacePlatformPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments/{platformPaymentKey}</span> <br/>
        <span class="api-summary">Partially update a PlatformPayment record. updatePlatformPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments/{platformPaymentKey}</span> <br/>
        <span class="api-summary">Delete a PlatformPayment Record deletePlatformPaymentRecord</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PaymentMethodroot with key {PaymentMethodKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **payment-method** | /payment-methods | listPaymentMethods | createPaymentMethod | getPaymentMethods | updatePaymentMethods | deletePaymentMethods |
    | **bank-intermediarie** | /payment-methods/{paymentMethodKey}/bank-intermediaries | listBankIntermediarysByPaymentMethodKey | createBankIntermediary | getBankIntermediarysByPaymentMethodKey | updateBankIntermediarysByPaymentMethodKey | deleteBankIntermediarysByPaymentMethodKey |
    | **reward-payment** | /payment-methods/{paymentMethodKey}/reward-payments | listRewardPaymentsByPaymentMethodKey | createRewardPayment | getRewardPaymentsByPaymentMethodKey | updateRewardPaymentsByPaymentMethodKey | deleteRewardPaymentsByPaymentMethodKey |
    | **person-name** | /payment-methods/{paymentMethodKey}/person-names | listPersonNamesByPaymentMethodKey | createPersonName | getPersonNamesByPaymentMethodKey | updatePersonNamesByPaymentMethodKey | deletePersonNamesByPaymentMethodKey |
    | **identifier** | /payment-methods/{paymentMethodKey}/identifiers | listIdentifiersByPaymentMethodKey | createIdentifier | getIdentifiersByPaymentMethodKey | updateIdentifiersByPaymentMethodKey | deleteIdentifiersByPaymentMethodKey |
    | **addresse** | /payment-methods/{paymentMethodKey}/addresses | listAddresssByPaymentMethodKey | createAddress | getAddresssByPaymentMethodKey | updateAddresssByPaymentMethodKey | deleteAddresssByPaymentMethodKey |
    | **check-payment** | /payment-methods/{paymentMethodKey}/check-payments | listCheckPaymentsByPaymentMethodKey | createCheckPayment | getCheckPaymentsByPaymentMethodKey | updateCheckPaymentsByPaymentMethodKey | deleteCheckPaymentsByPaymentMethodKey |
    | **cash-payment** | /payment-methods/{paymentMethodKey}/cash-payments | listCashPaymentsByPaymentMethodKey | createCashPayment | getCashPaymentsByPaymentMethodKey | updateCashPaymentsByPaymentMethodKey | deleteCashPaymentsByPaymentMethodKey |
    | **bank-beneficiarie** | /payment-methods/{paymentMethodKey}/bank-beneficiaries | listBankBeneficiarysByPaymentMethodKey | createBankBeneficiary | getBankBeneficiarysByPaymentMethodKey | updateBankBeneficiarysByPaymentMethodKey | deleteBankBeneficiarysByPaymentMethodKey |
    | **credit-card** | /payment-methods/{paymentMethodKey}/credit-cards | listCreditCardsByPaymentMethodKey | createCreditCard | getCreditCardsByPaymentMethodKey | updateCreditCardsByPaymentMethodKey | deleteCreditCardsByPaymentMethodKey |
    | **electronic-payment** | /payment-methods/{paymentMethodKey}/electronic-payments | listElectronicPaymentsByPaymentMethodKey | createElectronicPayment | getElectronicPaymentsByPaymentMethodKey | updateElectronicPaymentsByPaymentMethodKey | deleteElectronicPaymentsByPaymentMethodKey |
    | **platform-payment** | /payment-methods/{paymentMethodKey}/platform-payments | listPlatformPaymentsByPaymentMethodKey | createPlatformPayment | getPlatformPaymentsByPaymentMethodKey | updatePlatformPaymentsByPaymentMethodKey | deletePlatformPaymentsByPaymentMethodKey |

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