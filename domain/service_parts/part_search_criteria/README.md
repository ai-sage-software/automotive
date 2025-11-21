---

## 🔍 Core Search Criteria Class

### `PartSearchCriteria`

This is the central class that aggregates various criteria used to define a complex part search.

| Field | Type | Description |
| :--- | :--- | :--- |
| `partSearchCriteriaId` | String | A unique identifier for this set of search criteria. |
| `partSearchCriteriaKey` | String | A key used for referencing the search criteria. |
| `partIdentifiers` | List<`PartIdentifier`> | A list of specific part identification details to search by. |
| `partNames` | List<`PartName`> | A list of part names to include in the search. |
| `partConditionType` | `PartConditionTypes` | The desired condition type of the part (e.g., NEW, USED). |
| `partConditionGradeType` | `PartConditionGradeTypes` | The desired condition grade (e.g., EXCELLENT, FAIR). |
| `partPriceCriteria` | `PartPriceCriteria` | Pricing and warranty constraints for the search. |
| `partSpecificationCriterias` | List<`PartSpecification`> | Detailed specifications like dimensions, quantities, and packaging. |
| `partLogisticsCriteria` | `PartLogisticsCriteria` | Constraints related to warehouse, shipping, and availability. |
| `partLifecycles` | List<`PartLifecycle`> | Lifecycle status information (e.g., supersession data). |
| `partStatusTypes` | List<`PartStatusTypes`> | Specific statuses the parts must have within a process (e.g., PICK, SHIP). |
| `partInventoryActionTypes` | List<`PartInventoryOrderTypes`> | Inventory actions related to the part's availability (e.g., BACK_ORDERED, RECEIVING). |
| `partMasterActionTypes` | List<`ProductStageTypes`> | The product lifecycle stage (e.g., ACTIVE, OBSOLETE). |
| `advancedSearch` | `AdvancedSearchCriteria` | Criteria for advanced search techniques like fuzzy search and AI-inferred keywords. |

---

## 🏷️ Part Identification and Naming Classes

### `PartIdentifier`

Defines various ways a part can be identified, such as by manufacturer part number or SKU.

| Field | Type | Description |
| :--- | :--- | :--- |
| `partIdentifierKey` | String | A key for the identifier. |
| `partIdentifierId` | String | Unique ID for the identifier. |
| `partIdentifierType` | `PartIdentifierTypes` | The type of identifier (e.g., MPN, SKU, VIN). |
| `partIdentifierValue` | String | The actual value of the identifier. |
| `description` | String | A description of the identifier. |
| `identifiers` | List<`Identifier`> | A list of generic identifiers associated with this part identifier. |
| `partNames` | List<`PartName`> | A list of names associated with this part identifier. |

### `PartName`

Details the name or description of a part.

| Field | Type | Description |
| :--- | :--- | :--- |
| `partNameId` | String | Unique ID for the part name. |
| `partNameKey` | String | A key for the part name. |
| `description` | String | The descriptive name of the part. |
| `partNameType` | `PartNameTypes` | The context/type of the name (e.g., OEM, AFTERMARKET, MARKETING). |

### `Identifier`

A generic class for various identification or contextual values.

| Field | Type | Description |
| :--- | :--- | :--- |
| `identifierId` | String | Unique ID. |
| `identifierKey` | String | Key for the identifier. |
| `context` | String | The context in which the identifier is used. |
| `value` | String | The identifier value. |
| `detail` | String | Further detail about the identifier. |
| `identifierType` | String | The specific type of identifier (less constrained than `PartIdentifierTypes`). |

---

## 📐 Part Specification and Measurement Classes

### `PartSpecification`

Outlines the physical and ordering specifications for a part.

| Field | Type | Description |
| :--- | :--- | :--- |
| `partSpecificationId` | String | Unique ID for the specification. |
| `partSpecificationKey` | String | Key for the specification. |
| `partNameType` | `PartNameTypes` | The name type associated with this specification. |
| `partConditionTypes` | List<`PartConditionTypes`> | Acceptable condition types. |
| `partConditionGradeTypes` | List<`PartConditionGradeTypes`> | Acceptable condition grades. |
| `unitOfMeasures` | List<`UnitOfMeasure`> | Dimensions and measurement units. |
| `identifiers` | List<`Identifier`> | Generic identifiers for the specification. |
| `minimumOrderQuantity` | Integer | The smallest quantity that can be ordered. |
| `fixedOrderQuantity` | Integer | A mandated order quantity. |
| `packageQuantity` | Integer | Quantity per package. |
| `itemQuantity` | Integer | Quantity per item. |
| `productPackageType` | `ProductPackageTypes` | Type of packaging (e.g., BUNDLE, KIT, PALLET). |

