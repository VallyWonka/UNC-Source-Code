package classes.main.tryAgain;

import classes.main.primitives.Integer;


public class Child extends Parent{

    private final Integer value;

    public Child() {
        this.value = new Integer(10);
    }

    public int childFlag;

    public void doParentLogic(final Integer i) {
        i.value = 10;
    }

    @Override
    public String toString() {
        return "Child{}";
    }
}
