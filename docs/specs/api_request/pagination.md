Oh, pagination—the digital equivalent of "take a number, we'll get to you." Here's your information converted to a clean, easy-to-read Markdown format\!

-----

## 📄 API Pagination Guide

Pagination is key to efficient API use, ensuring you retrieve a manageable, fixed set of items per response. This improves performance and simplifies response handling.

### **Pagination Request Parameters**

These parameters are added as **query strings** and are applicable on "Get list of" resource endpoints.

| Parameter | Type | Description | Constraints & Errors |
| :--- | :--- | :--- | :--- |
| **`pageSize`** | Integer | The number of items displayed per page. | **Default:** 100. **Maximum:** 200. If $> 200$, returns $400$ Bad Request with error `GNRL-100001`. |
| **`pageCursor`** | String | The position indicator for retrieving the next page. | Use the `nextPageCursor` from the previous call. If **empty**, the first page is retrieved. If **invalid**, returns $400$ Bad Request with error `GNRL-100001`. |

### **Pagination Response Components**

The API response provides all the necessary data and the context for making the next request.

| Parameter | Description |
| :--- | :--- |
| **`totalCount`** | The total number of items available (or matching the filter). |
| **`pageInfo`** | Page specification, including: |
|     `hasNextPage` | Boolean. Indicates if another page of results exists. |
|     `nextPageCursor` | **The key for the next call.** The cursor string to use in the subsequent request's `pageCursor` parameter. |
| **`items`** | The list of items retrieved for the current page. |

#### **Response Example**

A successful paginated response might look like this:

```json
{
  "totalCount": 35,
  "pageInfo": {
    "hasNextPage": true,
    "nextPageCursor": "MG=="
  },
  "items": [
      {item 11}, {item 12}, {item 13}, … {item 20}
  ]
}
```

### **How to Create a Query String**

1.  **First API Call (Page 1):**

    * Set **`pageSize`** (e.g., $10$).
    * **Do not set `pageCursor`** (or leave it empty).
    * **Goal:** Retrieve the first set of items and the first `nextPageCursor` (e.g., `"MQ=="`).

2.  **Next API Call (Subsequent Pages):**

    * Use the **`nextPageCursor`** returned from the *previous* call as the new request's **`pageCursor`** value.
    * You can optionally change the `pageSize`.

#### **Query String Example**

> `https://api-p.tipalti.com/api/v1/payer-entities?pageSize=10&pageCursor=MQ==`

-----

That's an **excellent** and forward-thinking choice\! Cursor-based pagination (`cursor` and `limit`) is definitely the modern, scalable, and most performant approach for dealing with large or highly dynamic datasets (like feeds or ever-growing transaction logs).

Based on your choice, here are the proper and common query parameter definitions, adhering to the best practices we discussed:

### 🌟 Modern Cursor-Based Pagination

| Parameter | Recommended Name | Recommended Type | Description | Naming Case |
| :--- | :--- | :--- | :--- | :--- |
| **Size** | `limit` or `page_size` | `integer` | The maximum number of records to return. | snake\_case (if using `page_size`) |
| **Position** | `cursor` or `after` / `before` | `string` | An opaque token marking the starting point for the next page. | snake\_case or camelCase |

-----

### YAML Specification Example (Using `limit` and `cursor`)

Assuming you're documenting this in an OpenAPI/Swagger spec, here is how a proper definition would look. I've used `limit` (the most concise name for size) and `cursor` (as you specified).

```yaml
parameters:
  # --- Limit Parameter (The Page Size) ---
  - in: query
    name: limit
    description: The maximum number of records to return in the current request.
    schema:
      type: integer
      default: 50
      minimum: 1
      maximum: 100 # Good practice to enforce a maximum limit
    required: false

  # --- Cursor Parameter (The Starting Point) ---
  - in: query
    name: cursor
    description: |
      An opaque token marking the starting point for the next page of results. 
      This value is provided by the 'next_cursor' field in the previous response.
    schema:
      type: string
    required: false
```

#### Why this is Proper:

1.  **Clear Descriptions:** They no longer share the same description.
2.  **Correct Types:** `limit` is an `integer`, and `cursor` is an opaque `string`.
3.  **No Default `cursor`:** A cursor shouldn't have a default value; it's a pointer provided by the server *after* the first request.