### `UnitOfMeasure`

Details a specific unit of measure and its value.

| Field | Type | Description |
| :--- | :--- | :--- |
| `unitOfMeasureKey` | String | Key for the UOM. |
| `unitOfMeasure` | EnumBase | The UOM itself (assuming `EnumBase` is the type for the UOM value). |
| `uomValue` | String | The numeric value of the measurement. |
| `quantity` | String | The associated quantity. |
| `uomQuantityCategoryType` | `UOMQuantityCategoryTypes` | The category of quantity being measured (e.g., WEIGHT, VOLUME). |

---

## 💰 Pricing and Warranty Criteria

### `PartPriceCriteria`

Defines constraints on price and warranty for the search.

| Field | Type | Description |
| :--- | :--- | :--- |
| `partPriceCriteriaId` | String | Unique ID. |
| `partPriceCriteriaKey` | String | Key for the criteria. |
| `minPrice` | String | Minimum acceptable price. |
| `maxPrice` | String | Maximum acceptable price. |
| `currency` | String | The currency for the price range. |
| `coreChargeApplicable` | Boolean | Indicates if a core charge is relevant. |
| `warrantyTypes` | List<`WarrantyTypes`> | Acceptable warranty types (e.g., MANUFACTURER, EXTENDED). |
| `priceTypes` | List<`PriceTypes`> | Types of prices to consider (e.g., LIST, RETAIL, WHOLESALE). |

---

## 📦 Logistics and Availability Criteria

### `PartLogisticsCriteria`

Constraints related to the physical location and delivery of the part.

| Field | Type | Description |
| :--- | :--- | :--- |
| `partLogisticsCriteriaId` | String | Unique ID. |
| `partLogisticsCriteriaKey` | String | Key for the criteria. |
| `warehouseTypes` | List<`WarehouseTypes`> | Acceptable types of warehouses (e.g., DEALERSHIP, REGIONAL_DISTRIBUTION_CENTER). |
| `originLatitude` | Double | Latitude of the origin for logistics calculation. |
| `originLongitude` | Double | Longitude of the origin for logistics calculation. |
| `estimatedAvailabilityDateRange` | `EffectivePeriod` | The timeframe for estimated availability. |
| `shippingMethodType` | List<`ShippingMethodTypes`> | Acceptable shipping methods (e.g., EXPRESS, GROUND). |
| `requiresPickup` | Boolean | Flag indicating if the part must be picked up. |
| `warehouses` | List<`Identifier`> | Specific warehouse identifiers. |

### `EffectivePeriod`

Defines a time window or recurrence pattern for availability.

| Field | Type | Description |
| :--- | :--- | :--- |
| `effectivePeriodKey` | String | Key for the period. |
| `activeIndicator` | Boolean | Is the period currently active? |
| `exclusiveIndicator` | Boolean | Is this period exclusive? |
| `startDateTime` | Date | The start date and time. |
| `completeDateTime` | Date | The end date and time. |
| `durationUomType` | `DurationUOMTypes` | The unit of measure for duration (e.g., DAYS, MONTHS). |
| `durationValue` | String | The value of the duration. |
| `recurUomType` | `DurationUOMTypes` | Unit of measure for recurrence. |
| `recurCount` | String | Number of recurrences. |
| `recurCriteria` | String | Specific recurrence criteria. |
| `recurIndicator` | Boolean | Flag for recurrence. |
| `timeslot` | TimeSlot | A specific time slot definition (assuming `TimeSlot` is a defined type). |

---

## ♻️ Part Lifecycle and Supersession

### `PartLifecycle`

Details the lifecycle status and history of a part, including supersession.

| Field | Type | Description |
| :--- | :--- | :--- |
| `partLifecycleId` | String | Unique ID. |
| `partLifecycleKey` | String | Key for the lifecycle. |
| `isSuperseded` | Boolean | Is the part superseded by a newer part? |
| `reason` | String | The reason for the current status. |
| `partStatusTypes` | List<`PartStatusTypes`> | Current status in a process (e.g., SUPERSEDE, SUPERSEDED). |
| `superSessions` | List<`SuperSession`> | Details about the superseding or superseded parts. |

### `SuperSession`

Provides detailed information about the replacement of one part by another.

