package classes.main.tryAgain.builder;

public class Engine {
    private int size;

    public Engine(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "size=" + size +
                '}';
    }
}
