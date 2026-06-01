# Architectural Decision Record: Shifting from Navigation-Based HATEOAS to Intent & Capability-Based Schemas

## Status
**Approved**

## Context & Problem Statement
Our automated API linting tools (Spectral) flag our OpenAPI schemas with the following warning:
`Schema contains '*_key' fields but no '_links' object. Consider adding HATEOAS links.`

This rule enforces traditional Hypermedia As-A Engine Of Application State (HATEOAS). While HATEOAS works well for crawling flat data relationships, it creates an anemic client experience for complex systems. It focuses purely on **navigation** (how to get to a resource) rather than **capabilities and intents** (what business actions can actually be performed right now).

## Decision
We are deprecating strict, navigation-based HATEOAS (`_links`) as our default API design pattern and have disabled this Spectral warning.

We are moving toward **Intent and Capability-Based API contracts**. Traditional HATEOAS links will only be used selectively where simple structural navigation makes practical sense (e.g., pagination or simple relational fetches).

---

## Justification for the Community

### 1. HATEOAS Lacks Business Context
Traditional HATEOAS links are structurally shallow. Providing a link like `{"rel": "edit", "href": "/accounts/456"}` tells a client that an endpoint exists, but it masks the underlying business state. It does not answer critical workflow questions:
* Is the user *allowed* to edit this account given its current status?
* What specific fields are modifiable in this state?
* What is the business *intent* behind the edit (e.g., correcting a typo vs. a legal name change)?

By relying solely on `_links`, the client is forced to guess the business rules or read extensive out-of-band documentation.

### 2. Shifting from Nouns to Verbs (Intents & Capabilities)
Instead of forcing clients to parse a generic web of links to figure out what to do next, our new API style explicitly publishes a resource's **current capabilities, allowed state transitions, and required intents** right inside the payload metadata.

Consider an order processing system. Instead of giving the client a generic `PUT` link to update an order, the API explicitly returns an array of executable capabilities based on the server's state engine:

```json
{
  "order_key": "ord_849100",
  "status": "PROCESSING",
  "allowed_actions": [
    {
      "capability": "CANCEL_ORDER",
      "intent": "Customer changed mind",
      "requires_reason": true
    },
    {
      "capability": "UPDATE_SHIPPING_ADDRESS",
      "intent": "Correct routing error"
    }
  ]
}

```
This empowers the client application to dynamically render its user interface (e.g., showing or hiding a "Cancel Order" button) based entirely on clear business semantics, without hardcoding complex state logic on the frontend.

### 3. Clearer State Transitions

By treating capabilities as first-class citizens in our schemas, the API guides the consumer through complex multi-step workflows. The contract transitions from being an interactive database diagram to an expressive, runtime-validated business process engine.



## Consequences & Guidelines for Developers

* **Spectral Configuration:** The rule requiring _links alongside *_key fields has been explicitly set to off in our .spectral.yaml profile.


* **When to use HATEOAS:** You may still use HATEOAS styles for purely structural navigation where no state machine exists. Examples include pagination links (next, prev), file downloads, or simple parent-child navigation.


* **Designing New Endpoints:** When building stateful resources, do not design generic PUT/PATCH update endpoints. Instead, explicitly model the state transitions as separate capabilities and document the consumer's intent clearly in the OpenAPI specification.