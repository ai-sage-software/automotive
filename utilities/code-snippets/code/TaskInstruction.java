package domain;

import java.util.List;

/**
 * Domain entity representing the requirements for a specific task.
 * This covers the "Task Memory Requirement" phase.
 * It defines what the task is, and what data it needs to function.
 */
public class TaskInstruction {
    private final String taskId;
    private final String taskName;
    private final List<MemoryRequirement> requirements;
    private final boolean requiresCleanup;
    private final List<String> postTaskTags; // Tags for the Memory Post-Instructions phase

    public TaskInstruction(String taskId, String taskName, List<MemoryRequirement> requirements, boolean requiresCleanup, List<String> postTaskTags) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.requirements = requirements;
        this.requiresCleanup = requiresCleanup;
        this.postTaskTags = postTaskTags;
    }

    // Getters

    public String getTaskId() { return taskId; }
    public String getTaskName() { return taskName; }
    public List<MemoryRequirement> getRequirements() { return requirements; }
    public boolean requiresCleanup() { return requiresCleanup; }
    public List<String> getPostTaskTags() { return postTaskTags; }
}