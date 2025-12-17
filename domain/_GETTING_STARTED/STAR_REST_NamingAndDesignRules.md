# STAR REST API Naming and Design Rules

![STAR](https://img.shields.io/badge/STAR-standards-blue) ![OpenAPI](https://img.shields.io/badge/OpenAPI-3.x-success)

## Table of Contents
- [Naming Conventions](#naming-conventions)
- [Schemas and Reuse](#schemas-and-reuse)
- [Properties, Required Fields, and Validation](#properties-required-fields-and-validation)
- [Enumerations (Enums)](#enumerations-enums)
- [Boolean Best Practices](#boolean-best-practices)
- [String Best Practices](#string-best-practices)
- [Numbers and Integers](#numbers-and-integers)
- [Array Best Practices](#array-best-practices)
- [Nulls, Additional Properties, and Common Types](#nulls-additional-properties-and-common-types)
- [Date, Time, and Timezones](#date-time-and-timezones)
- [Versioning (Semantic Versioning + Internal Build)](#versioning-semantic-versioning--internal-build)

---

# Naming Conventions

## Entities (Objects / Schemas)

- **Use PascalCase (UpperCamelCase)**: start each word with a capital letter; no spaces or hyphens.
  - Examples: `UserProfile`, `OrderDetails`, `ProductCategory`
- **Use singular nouns** for a resource type.
  - Good: `Customer`, `Address`
  - Avoid: `Customers`, `Addresses` (unless representing an array/collection)
- **Be descriptive and concise**.
  - Good: `ShippingAddress` (clearer than just `Address`)
  - Avoid: overly long or ambiguous names.

## Properties (Fields)

- **Use lower_snake_case** (underscore between words).
  - Examples: `first_name`, `order_id`, `product_description`, `is_active`
- **Be descriptive and specific**.
  - Good: `email_address` (more specific than `email`)
  - Avoid: abbreviations that are not universally understood (e.g., `eml_addr`).

## Naming Convention Summary Table

| Element | Convention | Examples |
|---|---|---|
| Entity | PascalCase | `UserProfile`, `OrderStatus` |
| Property | lower_snake_case | `first_name`, `order_date` |
| Enum Name | PascalCase (often ends with `Type`) | `ProductType` |
| Enum Value | UPPER_SNAKE_CASE | `COMPLETED`, `FAILED_EXECUTION` |

---

# Schemas and Reuse

## Define Reusable Schemas

- Define reusable objects under `components/schemas`.
- Prefer `$ref` for reusability in request/response bodies and other schemas.

## Example (Schema + $ref)

The following image (rendered from the source PDF) illustrates defining schemas in `components/schemas` and referencing them via `$ref`.

![Schema reuse example](docs/standards/images/page_02.png)

---

# Properties, Required Fields, and Validation

## Required Fields

- Use `required` to indicate mandatory properties in requests/responses.

## Constraints and Validation Rules

Use JSON Schema keywords to ensure data integrity:

- `minLength`, `maxLength`
- `minimum`, `maximum`
- `pattern`
- `minItems`, `maxItems`
- `uniqueItems`
- `enum`

## Guidance

- Be explicit with data types and formats (e.g., `int32`, `int64`, `float`, `double`, `email`, `date`, `date-time`, `uuid`).
- Use `description` extensively for schemas, properties, and enum values.
- Use `nullable: true` only when a property can legitimately be null (but see the **Null** guidance later in this standard).

---

# Enumerations (Enums)

## Naming

- **Enum Name:** PascalCase (UpperCamelCase), like entities.
  - Examples: `OrderStatus`, `PaymentMethod`
- **Enum Values:** UPPER_SNAKE_CASE
  - Examples: `PENDING`, `PROCESSING`, `SHIPPED`, `CREDIT_CARD`, `PAYPAL`

## Controlled Vocabulary

- Use `enum` when the set of allowed values is fixed.
- If new values might be added in the future, **do not** use `enum`. Instead, use `type: string` and document allowed values in `description`, enforcing naming conventions with `pattern`.

![Enum example](docs/standards/images/page_05.png)

---

# Boolean Best Practices

- Explicitly define boolean properties with `type: boolean`.
- Use clear, unambiguous property names that suggest true/false values:
  - Good: `is_active`, `has_notifications`, `should_remind`, `is_admin`, `is_deleted`
  - Avoid: `status` (could be string/enum), `flag` (too generic)
- If `null` is meaningful (unknown/unset), mark it explicitly with `nullable: true` and document semantics carefully.
- Avoid using strings for boolean values ("true"/"false", "yes"/"no").

Example pattern:

```yaml
is_completed:
  type: boolean
  nullable: true
  description: >
    True if completed, false if not. Null if status is yet to be determined.
```

---

# String Best Practices

- **MUST** define `minLength` and `maxLength` to ensure database compatibility, prevent empty values, and manage backward compatibility.
- **MAY** omit `minLength`/`maxLength` only when length is dictated by an upstream system that provides no length info—**and this must be documented**.
- Use `format` for semantic meaning when applicable:
  - `email`, `date`, `date-time`, `uri`, `uuid`, `base64`

Additional guidance:
- Think about internationalization (i18n) and document language-specific fields where needed.
- Document constraints that aren’t captured by schema keywords.
- Consider security implications for sensitive strings (passwords, API keys).

---

# Numbers and Integers

## Avoid `number`

- **SHOULD NEVER** use JSON Schema `number` due to cross-language interpretation issues (fixed vs floating point).

## Integer Rules

- **SHOULD ONLY** use `integer` for 32-bit signed values (`-2147483648` to `2147483647`).
- Always define `minimum` and `maximum` explicitly.
- If values may exceed 32-bit integer or represent decimals, use `type: string` with `pattern` to constrain numeric representation.

Example numeric string:

```yaml
quantity:
  type: string
  pattern: '^[0-9]+$'
  minLength: 1
  maxLength: 6
```

---

# Array Best Practices

- Define `maxItems` and `minItems`.
  - `maxItems` SHOULD be defined and SHOULD NOT exceed `32767` (default if no better choice exists).
- **Always define `items`** — this is the most crucial rule for arrays.
- Consider `uniqueItems: true` when elements must be unique.
- Document what the array represents and what each element means.
- Model relationships in arrays using `$ref` in the `items` schema.
- Avoid deeply nested arrays unless necessary.

![Array best practices example](docs/standards/images/page_18.png)

---

# Nulls, Additional Properties, and Common Types

## Null

- APIs **MUST NOT** produce or consume `null` values.
- A missing property is different from a property with a null value (cross-language compatibility issues).

## additionalProperties

- `additionalProperties` **MUST NOT** be explicitly set to `false` (it can break backward compatibility for clients validating against the schema).
- API implementations SHOULD perform runtime validation against the defined contract.

## Common Types (Recommended Reuse)

- **Address:** `address_portable.json`
- **Money:** `money.json` (MUST include `currency_code` and `value`; `value` must not be negative)
- **Percentage / Interest Rate / APR:** `percentage.json` (value represented as a percentage; clients handle display)

Internationalization:
- `country_code`: ISO 3166-1 alpha-2
- `currency_code`: ISO 4217
- `language`: BCP-47
- `locale`: country_code + language, optionally IANA timezone

---

# Date, Time, and Timezones

## UTC Overview

UTC is a time standard (not a time zone). Time zones are offsets from UTC. UTC does not observe daylight saving time and is widely used in technical systems for unambiguous timestamps.

## Rules

- Date and time strings MUST conform to RFC3339 `date-time` format.
- APIs MUST only emit **UTC time** in responses.
- APIs SHOULD accept date-time or time fields with UTC offsets in requests, converting them to UTC for internal storage.
- Offsets MUST NOT be used to derive timezone information.
- If timezone is business-relevant, capture it explicitly using IANA time zone IDs (e.g., `America/Los_Angeles`).
- For floating time values (e.g., date of birth), SHOULD NOT associate them with a timezone.

## Examples

![Date and time example (event)](docs/standards/images/page_27.png)

![Date and time example (meeting)](docs/standards/images/page_28.png)

![Date and time example (log entry)](docs/standards/images/page_29.png)

---

# Versioning (Semantic Versioning + Internal Build)

Version format:

- **Full version:** `MAJOR.MINOR.PATCH.BUILD`
- Example: `1.0.3.20180625T1304ZA`
  - Product version: `1.0.3`
  - Build number: `20180625T1304ZA`

Meaning:
- **Major:** breaking changes (incompatible API changes)
- **Minor:** new features (backward-compatible)
- **Patch:** bug fixes (backward-compatible)
- **Build:** internal tracking

Build suffix codes:
- **A** – ALPHA (incomplete)
- **B** – BETA (feature-complete, testing)
- **C** – CANDIDATE (final testing)
- **R** – RELEASE (official)

![Versioning diagram](docs/standards/images/page_30.png)

---
