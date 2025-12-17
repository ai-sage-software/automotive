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
