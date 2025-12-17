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
