package classes.main.interfaces;

public class Singleton {

    private String state;
    public static String staticState = "static";

    public static Singleton instance;

    private Singleton(){};

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "state='" + staticState + '\'' +
                '}';
    }
}
