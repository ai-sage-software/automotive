public interface IMemory<T> {
    T get(String key);
    void put(String key, T value);
    void remove(String key);
}

