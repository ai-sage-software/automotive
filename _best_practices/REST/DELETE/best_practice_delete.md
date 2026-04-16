### 1. The Technical Specification (RFC 9110)
According to the HTTP specification (the successor to RFC 7231):
* **Content is allowed:** A `DELETE` request *can* technically have a payload.
* **Meaning is undefined:** The specification states that the presence of a request body in a `DELETE` method has no defined semantics. 
* Many servers, proxies, and caches will either ignore the body entirely or, in some strict cases, reject the request with a **400 Bad Request**.

---

### 2. The Practical Reality
While you *can* force a body into a `DELETE` call, it breaks the "Principle of Least Astonishment" for other developers and AI agents.

| Component | Behavior |
| :--- | :--- |
| **Client Libraries** | Some libraries (like older versions of Java’s `HttpURLConnection` or certain JavaScript Fetch wrappers) make it difficult or impossible to send a body with `DELETE`. |
| **Load Balancers/Proxies** | Infrastructure like AWS ALBs or NGINX may strip the body during transit for security or performance reasons. |
| **AI Agents** | Most agentic systems expect `DELETE` to be **Idempotent** and driven by a Resource ID in the URL. Sending a body can confuse the agent's deterministic mapping logic. |

---

### 3. Better Alternatives for Your System
If you find yourself needing to send data with a deletion, consider these three patterns:

#### A. Query Parameters (For metadata)
If you need to send a reason for the deletion or a flag (e.g., `hardDelete=true`), use query strings.
`DELETE /parties/12345?reason=duplicate&softDelete=true`

#### B. The "Action" Resource (For complex deletions)
If you are deleting a large set of data based on complex criteria (e.g., "Delete all archived parties created before 2020"), you aren't really deleting a single resource—you are performing a **Batch Task**.
* **Method:** `POST`
* **Endpoint:** `/tasks/cleanup-parties`
* **Body:** Your complex JSON criteria.

#### C. Soft Deletes (State Management)
You might not actually want to `DELETE` the record.
* **Method:** `PATCH` or `PUT`
* **Action:** Update the `partyStatus` to `ARCHIVED` or `PURGED`. This preserves the `partyKey` for historical integrity while effectively "deleting" it from the operational view.

### Avoid Delete Request Body
Recommendation is **avoiding request bodies in DELETE**.

Stick to `DELETE /resource/{id}` for true deletions. If you need to pass a "Reason Code" or "Authorized By" metadata, use **Custom HTTP Headers** or **Query Parameters**. This ensures your API remains compatible with the widest range of tools and agents.
 