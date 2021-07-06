package classes.main;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(0);

        Counter counter1 = new CounterIncrementTwo(0);

        System.out.println(counter1.toString());

        CounterAggregation counterAggregation = new CounterAggregation(
                Collections.emptyList()
        );

        counterAggregation.initCounterAggregation(counter, counter, counter);

        System.out.println(String.format("Current value %s", counter.getNextElement()));

        changeReferenceOnCounter(counter);

        System.out.println(String.format("Current value %s", counter.getNextElement()));
    }

    private static void changeReferenceOnCounter(Counter counter) {
        counter = new Counter(0);
    }
}
