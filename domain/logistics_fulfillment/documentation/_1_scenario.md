# STAR–RunBuggy Domain Validation
## Scenario 1: A Dealership Requests Transportation for Three Vehicles

**Aggregate Root:** `VehicleTransferOrder`  
**Business Capability:** Vehicle Transportation Request  
**Transfer Reason:** `DEALER_TRADE`  
**Initial Status:** `REQUESTED`

### 1. Business scenario

A dealership in Alpharetta, Georgia, needs three vehicles transported from another dealership in Charlotte, North Carolina.

The requesting dealership wants all three vehicles transported to its location within a specified delivery window.

For this initial scenario, we assume:

| Attribute | Value |
|---|---|
| Requesting dealership | North Atlanta Motors |
| Source dealership | Charlotte Auto Group |
| Destination dealership | North Atlanta Motors |
| Number of vehicles | 3 |
| Transfer reason | `DEALER_TRADE` |
| Transportation method | `GROUND` |
| Service level | `GROUND` |
| Requested pickup | November 2, 2026 |
| Requested delivery | November 4, 2026 |
| Transfer status | `REQUESTED` |
| Carrier assigned | No |
| Transportation price accepted | No |

The business objective is straightforward:

**The dealership submits one transportation request covering three vehicles, and RunBuggy must be able to process that request using the STAR domain model.**

At this stage, we are not assigning a driver, selecting a carrier, or creating a transportation session.

Those are subsequent business activities.

---

## 2. JSON example using the existing STAR model

I reviewed the uploaded `vehicle_transfer_order_clazz.puml`.

The existing `VehicleTransferOrder` aggregate already provides the principal structures needed for this request:

- `vehicleReferences`
- `requestingParty`
- `sourceParty`
- `destinationParty`
- `sourceAddress`
- `destinationAddress`
- `requestedTransferPeriod`
- `transferReasonType`
- `transportMethodTypes`
- `serviceLevelType`
- `transferStatusType`
- `specialHandlingInstructions`
- `businessContext`

The following example uses properties declared in your PlantUML model, converted to snake_case.

```json
{
  "vehicle_transfer_order_key": "VTO-2026-000145",
  "vehicle_transfer_order_id": "VTO-000145",
  "transfer_order_number": "TRF-2026-145",

  "transfer_status_type": "REQUESTED",
  "transfer_reason_type": "DEALER_TRADE",

  "transport_method_types": [
    "GROUND"
  ],
  "service_level_type": "GROUND",

  "requesting_party": {
    "party_reference_key": "DEALER-ATL-001",
    "party_name": "North Atlanta Motors"
  },

  "source_party": {
    "party_reference_key": "DEALER-CLT-001",
    "party_name": "Charlotte Auto Group"
  },

  "destination_party": {
    "party_reference_key": "DEALER-ATL-001",
    "party_name": "North Atlanta Motors"
  },

  "source_address": {
    "address_reference_key": "ADDR-CLT-001",
    "address_line1": "1000 Auto Center Drive",
    "city": "Charlotte",
    "state_province": "NC",
    "postal_code": "28202",
    "country_code": "US"
  },

  "destination_address": {
    "address_reference_key": "ADDR-ATL-001",
    "address_line1": "2000 North Point Parkway",
    "city": "Alpharetta",
    "state_province": "GA",
    "postal_code": "30022",
    "country_code": "US"
  },

  "vehicle_references": [
    {
      "vehicle_reference_key": "VEH-001",
      "vin": "1HGCM82633A004352",
      "model_year": "2025",
      "make": "Honda",
      "model": "Accord",
      "stock_number": "STK-10001"
    },
    {
      "vehicle_reference_key": "VEH-002",
      "vin": "1FTRX18W1XNB12345",
      "model_year": "2025",
      "make": "Ford",
      "model": "F-150",
      "stock_number": "STK-10002"
    },
    {
      "vehicle_reference_key": "VEH-003",
      "vin": "5YJSA1E26HF000316",
      "model_year": "2024",
      "make": "Tesla",
      "model": "Model S",
      "stock_number": "STK-10003"
    }
  ],

  "requested_transfer_period": {
    "start_date_time": "2026-11-02T08:00:00-05:00",
    "complete_date_time": "2026-11-04T17:00:00-05:00"
  },

  "special_handling_instructions": [
    {
      "narrative_desc": "Transport all three vehicles together if possible."
    },
    {
      "narrative_desc": "Contact the destination dealership before delivery."
    }
  ],

  "business_context": {
    "intent_code": "REQUEST_VEHICLE_TRANSFER",
    "business_action_code": "CREATE_TRANSFER_ORDER",
    "correlation_id": "CORR-2026-000145"
  },

  "source_system_code": "DEALER_DMS",
  "occurrence_date_time": "2026-10-29T10:00:00-04:00",

  "quote_indicator": false
}
```

