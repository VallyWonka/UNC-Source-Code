package classes.main.interfaces;

public class CorrectClass extends AbstractClass{

    public CorrectClass(String value) {
        super(value);
    }

    @Override
    void doSomeLogic() {
        System.out.println(value);
    }
}
