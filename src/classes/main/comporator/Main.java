package classes.main.comporator;


import classes.main.tryAgain.Parent;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] inputtedArray = {1,1,2,1,2,1};
        Map<Integer, Integer> resultMap = new HashMap<>();
        for(int i: inputtedArray){
            Integer count = resultMap.getOrDefault(i, 0);
            count++;
            resultMap.put(i, count);
        }
        for(Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            if(entry.getValue() > inputtedArray.length/2){
                System.out.println(entry.getKey());
                break;
            }
        }

        System.out.println(Arrays.stream(inputtedArray).max().orElse(0));
        System.out.println(1 << 4);

        Map<String, Map<String, Integer>> shopHistory = new TreeMap();

        shopHistory.put("Petrov", new HashMap<String, Integer>(){{
            put("envelope", 20);
            put("pens", 5);
        }});
        shopHistory.put("Ivanov", new HashMap<String, Integer>(){{
            put("envelope", 5);
            put("paper", 17);
            put("marker", 3);
        }});


        for (Map.Entry<String, Map<String, Integer>> peopleHistory: shopHistory.entrySet()){
            System.out.print(peopleHistory.getKey());
            for (Map.Entry<String, Integer> itemHistory: peopleHistory.getValue().entrySet()){
                System.out.format(": %s %d ", itemHistory.getKey(), itemHistory.getValue());
            }
            System.out.println();
        }
    }
}