**Model conformance:** The example uses existing model properties and declared enum values. The addresses, dealership names, and vehicle identifiers are illustrative. The payload is valid JSON, but it has not been validated against an executable STAR JSON Schema.

One semantic detail requires confirmation: `requested_transfer_period` provides one interval, but the model does not explicitly say whether that interval represents pickup availability, delivery expectations, or the entire transfer window.

---

## 3. Gap analysis: What is missing?

The current model can represent the basic transportation request. However, there are several questions that we should resolve with RunBuggy before declaring the model complete.

### Gap 1: Pickup and delivery windows are not independently represented

**Priority: High**

Currently, the model provides:

```json
{
  "requested_transfer_period": {
    "start_date_time": "2026-11-02T08:00:00-05:00",
    "complete_date_time": "2026-11-04T17:00:00-05:00"
  }
}
```

But what happens when the dealership specifies:

- Pickup: November 2, between 8 AM and noon.
- Delivery: November 4, between 9 AM and 5 PM.

These are two distinct scheduling requirements.

**Recommendation:** Consider introducing two properties:

```java
EffectivePeriod requestedPickupPeriod;
EffectivePeriod requestedDeliveryPeriod;
```

Represented as:

```json
{
  "requested_pickup_period": {
    "start_date_time": "2026-11-02T08:00:00-05:00",
    "complete_date_time": "2026-11-02T12:00:00-05:00"
  },
  "requested_delivery_period": {
    "start_date_time": "2026-11-04T09:00:00-05:00",
    "complete_date_time": "2026-11-04T17:00:00-05:00"
  }
}
```

These would be **proposed additions**, not existing properties.

### Gap 2: Different vehicles may have different transportation requirements

**Priority: High**

The existing model supports multiple vehicles:

```java
List<VehicleReference> vehicleReferences;
```

However, transportation requirements can differ by vehicle.

For example:

| Vehicle | Transportation requirement |
|---|---|
| Honda Accord | Standard transportation |
| Ford F-150 | Oversized vehicle considerations |
| Tesla Model S | Enclosed transportation requested |

Currently, `transportMethodTypes` and `serviceLevelType` apply at the transfer-order level.

The model does not explicitly associate individual transportation requirements with each vehicle.

**Recommendation:** Consider introducing a `VehicleTransferItem` entity.

```java
class VehicleTransferItem {
    String transferItemKey;
    VehicleReference vehicleReference;
    List<TransportMethodTypes> transportMethodTypes;
    ServiceLevelTypes serviceLevelType;
    List<Narrative> specialHandlingInstructions;
}
```

This is an architectural proposal, not an existing STAR class.

It would allow a single transfer order to contain multiple vehicles with different handling requirements.

Before introducing this entity, we should confirm whether RunBuggy considers such differences part of the transfer request or part of subsequent transportation planning.

### Gap 3: Transportation preference versus requirement

**Priority: Medium**

The model currently supports:

```json
{
  "transport_method_types": ["GROUND"],
  "service_level_type": "GROUND"
}
```

But does `GROUND` represent a mandatory requirement or a preference?

Consider a dealership requesting enclosed transportation.

If enclosed transportation is unavailable, can RunBuggy offer open transportation instead?

The existing `TransportMethodTypes` enum includes `AIR`, `COURIER`, `FREIGHT`, `GROUND`, and `ROUTE_TRUCK`, but it does not distinguish open and enclosed vehicle transportation.

**Recommendation:** Evaluate a dedicated vehicle transportation equipment or configuration classification.

Potential values could include:

- `OPEN`
- `ENCLOSED`
- `FLATBED`
- `TOW_TRUCK`

These are proposed values requiring business validation.

### Gap 4: Pickup and delivery contact information

**Priority: Medium**

The model already contains `sourceParty` and `destinationParty`.

Furthermore, `PartyReference` supports `communicationChannels`.

Therefore, **this is not necessarily a missing capability**.

However, we should determine whether the dealership contact and the person physically releasing the vehicle are always the same.

