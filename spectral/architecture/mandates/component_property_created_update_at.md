## 1. Explanation to the Community: Why They Are Off

 

### 📝 Architectural Decision Record (ADR): Exclusion of `created_at` and `updated_at` Timestamps

#### Context & Problem Statement

Our automated API linting tools (Spectral) flag our OpenAPI schemas for missing standard `created_at` and `updated_at` properties on resource objects. While these fields are standard in traditional CRUD (Create, Read, Update, Delete) database designs, our system architecture follows Domain-Driven Design (DDD) and event-driven patterns.

#### Decision

We have explicitly disabled the Spectral rules enforcing `created_at` and `updated_at` across our API definitions.

#### Justification for the Community

**1. The API is Not a Database Mirror (Anemic Model Avoidance)**
In Domain-Driven Design, the API represents an expressive, task-oriented interface, not an interactive mirror of our database tables. Standard `created_at` and `updated_at` properties are data-tier constructs popularized by ORMs (like Hibernate or ActiveRecord). Forcing them into the API leaks infrastructure implementation details into our public contracts.

**2. State-Based Timestamps Destructively Flatten History**
A single `updated_at` timestamp is a destructive operation; it tells you *when* something changed, but completely obliterates *what* changed, *why* it changed, and *who* changed it.

**3. We Model Actions and History via an Event Trail**
Instead of static timestamps, our domain captures rich context using an append-only timeline of life-cycle events.

* **For Creation:** A resource isn't just "created." It is *registered*, *provisioned*, or *activated*. The metadata surrounding this initialization (the initiating actor, the onboarding channel, the initial system state) is captured inside a specific lifecycle event payload, providing far deeper context than a generic `created_at` timestamp.
* **For Updates:** We utilize an explicit event log. If a user changes their address, we publish an `AddressChanged` event. This event contains the old address, the new address, the modification timestamp, and the security context of the operator.

By consuming our sub-resource event streams, API consumers gain access to a forensic audit trail of the entity’s complete evolution, rendering a flat `updated_at` timestamp redundant and misleading.

#### Consequences

* **API Consumers:** To track timelines, clients should inspect the event/history block of the resource or subscribe to webhooks/event streams rather than relying on top-level timestamp properties.
* **Linting:** Any future custom Spectral rules must favor event-structure validation over traditional CRUD property enforcement.

---

### Anti-Pattern Notes

In a pure DDD ecosystem, behavior and language (*The Ubiquitous Language*) reign supreme. CRUD APIs focus on nouns and data states, whereas DDD APIs focus on verbs, intents, and business capabilities.

If a domain treats history as a first-class citizen (Event Sourcing or CQRS patterns), exposing a flat `updated_at` field is actively anti-pattern—it encourages API clients to continuously poll an entity to see if a timestamp changed, rather than reactively listening to the explicit semantic event that occurred. A event-based setup is a much more mature and scalable design for complex systems.