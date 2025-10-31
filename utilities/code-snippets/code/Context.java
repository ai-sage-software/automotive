package domain;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The final, organized, and prioritized state of memory for the current task.
 * This represents the agent's Working Memory for this task execution.
 */
public class Context {
    private final TaskInstruction instruction;
    // Stores the prioritized memory entries ready for consumption by the task
    private final List<MemoryEntry> prioritizedContext;
    // Map to quickly check for missing required fields during the organization phase
    private final Map<String, Boolean> requirementsStatus = new ConcurrentHashMap<>();

    public Context(TaskInstruction instruction, List<MemoryEntry> prioritizedContext) {
        this.instruction = instruction;
        this.prioritizedContext = prioritizedContext;

        // Initialize status based on instruction requirements
        instruction.getRequirements().forEach(req ->
                requirementsStatus.put(req.getLogicalName(), false)
        );
    }

    /**
     * Checks if all mandatory requirements specified in the TaskInstruction were satisfied.
     * @return true if all required fields are present, false otherwise.
     */
    public boolean isPreconditionMet() {
        return instruction.getRequirements().stream()
                .filter(MemoryRequirement::isRequired)
                .allMatch(req -> requirementsStatus.getOrDefault(req.getLogicalName(), false));
    }

    // Setters and Getters to manage the status during the build process
    public void markRequirementSatisfied(String logicalName) {
        requirementsStatus.put(logicalName, true);
    }

    public List<MemoryEntry> getPrioritizedContext() { return prioritizedContext; }
    public TaskInstruction getInstruction() { return instruction; }
    // Other methods to access specific memory elements could be added here
}


