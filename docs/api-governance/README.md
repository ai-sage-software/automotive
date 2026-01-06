# STAR API Governance – Spectral Rules

## Purpose
This document explains the **STAR API governance rules** enforced using **Spectral**.

### Severity mapping
- **MUST** → `severity: error` (CI build blockers)
- **SHOULD** → `severity: warn` (strong recommendations)
- **MAY** → `severity: info` (nice-to-have guidance)

_Generated from the current ruleset on **January 6, 2026**._

---

## MUST (Errors – Publish blockers)
These rules fail CI and should be fixed before merge/release.

### `must-enum-values-be-upper-snake-case`
**What it enforces:** MUST: enum values (for string enums) must be UPPER_SNAKE_CASE.
**What you’ll see when it fails:** Enum value '{{value}}' must be UPPER_SNAKE_CASE.
**Why this exists:** Consistent enum casing reduces ambiguity and avoids mixed-case variants.
**How to fix:** Use UPPER_SNAKE_CASE values (e.g., `IN_STOCK`, `BACK_ORDER`).
**Where it checks (`given`):** `$..[?(@ && @.type=='string')].enum[*]`
**How it checks (`then`):** Uses function `pattern`

### `must-not-mix-date-time-format-with-hhmm-pattern`
**What it enforces:** MUST: do not combine format: date-time with an HH:mm-only pattern.
**What you’ll see when it fails:** Schema uses format 'date-time' with an HH:mm-only pattern; choose one.
**Why this exists:** A full `date-time` and an `HH:mm`-only pattern conflict and cause parsing errors.
**How to fix:** Choose one: either `format: date-time` (full timestamp) OR a strict HH:mm pattern.
**Where it checks (`given`):** `$..properties[?(@property === 'start_time' || @property === 'end_time')]`
**How it checks (`then`):** Uses function `schema`

### `must-operationid-be-camelcase`
**What it enforces:** MUST: operationId must be camelCase.
**What you’ll see when it fails:** operationId '{{value}}' must be camelCase (e.g., listPartOrders).
**Why this exists:** operationId often becomes a generated method name; camelCase keeps SDKs idiomatic.
**How to fix:** Rename operationId to camelCase (e.g., `listParts`, `getPartByKey`).
**Where it checks (`given`):** `$.paths[*][*].operationId`
**How it checks (`then`):** Uses function `pattern`

### `must-property-names-be-snake_case`
**What it enforces:** MUST: property names must be snake_case.
**What you’ll see when it fails:** Property name '{{property}}' must be snake_case (lowercase with underscores).
**Why this exists:** Consistent property naming reduces mapping friction and improves readability.
**How to fix:** Rename properties to snake_case (e.g., `control_account_reference_id`).
**Where it checks (`given`):** `$.components.schemas.*.properties.*~`
**How it checks (`then`):** Uses function `pattern`

### `must-quantity-be-numeric`
**What it enforces:** MUST: quantity fields must be numeric (integer or number), not string.
**What you’ll see when it fails:** Field '{{property}}' must be numeric (integer/number).
**Why this exists:** Quantities should support numeric operations and comparisons.
**How to fix:** Use `type: integer` (preferred) or `type: number`.
**Where it checks (`given`):** `$..properties[?(@property === 'quantity')]`
**How it checks (`then`):** Uses function `schema`

### `must-schema-names-be-pascalcase`
**What it enforces:** MUST: schema names must be PascalCase.
**What you’ll see when it fails:** Schema name '{{property}}' must be PascalCase (e.g., PartMaster).
**Why this exists:** Consistent schema naming improves reuse and readability across domains.
**How to fix:** Rename schemas to PascalCase (e.g., `ControlAccountReference`).
**Where it checks (`given`):** `$.components.schemas.*~`
**How it checks (`then`):** Uses function `pattern`

### `oas3-arrays-must-have-items`
**What it enforces:** MUST: array schemas must define items.
**What you’ll see when it fails:** Array schema is missing `items`.
**Why this exists:** Arrays without `items` are ambiguous and break code generation/validation.
**How to fix:** Add an `items:` schema to every `type: array`.
**Where it checks (`given`):** `$..[?(@ && @.type=='array')]`
**How it checks (`then`):** Requires field `items`

### `oas3-no-invalid-exampleSetFlag`
**What it enforces:** MUST: forbid non-OpenAPI field `exampleSetFlag`.
**What you’ll see when it fails:** Invalid field `exampleSetFlag` found. Use `x-...` vendor extension or remove.
**Why this exists:** `exampleSetFlag` is not an OpenAPI field; it can break validators and tooling.
**How to fix:** Remove it or convert to an `x-...` vendor extension (e.g., `x-exampleSetFlag`).
**Where it checks (`given`):** `$..exampleSetFlag`
**How it checks (`then`):** Uses function `undefined`

### `oas3-securityschemes-required`
**What it enforces:** MUST: components.securitySchemes must exist.
**What you’ll see when it fails:** components.securitySchemes is missing.
**Why this exists:** Consumers need a declared auth mechanism; security cannot be inferred reliably.
**How to fix:** Define `components.securitySchemes` (e.g., OAuth2, API Key, bearer JWT).
**Where it checks (`given`):** `$`
**How it checks (`then`):** Uses function `schema`

