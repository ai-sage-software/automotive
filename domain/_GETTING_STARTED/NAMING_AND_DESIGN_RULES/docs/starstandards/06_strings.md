# String Best Practices

- **MUST** define `minLength` and `maxLength` to ensure database compatibility, prevent empty values, and manage backward compatibility.
- **MAY** omit `minLength`/`maxLength` only when length is dictated by an upstream system that provides no length info—**and this must be documented**.
- Use `format` for semantic meaning when applicable:
  - `email`, `date`, `date-time`, `uri`, `uuid`, `base64`

Additional guidance:
- Think about internationalization (i18n) and document language-specific fields where needed.
- Document constraints that aren’t captured by schema keywords.
- Consider security implications for sensitive strings (passwords, API keys).
