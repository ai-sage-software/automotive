# Best Practices — STAR Automotive Domain

This document defines the **modeling, schema, and governance best practices** for the STAR `automotive` repository.

These rules exist to ensure:
- Long-term stability
- Interoperability across vendors
- Automated validation
- Clear evolution of standards
.

---

## 🎯 Guiding Principles

1. Domain Driven Design first, not API-first  
2. OpenAPI artifacts naming and design rules governance
3. Engagement with STAR data engineers is highly recommended 

---

## 🧠 Domain-Driven Design (DDD)

### Bounded Contexts
- Each domain represents a bounded context
- Schemas should not leak assumptions across domains
- Cross-domain references must be intentional and explicit

### Aggregate Roots
- Aggregate roots define ownership boundaries
- Changes inside an aggregate must not require changes outside it
- Avoid deep object graphs across aggregates

---

## 📐 Schema Design Standards

### Naming Conventions

| Element | Convention | Example |
|------|-----------|--------|
| Schema / Object names | PascalCase | WarrantyCoverage |
| Properties | snake_case | coverage_start_date |
| Enums | UPPER_SNAKE_CASE | ACTIVE |
| Boolean fields | is_ / has_ prefix | is_active |
| Arrays | Plural nouns | coverage_intervals |

---

### Schema Structure Rules

- Schemas must be self-describing
- Avoid ambiguous names (value, type, data)
- Prefer composition over duplication
- Use $ref only when semantics are shared
- Do not reuse schemas just because structures look similar

---

## 🔄 Versioning Rules

- Schemas are immutable once released
- Breaking changes require a new version
- Non-breaking additions may extend existing versions
- Deprecated fields must be documented
- Legacy schemas move to `legacy/`

---

## 🧪 Validation & Quality

### Spectral
- Spectral rules enforce naming, structure, and governance
- Validation failures must be fixed at the schema level
- Rules change only through governance approval

---

## 📄 Documentation Expectations

Every schema change must include:
- Updated documentation
- Updated diagrams when relationships change
- Clear rationale in PR descriptions

---

## 🚫 Anti-Patterns

- Silent breaking changes
- Schema reuse without semantic alignment
- Embedding API concerns into domain schemas
- One-off exceptions without documentation

---

## 🏁 Final Note

When in doubt, favor **clarity, stability, and explicit intent**.
