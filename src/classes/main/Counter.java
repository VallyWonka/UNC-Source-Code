package classes.main;

public class Counter implements CounterInterface, CounterInterface2 {

    private CounterAggregation counterAggregation;
    private Void temp;

    protected int i;

    public Counter(int i) {
        this.i = i;
    }

    public int getNextElement(){
        if ( i >= 5 ){

            this.i = 0;

            return i;
        }
        return ++i;
    }
}
