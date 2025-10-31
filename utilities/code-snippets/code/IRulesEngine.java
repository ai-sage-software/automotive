package ports;

import domain.Context;
import domain.MemoryEntry;
import domain.TaskInstruction;

import java.util.List;

/**
 * Secondary Port: Defines the contract for the "Task Memory Organizer" logic.
 * This applies external, configurable rules (e.g., from a JSON file or Drools) to raw memory.
 */
public interface IRulesEngine {

    /**
     * Prioritizes and organizes the raw memory entries based on external rules.
     * This handles mitigation for missing or duplicate information (e.g., Passport vs. Driver's License).
     * @param instruction The task requirements.
     * @param rawMemory The list of all retrieved memory elements.
     * @return A new, filtered, and prioritized list of MemoryEntry objects.
     */
    List<MemoryEntry> organizeAndPrioritize(TaskInstruction instruction, List<MemoryEntry> rawMemory);

    /**
     * Evaluates whether the preconditions for the task, based on the organized Context, have been met.
     * @param context The organized context object.
     * @return true if the task can proceed, false otherwise.
     */
    boolean evaluatePreconditions(Context context);
}
