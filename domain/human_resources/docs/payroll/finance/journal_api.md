The management of **Journal Entries** and **Control Accounts** should be handled by dedicated APIs within an **Accounting or General Ledger (GL) ** domain, separate from the core payroll system.

Here are the essential API endpoints (methods) for managing these two resources.

| Resource | Operation (HTTP Method) | API Endpoint | Description |
| :--- | :--- | :--- | :--- |
| **Journal Entries** (Batch) | `POST` | `/api/v1/journal-entries` | **Creates a new batch** of journal entries (e.g., from a completed payroll run). This is the primary endpoint for sending payroll data to the GL system. |
| **Journal Entries** | `GET` | `/api/v1/journal-entries/{resourceId}` | Retrieves all journal entries associated with a specific source transaction (e.g., the `PayrollRunId`). |
| **Journal Entries** | `GET` | `/api/v1/journal-entries/{entryId}` | Retrieves the details of a single, specific journal entry line. |
| --- | --- | --- | --- |
| **Control Accounts** | `GET` | `/api/v1/control-accounts` | Retrieves a list of all active Control Accounts (e.g., for mapping purposes within the payroll system). |
| **Control Accounts** | `GET` | `/api/v1/control-accounts/{accountId}` | Retrieves the full details of a single Control Account (e.g., `WAGES_PAYABLE_CTRL`). |
| **Control Accounts** | `POST` | `/api/v1/control-accounts` | **Creates a new** Control Account (typically used by finance/admin tools, not payroll). |
| **Control Accounts** | `PUT`/`PATCH`| `/api/v1/control-accounts/{accountId}` | Updates the details of an existing Control Account (e.g., changing the description or linked bank ID). |

---

### Integration Context

The payroll system would primarily act as a **client** of the Accounting API, specifically using the **`POST /api/v1/journal-entries`** endpoint after a `PayrollRun` has reached the `POSTED` status. The payroll service would use the **`GET /api/v1/control-accounts`** endpoint to ensure the correct `control_account_id` is used when generating the journal entry JSON.