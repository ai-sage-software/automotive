## 4\. Financial Consolidation (Intercompany Adjustment)

Consolidation often involves pushing *intercompany* adjustments back down to individual entity GLs to eliminate discrepancies before final reporting.

| Field | Value | Rationale |
| :--- | :--- | :--- |
| `resource_type` | `CONSOLIDATION_ADJ` | Identifies the source as the corporate consolidation tool. |
| `org_id` | `STORE_002` | Crucially, directs the adjustment to the individual store's (DMS) GL. |
| **Debit/Credit** | `reference_account_id`: `2900` | Uses a specific account for intercompany suspense/elimination. |

```json
[
  {
    "entry_key": "CONS-2025Q4-ADJ-D",
    "desc": "Q4 Intercompany Adjustment from Consolidation Tool",
    "detail_sequence": "1",
    "journal_type": "DEBIT",
    "org_id": "STORE_002",
    "resource_id": "CONSOL-Q4-2025",
    "resource_type": "CONSOLIDATION_ADJ",
    "reference_account_id": "2900",
    "entry_reference_account_desc": "Intercompany Suspense/Elimination",
    "money": {
      "amount": 8000.00,
      "currency": "USD"
    }
  },
  {
    "entry_key": "CONS-2025Q4-ADJ-C",
    "desc": "Q4 Intercompany Adjustment from Consolidation Tool",
    "detail_sequence": "2",
    "journal_type": "CREDIT",
    "org_id": "STORE_002",
    "resource_id": "CONSOL-Q4-2025",
    "resource_type": "CONSOLIDATION_ADJ",
    "reference_account_id": "1400",
    "entry_reference_account_desc": "Fixed Asset Depreciation",
    "money": {
      "amount": 8000.00,
      "currency": "USD"
    }
  }
]
```