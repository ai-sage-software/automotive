An example for payroll processing would focus on defining the master GL accounts used to aggregate and reconcile the detailed payroll transactions.

In the context of payroll, the most common Control Accounts represent major **Liability** (money owed to third parties) and **Expense** (cost to the company) categories.

Here are JSON examples for three critical **Control Accounts** used in payroll processing, showing how your model fields would be populated.

-----

## Control Account JSON Examples for Payroll

These examples assume the `ControlAccount` objects are part of a master reference data set that the payroll and GL systems use for mapping.

### 1\. Wages Payable (Liability) Control Account

This account represents the total **net pay** owed to all employees before funds are disbursed. It is the primary liability created by a payroll run.

| Field | Value | Rationale |
| :--- | :--- | :--- |
| `control_account_id` | `2100` | Standard GL code for a current liability (Wages Payable). |
| `control_account_key` | `WAGES_PAYABLE_CTRL` | Business key for easy lookup. |
| `control_account_name` | `Wages Payable - Control` | Display name for the GL ledger. |
| `control_account_desc` | `Master account for all employee net pay liabilities.` | Detailed description. |
| `control_account_type` | `LIABILITY` | The account classification (using an assumed `ControlAccountTypes` enum). |
| `financial_category_type` | `CURRENT_LIABILITY` | Defines the category on the Balance Sheet (using an assumed `FinancialCategoryTypes` enum). |

```json
{
  "control_account_id": "2100",
  "control_account_key": "WAGES_PAYABLE_CTRL",
  "control_account_name": "Wages Payable - Control",
  "control_account_desc": "Master account for all employee net pay liabilities.",
  "control_account_type": "LIABILITY",
  "financial_category_type": "CURRENT_LIABILITY",
  "control_account_role_types": "MASTER_RECONCILIATION" 
}
```

-----

### 2\. Payroll Tax Expense Control Account

This account aggregates the **employer's share** of payroll taxes (like FICA/FUTA match), representing the total expense incurred by the company.

| Field | Value | Rationale |
| :--- | :--- | :--- |
| `control_account_id` | `6100` | Standard GL code for a common operating expense. |
| `control_account_key` | `PAYROLL_TAX_EXP_CTRL` | Business key for lookup. |
| `control_account_name` | `Payroll Tax Expense - Control` | Display name for the GL ledger. |
| `control_account_desc` | `Master account for all employer-paid payroll tax expenses.` | Detailed description. |
| `control_account_type` | `EXPENSE` | The account classification. |
| `financial_category_type` | `OPERATING_EXPENSE` | Defines the category on the Income Statement. |

```json
{
  "control_account_id": "6100",
  "control_account_key": "PAYROLL_TAX_EXP_CTRL",
  "control_account_name": "Payroll Tax Expense - Control",
  "control_account_desc": "Master account for all employer-paid payroll tax expenses.",
  "control_account_type": "EXPENSE",
  "financial_category_type": "OPERATING_EXPENSE",
  "control_account_role_types": "MASTER_RECONCILIATION"
}
```

-----

### 3\. Cash Disbursements Control Account

This account represents the company's bank account (Asset) from which all net payments are drawn.

| Field | Value | Rationale |
| :--- | :--- | :--- |
| `control_account_id` | `1001` | Standard GL code for a Cash/Asset account. |
| `control_account_key` | `OPERATING_CASH_CTRL` | Business key for lookup. |
| `control_account_name` | `Operating Bank Account - Control` | Display name. |
| `control_account_desc` | `Master account for the primary operating bank account.` | Detailed description. |
| `control_account_type` | `ASSET` | The account classification. |
| `financial_category_type` | `CURRENT_ASSET` | Defines the category on the Balance Sheet. |
| `bank_account_id` | `BANK-001234` | Directly links the GL account to the physical bank account used for payments. |

```json
{
  "control_account_id": "1001",
  "control_account_key": "OPERATING_CASH_CTRL",
  "control_account_name": "Operating Bank Account - Control",
  "control_account_desc": "Master account for the primary operating bank account.",
  "control_account_type": "ASSET",
  "financial_category_type": "CURRENT_ASSET",
  "bank_account_id": "BANK-001234",
  "control_account_role_types": "MASTER_RECONCILIATION"
}
```