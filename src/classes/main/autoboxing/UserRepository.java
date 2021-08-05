package classes.main.autoboxing;

public interface UserRepository<T> {

    T getById(long id);
    void save(T user);

}