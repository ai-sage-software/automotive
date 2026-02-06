# Agentic Commerce: Financial Split in MCP & UCP Ecosystems

This article outlines the strategic role of the **Financial Split** entity within the Model Context Protocol (MCP) and Universal Commerce Protocol (UCP) frameworks, serving as the critical bridge between AI-driven negotiation and legacy Dealer Management Systems (DMS) like **CDK Drive** and **Tekion**.

---

## 🤖 The Role of AI Agents (MCP)

In an **Agentic Commerce** model, AI agents act as autonomous negotiators. When an agent (e.g., a customer's personal assistant) interacts with a Service Provider's MCP server, it doesn't just ask for a price.  It negotiates a **Value Exchange**.

The **Financial Split** is the data contract that records the outcome of that negotiation.

### MCP Interaction Flow

1. **Discovery:** The Agent queries the MCP server for service availability.
2. **Negotiation:** The Agent presents credentials (e.g., "I have a $20 loyalty coupon" or "This is a warranty-covered VIN").
3. **Resolution:** The MCP server uses the **PricePlan** to calculate a complex billing scenario.
4. **Final Split:** The server generates a `FinancialSplit` that snapshots exactly how the 150 dollar labor operation is divided: 100 to the OEM (Warranty) and $50 to the Customer.

---

## 🌐 UCP: The Universal Language of the Handshake

The **Universal Commerce Protocol (UCP)** provides the standardized schema that allows disparate AI agents and services to speak the same language.

By using the **Financial Split** as a UCP-compliant entity, you ensure:

* **Interoperability:** A "Discount" in a Toyota agent is interpreted the same way by a Ford-based DMS bridge.
* **Auditability:** The `sequence_id` and `control_account_reference` ensure that the financial handshake is mathematically verifiable across different bounded contexts.

---

## ⚡ Integration with Legacy Systems (CDK, Tekion)

The "Last Mile" of the transaction is pushing the agent's negotiated split into the legacy mainframe.

### 1. CDK Drive (The STAR XML Path)

CDK relies heavily on the **STAR 5 Standard**. Your `FinancialSplit` must be mapped to the `<Splits>` segment of a `ServiceWorkOrder` or `PartsPickList`.

* **Challenge:** CDK requires specific "Pay Types" (C, W, I, S).
* **Solution:** The bridge uses the `party_reference_type` and `ledger_types` from your split to inject the correct CDK-specific codes.

### 2. Tekion (The Modern Cloud Path)

Tekion offers a more flexible API, but still requires strict accounting reconciliation.

* **Mapping:** Your `ledger_action_type` (DEBIT/CREDIT) maps directly to Tekion’s General Ledger posting API.
* **Precision:** Tekion’s platform consumes the `snake_case` JSON directly, allowing for real-time invoice generation that matches the AI's promise.

---

## 📈 Capability Matrix: Why This Model Wins

| Feature | Agentic Value (MCP/UCP) | Legacy System Impact (CDK/Tekion) |
| --- | --- | --- |
| **`sequence_id`** | Ensures the AI applies coupons in the right order. | Prevents "Penny-Off" reconciliation errors in the GL. |
| **`parties` list** | Lets the agent know exactly *who* it is billing. | Populates the "Payor" fields in the DMS automatically. |
| **`tax_splits`** | Handles complex regional tax negotiation for mobile services. | Ensures the dealer pays the correct jurisdiction (State vs. Local). |
| **`ledger_types`** | Standardizes "Reasons" (REBATE, FEE, DISCOUNT). | Maps the transaction to the correct 4-digit accounting bucket. |

---

## 🛡️ Compliance & The Immutable Audit

Because the **Financial Split** is snapshotted inside the `LaborOperation`, it provides an **Immutable Audit Trail**. If an AI agent promises a discount today, the dealer's legacy system will reflect that exact discount six months from now, even if the master PricePlan has changed.

