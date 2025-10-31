// File: src/main/java/core/AgentContextManager.java
package core;

import domain.Context;
import domain.MemoryEntry;
import domain.TaskInstruction;
import domain.MemoryRequirement;
import ports.IMemoryAdapter;
import ports.IRulesEngine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * The central Application Service (Orchestrator).
 * Manages the entire lifecycle: Requirement -> Builder -> Organizer -> Loader -> Post-Instructions.
 */
public class AgentContextManager {

    // Dependency Injection (Hexagonal Adapters)
    private final Map<String, IMemoryAdapter> memoryAdapters;
    private final IRulesEngine rulesEngine;

    public AgentContextManager(Map<String, IMemoryAdapter> memoryAdapters, IRulesEngine rulesEngine) {
        this.memoryAdapters = memoryAdapters;
        this.rulesEngine = rulesEngine;

        // Start the background memory maintenance thread
        new Thread(new MemoryOrganizerThread(memoryAdapters)).start();
    }

    /**
     * Main method: Task Memory Requirement, Builder, and Organizer.
     * @param instruction The task's memory requirements.
     * @return The final, prioritized Context ready for task execution.
     */
    public Context buildTaskContext(TaskInstruction instruction) throws Exception {
        System.out.println("Phase 1: Task Memory Requirement & Builder started for: " + instruction.getTaskName());

        // --- Task Memory Builder ---
        List<MemoryEntry> rawMemory = new ArrayList<>();

        // Collect memory in parallel (or sequentially, simplified here)
        for (MemoryRequirement req : instruction.getRequirements()) {
            IMemoryAdapter adapter = memoryAdapters.get(req.getMemoryType());
            if (adapter == null) {
                System.err.println("ERROR: No adapter found for type: " + req.getMemoryType());
                continue;
            }

            // Retrieve memory elements
            List<MemoryEntry> entries = adapter.retrieveMemory(instruction, req.getRetrievalQuery());
            rawMemory.addAll(entries);
        }

        // --- Task Memory Organizer ---
        System.out.println("Phase 2: Task Memory Organizer started. Raw entries: " + rawMemory.size());

        // Use the Rules Engine to prioritize, filter, and resolve conflicts (Passport vs. DL)
        List<MemoryEntry> prioritizedEntries = rulesEngine.organizeAndPrioritize(instruction, rawMemory);

        // --- Task Memory Loader (Precondition Check) ---
        Context context = new Context(instruction, prioritizedEntries);

        // Simplified check: mark requirements satisfied if they appear in the prioritized list
        prioritizedEntries.forEach(entry -> {
            // In a real system, this mapping is more complex
            if (entry.getId().equals("ChildAges") || entry.getId().equals("PolicyInfo")) {
                context.markRequirementSatisfied(entry.getId());
            }
        });

        if (!rulesEngine.evaluatePreconditions(context)) {
            // Task Memory Organizer Rule: If X is missing, cannot move forward.
            throw new Exception("Preconditions not met for task: " + instruction.getTaskName());
        }

        System.out.println("Phase 3: Preconditions met. Context ready for Task Execution.");
        return context;
    }

    /**
     * Handles the cleanup and storage after a task is completed.
     * This covers the "Task Memory Post-Instructions" phase.
     */
    public void postTaskCleanup(TaskInstruction instruction, boolean taskSuccessful, String outcomeSummary) {
        if (instruction.requiresCleanup()) {
            System.out.println("Phase 4: Post-Task Cleanup and Storage started for: " + instruction.getTaskName());

            // 1. Log the performance/outcome of the task
            String logContent = String.format("Task completed: %s. Successful: %b. Summary: %s",
                    instruction.getTaskName(), taskSuccessful, outcomeSummary);

            MemoryEntry logEntry = new MemoryEntry(
                    "TaskLog-" + UUID.randomUUID().toString(),
                    "EPISODIC",
                    logContent,
                    1.0, // High priority for logs
                    LocalDateTime.now()
            );

            // Store the log in the primary episodic memory adapter
            IMemoryAdapter episodicAdapter = memoryAdapters.get("EPISODIC");
            if (episodicAdapter != null) {
                episodicAdapter.storeMemory(logEntry);
                System.out.println("Task log stored in Episodic Memory.");
            }

            // 2. Store other relevant updated data based on postTaskTags
            for (String tag : instruction.getPostTaskTags()) {
                // Example: Retrieve updated profile data and store it
                // In a real system, the task would return this data.
                if (tag.equals("PROFILE_UPDATE")) {
                    MemoryEntry profileUpdate = new MemoryEntry(
                            "UserProfile-Update", "WORKING", "{'field': 'insurance', 'status': 'updated'}", 0.8, LocalDateTime.now());

                    IMemoryAdapter workingAdapter = memoryAdapters.get("WORKING");
                    if (workingAdapter != null) {
                        workingAdapter.storeMemory(profileUpdate);
                        System.out.println("Working memory updated with profile changes.");
                    }
                }
            }

            System.out.println("Phase 4 completed. Control handed back to orchestration agent.");
        }
    }
}

/**
 * Component for the "Memory Organizer" (separate thread).
 * Runs background memory maintenance tasks.
 */
class MemoryOrganizerThread implements Runnable {
    private final Map<String, IMemoryAdapter> memoryAdapters;

    public MemoryOrganizerThread(Map<String, IMemoryAdapter> memoryAdapters) {
        this.memoryAdapters = memoryAdapters;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("\n[BACKGROUND] Memory Organizer: Starting scheduled data migration/cleanup...");

                IMemoryAdapter working = memoryAdapters.get("WORKING");
                IMemoryAdapter episodic = memoryAdapters.get("EPISODIC");

                if (working != null && episodic != null) {
                    // Example: Retrieve all low-priority working memory items
                    List<MemoryEntry> lowPriorityWorkingItems = working.retrieveMemory(null, "PRIORITY < 0.2");

                    if (!lowPriorityWorkingItems.isEmpty()) {
                        System.out.printf("[BACKGROUND] Moving %d items from WORKING to EPISODIC (long-term storage).%n", lowPriorityWorkingItems.size());

                        // Move logic: store in long-term, then delete from short-term
                        lowPriorityWorkingItems.forEach(item -> {
                            episodic.storeMemory(item);
                            // A specific method to delete from working memory would be needed here
                            // working.deleteMemory(item.getId());
                        });
                    } else {
                        System.out.println("[BACKGROUND] No low-priority items to move.");
                    }
                } else {
                    System.err.println("[BACKGROUND] Missing WORKING or EPISODIC adapter for Organizer thread.");
                }

                // Schedule for next run (e.g., every 5 minutes)
                Thread.sleep(5 * 60 * 1000);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Memory Organizer thread interrupted.");
                break;
            } catch (Exception e) {
                System.err.println("Error in Memory Organizer thread: " + e.getMessage());
            }
        }
    }
}