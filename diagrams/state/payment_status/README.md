## 🚗 Vehicle Purchase & Financing Statuses

These statuses are critical for managing the multi-part payments involved in a car sale (e.g., deposit, down payment, financed amount).

| Status | Suggested Name | Description | Related Process |
| :--- | :--- | :--- | :--- |
| **1.** | **DEPOSIT\_HELD** | Initial funds (often refundable) taken to secure a vehicle or special order. | **Vehicle Reservation** |
| **2.** | **FINANCING\_PENDING** | The payment (usually the main loan amount) is awaiting final approval or funding from the financial institution (assignee). | **Vehicle Purchase** |
| **3.** | **FUNDING\_CLEARED** | The entire loan amount has been received from the bank/lender and is applied to the sale. This often happens *after* the customer drives off. | **Vehicle Purchase** |
| **4.** | **LATE\_FEE\_DUE** | A specific status for scheduled recurring payments (if the dealership handles financing/lease payments) that have exceeded the grace period. | **Loan/Lease Servicing** |
| **5.** | **TITLE\_RELEASED** | A final state for the payment record confirming all obligations have been met, allowing the lien on the vehicle title to be removed. | **Loan/Lease Servicing** |

***

## 🛠️ Service & Parts Specific Statuses

While many service and parts payments use the standard Counter Sale or Invoice flow, recurring service plans or complex transactions require distinct statuses.

| Status | Suggested Name | Description | Related Process |
| :--- | :--- | :--- | :--- |
| **6.** | **PREAUTH\_EXPIRED** | An authorization hold for an estimated service or repair cost has timed out before the final charge could be captured. | **Service/Repair** |
| **7.** | **WARRANTY\_CLAIM** | The transaction amount is being covered by a third-party warranty or insurance claim, which has its own billing lifecycle. | **Service/Repair** |
| **8.** | **RENTAL\_DAMAGE** | Used for a separate charge related to damage/fees incurred on a rental or loaner vehicle provided by the dealership. | **Ancillary Charges** |
| **9.** | **TOKENIZED** | The customer's payment details (card or bank account) have been securely saved on file for future recurring service charges or loyalty payments. | **Recurring Payments** |

***

## 🔄 Loan/Lease Servicing & Collections Statuses

If your system manages the subsequent monthly payments for auto loans or leases (either in-house or through a third-party assignee), these statuses are critical for tracking delinquency:

| Status | Suggested Name | Description | Related Process |
| :--- | :--- | :--- | :--- |
| **10.** | **GRACE\_PERIOD** | The scheduled monthly payment is past due, but still within the acceptable grace period (e.g., 10 days) before a penalty is assessed. | **Delinquency Tracking** |
| **11.** | **DEFERRED\_PAYMENT** | The lender has granted a temporary suspension of the monthly payment, pushing the due date out (often seen during financial hardship programs). | **Loan Modification** |
| **12.** | **COLLECTIONS** | The payment is significantly past due, and the account has been handed over to an internal or external collections team. | **Collections** |
| **13.** | **REPOSSESSION** | The final status indicating the account is being closed out due to the initiation of vehicle repossession. | **Extreme Delinquency** |
