# STAR API Governance – Spectral Rules

## Purpose
This document explains the STAR API governance rules enforced using Spectral.
Rules are classified as **MUST**, **SHOULD**, or **MAY** to align with RFC-style standards
and enable gradual enforcement.

---

## MUST (Errors – Build Blockers)

### Array schemas must define items
**Why:** Arrays without item definitions are ambiguous and break tooling.
**Fix:** Always define `items` for `type: array`.

### exampleSetFlag is forbidden
**Why:** `exampleSetFlag` is not part of OpenAPI.
**Fix:** Remove it or replace with an `x-` vendor extension.

### Security schemes must exist
**Why:** APIs must declare authentication mechanisms.
**Fix:** Define `components.securitySchemes`.

### PATCH must use merge-patch
**Why:** Ensures consistent partial update semantics.
**Fix:** Use `application/merge-patch+json`.

### Quantity fields must be numeric
**Why:** Quantities should support numeric operations.
**Fix:** Use `integer` or `number`, not `string`.

### Do not mix date-time with HH:mm patterns
**Why:** Conflicting time semantics cause parsing errors.
**Fix:** Choose either `format: date-time` or an HH:mm pattern.

---

## SHOULD (Warnings – Strong Recommendations)

### Avoid bad pluralization in operationId
**Why:** Prevents confusing APIs.
**Fix:** Use correct English plurals.

### Avoid boilerplate descriptions
**Why:** APIs should explain domain intent.
**Fix:** Replace generic text with domain-specific language.

### GET list endpoints should return envelopes
**Why:** Enables pagination and metadata.
**Fix:** Wrap arrays in objects like `{ data, next_cursor }`.

### Tags must be defined globally
**Why:** Improves documentation consistency.
**Fix:** Declare tags at the root level.

### Standard HTTP error responses
**Why:** Predictable error handling.
**Fix:** Define 401, 403, 404, 409, and 500 where appropriate.

### POST should include Location header
**Why:** Indicates newly created resource URI.
**Fix:** Add `Location` header with a path example.

### *_id fields should be readOnly
**Why:** IDs are server-generated.
**Fix:** Mark as `readOnly: true`.

### Avoid 'criterias' in paths
**Why:** Incorrect pluralization.
**Fix:** Use `criteria`.


- Schemas: PascalCase
- Properties: snake_case
- operationId: camelCase
- Enum values: UPPER_SNAKE_CASE


### Schemas with *_key should expose _links
**Why:** Supports discoverability and navigation.

### Numeric values must not be strings
**Why:** Prevents downstream type issues.

### Avoid generic path parameter examples
**Why:** Improves clarity in documentation.

### Avoid numeric min/max on strings
**Why:** Use `minLength` / `maxLength` instead.

### Version APIs explicitly
**Why:** Enables safe evolution.
**Fix:** Include `/v1` in `servers.url` or document strategy.

### Include audit fields
**Why:** Traceability and compliance.
**Fix:** Add `created_at` and `updated_at`.

---

## MAY (Informational)

### Document versioning strategy
**Why:** Helps consumers understand lifecycle management.

---

## Usage

### Local
```bash
spectral lint -r spectral/star-api-governance.spectral.yaml domain/**/openapi_monolith.yaml
```

### CI
Executed automatically via GitHub Actions on push and pull requests.

---

## Outcome
- Faster reviews
- Consistent APIs
- Enforced standards as code
