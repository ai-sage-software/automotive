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
