### Problem with readonly _id or _key

The linter sees a property ending in _id (or _key/_reference_id) and automatically assumes: 

**"This is a database auto-incrementing integer or a server-side UUID generated during a SQL insert, so the client shouldn't be allowed to send it in a POST or PUT request."**

However, in an intentional, distributed, or domain-driven system, marking a reference ID as readOnly: true can actively break your architecture.

## Why This Warning Is Often Wrong for Production APIs

#### *1. Client-Generated IDs (Crucial for Idempotency)*
   If your CLI or frontend application needs to retry an upload due to a network glitch, sending a client-generated ID ensures the operation is idempotent. If the client generates the address_reference_id (using a UUID or TSID) before making the API call, it can safely retry a failed POST request ten times without accidentally creating ten duplicate address records in your database. Forcing readOnly: true completely outlaws this pattern.


#### *2. Aggregate Roots vs. Child Entities*
   In Domain-Driven Design, if Address is an entity inside a larger Aggregate (like an Order or a Customer), the client must pass the address_reference_id to correlation-link or swap components of the aggregate state. It isn't just an internal database primary key; it is a vital functional pointer used to orchestrate complex domain changes.


#### *3. Intent-Driven Command Payloads*
   When a client sends an explicit action command (e.g., ChangeShippingAddressCommand), it has to supply the target address_reference_id within the request body to declare exactly which resource it intends to manipulate.


## Policy on readOnly Target Identifiers
We do not blindly mark structural identity handles (*_id, *_key, *_reference_id) as readOnly: true.

The system design prioritizes Idempotent Operations and Command-Driven Architecture. Because clients can frequently generate unique identification keys (such as TSIDs or UUIDs) upstream to safely handle network retry states, or must pass reference keys within command payloads to execute explicit domain state transitions, these fields must remain valid across both request and response schemas.

Automated linting exceptions have been configured globally to allow identifier reuse within payload request contexts.