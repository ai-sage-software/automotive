package ports;

import domain.MemoryEntry;
import domain.TaskInstruction;

import java.util.List;

/**
 * Secondary Port: Defines the contract for all memory and data source access (Working, Episodic, SQL, etc.).
 * This is used during the "Task Memory Builder" phase.
 */
public interface IMemoryAdapter {

    /**
     * Retrieves memory entries based on the instruction and a specific query.
     * @param instruction The overall task instruction.
     * @param requirement A specific memory requirement (logical name, query, etc.).
     * @return A list of raw memory entries that match the query.
     */
    List<MemoryEntry> retrieveMemory(TaskInstruction instruction, String requirement);

    /**
     * Stores a new memory entry. Used for "Task Memory Post-Instructions" and the background "Memory Organizer".
     * @param entry The memory entry to store.
     */
    void storeMemory(MemoryEntry entry);
}