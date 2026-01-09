# 🏗️ Enterprise Export & Capabilities Framework

Welcome to the **Core Domain API**. This system uses a **Capability-Intent-Export** architecture designed for high-scale, asynchronous data processing and domain-driven interaction.

## 🚀 The Three-Step Integration Flow

Unlike standard REST APIs, this system is **self-describing**. Follow these steps to integrate:

### 1. Discover (Capabilities)

Before performing an action, query the capabilities endpoint to see what is currently possible for the `xxxxx` aggregate.

* **Endpoint:** `GET /xxxxx/capabilities`
* **Purpose:** Returns available **Intents** (Commands) and **Data Products** (Exports).
* **Key Benefit:** The UI can dynamically enable/disable buttons based on the `constraints` returned.

### 2. Execute (Intent)

Once you have identified a Data Product (e.g., `transaction_ledger_v1`), initiate the export.

* **Endpoint:** `POST /xxxxx/exports`
* **Headers:** * `Idempotency-Key`: **REQUIRED**. Use a UUID to prevent duplicate job creation.
* **Payload:** Specify the `data_product_id`, `format` (Parquet/CSV), and your `notification` webhook URL.

### 3. Retrieve (Webhook or Polling)

Since exports are asynchronous, the system will notify you when the file is ready.

* **Webhook:** Your server will receive a `POST` with the signed payload containing the `download_url`.
* **Polling:** (Fallback) Check status at `GET /xxxxx/exports/{job_id}`.

---

## 🛡️ Key Architectural Pillars

### 📋 RFC 7807 Problem Details

If an Intent is rejected (e.g., trying to export a frozen account), the API returns a **422 Unprocessable Entity**.

* **Structure:** Machine-readable `violations` array.
* **Path-mapping:** Tells you exactly which field or business rule caused the failure.

  
### 🔐 Webhook Security

All notifications sent to your `webhook_url` are signed.

1. Use the `signature_key` provided during the POST.
2. Verify the `X-Export-Signature` header to ensure the payload hasn't been tampered with.

---

No "Guessing" Errors: When the client fails, they aren't looking at a generic 500 Internal Server Error. They receive a list of Violations that maps directly to their business logic (e.g., "Insufficient permissions to export this currency").

Predictive State: A smart frontend can use the /capabilities data to disable the "Export" button before the user even tries to click it if a constraint (like a frozen account) is present.

Idempotency Safety: The developer can safely wrap this call in a "Retry" block. If the network drops, sending the same Idempotency-Key ensures they don't accidentally bill the server for two 50GB Parquet generations.


## Capabilities Filtering

Filtering approach is "Next Level"
State-Aware UI: By passing ?state=FROZEN, the client gets a tiny response showing that all "Move Money" intents are disabled and why.

Bandwidth Efficiency: Mobile apps can request ?include=commands to keep the payload under 2KB, while a Data Analytics tool can request ?include=exports.

Dry Run Confidence: The dry_run feature is the ultimate "safety net" for Money. It allows a user to see, "If I run this, I will get 5 million rows," and decide to narrow their date range before clicking "Confirm."

The Resulting Developer Experience
A developer building a "Withdrawal" screen would simply call: GET /money/capabilities?state=ACTIVE&include=commands

They get exactly the intents needed to render the buttons for an active account, with no extra "Export" noise.


 