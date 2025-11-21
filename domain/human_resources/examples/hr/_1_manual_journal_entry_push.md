## 1\. Manual Journal Entry Push (Month-End Accrual)

This is a typical entry posted by an accountant at month-end. The `resource_type` is set to reflect a manual or system-generated adjustment rather than an automated business process.

| Field | Value | Rationale |
| :--- | :--- | :--- |
| `resource_type` | `MANUAL_ADJUSTMENT` | Identifies the source as a direct entry from a user/external financial tool. |
| `desc` | `Month-End Salary Accrual for Unpaid Wages` | Details the adjustment purpose. |
| **Debit Entry** | `reference_account_id`: `6000` (Salary Expense) | Recognizes the expense incurred but not yet paid. |
| **Credit Entry**| `reference_account_id`: `2150` (Accrued Wages Payable) | Records the short-term liability. |

```json
[
  {
    "entry_key": "MJE-20251031-1",
    "desc": "Month-End Salary Accrual for Unpaid Wages",
    "detail_sequence": "1",
    "journal_type": "DEBIT",
    "org_id": "DEPT_ADMIN",
    "resource_id": "ADJ-202510-145",
    "resource_type": "MANUAL_ADJUSTMENT",
    "reference_account_id": "6000",
    "entry_reference_account_desc": "Salary & Wages Expense",
    "control_accounts": {
      "control_account_id": "6000_CTRL"
    },
    "money": {
      "amount": 15000.00,
      "currency": "USD"
    }
  },
  {
    "entry_key": "MJE-20251031-2",
    "desc": "Month-End Salary Accrual for Unpaid Wages",
    "detail_sequence": "2",
    "journal_type": "CREDIT",
    "org_id": "DEPT_ADMIN",
    "resource_id": "ADJ-202510-145",
    "resource_type": "MANUAL_ADJUSTMENT",
    "reference_account_id": "2150",
    "entry_reference_account_desc": "Accrued Wages Payable",
    "control_accounts": {
      "control_account_id": "2150_CTRL"
    },
    "money": {
      "amount": 15000.00,
      "currency": "USD"
    }
  }
]
```
 