
## **Intent-based discovery is a pragmatic evolution of HATEOAS.**

While pure HATEOAS (Hypermedia as the Engine of Application State) is academically beautiful, it is notoriously difficult to implement and consume in the real world. The **Intent + Capabilities** approach solves the "why" and "how" that HATEOAS often misses.

---

### 1. HATEOAS vs. Intent-Based Discovery

| Feature | Pure HATEOAS |  Intent-Based Architecture |
| --- | --- | --- |
| **Discovery Mechanism** | Links (`_links`) embedded in every resource response. | A centralized `/capabilities` endpoint. |
| **Payload Weight** | High: Every record carries its own "menu" of links. | Low: Records stay slim; the "menu" is fetched once. |
| **The "Why"** | Generic: `rel: "update"`. | Specific: `command: "CancelInvoice"`. |
| **Client Logic** | Complex: Must parse links for every single object. | Simple: Fetch capabilities once, then map to UI/Logic. |

---

### 2. Why Intent is "Superior" for Business Logic

In a pure HATEOAS system, you might see a link like this:
`{"rel": "update", "href": "/orders/123", "method": "PATCH"}`

This doesn't tell the client **what** it is allowed to change—only **where** it can send data.

In the **Intent/Capabilities** approach, the client sees:

* **Intent:** `CancelInvoice`
* **Pre-condition:** `from_states: ["CREATED", "ACTIVE"]`
* **Result:** `to_state: "DELETED"`

**This is superior because it encodes Business Rules, not just URL paths.** The client doesn't just know that an endpoint exists; it knows the *context* and *consequence* of the action.  

---

### 3. The "Hybrid" Victory

 
By using the `/capabilities` endpoint:

1. You retain the **Decoupling** of HATEOAS (the client doesn't hardcode paths).
2. You gain the **Clarity** of Domain-Driven Design (the client understands business intents).
3. You gain **Efficiency** (the client isn't re-downloading the same links for 1,000 different search results).

---

### 4. Conclusion


Pure HATEOAS is often "Link-driven," which is great for browsing a website but poor for automated system-to-system integration. The Intent approach is **"Contract-driven."** * **HATEOAS** tells you where the doors are.

* **The Intent-based Approach** tells you where the doors lead, who has the keys, and what happens when you walk through.

For an API, knowing the "Intent" (e.g., `ReverseTransaction` vs. `RefundTransaction`) is infinitely more important than just knowing the HTTP verb is `POST`.
 