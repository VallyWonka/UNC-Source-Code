package classes.main.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        getValidation().validate(new ObjectForValidation());
        //getValidation().validate(null);

        List<List<Integer>> list = new ArrayList<List<Integer>>(){{
            add(new ArrayList<Integer>(){{add(1);add(2);add(3);}});
            add(new ArrayList<Integer>(){{add(10);add(20);add(30);}});
            add(new ArrayList<Integer>(){{add(100);add(200);add(300);}});
        }};

        list.stream()
                .flatMap(List::stream)
                .max(Integer::compareTo);

        List<String> strings = Stream.of(1,2,3,4)
                .filter(val -> val > 2)
                .map(String::valueOf)
                .distinct()
                .collect(Collectors.toList());



    }

    public static Validation getValidation(){
        return Object::toString;
    }
}