| Field | Type | Description |
| :--- | :--- | :--- |
| `superSessionId` | String | Unique ID. |
| `superSessionKey` | String | Key for the supersession record. |
| `prevPartNames` | List<`PartName`> | Names of the previous (superseded) part(s). |
| `newPartNames` | List<`PartName`> | Names of the new (superseding) part(s). |
| `partOrderConfigType` | `PartOrderConfigTypes` | How ordering changes (e.g., SINGLE, MULTIPLE_SPLIT). |
| `quantity` | String | Quantity adjustment in the supersession. |
| `productConsumptionType` | `ProductConsumptionTypes` | Strategy for using up the old part (e.g., USE_UP_STRATEGY). |
| `warehouses` | List<`Identifier`> | Warehouses involved in the transition. |
| `productStageType` | `ProductStageTypes` | The stage of the product involved in supersession (e.g., FINAL_SUPERSESSION). |
| `partyIdentifiers` | List<`PartyIdentifier`> | Identifiers for the parties involved (assuming `PartyIdentifier` is a defined type). |
| `partStatusTypes` | List<`PartStatusTypes`> | Statuses related to the supersession process. |

---

## 💡 Advanced Search Capabilities

### `AdvancedSearchCriteria`

Holds criteria for non-standard, flexible search methods.

| Field | Type | Description |
| :--- | :--- | :--- |
| `advancedSearchCriteriaId` | String | Unique ID. |
| `advancedSearchCriteriaKey` | String | Key for the criteria. |
| `customTags` | List<`Identifier`> | Custom tags for search. |
| `fuzzySearchEnabled` | Boolean | Whether fuzzy search is active. |
| `partMasterStatusTypes` | List<`ProductStageTypes`> | Product stages relevant to advanced search. |
| `includeAssemblyComponents` | Boolean | Should the search include components of an assembly? |
| `imageSearchConfidenceThreshold` | String | Confidence level required for image search results. |
| `advancedSearchValues` | List<`AdvanceSearchValue`> | The actual search values used in the advanced query. |

### `AdvanceSearchValue`

A specific value used in an advanced search, with its type.

| Field | Type | Description |
| :--- | :--- | :--- |
| `advanceSearchValueKey` | String | Key for the value. |
| `searchType` | `AdvanceSearchTypes` | The method of the search value (e.g., FREE_TEXT_SEARCH, OCR_TEXT, AI_INFERRED_KEYWORDS). |
| `value` | String | The actual search string or value. |

---

## 🗂️ Enumeration Classes (Enums)

* **`AdvanceSearchTypes`**: Methods for advanced searching (e.g., AI\_INFERRED\_KEYWORDS, OCR\_TEXT).
* **`DurationUOMTypes`**: Units of measure for time durations (e.g., DAYS, MONTHS, YEARS).
* **`PartConditionGradeTypes`**: Quality grades for a part (e.g., EXCELLENT, FAIR, DAMAGED).
* **`PartConditionTypes`**: General condition categories (e.g., NEW, USED, REMANUFACTURED).
* **`PartIdentifierTypes`**: Standardized part identifier categories (e.g., MPN, SKU, VIN).
* **`PartInventoryOrderTypes`**: Actions or statuses related to inventory and orders (e.g., BACK\_ORDERED, SHIPPED).
* **`PartNameTypes`**: Context of a part name (e.g., OEM, AFTERMARKET, MARKETING).
* **`PartOrderConfigTypes`**: Configuration for how parts are ordered (e.g., SINGLE, VARIABLE\_SPLIT).
* **`PartStatusTypes`**: Process statuses for a part (e.g., PICK, SHIP, RECEIVE).
* **`PriceTypes`**: Categories of pricing (e.g., LIST, RETAIL, PROMOTIONAL).
* **`ProductConsumptionTypes`**: Strategies for part consumption (e.g., USE\_UP\_STRATEGY).
* **`ProductPackageTypes`**: Types of packaging (e.g., BUNDLE, KIT, PALLET).
* **`ProductStageTypes`**: Lifecycle stages of a product (e.g., ACTIVE, OBSOLETE, PRE\_PRODUCTION).
* **`ShippingMethodTypes`**: Available shipping methods (e.g., EXPRESS, GROUND, OVERNIGHT).
* **`UOMQuantityCategoryTypes`**: Categories for measurement quantities (e.g., WEIGHT, VOLUME, DIMENSIONS).
* **`WarehouseTypes`**: Types of storage facilities (e.g., DEALERSHIP, NATIONAL\_DISTRIBUTION\_CENTER).
* **`WarrantyTypes`**: Types of warranties offered (e.g., MANUFACTURER, LIFETIME, EXTENDED).

---