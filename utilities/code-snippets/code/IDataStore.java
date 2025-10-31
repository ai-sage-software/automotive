public interface IDataStore {
    DataResult retrieve(DataQuery query);
    void persist(DataPayload payload);
}

