package classes.main;

import java.io.IOException;
import java.util.List;

public class CounterAggregation {
    private List<CounterInterface> counterInterfaceList;

    private Counter counter;

    public CounterAggregation(List<CounterInterface> counterInterfaceList) {
        this.counterInterfaceList = counterInterfaceList;
    }

    public int aggregate() throws IOException {
        if(3>4) {
            throw new IOException();
        }
        return counter.getNextElement() + counter.getNextElement();

    }

    public void initCounterAggregation(CounterInterface... counterInterfaces){

    }

}

