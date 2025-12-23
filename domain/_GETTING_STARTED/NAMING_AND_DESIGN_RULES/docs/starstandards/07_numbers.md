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
