## 🛠️ Service & Parts Specific Statuses

While many service and parts payments use the standard Counter Sale or Invoice flow, recurring service plans or complex transactions require distinct statuses.

| Status | Suggested Name | Description | Related Process |
|:-------| :--- | :--- | :--- |
| **1.** | **PREAUTH\_EXPIRED** | An authorization hold for an estimated service or repair cost has timed out before the final charge could be captured. | **Service/Repair** |
| **2.** | **WARRANTY\_CLAIM** | The transaction amount is being covered by a third-party warranty or insurance claim, which has its own billing lifecycle. | **Service/Repair** |
| **3.** | **RENTAL\_DAMAGE** | Used for a separate charge related to damage/fees incurred on a rental or loaner vehicle provided by the dealership. | **Ancillary Charges** |
| **4.** | **TOKENIZED** | The customer's payment details (card or bank account) have been securely saved on file for future recurring service charges or loyalty payments. | **Recurring Payments** |

***