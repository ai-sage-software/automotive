## Key Mapping Logic

### **The Happy Path:** 

DRAFT → INITIATING → ACTIVE → PENDING_APPROVAL → APPROVED → POSTED → APPLIED → COMPLETE.

### **The "Agentic" States:** 

States like AUTHENTICATION_REQUIRED and COMBINATION_DISALLOWED are critical. 

They allow an AI agent to know exactly why a rebate wasn't applied so it can ask the user for a fix (like logging in or choosing a different coupon).

### **The Hold Loop** 

Any status ending in _HOLD (Sales, Payment, Finance, Customer) represents a temporary suspension where the flow is preserved but requires external intervention to move back to PENDING_APPROVAL.
 

### Technical Breakdown of These States

#### 1. AUTHENTICATION_REQUIRED (State 22)

This state triggers a **Decoupled Authentication** or **CIBA (Client-Initiated Backchannel Authentication)**.

* **The Problem:** The AI agent is acting on your behalf but reaches a point where a sensitive financial action (like applying a high-value loyalty credit) requires "Proof of Possession."
* **The AI Action:** The agent doesn't just fail; it suspends the flow and pushes a notification to the user's primary device (e.g., a FaceID prompt on their phone). Once verified, the agent receives a short-lived scoped token to move the status from `AUTHENTICATION_REQUIRED` back to `ACTIVE`.

#### 2. COMBINATION_DISALLOWED (State 20)

This is common in the automotive service lane (e.g., you can't stack a "First Time Guest" discount with a "Spend & Save" rebate).

* **The Problem:** Standard checkout systems usually just throw an error or remove one discount silently.
* **The AI Action:** The agent acts as a **Digital F&I Manager**. It performs a "shadow calculation" of all possible permutations:
* *Option A:* Oil Change Discount + Tire Rebate = **$75 off**.
* *Option B:* 15% Total Invoice Discount = **$62 off**.


* The agent then communicates the **Optimized Path** to the user in natural language, asking for permission to proceed with Option A.

 