For example:

- Source dealership: Charlotte Auto Group
- Pickup contact: John Smith, lot manager
- Destination dealership: North Atlanta Motors
- Receiving contact: Mary Jones, inventory manager

If these individuals differ from the source and destination parties, we should evaluate whether explicit pickup and delivery contact roles are needed.

I would avoid adding redundant fields until RunBuggy confirms the business requirement.

### Gap 5: Transportation grouping

**Priority: Medium**

The dealership requests three vehicles.

But does it require all three to travel together?

There are several possibilities:

1. All three vehicles must use the same carrier.
2. The vehicles may use different carriers.
3. Two vehicles may travel together while the third travels separately.
4. All vehicles must arrive together, regardless of carrier.

Your existing model can represent multiple vehicles within one transfer order.

However, it does not explicitly distinguish **mandatory grouping from preferred grouping**.

The existing `specialHandlingInstructions` can express the requirement narratively, but a machine-readable constraint may be preferable.

This becomes especially important if RunBuggy uses automated carrier matching.

---

## 4. Gap summary

| ID | Potential gap | Existing support | Recommendation | Priority |
|---|---|---|---|---|
| G01 | Independent pickup window | `requestedTransferPeriod` | Add pickup period | High |
| G02 | Independent delivery window | `requestedTransferPeriod` | Add delivery period | High |
| G03 | Vehicle-specific handling | `vehicleReferences`, narratives | Evaluate transfer item entity | High |
| G04 | Open versus enclosed transport | `transportMethodTypes` | Extend transport classification | Medium |
| G05 | Pickup contact | `sourceParty` | Clarify contact roles | Medium |
| G06 | Delivery contact | `destinationParty` | Clarify contact roles | Medium |
| G07 | Mandatory vehicle grouping | Order-level vehicle list | Add structured grouping requirement if needed | Medium |
| G08 | Quote requirements | `quoteIndicator`, `availableFares` | Clarify quote workflow semantics | Medium |
| G09 | Partial order fulfillment | Order-level status | Define per-vehicle fulfillment semantics | High |

The final two gaps are particularly important.

**Quote requirements:** The model contains `quoteIndicator`, `availableFares`, and `quoteExpirationDateTime`, but we need to establish whether creating a transfer order can occur before pricing and whether quote acceptance is a prerequisite for approval.

**Partial fulfillment:** If two vehicles are delivered and the third is delayed, the single `transferStatusType` cannot independently express the status of each vehicle. That may be handled by associated transport sessions or shipment records, but the ownership and completion rules must be defined.

---

## 5. Recommended changes to VehicleTransferOrder

I would not immediately add all nine capabilities.

For the first iteration, I would recommend just two additional scheduling properties:

```java
class VehicleTransferOrder {
    // Existing properties remain unchanged

    EffectivePeriod requestedPickupPeriod;
    EffectivePeriod requestedDeliveryPeriod;
}
```

I would defer the proposed `VehicleTransferItem` entity until we evaluate RunBuggy's handling of multiple vehicles.

This avoids introducing unnecessary complexity into the STAR model.

## 6. Questions for RunBuggy

Before proceeding to Scenario 2, I would validate three important business rules with RunBuggy:

**Question 1 — Multiple vehicles**

When a dealership requests transportation for three vehicles, does RunBuggy treat this as one transportation order containing three vehicles, or does it create three separate transportation orders?

**Question 2 — Pickup and delivery scheduling**

Can the dealership independently specify pickup and delivery windows, or does RunBuggy calculate delivery expectations based on the pickup date?

**Question 3 — Vehicle grouping**

Can the dealership require all three vehicles to travel together, or does RunBuggy independently optimize carrier assignments?

These answers will determine whether we need additional properties, a new `VehicleTransferItem` entity, or simply clearer business rules.

### My architectural assessment

**The existing `VehicleTransferOrder` model is sufficient to express the basic request for transportation of three vehicles.**

The most significant potential gap is not the absence of transportation information. It is the lack of explicit **per-vehicle requirements and fulfillment semantics**.

That distinction will become critical when we progress to carrier selection, dispatching, pickup, transportation, and delivery.

**Next scenario:** RunBuggy evaluates transportation options and pricing for the three vehicles. This will allow us to examine whether `FareOptionCriteria`, `Fare`, and `VehicleTransferOrder` provide everything necessary for transportation quoting and carrier selection.