# Financial Split Entity: Unified Financial Resolution Model

The **Financial Split** entity is a high-fidelity accounting component designed for the **UCP/MCP Bridge**. It acts as the "Accounting Truth" for complex, multi-party transactions, specifically optimized for the rigid General Ledger (GL) requirements of legacy DMS systems like **CDK Drive** and **Reynolds & Reynolds (ERA-IGNITE)**.

---

## 🚀 Key Capabilities

* **Multilateral Ledger Actions:** Supports complex billing where a single `LaborOperation` is split between multiple parties (Customer, Warranty, Internal, etc.).
* **Sequential Calculation Path:** Uses `sequenceId` (String) to maintain the exact order of discounts, fees, and taxes to ensure mathematical compliance with legacy accounting rules.
* **Payee Ambiguity Resolution:** Integrates a `List<PartyReference>` at the split level to explicitly define the "Bill-To" entity for every sub-amount.
* **Granular Tax Accounting:** Supports `TaxSplit` arrays to handle mixed tax jurisdictions and exempt/non-exempt status across different payees in the same transaction.
* **Lossless Precision:** Leverages the `Price` aggregate to track `totalAmount`, `costAmount`, and `taxableAmount` separately to preserve audit integrity.

---

## 🛠 Model Architecture

The entity bridges the gap between **AI Intent** (e.g., "Give this customer a loyalty discount") and **Mainframe Execution** (e.g., "Credit GL Account 4500, Debit GL Account 1200").

---

## 📈 Use Cases

### 1. The "Goodwill" Service Split

A Service Manager agrees to pay 50% of a repair to keep a customer happy.

* **Split A:** Billed to the **Customer** for 50% of the `resolvedAmount`.
* **Split B:** Billed to the **Dealership Internal Account** for 50% via a `CreditReference`.

### 2. Mixed Warranty & Maintenance

A vehicle is in for an Oil Change (Covered by OEM Maintenance) and a Brake Job (Customer Pay).

* **Split A:** Mapped to `ProductPriceItemTypes.REBATE` billed to the Manufacturer.
* **Split B:** Mapped to `ProductPriceItemTypes.RETAIL` billed to the Customer.

---

## 📝 JSON Examples

### Example: Loyalty Discount with Sequence Control

This example shows a $10.00 discount applied to a labor operation before taxes are calculated.

```json
{
  "financial_split_id": "fs-99283-01",
  "price_name": "Loyalty Discount Adjustment",
  "ledger_action_type": "CREDIT",
  "ledger_types": "SALES_DISCOUNT",
  "price_type": "DISCOUNT",
  "price": {
    "value": "10.00",
    "currency_code": "USD",
    "tax_included_indicator": false
  },
  "discount_references": [
    {
      "discount_key": "LOYALTY_10",
      "context": "LOYALTY_PROGRAM",
      "sequence_id": "001",
      "occurrence_date_time": "2026-01-24T18:00:00Z"
    }
  ],
  "parties": [
    {
      "party_reference_type": "PAYEE",
      "context": "CUSTOMER",
      "party_key": "cust-5521"
    }
  ]
}

```

### Example: Multi-Jurisdiction Tax Split

This illustrates how the model handles complex tax obligations for a single split.

```json
{
  "financial_split_key": "tax-split-ref-77",
  "price_type": "TAX",
  "tax_splits": [
    {
      "tax_code": "STATE_SALES",
      "tax_rate": "0.06",
      "jurisdiction": "GA",
      "sequence_id": "T1",
      "tax_amount": {
        "value": "5.40",
        "currency_code": "USD"
      }
    },
    {
      "tax_code": "COUNTY_EXCISE",
      "tax_rate": "0.01",
      "jurisdiction": "FULTON",
      "sequence_id": "T2",
      "tax_amount": {
        "value": "0.90",
        "currency_code": "USD"
      }
    }
  ]
}

```

---

## ⚖️ Audit & Compliance

Every `FinancialSplit` serves as an immutable memento. 

By capturing the `ControlAccountReference` and the `occurrenceDateTime`, the system provides a bulletproof trail for SOC2 audits and dealership month-end reconciliation.
