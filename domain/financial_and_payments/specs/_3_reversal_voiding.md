## 3\. Reversal & Voiding

A reversal creates a new entry that exactly mirrors the original entry but with the opposite debit/credit assignment. This is often initiated by an error-checking tool.

| Field | Value | Rationale |
| :--- | :--- | :--- |
| `resource_type` | `REVERSAL` | Identifies the entry as a formal correction process. |
| `desc` | `Reversal of original JE: AR-202509-012 (Incorrect amount posted)` | **Crucial:** References the original entry that contains the error. |
| **Debit/Credit Swap**| The Debit/Credit fields are swapped relative to the original entry. | Mathematically cancels the original entry's impact. |

```json
[
  {
    "entry_key": "RVL-AR-202509-012-D",
    "desc": "Reversal of original JE: AR-202509-012 (Incorrect amount posted)",
    "detail_sequence": "1",
    "journal_type": "DEBIT",  // Original was a CREDIT
    "org_id": "STORE_001",
    "resource_id": "AR-202509-012", // ID of the original faulty JE
    "resource_type": "REVERSAL",
    "reference_account_id": "4000",
    "entry_reference_account_desc": "Sales Revenue",
    "money": {
      "amount": 5000.00,
      "currency": "USD"
    }
  },
  {
    "entry_key": "RVL-AR-202509-012-C",
    "desc": "Reversal of original JE: AR-202509-012 (Incorrect amount posted)",
    "detail_sequence": "2",
    "journal_type": "CREDIT", // Original was a DEBIT
    "org_id": "STORE_001",
    "resource_id": "AR-202509-012",
    "resource_type": "REVERSAL",
    "reference_account_id": "1200",
    "entry_reference_account_desc": "Accounts Receivable",
    "money": {
      "amount": 5000.00,
      "currency": "USD"
    }
  }
]
```
 