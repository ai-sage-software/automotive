# Party Lifecycle State Information

This document outlines the state machine and lifecycle transitions for the `Party` entity. This state information is designed to provide deterministic governance for both system processes and AI agents.

## 1. State Definitions

| State | Name | Description | Agentic Impact |
| :--- | :--- | :--- | :--- |
| **DRAFT** | Initial | Record is created but incomplete or unverified. | **Restricted**: Agents may not initiate external contact. |
| **PENDING_VERIFICATION** | Vetting | Identity, Tax, or Business validation is in progress. | **Observed**: Agents monitor for completion signals. |
| **REJECTED** | Failed Validation | Verification failed due to data discrepancy or risk. | **Action Required**: Agents flag for manual correction. |
| **ACTIVE** | Operational | Verified and fully authorized for all business roles. | **Full Agency**: Authorized for all automated workflows. |
| **INACTIVE** | Suspended | Valid entity, but current business activity is paused. | **Read-Only**: Agents may maintain but not initiate transactions. |
| **PENDING_MERGE** | Consolidation | Duplicate detected; awaiting mapping to primary record. | **Hold**: Agents pause updates to prevent fragmentation. |
| **MERGED** | Redirected | Record is now a pointer to a primary `partyKey`. | **Redirect**: Agents must traverse to primary identity. |
| **DECEASED / DISSOLVED** | Legal Termination | Entity no longer exists legally (Individual or Org). | **Safety Gate**: Triggers automated closure of active assets. |
| **ARCHIVED** | Historical | Retention-only state; record is no longer operational. | **Invisible**: Generally excluded from active agent queries. |
| **PURGED** | Compliance | PII removed for GDPR/CCPA; record shell remains. | **Terminal**: No identity data available for processing. |

## 2. Transition Logic

### Verification Workflow
* **DRAFT → PENDING_VERIFICATION**: Occurs when a "Submit for Vetting" event is triggered.
* **PENDING_VERIFICATION → ACTIVE**: Triggered by a successful match from an identity provider or tax service.
* **PENDING_VERIFICATION → REJECTED**: Triggered if validation fails (e.g., invalid EIN/SSN).

### Operational Maintenance
* **ACTIVE ↔ INACTIVE**: Managed by account management logic or manual administrative override.
* **ACTIVE → DECEASED_DISSOLVED**: Triggered by verified legal notification or public record match.

### Master Data Management (MDM)
* **[Any] → PENDING_MERGE**: Triggered when the deduplication logic identifies a high-confidence match.
* **PENDING_MERGE → MERGED**: Finalized after data survivorship rules are applied.

### Compliance & Privacy
* **INACTIVE / ARCHIVED → PURGED**: Triggered by a "Right to be Forgotten" request or the expiration of the legal retention period.

## 3. Implementation Guidelines
- **Indexing**: The `partyStatus` field must be indexed for high-performance filtering.
- **API Gates**: The API Gateway should block requests to `PURGED` or `MERGED` entities except for specific audit/pointer resolution.
- **Agent Governance**: AI Agent system prompts must include the `ACTIVE` status as a prerequisite for any autonomous action.