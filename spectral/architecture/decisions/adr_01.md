
# Architectural Decision Record (ADR): API Design Philosophy & Spectral Linter Overrides

## Status
**Approved**

## Context & Problem Statement
Our automated API linting tools (Spectral) are built on traditional, resource-oriented CRUD (Create, Read, Update, Delete) constraints. As a result, they emit several warnings and errors when analyzing our OpenAPI definitions.

Specifically, the linter flags:
1. Missing `created_at` and `updated_at` timestamps.
2. Missing HATEOAS `_links` objects alongside `*_key` fields.
3. Fields ending in `_id` or `_key` (such as `address_reference_id`) that are not marked as `readOnly: true`.

While these rules are standard for basic database-mirroring APIs, they directly conflict with our core architectural principles: **Domain-Driven Design (DDD)**, **Intent/Capability-Driven Contracts**, and **Idempotent Operations**.

## Decision
We have explicitly disabled these specific automated linting rules within our `.spectral.yaml` configuration. This document serves as the official architectural justification for our developer community.
