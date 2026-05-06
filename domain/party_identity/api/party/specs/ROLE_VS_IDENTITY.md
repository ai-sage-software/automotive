# Identity vs. Role: Architectural Specification

This document defines the distinction between **Identity** (who a Party is) and **Role** (what a Party does) within the system. 
Understanding this separation is critical for building a scalable system and enabling "Deterministic Agency."

## 1. Core Philosophy

* **Identity (The Anchor):** A singular, unique entity that persists over time. A Person or Organization has one Identity but can inhabit many Roles.
* **Role (The Context):** A temporary or situational set of permissions, behaviors, and attributes. Roles are "worn" by an Identity to interact with specific business processes.

## 2. Identity Examples (The "Who")

Identities are represented by the `Party` supertype and its specific profiles.

| Identity Type | Key Attributes | Purpose |
| :--- | :--- | :--- |
| **Individual** | Legal Name, DOB, SSN/National ID | To uniquely identify a human being across all interactions. |
| **Organization** | Legal Name, EIN/Tax ID, Date of Incorporation | To identify a business entity, department, or legal construct. |
| **AI Agent / Device** | Model Version, Serial Number, MAC Address | To identify a non-human actor performing automated tasks. |

## 3. Role Examples (The "What")

Roles are situational. An Identity can hold multiple roles simultaneously without duplicating the Identity data.

| Role Name | Linked Identity | Contextual Attributes |
| :--- | :--- | :--- |
| **Staff Member** | Individual | Employee ID, Job Title, Payroll Rate, Skills. |
| **Customer** | Indiv. or Org. | Loyalty Tier, Credit Limit, Purchase History. |
| **Vendor** | Organization | Service Type, Payment Terms, 1099 Status. |
| **Technician** | Individual | Certification Level, Proficiency, Availability. |
| **Owner (Garage)** | Individual | Purchase Date, Title Status, Primary Driver Flag. |

## 4. Why This Distinction Matters for AI Agents

Separating Identity from Role allows an AI agent to perform "Cross-Domain Reasoning":

1.  **Authorization:** An agent checks the *Role* to see if an action is permitted (e.g., "Does this Identity have the *Sales Manager* role?").
2.  **Safety:** An agent checks the *Identity Status* to see if the actor is valid (e.g., "Is this Identity *Active*, or has the company *Dissolved*?").
3.  **Data Integrity:** When a Staff Member leaves the company, we terminate their *Role*, but we do not delete their *Identity*. This preserves the history of who performed past actions.

## 5. Implementation Summary
- **Identity Storage**: `Party`, `Person`, `OrgProfile`.
- **Role Storage**: `StaffMember`, `Customer`, `Vendor` (linked via `partyKey`).
- **Relationship**: Always use the `partyKey` as the "foreign key" to bridge Roles back to the Identity anchor.
- 
### Naming Choice
Use **`IndividualName`** (or even better, `FullName`) for the actual identity, but use **`ContactName`** for the *role* or *context* within the party relationship.

If you have to pick just one for a general schema: **`IndividualName`** is more precise.

---

### Why the distinction matters

| Attribute | Best Used When... | Why? |
| :--- | :--- | :--- |
| **`IndividualName`** | Defining the **identity** of a person. | It distinguishes a human being from a `LegalEntityName` (Business). It implies "this is who this person is." |
| **`ContactName`** | Defining a **functional role**. | It implies "this is the person you talk to for this Party." A business might have three different "Contact Names" for billing, technical support, and sales. |

---

### Recommended Strategy: The "Party" Pattern
The system distinguishes between businesses and individuals, the most robust way to handle this is through a **Role-Based** approach.

1.  **The Party:** Holds a `PartyType` (Individual vs. Organization).
2.  **The Individual:** If the Party is an individual, this stores their **`FirstName`**, **`LastName`**, or **`FullName`**.
3.  **The Contact Relationship:** This links a Person to a Business.

> **Pro-Tip:** Avoid using `ContactName` as a primary field. It’s often a "computed" field. For example, a Business Party has a relationship with an Individual Party. In the UI, you display that individual's name as the **Contact Name**.

### Decision Matrix
* **Use `IndividualName` if:** You are collecting the legal name of a human being to create their profile.
* **Use `ContactName` if:** You are working in a CRM context where a user needs to know "Who do I call at Acme Corp?"

### My Preference
**`IndividualName`** for the party name.

It’s more semantically "honest." A name doesn't change just because they stop being a "contact" and become a "lead" or a "client." **`ContactName`** is a label for a relationship; **`IndividualName`** is an attribute of a person.

To build a truly resilient system, you have to distinguish between the **Identity** (what something is) and the **Role** (what something does).

### 1. The Entity vs. The Role
A "Person" is a biological human being. An "Organization" is a legal or social construct (a corporation, a department, a club). They are fundamentally different types of **Entities**.

However, in most business processes, both can act as a **Party**.

* **The "Party" Pattern:** This is the standard architectural solution. You create a top-level `Party` entity. Both `Individual` and `Organization` inherit from it.
* **The "Functional" View:** If your system asks, "Who is the 'Vendor' for this contract?", the answer could be *John Doe* (an individual) or *Global Corp* (an organization).



---

### 2. The "Sole Proprietorship" Exception
There is one specific scenario where a person "is" an organization: **The Sole Proprietorship or Single-Member LLC.**

In this case, the legal identity of the person and the business are often treated as one for tax or liability purposes. Even here, a clean data model should separate them:
* **The Person:** Eban (the human).
* **The Organization:** "Eban Consulting" (the legal entity).
* **The Link:** The Person *owns* or *is the sole member* of the Organization.

---

### 3. How to Model This (DDD Approach)
Avoid making a Person an Organization. Instead, use a **Polymorphic Relationship**:

| Concept | Implementation |
| :--- | :--- |
| **Legal Entity** | Use a `Party` supertype. |
| **Contact Point** | A `Contact` is a relationship between a `Person` and an `Organization`. |
| **Acting Agent** | An `Actor` is an interface that both a `Person` and an `Organization` (or even an AI Agent) can implement. |

### Why you shouldn't "force" a Person into an Organization:
1.  **Validation:** Organizations have tax IDs (EINs), incorporation dates, and "Doing Business As" (DBA) names. People have Birthdays and Social Security Numbers. Combining them leads to "Swiss Army Knife" tables with too many nullable columns.
2.  **Lifecycle:** A person "dies"; an organization "dissolves" or "merges." The logic for handling these events is different.
3.  **Relationships:** A person can belong to multiple organizations, but an organization is rarely "part of" a person.

