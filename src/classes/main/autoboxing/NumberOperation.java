package classes.main.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class NumberOperation {
    public static List<Integer> getPrimitivesList(int i, int j){
        System.out.println("primitives inputted parameters");
        return new ArrayList<Integer>(){{
            add(i);
            add(j);
        }};
    }

    public static List<Integer> getList(Integer i, Integer j){
        System.out.println("Wrapped inputted parameters");
        return new ArrayList<Integer>(){{
            add(i);
            add(j);
        }};
    }

    public static List<? super Number> getListInt(int i, int j){
        System.out.println("Wrapped inputted parameters");
        List<? extends Number> list = new ArrayList<>();
        return new ArrayList<Object>(){{
            add(String.valueOf(i));
            add(String.valueOf(j));
        }};
    }
}
