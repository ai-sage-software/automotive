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
