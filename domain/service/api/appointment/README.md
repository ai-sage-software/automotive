# 🚗 STAR Automotive Retail Systems API

## Appointment API

*A standardized interface for Appointment lifecycle management within
Automotive Retail operations.*

------------------------------------------------------------------------

This contains the OpenAPI specification for the **Appointment API**,
which provides an interface for managing dealership service appointments
and their associated resources such as:

**VehicleIdentifier**, **PartyReference**, **AddressReference**,
**TimeSlot**, **LaborOperationSelection**, **PaymentAuthorization**,
**Money**, **MetricValue**, and related domain entities.

The API adheres to the **OpenAPI 3.0.1** standard.

------------------------------------------------------------------------

# 📝 Overview

The Appointment API is structured around the domain **service
scheduling** with **Appointment** as the aggregate root entity.

All related resources are scoped under the Appointment aggregate via
path parameters.

  ---------------------------------------------------------------------------------------------------------------
  Resource                  Base Path                                                   Description
  ------------------------- ----------------------------------------------------------- -------------------------
  Appointment               /appointments                                               Manages Appointment
                                                                                        lifecycle

  VehicleIdentifier         /appointments/{appointmentKey}/vehicle-identifiers          Vehicle associated to
                                                                                        appointment

  PartyReference            /appointments/{appointmentKey}/party-references             Dealer, customer,
                                                                                        advisor, technician
                                                                                        relationships

  AddressReference          /appointments/{appointmentKey}/address-references           Service, pickup, billing
                                                                                        addresses

  TimeSlot                  /appointments/{appointmentKey}/time-slots                   Scheduled time windows

  LaborOperationSelection   /appointments/{appointmentKey}/labor-operation-selections   Selected service
                                                                                        operations

  Money                     /appointments/{appointmentKey}/money                        Pricing and estimated
                                                                                        totals

  MetricValue               /appointments/{appointmentKey}/metric-values                Measurements (e.g.,
                                                                                        odometer)

  PaymentAuthorization      /appointments/{appointmentKey}/payment-authorizations       Payment
                                                                                        pre-authorizations
  ---------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------

# 🛠️ Getting Started

## Understanding the Directory

  -----------------------------------------------------------------------
  File Name                          Description
  ---------------------------------- ------------------------------------
  openapi_monolith.yaml              Complete API path and schema
                                     information

  openapi_path.yaml                  API paths only

  openapi_schema.yaml                Base schemas only

  openapi_schema_enriched.yaml       Schemas including Create/Update
                                     enriched entities
  -----------------------------------------------------------------------

Enhanced entities allow Create/Update operations to include required
fields that may not exist in retrieval models.

------------------------------------------------------------------------

## Exploring the API

Example request:

GET https://\[Your-API-Host\]/appointments

------------------------------------------------------------------------

# 🔑 Key Concepts

## Appointment (Aggregate Root)

Represents a scheduled service interaction between a customer and
dealership.

Core characteristics: - Appointment type - Status - Scheduled TimeSlot -
Associated VehicleIdentifier - Associated PartyReferences - Selected
LaborOperationSelections - Pricing estimates (Money) - Payment
authorization details

------------------------------------------------------------------------

# 💠 Enums

-   AppointmentStatusTypes\
-   AppointmentTypes\
-   DaysOfWeekTypes\
-   DurationUOMTypes\
-   PartyRelationshipTypes\
-   AddressTypes\
-   PayTypes

------------------------------------------------------------------------

# 🔄 Appointment Lifecycle

SCHEDULED → CONFIRMED → CHECKED_IN → IN_PROGRESS → COMPLETED → CLOSED

Status transitions must follow business governance rules.

------------------------------------------------------------------------

# 🏛 Governance

All changes must: - Preserve backward compatibility unless versioned -
Pass schema validation - Follow STAR working group governance - Be
reviewed for domain correctness

Breaking changes require semantic version increments.

------------------------------------------------------------------------

# 🧪 CI/CD Compatibility

The API is designed for: - Contract-first development - High-reliability
environments - Automated schema validation - Asynchronous integration
workflows

------------------------------------------------------------------------

Thank you for contributing to the STAR Automotive Retail Appointment
standard.

