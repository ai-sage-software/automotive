

## 🚦 API Rate Limit Information 

API uses rate limiting to ensure stability and guard against bursts of traffic. If you send too many requests too quickly, you'll encounter an error.

### **Example Limit Details**

* **Maximum Requests:** **1500 requests per minute**
* **Error Status Code:** **429 - Too Many Requests**

### **API Failed Response (429 Error)**

If the limit is reached, you will receive an HTTP $429$ error. The response body and headers provide critical information on when to try again.

| Item | Description |
| :--- | :--- |
| **Error Text Body** | `{ Content: 'API calls quota exceeded! The maximum number of requests allowed: X per YYY {s/m/h/d}' }` |
| **Response Header: `Retry-After`** | An integer indicating the time (in **seconds**) you must wait before performing a new API request. |

### **API Successful Response (Headers)**

With every successful API call, the response header includes details on your current usage and the limit. This is your go-to for keeping track!

| Header | Type | Description |
| :--- | :--- | :--- |
| **`X-Rate-Limit-Limit`** | Integer | The maximum number of requests for the configured rate limit period (e.g., $1m$, $12h$, $1d$). |
| **`X-Rate-Limit-Remaining`** | Integer | The **remaining** number of requests you have for the given period. |
| **`X-Rate-Limit-Reset`** | date-time | The timestamp of the next limit reset, following the **ISO 8601** standard with a trailing $Z$ offset. |

---
