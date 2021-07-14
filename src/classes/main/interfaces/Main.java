package classes.main.interfaces;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setState("First Call");

        String string = String.valueOf(1);
        string.charAt(1);

        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1);

        System.out.println(singleton.getClass().getName());

        if (singleton instanceof Singleton){
            System.out.println("Могу съесть");
        }

        Singleton.staticState = "non static";

        AbstractClass abstractClass = new CorrectClass("string");
        abstractClass.doSomeLogic();

        System.out.println(singleton1);
    }
}
