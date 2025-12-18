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
