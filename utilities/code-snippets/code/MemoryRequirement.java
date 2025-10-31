class MemoryRequirement {
    private final String logicalName; // e.g., "ChildAges", "PolicyNumber"
    private final String memoryType;  // e.g., "WORKING", "EPISODIC_SEARCH", "SQL_DB"
    private final boolean isRequired;
    private final String retrievalQuery; // The query to be passed to the adapter

    public MemoryRequirement(String logicalName, String memoryType, boolean isRequired, String retrievalQuery) {
        this.logicalName = logicalName;
        this.memoryType = memoryType;
        this.isRequired = isRequired;
        this.retrievalQuery = retrievalQuery;
    }

    // Getters

    public String getLogicalName() { return logicalName; }
    public String getMemoryType() { return memoryType; }
    public boolean isRequired() { return isRequired; }
    public String getRetrievalQuery() { return retrievalQuery; }
}
