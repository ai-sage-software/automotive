# Schemas and Reuse

## Define Reusable Schemas

- Define reusable objects under `components/schemas`.
- Prefer `$ref` for reusability in request/response bodies and other schemas.

## Example (Schema + $ref)

The following image (rendered from the source PDF) illustrates defining schemas in `components/schemas` and referencing them via `$ref`.

![Schema reuse example](images/page_02.png)
