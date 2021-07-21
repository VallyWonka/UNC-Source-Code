package classes.main.primitives;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Integer int1 = new Integer(1);
        Integer int2 = new Integer(2);
        Integer int3 = new Integer(-1);

        List<Integer> list = new ArrayList<>();
        list.add(int1);
        list.add(int2);
        list.add(int3);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(int1,int2, int3));
        List<Integer> list2 = new ArrayList<Integer>(){{
           add(int1);
           add(int2);
        }};

        list1.add(int1);

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        CarState.IN_DRIVE.equals(CarState.IN_DRIVE);
        CarState.IN_DRIVE.getName();

        Math.abs(-1);

        System.out.println(int1 == int2);
        System.out.println(int1.equals(int2));

        Collections.sort(list);
        //list.sort();


        list.sort(new IntegerComparator());


        list.forEach(System.out::println);
        list1.forEach(System.out::println);

    }
}
