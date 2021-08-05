package classes.main.autoboxing;

import classes.main.autoboxing.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumberOperation.getList(10, 20);
        NumberOperation.getList(new Integer(10), new Integer(20));

        CustomList<Integer> customList = new CustomList<>();

        List<? super Integer> list;
        list = new ArrayList<Integer>();
        list = new ArrayList<Number>();
        list = new ArrayList<Object>();


        customList.add(10);

        DuplicateFinder<Integer> duplicateFinder = new DuplicateFinderImpl<>();

        duplicateFinder.getDuplicatedElements(Arrays.asList(10, 10, 20, 40, 20))
                .forEach(element -> System.out.println(element));


        UserRepositoryImpl userRepository = new UserRepositoryImpl();

        userRepository.save(new User(1L, "name1", "name2"));
        userRepository.save(new User(2L, "name2", "name2"));
        userRepository.save(new User(3L, "name3", "name3"));
        userRepository.save(new User(20L, "name2", "name2"));
        userRepository.save(new User(30L, "name2", "name20"));


        userRepository.getElementsOrderedByKeys(5).forEach(System.out::println);

    }
}
