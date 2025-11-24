Ah, filters! The API equivalent of telling a bouncer exactly who you're looking for in a crowded room. Here is your information converted to Markdown.

---

## 🔍 API Filtering Guide

Filters are query parameters used, often alongside pagination, to retrieve a specific, smaller subset of data from a larger collection. (Remember: each Tipalti resource has its own specific filtering capabilities, so check the endpoint documentation!)

### **Filter Structure (The ABCs of Filtering)**

The filter value is constructed from three key components:

| Parameter | Description | Examples |
| :--- | :--- | :--- |
| **Field** | The property or field name to be filtered (e.g., `id`, `firstName`). | `id` |
| **Operator** | The comparison method (e.g., $==$, $<$, `IN`). | $==$ |
| **Value** | The value(s) the field must match. | `"1"` |
| **Syntax Examples** | **Single Value:** `id=="1"` **Multiple Values:** `id IN ("1","2","3")` | |

### **Filter Chaining (Making it Complex)**

You can combine multiple filter clauses to create complex queries:

| Operator | Description | Support | Example |
| :--- | :--- | :--- | :--- |
| **AND** | Combines clauses using a **double ampersand** (`&&`). Both clauses must be true. | Supported | `firstName=="John" && id IN ("1","2","3")` |
| **OR** | Logical OR operator. | **Not Supported** | |

### **The Crucial Step: Filter Encoding**

**Filters must be URL encoded**  before being placed in the request URL. Failure to encode will result in an unhappy API.

| Description | Example Request (Unencoded) | Encoded URL |
| :--- | :--- | :--- |
| Filter by ID and email | `api/v1/payees?filter=id=="1" && email=="payee@payee.com"` | `/api/v1/payees?filter=id==%221%22%20%26%26%20email%20==%20%22payee@payee.com%22` |

### **Available Filter Operators and Syntax**

| Operator Name | Syntax | Supported Types | Example |
| :--- | :--- | :--- | :--- |
| **Equal / Not Equal** | $==$ / $!=$ | Numeric, Boolean, String, Date | `Amount == 1.45` |
| **In / Not In** | `[prop] IN()` / `!([prop] IN())` *(Note: requires space before IN)* | String | `firstName IN ("Adam","Emma")` |
| **Greater Than / Less Than** | $>, >=, <, <=$ | Numeric, Date | `Date >= "yyyy-MM-ddTHH:mm:ss.fffZ"` |
| **String Matching** | `.contains()`, `.startsWith()`, `.endsWith()` | String | `Country.contains("US")` |
| **Any (Collections)** | `.any()` | Lists/Arrays of Nested Objects | `Payments.any(x => x.Currency == "USD")` |

### **Quoting and Escaping**

| Character | Rule | Example |
| :--- | :--- | :--- |
| **Quotation Marks** (`""`) | Required for **String** and **Date** values. | `CompanyName=="aaa"` |
| **Backslash** (`\`) | Used to **escape** quotes within a string value. | For `"my"company"`, use: `CompanyName=="my\"company"` |

### **Advanced Filtering**

#### **Nested Fields**

To filter on properties within an object, use dot notation:

* **Syntax:** `NestedObject.PropertyName`
* **Example:** To filter for "John" in the US:
  `firstName == "John" && contactInformation.paymentCountry == "US"`

#### **Collections (Lists/Arrays)**

Use the **`.any()`** operator with a **lambda expression** to filter items inside a list of nested objects:

* `InvoiceLines.any(x => x.Quantity == 30 || x.price.Amount == 1000)`
* `InvoiceLines.any(x => x.id IN ("1","2") && x.description.Contains("invoice"))`

### **Filter Examples (Unencoded URLs)**

* **Date and Email:** `?filter=lastChangeDateTimeUTC >= "2022-11-14T17:32:28.000Z" && contactInformation.email != "payee@payee.com"`
* **Status, RefCode, and Boolean:** `?filter=Status=="Active" && refCode.startsWith("1") && isAccountClosed == false`
* **Multiple Countries:** `?filter=contactInformation.paymentCountry IN ("AT","US")`

### **Errors**

If your filter is invalid or malformed, the API will return a **$400$ Bad Request** status code with relevant error details.

---

I'd say you now have the cheat sheet for effective data hunting! Would you like me to walk you through an example of how to correctly URL-encode one of those complex filter strings?