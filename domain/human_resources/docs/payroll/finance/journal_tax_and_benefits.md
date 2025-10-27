Journal entries and Control Accounts are used together to ensure that the detailed, employee-level deductions for Tax, Medical, and 401(k) are accurately summarized and recorded in the main General Ledger (GL) as high-level **liabilities** and **expenses**.

Here's how they work for each type, focusing on the accounting flow:

***

## 1. Employee Withheld Taxes (Liability) 🏛️

Taxes withheld from an employee's paycheck (Federal Income Tax, FICA, State Tax) are **not** an expense to the company; they are a liability—money the company temporarily holds before paying the government.

### The Accounting Flow

| Payroll Step | Journal Entry (JE) | Control Account Used |
| :--- | :--- | :--- |
| **1. Calculate Liability** | **DEBIT** Wages Expense (to offset Gross Pay) | **Salary Expense Control Account** (e.g., GL 6000) |
| | **CREDIT** Taxes Payable (FICA, Federal, State) | **Tax Liability Control Account** (e.g., GL 2200) |
| **2. Transfer Funds** | **DEBIT** Taxes Payable (clears the liability) | **Tax Liability Control Account** (GL 2200) |
| | **CREDIT** Cash (funds leave bank account) | **Cash/Bank Account Control Account** (GL 1001) |

The **Tax Liability Control Account** (e.g., GL 2200) holds the **total** amount of tax money owed to all government entities for the entire payroll run, ensuring the company remits the correct total.

---

## 2. Medical & HSA Premiums (Pre-Tax Liability) 🛡️

Since these are generally **pre-tax** deductions, they are also a liability. The company collects the employees' portion and is then obligated to pay the full premium to the insurance carrier or transfer the HSA funds to the custodian.

### The Accounting Flow

| Payroll Step | Journal Entry (JE) | Control Account Used |
| :--- | :--- | :--- |
| **1. Calculate Liability** | **DEBIT** Wages Payable (reduces net pay) | **Wages Payable Control Account** (e.g., GL 2100) |
| | **CREDIT** Premiums Payable (or HSA Payable) | **Benefits Payable Control Account** (e.g., GL 2400) |
| **2. Pay Carrier/Custodian**| **DEBIT** Premiums Payable (clears the liability) | **Benefits Payable Control Account** (GL 2400) |
| | **CREDIT** Cash (funds leave bank account) | **Cash/Bank Account Control Account** (GL 1001) |

The **Benefits Payable Control Account** (GL 2400) tracks the total amount owed to all insurance carriers and HSA custodians, allowing the finance team to reconcile the sub-ledger details with the main financial statement.

---

## 3. 401(k) Contributions (Liability & Expense) 📈

401(k) processing involves two main types of entries: the **Employee Contribution (Liability)** and the **Employer Match (Expense)**.

### A. Employee Contribution (Liability)

This is treated like medical premiums—money collected from the employee that must be remitted.

| Journal Entry (JE) | Control Account Used | Rationale |
| :--- | :--- | :--- |
| **DEBIT** Wages Payable | **Wages Payable Control Account** (GL 2100) | Reduces the employee's net pay. |
| **CREDIT** 401(k) Payable | **Retirement Payable Control Account** (e.g., GL 2300) | Establishes the liability owed to the fund administrator. |

### B. Employer Match (Expense)

This is a direct cost to the company, not money withheld from the employee.

| Journal Entry (JE) | Control Account Used | Rationale |
| :--- | :--- | :--- |
| **DEBIT** 401(k) Match Expense | **Retirement Expense Control Account** (e.g., GL 6300) | Records the expense on the Income Statement. |
| **CREDIT** 401(k) Payable | **Retirement Payable Control Account** (GL 2300) | Increases the total liability owed to the fund administrator. |

The **Retirement Payable Control Account** (GL 2300) holds the combined total of both employee contributions and the employer match, ensuring the single batch transfer to the 401(k) fund administrator clears the entire liability.