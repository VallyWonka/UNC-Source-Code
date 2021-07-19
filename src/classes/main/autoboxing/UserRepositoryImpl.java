package classes.main.autoboxing;

import classes.main.autoboxing.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl<T> implements UserRepository {

    private Map<Long, User> userRepository = new HashMap<>();

    @Override
    public Object getById(Long id) {
        return this.userRepository.get(id);
    }

    @Override
    public void save(Long id, String name) {
        User newUser = new User(id, name);
        this.userRepository.put(newUser.getId(), newUser);
    }
}