### `patch-must-use-merge-patch`
**What it enforces:** MUST: PATCH should use application/merge-patch+json (or explicitly justified).
**What you’ll see when it fails:** PATCH requestBody must include 'application/merge-patch+json'.
**Why this exists:** PATCH semantics vary. Requiring merge-patch makes partial updates consistent.
**How to fix:** Ensure PATCH requestBody supports `application/merge-patch+json`.
**Where it checks (`given`):** `$.paths[*][patch]`
**How it checks (`then`):** Uses function `schema`

---

## SHOULD (Warnings – Strong recommendations)
These rules indicate important improvements. Teams may fix incrementally, but they should not be ignored.

### `should-avoid-boilerplate-info-description`
**What it enforces:** SHOULD: avoid boilerplate info.description text.
**What you’ll see when it fails:** info.description appears to be boilerplate; replace with domain-specific description.
**Where it checks (`given`):** `$.info.description`
**How it checks (`then`):** Uses function `pattern`

### `should-avoid-criterias-in-paths`
**What it enforces:** SHOULD: avoid 'criterias' in paths; use 'criteria'.
**What you’ll see when it fails:** Path contains 'criterias' (nonstandard plural). Use 'criteria'.
**Where it checks (`given`):** `$.paths.*~`
**How it checks (`then`):** Uses function `pattern`

### `should-avoid-generic-path-param-example`
**What it enforces:** SHOULD: avoid generic path parameter example PR-1234567 across all resources.
**What you’ll see when it fails:** Parameter example uses generic 'PR-1234567'. Use a resource-specific example.
**Where it checks (`given`):** `$..parameters[*].example`
**How it checks (`then`):** Uses function `pattern`

### `should-define-401-unauthorized`
**What it enforces:** SHOULD: define 401 response for authentication failures.
**What you’ll see when it fails:** Operation should define a 401 Unauthorized response.
**Where it checks (`given`):** `$.paths[*][*].responses`
**How it checks (`then`):** Uses function `schema`

### `should-define-403-forbidden`
**What it enforces:** SHOULD: define 403 response for authorization failures.
**What you’ll see when it fails:** Operation should define a 403 Forbidden response.
**Where it checks (`given`):** `$.paths[*][*].responses`
**How it checks (`then`):** Uses function `schema`

### `should-define-404-not-found`
**What it enforces:** SHOULD: define 404 response for missing resources.
**What you’ll see when it fails:** Operation should define a 404 Not Found response.
**Where it checks (`given`):** `$.paths[*][*].responses`
**How it checks (`then`):** Uses function `schema`

### `should-define-409-conflict-for-write-ops`
**What it enforces:** SHOULD: define 409 response for conflicts (create/update).
**What you’ll see when it fails:** POST/PUT should define a 409 Conflict response.
**Where it checks (`given`):** `$.paths[*][post,put].responses`
**How it checks (`then`):** Uses function `schema`

### `should-define-500-error`
**What it enforces:** SHOULD: define 500 response for internal errors.
**What you’ll see when it fails:** Operation should define a 500 response.
**Where it checks (`given`):** `$.paths[*][*].responses`
**How it checks (`then`):** Uses function `schema`

### `should-define-securityschemes`
**What it enforces:** SHOULD: define components.securitySchemes.
**What you’ll see when it fails:** components.securitySchemes is missing. Define auth mechanisms used by 401 responses.
**Where it checks (`given`):** `$.components`
**How it checks (`then`):** Uses function `schema`

### `should-latitude-be-numeric`
**What it enforces:** SHOULD: latitude should be numeric.
**What you’ll see when it fails:** latitude should be number (not string).
**Where it checks (`given`):** `$..properties.latitude`
**How it checks (`then`):** Uses function `schema`

### `should-list-get-not-return-bare-array`
**What it enforces:** SHOULD: list GET endpoints should return an envelope object (e.g., {data, next_cursor}).
**What you’ll see when it fails:** GET list endpoint response returns a bare array; prefer an envelope object for pagination/metadata.
**Why this exists:** Envelopes allow pagination, counts, links, and metadata without breaking clients.
**How to fix:** Wrap list responses like `{ data: [...], next_cursor: '...' }`.
**Where it checks (`given`):** `$.paths[*][get].responses[?(@property.match(/^(200|206)$/))].content.application/json.schema`
**How it checks (`then`):** Uses function `schema`

### `should-longitude-be-numeric`
**What it enforces:** SHOULD: longitude should be number (not string).
**Where it checks (`given`):** `$..properties.longitude`
**How it checks (`then`):** Uses function `schema`

### `should-mark-id-fields-readonly`
**What it enforces:** SHOULD: properties ending with _id should be marked readOnly: true.
**What you’ll see when it fails:** Property '{{property}}' looks server-generated; mark as readOnly: true.
**Why this exists:** Server-generated identifiers should not be client-editable.
**How to fix:** Add `readOnly: true` to *_id properties in response/resource schemas.
**Where it checks (`given`):** `$..properties[?(@property.match(/_id$/))]`
**How it checks (`then`):** Uses function `schema`

