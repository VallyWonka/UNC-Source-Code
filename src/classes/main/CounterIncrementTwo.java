package classes.main;

public class CounterIncrementTwo extends Counter {

    private int j = 0;

    public CounterIncrementTwo(int i) {
        super(i);
    }

   @Override
    public int getNextElement() {
        i = i + 2;
        return i;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format("Current value: %s", i);
    }
}
