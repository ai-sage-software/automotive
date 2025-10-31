public class WorkingMemory implements IMemory<Object> {
    private final Map<String, Object> cache = new ConcurrentHashMap<>();

    // Implementation of get, put, remove...
}

