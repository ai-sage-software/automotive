## Journal Entry and a Control Account

The relationship between a Journal Entry and a Control Account is one of reference and validation in the context of a robust accounting system.

## Relationship: Reference and Validation
A **Control Account** (also known as a **Reconciliation Account**) is a high-level General Ledger (GL) account used in the main accounting books to summarize the total activity of a subsidiary ledger (or sub-ledger).


**Reference**: When a detailed transaction (like a payroll entry) is generated in the sub-ledger (the payroll system), the corresponding JournalEntry contains a reference to the relevant GL control accounts.


**Example**: A payroll run generates numerous liability and expense entries. All the **Wages Payable** (liability) entries, for instance, are detailed in the payroll sub-ledger. The total of these detailed entries must match the balance of the single **Wages Payable Control Account** in the main GL.


**Validation**: The inclusion of controlAccounts in the JournalEntry data structure signals to the receiving GL system which top-level accounts will be impacted, enabling the system to validate that the total sum of all debits and credits from the payroll run correctly matches the main GL's control accounts.