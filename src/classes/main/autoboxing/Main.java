package classes.main.autoboxing;

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

    }
}
