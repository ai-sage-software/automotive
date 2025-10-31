// File: src/main/java/infrastructure/WorkingMemoryAdapter.java
package infrastructure;

import domain.MemoryEntry;
import domain.TaskInstruction;
import ports.IMemoryAdapter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 * Example Adapter for the fast, transient Working Memory (in-memory storage).
 * Implements the IMemoryAdapter Port.
 */
public class WorkingMemoryAdapter implements IMemoryAdapter {
    // Highly available, fast storage (e.g., a Concurrent Map or Redis)
    private final ConcurrentMap<String, MemoryEntry> store = new ConcurrentHashMap<>();

    public WorkingMemoryAdapter() {
        // Seed the memory with some data
        store.put("ChildAges", new MemoryEntry("ChildAges", "WORKING", "Ages: [10, 15]", 0.9, LocalDateTime.now()));
        store.put("PolicyInfo", new MemoryEntry("PolicyInfo", "WORKING", "Policy: XYZ-987, Active", 0.95, LocalDateTime.now()));
        store.put("LowPriorityData", new MemoryEntry("LowPriorityData", "WORKING", "Old temporary calc", 0.1, LocalDateTime.now()));
    }

    @Override
    public List<MemoryEntry> retrieveMemory(TaskInstruction instruction, String query) {
        // Simple retrieval logic: assume query is an ID match or a priority check for the organizer
        if (query != null && query.contains("PRIORITY < 0.2")) {
            // Logic for the background Memory Organizer
             return store.values().stream()
                     .filter(e -> e.getPriorityScore() < 0.2)
                     .collect(Collectors.toList());
        }

        return store.values().stream()
                .filter(entry -> entry.getId().equalsIgnoreCase(query) || entry.getContent().contains(query))
                .collect(Collectors.toList());
    }

    @Override
    public void storeMemory(MemoryEntry entry) {
        System.out.println("[WORKING] Storing/Updating: " + entry.getId());
        store.put(entry.getId(), entry);
    }
}