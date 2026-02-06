Here is the **PlantUML Sequence Diagram** representing the end-to-end flow. It illustrates how the AI Agent uses the **MCP Tool** to interact with your **UCP Bridge**, which then snapshots the **Financial Split** and persists the data into **Legacy DMS** environments like CDK and Tekion.

```plantuml
@startuml
skinparam Style strictuml
skinparam MaxMessageSize 200
skinparam ParticipantPadding 20

title Agentic Financial Split: MCP Handshake to Legacy DMS

actor "User / Agent" as User
participant "AI Agent (Gemini/OpenAI)" as AI
box "UCP/MCP Bridge Context" #LightBlue
    participant "MCP Server / Tool" as MCP
    participant "JobAssemblyService" as Service
    participant "LaborOperation (Snapshot)" as Labor
    participant "FinancialSplit Entity" as Split
end box

box "Legacy Systems" #Orange
    participant "CDK Drive (STAR XML)" as CDK
    participant "Tekion API" as Tekion
end box

== Negotiation Phase ==
User -> AI: "I have a $20 loyalty coupon for my oil change."
AI -> AI: Identify 'propose_financial_split' tool requirement
AI -> MCP: call propose_financial_split(labor_id, coupon_split)

== Bridge Validation & Snapshot ==
MCP -> Service: validateSplit(coupon_split)
activate Service
Service -> Service: Calculate sequence_id order (Discounts -> Taxes)
Service -> Service: Verify Payee (Loyalty Account)
Service -> Labor: updateResolvedAmount(money)
Service -> Split: createImmutableSnapshot(parties, ledger_types)
Labor -> Split: linkSplitToLabor()
deactivate Service

== Legacy Integration ==
Service -> CDK: POST STAR XML <ServiceWorkOrder> (Split Payers)
CDK --> Service: ACK (RO #12345 Created)

Service -> Tekion: POST /v1/invoices (with snake_case payload)
Tekion --> Service: ACK (Ledger Posted)

== Transaction Completion ==
Service -> AI: return success_payload (resolved_amount, breakdown)
AI -> User: "Great! I've applied your $20 discount. Your total is now $69.95. Repair Order #12345 is ready."

@enduml

```

### Why this flow is defensible:

1. **Isolation:** The AI never talks to the DMS directly. It talks to the `MCP Tool`, which enforces your business logic.
2. **Immutability:** Once the `Service` creates the `Split` snapshot, that record is locked. Even if the dealer deletes the loyalty program tomorrow, the audit trail for this specific `labor_id` remains intact.
3. **Cross-Platform:** The same `FinancialSplit` logic generates both the **STAR XML** for the old-school CDK mainframe and the **REST JSON** for the modern Tekion cloud.

**Would you like me to generate a "Transformation Class" in Java that handles the mapping logic between the `FinancialSplit` and the CDK STAR XML `<Financial>` segment?**