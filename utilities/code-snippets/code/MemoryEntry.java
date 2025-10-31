package domain;

import java.time.LocalDateTime;

/**
 * A generic representation of a single piece of information retrieved from any memory store.
 * This ensures consistency across Working, Episodic, and external data sources.
 */
public class MemoryEntry {
    private final String id;
    private final String type; // e.g., "EPISODIC", "WORKING", "SQL_PROFILE"
    private final String content;
    private final double priorityScore;
    private final LocalDateTime timestamp;

    public MemoryEntry(String id, String type, String content, double priorityScore, LocalDateTime timestamp) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.priorityScore = priorityScore;
        this.timestamp = timestamp;
    }

    // Getters (omitted for brevity, but necessary for a full implementation)

    public String getId() { return id; }
    public String getType() { return type; }
    public String getContent() { return content; }
    public double getPriorityScore() { return priorityScore; }
    public LocalDateTime getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        return String.format("[%s, Score: %.2f] %s: %s", type, priorityScore, id, content.substring(0, Math.min(content.length(), 40)) + "...");
    }
}