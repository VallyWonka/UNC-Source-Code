package classes.main.autoboxing;

public interface UserRepository<T> {
    T getById(Long id);
    void save(Long id, String name);
}
