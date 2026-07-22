 
In privacy engineering (GDPR, CCPA, HIPAA), **anonymization** is technically defined as *irreversibly altering data so that an individual can no longer be identified, directly or indirectly*. 

The Privacy Strategy enum includes every standard mechanism used to achieve privacy, plus controls for pseudonymization, masking, and transport policy.

---

### Actions Map to Formal Privacy Categories

| Privacy Category | Your Enums | How It Achieves It |
| --- | --- | --- |
| **Full Anonymization** (Irreversible) | `HASH`, `GENERALIZE`, `PERTURB`, `REDACT`, `TRUNCATE`, `NULLIFY` | Destroys or alters the underlying data such that re-identification is mathematically or practically impossible. |
| **Pseudonymization** (Reversible / Structural) | `PSEUDONYMIZE`, `TOKENIZE` | Replaces real values with surrogates. *Note: Under GDPR, pseudonymized data is still considered personal data if a mapping key exists.* |
| **Data Minimization / Obfuscation** | `PARTIAL_MASK` | Preserves utility (e.g., verifying last 4 digits of VIN/card) while hiding the sensitive payload. |
| **Policy / Enforcement** | `BLOCK`, `NONE` | Control-plane directives that handle transport safety rather than in-place transformation. |

---

### Key Nuances

1. **`HASH` vs. `TOKENIZE` Separation is Crucial:**
   Keeping `HASH` (one-way deterministic) separate from `TOKENIZE` (reversible lookup) is a huge win for third-party adapter integrations. It allows your global privacy engine to differentiate between persistent identity matching across systems (`HASH`) versus secure reversible data vaults (`TOKENIZE`).
2. **`GENERALIZE` & `PERTURB` Cover Differential Privacy:**
   Most basic systems stop at masking and redacting. Including statistical noise (`PERTURB`) and bucketing (`GENERALIZE`) allows you to safely export data for analytics or machine learning models without leaking exact customer identities.
3. **`NULLIFY` vs. `REDACT` vs. `BLOCK`:**
* `REDACT` keeps the structural payload and inserts a string marker (`"[REDACTED]"`).
* `NULLIFY` cleanses the value or key to keep strict JSON/Protobuf schemas valid without dummy strings.
* `BLOCK` halts processing entirely as a security boundary.



---

### Things to Consider

Watch the implementation of **`HASH`**:

> **Tip:** Standard unsalted cryptographic hashing (e.g., `SHA-256("john@example.com")`) can be vulnerable to dictionary attacks for small domains (like phone numbers or ZIP codes). For true compliance-grade anonymization, make sure your underlying `HASH` implementation utilizes a **global salt / HMAC** so deterministic hashes can't be reversed via rainbow tables.
 

### Examples

Here is a comprehensive demonstration table showing how a sensitive input payload transforms across every action in your privacy enum strategy:

| Enum Action | Original Value | Transformed / Masked Output Value | Technical Purpose & Behavior |
| --- | --- | --- | --- |
| **`REDACT`** | `"Eban Thomas"` | `"[REDACTED]"` | Static string substitution preserving key existence. |
| **`TOKENIZE`** | `"Eban Thomas"` | `"[NAME_REF_9814A]"` | Reversible lookup token stored in a secure vault. |
| **`HASH`** | `"1FA6P8CF0R5100000"` *(VIN)* | `"e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"` | Irreversible, deterministic cryptographic hash (HMAC salted). |
| **`PSEUDONYMIZE`** | `"Eban Thomas"` | `"Marcus Vance"` | Realistic synthetic mock data preserving structural format for non-prod/UI. |
| **`PARTIAL_MASK`** | `"4111-2222-3333-4582"` | `"XXXX-XXXX-XXXX-4582"` | Obfuscates payload while retaining contextual fragments for verification. |
| **`BLOCK`** | `"ssn": "000-12-3456"` | `[EXCEPTION / TRANSMISSION ABORTED]` | Direct transport halt; payload processing fails fast at the adapter boundary. |
| **`GENERALIZE`** | `"1984-03-12"` | `"1984"` *(or "30-39 age group")* | Buckets specific scalars into broader ranges to prevent single-out identification. |
| **`PERTURB`** | `$180.00` *(Labor Rate)* | `$184.32` *(Calculated noise)* | Applies mathematical drift ($\pm\Delta$) for differential privacy in analytics. |
| **`TRUNCATE`** | `$2,450,000.00` *(Net Worth)* | `"> $1,000,000.00"` | Clamps outliers to a ceiling/floor threshold to prevent high-value targeting. |
| **`NULLIFY`** | `"email": "eban@example.com"` | `"email": null` *(or key stripped)* | Clears contents to comply with strict schema types without leaving placeholder noise. |
| **`NONE`** | `"Alpharetta"` | `"Alpharetta"` | Passthrough mode; explicitly leaves data untouched. |

---

> **Note on Strategy Cohesion:** Pairing structural transforms like **`PSEUDONYMIZE`** and **`PARTIAL_MASK`** alongside statistical controls like **`PERTURB`** and **`GENERALIZE`** gives an architecture complete coverage across operational DMS messaging, third-party syncs, and downstream data warehouse feeds.