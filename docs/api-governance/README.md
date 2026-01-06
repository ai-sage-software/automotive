# STAR API Governance Rules

## What is this?
This document explains the **Spectral rules** used in this repository.
Its goal is to help **API designers, reviewers, and business stakeholders** understand *why* rules exist — not how to code them.

---

## How to read the results
When Spectral runs, it reports:

- **ERROR (Must)** → The API cannot be merged or released until fixed
- **WARNING (Should)** → Strong recommendation; technical debt if ignored
- **INFO (May)** → Optional best practices

---

## MUST rules (Release blockers)

### Arrays must define what they contain
If an API says something is a list, it must clearly say **what is inside the list**.

Why this matters:
- Prevents ambiguous APIs
- Enables client code generation

---

### No invalid OpenAPI fields
Custom fields like `exampleSetFlag` are **not part of OpenAPI** and must be removed or renamed using `x-`.

Why this matters:
- Keeps APIs standards‑compliant
- Avoids tooling failures

---

### Security must be defined
Every API must clearly document **how it is secured** (OAuth, API keys, etc.).

Why this matters:
- Consumers must know how to authenticate
- Required for enterprise governance

---

### PATCH must use merge‑patch
PATCH endpoints must use the standard `application/merge-patch+json` format.

Why this matters:
- Ensures predictable partial updates
- Prevents accidental data loss

---

### Quantities must be numbers
Fields representing quantities must be numeric, not text.

Why this matters:
- Prevents calculation errors
- Ensures consistent behavior across systems

---

### Time formats must not conflict
A field cannot be both a full date‑time *and* a time‑only pattern.

Why this matters:
- Avoids ambiguity
- Prevents validation errors

---

### Naming conventions are enforced
- Schemas: `PascalCase`
- Properties: `snake_case`
- operationId: `camelCase`
- Enums: `UPPER_SNAKE_CASE`

Why this matters:
- Consistency across APIs
- Easier learning and reuse

---

## SHOULD rules (Strong recommendations)

### APIs should document common errors
Endpoints should include standard error responses:
- 401 Unauthorized
- 403 Forbidden
- 404 Not Found
- 409 Conflict
- 500 Server Error

Why this matters:
- Predictable error handling
- Better client experience

---

### POST should return Location headers
Create operations should tell clients **where the new resource lives**.

Why this matters:
- REST best practice
- Simplifies follow‑up requests

---

### Server‑generated IDs should be read‑only
If the server creates an ID, clients should not be allowed to set it.

Why this matters:
- Prevents data corruption
- Clarifies ownership

---

### Avoid incorrect plurals
Terms like `criterias` should never appear.

Why this matters:
- API professionalism
- Clear communication

---

### Numeric values should not be strings
Prices, totals, coordinates, and quantities should be numbers.

Why this matters:
- Avoids parsing errors
- Enables math operations

---

### Resources should include audit timestamps
Resources should include:
- `created_at`
- `updated_at`

Why this matters:
- Traceability
- Debugging and compliance

---

### Schemas with keys should expose links
Resources that reference other resources should include navigational links.

Why this matters:
- Better discoverability
- Easier API traversal

---

## MAY rules (Optional improvements)

### Versioning should be documented
APIs should clearly explain how versions are managed.

Why this matters:
- Safe evolution
- Backward compatibility

---

## Final takeaway
These rules exist to ensure that STAR APIs are:

- Predictable
- Consistent
- Secure
- Tool‑friendly
- Easy to integrate

They are not about control — they are about **trust and interoperability**.
