# automotive — STAR Automotive Domain

> **The future of automotive retail data interoperability.**  
>  
> This repository contains the canonical domain models, schemas, documentation, and tooling maintained by STAR (Standards for Technology in Automotive Retail) to support standardized data exchange across the automotive ecosystem.

---

## 📌 Table of Contents

- About This Repository
- Who This Is For
- Repository Structure (Detailed)
- Getting Started
- Domain Modeling Philosophy
- Schemas & Standards
- Tooling & Automation
- Documentation & Diagrams
- Versioning & Compatibility
- Contributing
- Governance & Best Practices
- Roadmap & Future Work
- License

---

## 🧭 About This Repository

The **automotive** repository serves as the **source of truth** for STAR’s automotive domain model.

It brings together:
- Canonical domain schemas (JSON, OpenAPI-ready structures)
- Best practices for schema design and API governance
- Tooling to validate, lint, transform, and generate artifacts
- Documentation and diagrams to make complex automotive domains approachable
- Legacy APIs that were developed before the STAR Domain Model wich utilizes a Domain-Driven Design approach
- Legacy artifacts derived from XML schemas to support backward compatibility and migration
- 📘 New to Domain-Driven Design?  
See: [Domain-Driven Design 101](docs/arch/domain_driven_design_101.md)

---

## 👥 Who This Is For

- STAR working groups and contributors
- OEMs, dealers, and suppliers
- Platform and API engineers
- Business Information Teams
- Product Teams
- Data architects & governance teams
- Solutions Teams
- QA Teams
- Data Integration Partners
  

---

## 📁 Repository Structure

### domain/ — Canonical Domain Models adhering to the Domain-Driven Design development approach
Source of truth for STAR automotive business concepts. Schemas here are stable, versioned, and reusable.

### [docs/ — Documentation](docs/)
Human-readable explanations, rationale, specifications, and usage guidance.

### diagrams/ — Visual Models
Domain maps, aggregate boundaries, process flows, and architecture views.

### tools/ — Automation
Schema conversion, OpenAPI generation, validation, and documentation tooling.

### utilities/ — Shared Helpers
Reusable helper code for tools. No business semantics.

### spectral/ — Governance Rules
Spectral rules enforcing naming, structure, and OpenAPI alignment.

### _best_practices/ — Standards
Normative guidance for schema design, versioning, and reuse.

### _getting_started/ — Onboarding
Task-oriented onboarding for new contributors.

### open_source_tools/ — OSS Tooling
Externally consumable tools and integrations.

### resources/ — Examples
Sample payloads and reference material.

### legacy/ — Historical JSON schemas and schemas translated from STAR XML
- Historical XML schemas converted to JSON schemas
- JSON schemas that were developed prior to the STAR Domain Model project which utilizes a Domain-Driven Design approach

### .github/workflows/ — CI / Automation
Validation and quality enforcement pipelines.

---

## 🚀 Getting Started

Start with: [Getting Started — automotive Repository](_getting_started/README.md)

---

## 🧠 Domain Modeling Philosophy

- Domain-Driven design
- small and self-contained aggregates, minimizing the number of other aggregates they directly reference or traverse
- Aggregate ownership boundaries
- Versioned evolution
- Metadata-first interoperability

---

## 📐 Schemas & Standards

- Canonical schemas live in `domain/`
- Schemas are derived from the OpenAPI Specifications (OAS)
- Naming and structure enforced via Spectral

---

## 🛠 Tooling & Automation

Automation ensures consistency and quality via CI and local tooling.

---

## 📘 Documentation & Diagrams

Docs explain intent. Diagrams visualize relationships. Both evolve with schemas.

---

## 🔄 Versioning & Compatibility

Backward compatibility by default. Breaking changes require versioning.

---

## 🤝 Contributing

Contact STAR
> - Steve Zadoorian - steve@starstandard.org
> - Paco Escobar    - pescobar@starstandard.org

---

## 🏛 Governance & Best Practices

See: [Best Practices — STAR Automotive Domain](_best_practices/README.md)

---

## 🧭 Roadmap & Future Work

- Expanded OpenAPI automation
- Metadata export
- Enhanced diagrams

---

## 📄 License

See the LICENSE file.
