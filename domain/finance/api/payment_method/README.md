## 🚗 STAR Automotive Retail Systems API (A standardized interface for Automotive Retail operations, built upon a formal Retail Ontology. It enables seamless integration 

**Key Capabilities:**
* **Catalog Management:** Unified definitions for parts, assemblies, and BOMs.
* **Inventory Orchestration:** Real-time visibility into warehouse and dealership stock.
* **Financial Workflows:** Automated invoicing and batch processing for high-volume retail transactions.

Designed for high-reliability CI/CD environments and asynchronous batch processing.)

This contains the OpenAPI specification for the **Automotive Retail Systems API**, which provides an interface for managing automotive retail entities such as **Address**, **AddressLocale**, **Authorization**, **BankBeneficiary**, **BankIntermediary**, **CashPayment**, **CheckPayment**, **CreditCard**, **ElectronicPayment**, **Identifier**, **PaymentMethod**, **PersonName**, **PlatformPayment**, **Position**, **RewardPayment**.

The API adheres to the **OpenAPI 3.0.1** standard.

---

## 📝 Overview

---


The API is structured around the domain **finance** and **PaymentMethod** resource as the primary entity, with several resources scoped under it via various path parameters.

| Resource | Base Path | Description |
| :--- | :--- | :--- |
    | **PaymentMethod** | /payment-methods | Manages PaymentMethods |
    | **RewardPayment** | /payment-methods/{paymentMethodKey}/reward-payments | Manages RewardPayments belonging to PaymentMethods |
    | **PersonName** | /payment-methods/{paymentMethodKey}/person-names | Manages PersonNames belonging to PaymentMethods |
    | **Addresse** | /payment-methods/{paymentMethodKey}/addresses | Manages Addresses belonging to PaymentMethods |
    | **Position** | /payment-methods/{paymentMethodKey}/positions | Manages Positions belonging to PaymentMethods |
    | **CashPayment** | /payment-methods/{paymentMethodKey}/cash-payments | Manages CashPayments belonging to PaymentMethods |
    | **BankBeneficiarie** | /payment-methods/{paymentMethodKey}/bank-beneficiaries | Manages BankBeneficiaries belonging to PaymentMethods |
    | **CreditCard** | /payment-methods/{paymentMethodKey}/credit-cards | Manages CreditCards belonging to PaymentMethods |
    | **AddressLocale** | /payment-methods/{paymentMethodKey}/address-locales | Manages AddressLocales belonging to PaymentMethods |
    | **BankIntermediarie** | /payment-methods/{paymentMethodKey}/bank-intermediaries | Manages BankIntermediaries belonging to PaymentMethods |
    | **Authorization** | /payment-methods/{paymentMethodKey}/authorizations | Manages Authorizations belonging to PaymentMethods |
    | **Identifier** | /payment-methods/{paymentMethodKey}/identifiers | Manages Identifiers belonging to PaymentMethods |
    | **CheckPayment** | /payment-methods/{paymentMethodKey}/check-payments | Manages CheckPayments belonging to PaymentMethods |
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
💠 **LocationTypes** : types of locations.<br/>
💠 **PaymentStatusTypes** : types of payment status.<br/>
💠 **RewardEventTypes** : types of reward events.<br/>

## ✅ Entities

