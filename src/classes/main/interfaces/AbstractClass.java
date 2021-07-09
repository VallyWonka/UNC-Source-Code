package classes.main.interfaces;

public abstract class AbstractClass {

    protected String value;
    protected AbstractClass(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    abstract void doSomeLogic();
}
