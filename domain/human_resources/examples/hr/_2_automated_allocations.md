 

## 2\. Automated Allocations (Overhead Distribution)

This reflects a complex entry where a central cost (e.g., corporate rent) is distributed across multiple cost centers/departments using an automated engine.

| Field | Value | Rationale |
| :--- | :--- | :--- |
| `resource_type` | `ALLOCATION_ENGINE` | Identifies the source as an automated, non-transactional system. |
| **Credit Entry** | `reference_account_id`: `1100` (Corporate Overhead Pool) | Clears the cost from the central, temporary holding account. |
| **Debit Entries**| `org_id`: `DEPT_A` and `DEPT_B` | Distributes the expense to the responsible operating units. |

```json
[
  {
    "entry_key": "ALLOC-202510-001-C",
    "desc": "Monthly Overhead Allocation - Corporate Rent",
    "detail_sequence": "1",
    "journal_type": "CREDIT",
    "org_id": "CORP_FINANCE",
    "resource_id": "ALLOC-202510-001",
    "resource_type": "ALLOCATION_ENGINE",
    "reference_account_id": "1100",
    "entry_reference_account_desc": "Corporate Overhead Pool",
    "money": {
      "amount": 25000.00,
      "currency": "USD"
    }
  },
  {
    "entry_key": "ALLOC-202510-001-D1",
    "desc": "Overhead Allocation to Sales Department",
    "detail_sequence": "2",
    "journal_type": "DEBIT",
    "org_id": "DEPT_SALES",
    "resource_id": "ALLOC-202510-001",
    "resource_type": "ALLOCATION_ENGINE",
    "reference_account_id": "7001",
    "entry_reference_account_desc": "Sales Dept. Rent Expense",
    "money": {
      "amount": 15000.00,
      "currency": "USD"
    }
  },
  {
    "entry_key": "ALLOC-202510-001-D2",
    "desc": "Overhead Allocation to Service Department",
    "detail_sequence": "3",
    "journal_type": "DEBIT",
    "org_id": "DEPT_SERVICE",
    "resource_id": "ALLOC-202510-001",
    "resource_type": "ALLOCATION_ENGINE",
    "reference_account_id": "7002",
    "entry_reference_account_desc": "Service Dept. Rent Expense",
    "money": {
      "amount": 10000.00,
      "currency": "USD"
    }
  }
]
```

-----
 