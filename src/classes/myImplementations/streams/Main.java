package classes.myImplementations.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>() {{
            add(new ArrayList<>(){{add(5);add(6);add(11);}});
            add(new ArrayList<>(){{add(13);add(127);add(7);}});
            add(new ArrayList<>(){{add(5);add(7);add(4);}});
        }};

        lists.stream()
                .flatMap(List::stream)
                .filter(val -> val < 10)
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
    }
}
