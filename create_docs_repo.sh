#!/bin/bash

# --- Configuration (Domain Contexts) ---
# List your Domain-Driven Design Bounded Contexts here
CONTEXTS=(
"party_and_identity_management"
"inventory_and_vehicle_management"
"sales_and_dealership_operations"
"service_repair_and_parts"
"financial_and_payments"
"marketing_and_loyalty"
"core_and_common_entities"
"telematics_and_vehicle_events"
"warranty_and_insurance"
"logistics_and_fulfillment"
"incentives_and_programs"
"human_resources"
"subscription_management"
)

# --- Core Directory Creation ---

echo "Creating the core documentation repository structure..."

# Create top-level files
touch README.md LICENSE .gitignore

# Create general documentation directories
mkdir -p docs/{arch,governance}
touch docs/arch/ADR-001-initial-architecture.md
touch docs/arch/main-system-overview.svg
touch docs/glossary.md

# Create utility directories
mkdir -p utilities/{scripts,code-snippets}
touch utilities/scripts/generate_docs.sh
touch utilities/code-snippets/VINValidator.py

# Create diagram directories
mkdir -p diagrams/{src,output}
touch diagrams/src/SystemContext.puml
touch diagrams/output/SystemContext.svg

# --- Domain Contexts Creation (DDD) ---

echo "Creating Bounded Context directories under /domain..."

for CONTEXT in "${CONTEXTS[@]}"; do
CONTEXT_PATH="domain/$CONTEXT"

    # Create the main context directory
    mkdir -p "$CONTEXT_PATH"

    # Create the standard subdirectories
    mkdir -p "$CONTEXT_PATH"/{model,specs,examples}

    # Create context-specific README and placeholder files
    touch "$CONTEXT_PATH/README.md"
    touch "$CONTEXT_PATH/model/$CONTEXT.puml"  # Placeholder PlantUML model
    touch "$CONTEXT_PATH/specs/initial_requirements.md"
    touch "$CONTEXT_PATH/examples/sample_scenario.json"
done

echo "Structure generation complete!"
echo "To view the result, run: find . -print | sed -e 's;[^/]*/;|____;g;s;____|; |;'"