---


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
        <span class="api-summary">Retrieve a list of PaymentMethod entities. getPaymentMethod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods</span> <br/>
        <span class="api-summary">Create a new PaymentMethod entity. createPaymentMethod</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PaymentMethod entity. getaymentMethodById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}</span> <br/>
        <span class="api-summary">Replace a PaymentMethod entity. replacePaymentMethod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}</span> <br/>
        <span class="api-summary">Partially update a PaymentMethod entity. updatePaymentMethod</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}</span> <br/>
        <span class="api-summary">Delete a PaymentMethod entity deletePaymentMethodEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/reward-payments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments</span> <br/>
        <span class="api-summary">Retrieve a list of RewardPayment entities scoped by paymentMethodKey. getRewardPaymentByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments</span> <br/>
        <span class="api-summary">Create a new RewardPayment entity. createRewardPayment</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/reward-payments/{rewardPaymentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments/{rewardPaymentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific RewardPayment entity. getewardPaymentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments/{rewardPaymentKey}</span> <br/>
        <span class="api-summary">Replace a RewardPayment entity. replaceRewardPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments/{rewardPaymentKey}</span> <br/>
        <span class="api-summary">Partially update a RewardPayment entity. updateRewardPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/reward-payments/{rewardPaymentKey}</span> <br/>
        <span class="api-summary">Delete a RewardPayment entity deleteRewardPaymentEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/person-names
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names</span> <br/>
        <span class="api-summary">Retrieve a list of PersonName entities scoped by paymentMethodKey. getPersonNameByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names</span> <br/>
        <span class="api-summary">Create a new PersonName entity. createPersonName</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/person-names/{personNameKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PersonName entity. getersonNameById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Replace a PersonName entity. replacePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Partially update a PersonName entity. updatePersonName</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/person-names/{personNameKey}</span> <br/>
        <span class="api-summary">Delete a PersonName entity deletePersonNameEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/addresses
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses</span> <br/>
        <span class="api-summary">Retrieve a list of Address entities scoped by paymentMethodKey. getAddressByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses</span> <br/>
        <span class="api-summary">Create a new Address entity. createAddress</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/addresses/{addressKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Address entity. getddressById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Replace a Address entity. replaceAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Partially update a Address entity. updateAddress</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/addresses/{addressKey}</span> <br/>
        <span class="api-summary">Delete a Address entity deleteAddressEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/positions
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/positions</span> <br/>
        <span class="api-summary">Retrieve a list of Position entities scoped by paymentMethodKey. getPositionByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/positions</span> <br/>
        <span class="api-summary">Create a new Position entity. createPosition</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/positions/{positionKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Position entity. getositionById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Replace a Position entity. replacePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Partially update a Position entity. updatePosition</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/positions/{positionKey}</span> <br/>
        <span class="api-summary">Delete a Position entity deletePositionEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/cash-payments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments</span> <br/>
        <span class="api-summary">Retrieve a list of CashPayment entities scoped by paymentMethodKey. getCashPaymentByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments</span> <br/>
        <span class="api-summary">Create a new CashPayment entity. createCashPayment</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/cash-payments/{cashPaymentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments/{cashPaymentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CashPayment entity. getashPaymentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments/{cashPaymentKey}</span> <br/>
        <span class="api-summary">Replace a CashPayment entity. replaceCashPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments/{cashPaymentKey}</span> <br/>
        <span class="api-summary">Partially update a CashPayment entity. updateCashPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/cash-payments/{cashPaymentKey}</span> <br/>
        <span class="api-summary">Delete a CashPayment entity deleteCashPaymentEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/bank-beneficiaries
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries</span> <br/>
        <span class="api-summary">Retrieve a list of BankBeneficiary entities scoped by paymentMethodKey. getBankBeneficiaryByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries</span> <br/>
        <span class="api-summary">Create a new BankBeneficiary entity. createBankBeneficiary</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/bank-beneficiaries/{bankBeneficiaryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries/{bankBeneficiaryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific BankBeneficiary entity. getankBeneficiaryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries/{bankBeneficiaryKey}</span> <br/>
        <span class="api-summary">Replace a BankBeneficiary entity. replaceBankBeneficiary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries/{bankBeneficiaryKey}</span> <br/>
        <span class="api-summary">Partially update a BankBeneficiary entity. updateBankBeneficiary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-beneficiaries/{bankBeneficiaryKey}</span> <br/>
        <span class="api-summary">Delete a BankBeneficiary entity deleteBankBeneficiaryEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/credit-cards
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards</span> <br/>
        <span class="api-summary">Retrieve a list of CreditCard entities scoped by paymentMethodKey. getCreditCardByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards</span> <br/>
        <span class="api-summary">Create a new CreditCard entity. createCreditCard</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/credit-cards/{creditCardKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards/{creditCardKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CreditCard entity. getreditCardById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards/{creditCardKey}</span> <br/>
        <span class="api-summary">Replace a CreditCard entity. replaceCreditCard</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards/{creditCardKey}</span> <br/>
        <span class="api-summary">Partially update a CreditCard entity. updateCreditCard</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/credit-cards/{creditCardKey}</span> <br/>
        <span class="api-summary">Delete a CreditCard entity deleteCreditCardEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/address-locales
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/address-locales</span> <br/>
        <span class="api-summary">Retrieve a list of AddressLocale entities scoped by paymentMethodKey. getAddressLocaleByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/address-locales</span> <br/>
        <span class="api-summary">Create a new AddressLocale entity. createAddressLocale</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/address-locales/{addressLocaleKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Retrieve a specific AddressLocale entity. getddressLocaleById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Replace a AddressLocale entity. replaceAddressLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Partially update a AddressLocale entity. updateAddressLocale</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/address-locales/{addressLocaleKey}</span> <br/>
        <span class="api-summary">Delete a AddressLocale entity deleteAddressLocaleEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/bank-intermediaries
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries</span> <br/>
        <span class="api-summary">Retrieve a list of BankIntermediary entities scoped by paymentMethodKey. getBankIntermediaryByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries</span> <br/>
        <span class="api-summary">Create a new BankIntermediary entity. createBankIntermediary</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/bank-intermediaries/{bankIntermediaryKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries/{bankIntermediaryKey}</span> <br/>
        <span class="api-summary">Retrieve a specific BankIntermediary entity. getankIntermediaryById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries/{bankIntermediaryKey}</span> <br/>
        <span class="api-summary">Replace a BankIntermediary entity. replaceBankIntermediary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries/{bankIntermediaryKey}</span> <br/>
        <span class="api-summary">Partially update a BankIntermediary entity. updateBankIntermediary</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/bank-intermediaries/{bankIntermediaryKey}</span> <br/>
        <span class="api-summary">Delete a BankIntermediary entity deleteBankIntermediaryEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/authorizations
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/authorizations</span> <br/>
        <span class="api-summary">Retrieve a list of Authorization entities scoped by paymentMethodKey. getAuthorizationByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/authorizations</span> <br/>
        <span class="api-summary">Create a new Authorization entity. createAuthorization</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/authorizations/{authorizationKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Authorization entity. getuthorizationById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Replace a Authorization entity. replaceAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Partially update a Authorization entity. updateAuthorization</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/authorizations/{authorizationKey}</span> <br/>
        <span class="api-summary">Delete a Authorization entity deleteAuthorizationEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/identifiers
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers</span> <br/>
        <span class="api-summary">Retrieve a list of Identifier entities scoped by paymentMethodKey. getIdentifierByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers</span> <br/>
        <span class="api-summary">Create a new Identifier entity. createIdentifier</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/identifiers/{identifierKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Retrieve a specific Identifier entity. getdentifierById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Replace a Identifier entity. replaceIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Partially update a Identifier entity. updateIdentifier</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/identifiers/{identifierKey}</span> <br/>
        <span class="api-summary">Delete a Identifier entity deleteIdentifierEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/check-payments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments</span> <br/>
        <span class="api-summary">Retrieve a list of CheckPayment entities scoped by paymentMethodKey. getCheckPaymentByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments</span> <br/>
        <span class="api-summary">Create a new CheckPayment entity. createCheckPayment</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/check-payments/{checkPaymentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments/{checkPaymentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific CheckPayment entity. getheckPaymentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments/{checkPaymentKey}</span> <br/>
        <span class="api-summary">Replace a CheckPayment entity. replaceCheckPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments/{checkPaymentKey}</span> <br/>
        <span class="api-summary">Partially update a CheckPayment entity. updateCheckPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/check-payments/{checkPaymentKey}</span> <br/>
        <span class="api-summary">Delete a CheckPayment entity deleteCheckPaymentEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/electronic-payments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments</span> <br/>
        <span class="api-summary">Retrieve a list of ElectronicPayment entities scoped by paymentMethodKey. getElectronicPaymentByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments</span> <br/>
        <span class="api-summary">Create a new ElectronicPayment entity. createElectronicPayment</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/electronic-payments/{electronicPaymentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments/{electronicPaymentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific ElectronicPayment entity. getlectronicPaymentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments/{electronicPaymentKey}</span> <br/>
        <span class="api-summary">Replace a ElectronicPayment entity. replaceElectronicPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments/{electronicPaymentKey}</span> <br/>
        <span class="api-summary">Partially update a ElectronicPayment entity. updateElectronicPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/electronic-payments/{electronicPaymentKey}</span> <br/>
        <span class="api-summary">Delete a ElectronicPayment entity deleteElectronicPaymentEntity</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/platform-payments
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments</span> <br/>
        <span class="api-summary">Retrieve a list of PlatformPayment entities scoped by paymentMethodKey. getPlatformPaymentByPaymentMethodKey</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-post">POST</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments</span> <br/>
        <span class="api-summary">Create a new PlatformPayment entity. createPlatformPayment</span>
    </span>
</div>

### /payment-methods/{paymentMethodKey}/platform-payments/{platformPaymentKey}
<div class="api-endpoint-row">
<span class="api-method-button method-get">GET</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments/{platformPaymentKey}</span> <br/>
        <span class="api-summary">Retrieve a specific PlatformPayment entity. getlatformPaymentById</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-put">PUT</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments/{platformPaymentKey}</span> <br/>
        <span class="api-summary">Replace a PlatformPayment entity. replacePlatformPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-patch">PATCH</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments/{platformPaymentKey}</span> <br/>
        <span class="api-summary">Partially update a PlatformPayment entity. updatePlatformPayment</span>
    </span>
</div>

<div class="api-endpoint-row">
<span class="api-method-button method-delete">DELETE</span>
    <span class="api-path-summary">
        <span class="api-path">/payment-methods/{paymentMethodKey}/platform-payments/{platformPaymentKey}</span> <br/>
        <span class="api-summary">Delete a PlatformPayment entity deletePlatformPaymentEntity</span>
    </span>
</div>

### 🏢 Scoped Dealer Resources

The following resources follow a consistent pattern under PaymentMethodroot with key {PaymentMethodKey} ... Support listing, creation, retrieval, replacement, deletion, and partial updates.

| Resource | Base Path | List Operation | Create Operation | Get Operation | Update Operation | Delete Operation |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
    | **payment-method** | /payment-methods | listPaymentMethod | createPaymentMethod | getPaymentMethod | updatePaymentMethod | deletePaymentMethod |
    | **reward-payment** | /payment-methods/{paymentMethodKey}/reward-payments | listRewardPaymentByPaymentMethodKey | createRewardPayment | getRewardPaymentByPaymentMethodKey | updateRewardPaymentByPaymentMethodKey | deleteRewardPaymentByPaymentMethodKey |
    | **person-name** | /payment-methods/{paymentMethodKey}/person-names | listPersonNameByPaymentMethodKey | createPersonName | getPersonNameByPaymentMethodKey | updatePersonNameByPaymentMethodKey | deletePersonNameByPaymentMethodKey |
    | **addresse** | /payment-methods/{paymentMethodKey}/addresses | listAddressByPaymentMethodKey | createAddress | getAddressByPaymentMethodKey | updateAddressByPaymentMethodKey | deleteAddressByPaymentMethodKey |
    | **position** | /payment-methods/{paymentMethodKey}/positions | listPositionByPaymentMethodKey | createPosition | getPositionByPaymentMethodKey | updatePositionByPaymentMethodKey | deletePositionByPaymentMethodKey |
    | **cash-payment** | /payment-methods/{paymentMethodKey}/cash-payments | listCashPaymentByPaymentMethodKey | createCashPayment | getCashPaymentByPaymentMethodKey | updateCashPaymentByPaymentMethodKey | deleteCashPaymentByPaymentMethodKey |
    | **bank-beneficiarie** | /payment-methods/{paymentMethodKey}/bank-beneficiaries | listBankBeneficiaryByPaymentMethodKey | createBankBeneficiary | getBankBeneficiaryByPaymentMethodKey | updateBankBeneficiaryByPaymentMethodKey | deleteBankBeneficiaryByPaymentMethodKey |
    | **credit-card** | /payment-methods/{paymentMethodKey}/credit-cards | listCreditCardByPaymentMethodKey | createCreditCard | getCreditCardByPaymentMethodKey | updateCreditCardByPaymentMethodKey | deleteCreditCardByPaymentMethodKey |
    | **address-locale** | /payment-methods/{paymentMethodKey}/address-locales | listAddressLocaleByPaymentMethodKey | createAddressLocale | getAddressLocaleByPaymentMethodKey | updateAddressLocaleByPaymentMethodKey | deleteAddressLocaleByPaymentMethodKey |
    | **bank-intermediarie** | /payment-methods/{paymentMethodKey}/bank-intermediaries | listBankIntermediaryByPaymentMethodKey | createBankIntermediary | getBankIntermediaryByPaymentMethodKey | updateBankIntermediaryByPaymentMethodKey | deleteBankIntermediaryByPaymentMethodKey |
    | **authorization** | /payment-methods/{paymentMethodKey}/authorizations | listAuthorizationByPaymentMethodKey | createAuthorization | getAuthorizationByPaymentMethodKey | updateAuthorizationByPaymentMethodKey | deleteAuthorizationByPaymentMethodKey |
    | **identifier** | /payment-methods/{paymentMethodKey}/identifiers | listIdentifierByPaymentMethodKey | createIdentifier | getIdentifierByPaymentMethodKey | updateIdentifierByPaymentMethodKey | deleteIdentifierByPaymentMethodKey |
    | **check-payment** | /payment-methods/{paymentMethodKey}/check-payments | listCheckPaymentByPaymentMethodKey | createCheckPayment | getCheckPaymentByPaymentMethodKey | updateCheckPaymentByPaymentMethodKey | deleteCheckPaymentByPaymentMethodKey |
    | **electronic-payment** | /payment-methods/{paymentMethodKey}/electronic-payments | listElectronicPaymentByPaymentMethodKey | createElectronicPayment | getElectronicPaymentByPaymentMethodKey | updateElectronicPaymentByPaymentMethodKey | deleteElectronicPaymentByPaymentMethodKey |
    | **platform-payment** | /payment-methods/{paymentMethodKey}/platform-payments | listPlatformPaymentByPaymentMethodKey | createPlatformPayment | getPlatformPaymentByPaymentMethodKey | updatePlatformPaymentByPaymentMethodKey | deletePlatformPaymentByPaymentMethodKey |

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