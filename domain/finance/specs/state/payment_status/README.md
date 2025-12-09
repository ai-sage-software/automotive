

## 🔄 Loan/Lease Servicing & Collections Statuses

If your system manages the subsequent monthly payments for auto loans or leases (either in-house or through a third-party assignee), these statuses are critical for tracking delinquency:

| Status | Suggested Name | Description | Related Process |
|:-------| :--- | :--- | :--- |
| **1.** | **GRACE\_PERIOD** | The scheduled monthly payment is past due, but still within the acceptable grace period (e.g., 10 days) before a penalty is assessed. | **Delinquency Tracking** |
| **2.** | **DEFERRED\_PAYMENT** | The lender has granted a temporary suspension of the monthly payment, pushing the due date out (often seen during financial hardship programs). | **Loan Modification** |
| **3.** | **COLLECTIONS** | The payment is significantly past due, and the account has been handed over to an internal or external collections team. | **Collections** |
| **4.** | **REPOSSESSION** | The final status indicating the account is being closed out due to the initiation of vehicle repossession. | **Extreme Delinquency** |
