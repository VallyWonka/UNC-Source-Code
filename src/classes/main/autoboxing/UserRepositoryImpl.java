package classes.main.autoboxing;

import classes.main.autoboxing.model.User;

import java.util.*;

public class UserRepositoryImpl implements UserRepository<User>{

    private final Map<Long, User> dataBase = new HashMap<>();

    @Override
    public User getById(long id) {
        return dataBase.get(id);
    }

    @Override
    public void save(User user) {
        dataBase.put(user.getId(), user);
    }

    public List<User> getElementsOrderedBy(int limit){
        List<Long> values = new ArrayList<>(dataBase.keySet());
        Collections.sort(values);
        if (limit < values.size()){
            return null;
        }
        return null;
    }

    public List<User> getElementsOrderedByKeys(int limit){
        List<User> result = new ArrayList<>();
        for (Map.Entry<Long, User> entry:dataBase.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}