### `should-not-use-minmax-on-strings`
**What it enforces:** SHOULD: do not use minimum/maximum on string-typed schemas (use minLength/maxLength).
**What you’ll see when it fails:** String schema defines minimum/maximum; use minLength/maxLength instead.
**Where it checks (`given`):** `$..[?(@.type=='string')]`
**How it checks (`then`):** Uses function `schema`

### `should-operation-tags-be-defined-globally`
**What it enforces:** SHOULD: operation tags must be defined in root tags.
**What you’ll see when it fails:** Operation tags must be defined in root 'tags:' section.
**Where it checks (`given`):** `$.paths[*][*].tags[*]`
**How it checks (`then`):** Uses function `truthy`

### `should-operationid-avoid-bad-plurals`
**What it enforces:** SHOULD: avoid common operationId typos (Inventorys/Searchs/Categorys/Regulatorys).
**What you’ll see when it fails:** operationId '{{value}}' contains a common typo pluralization (e.g., 'Inventorys').
**Where it checks (`given`):** `$.paths[*][*].operationId`
**How it checks (`then`):** Uses function `pattern`

### `should-post-include-location-header`
**What it enforces:** SHOULD: POST success responses should include a Location header with a path-like example.
**What you’ll see when it fails:** POST response should include headers.Location with an example starting with '/'.
**Why this exists:** Location helps clients discover the created resource URI after POST.
**How to fix:** Add `Location` header with a path example like `/parts/123`.
**Where it checks (`given`):** `$.paths[*][post].responses[?(@property.match(/^(200|201|202)$/))]`
**How it checks (`then`):** Uses function `schema`

### `should-price-value-be-numeric`
**What it enforces:** SHOULD: price.value should be numeric.
**What you’ll see when it fails:** price.value should be number (not string).
**Where it checks (`given`):** `$..properties.price.properties.value`
**How it checks (`then`):** Uses function `schema`

### `should-resource-schemas-have-audit-fields`
**What it enforces:** SHOULD: resource schemas should include created_at/updated_at timestamps.
**What you’ll see when it fails:** Consider adding created_at and updated_at (format: date-time) for auditability.
**Why this exists:** Audit fields support traceability and operational troubleshooting.
**How to fix:** Add `created_at` / `updated_at` with `format: date-time`.
**Where it checks (`given`):** `$.components.schemas[*].properties`
**How it checks (`then`):** Uses function `schema`

### `should-schemas-with-keys-have-links`
**What it enforces:** SHOULD: schemas that include *_key fields should include a _links object for navigation.
**What you’ll see when it fails:** Schema contains '*_key' fields but no '_links' object. Consider adding HATEOAS links.
**Where it checks (`given`):** `$.components.schemas[*]`
**How it checks (`then`):** Uses function `schema`

### `should-servers-url-include-version`
**What it enforces:** SHOULD: include an explicit version in servers.url (e.g., /v1) or document a versioning strategy.
**What you’ll see when it fails:** servers.url does not appear to include a version segment like /v1.
**Why this exists:** Explicit versioning makes breaking changes manageable.
**How to fix:** Use servers URL like `/v1` or document a header-based versioning strategy.
**Where it checks (`given`):** `$.servers[*].url`
**How it checks (`then`):** Uses function `pattern`

### `should-single-resource-define-500`
**What it enforces:** SHOULD: single-resource endpoints should define a 500 response.
**What you’ll see when it fails:** Single-resource operation should define 500 ServerError.
**Where it checks (`given`):** `$.paths[?(@property.match(/\{[^}]+\}/))][get,put,patch,delete].responses`
**How it checks (`then`):** Uses function `schema`

### `should-total-quantity-be-numeric`
**What it enforces:** SHOULD: total_quantity should be numeric.
**What you’ll see when it fails:** total_quantity should be integer/number (not string).
**Where it checks (`given`):** `$..properties.total_quantity`
**How it checks (`then`):** Uses function `schema`

### `should-write-ops-define-401`
**What it enforces:** SHOULD: POST/PUT/PATCH operations should define a 401 response.
**What you’ll see when it fails:** Write operation should define 401 Unauthorized.
**Where it checks (`given`):** `$.paths[*][post,put,patch].responses`
**How it checks (`then`):** Uses function `schema`

---

## MAY (Info – Nice to have)
These rules are helpful guidance and do not indicate a defect.

### `may-document-versioning`
**What it enforces:** MAY: include explicit versioning strategy (e.g., /v1 or headers).
**What you’ll see when it fails:** Consider documenting API versioning strategy.
**Where it checks (`given`):** `$.info.version`
**How it checks (`then`):** Uses function `truthy`

---

## Quick Usage
### Local
```bash
spectral lint -r spectral/star-api-governance.spectral.yaml domain/**/api/**/openapi_monolith.y*ml
```

### GitHub Actions (CI)
Wire the Spectral CLI into `.github/workflows/spectral.yml` to run automatically on pushes and pull requests.
