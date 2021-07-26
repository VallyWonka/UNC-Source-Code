package hw.zoo;


public class Main {
    public static void main(String[] args) {
        ZooImpl zoo = new ZooImpl();
        ConsoleParser consoleParser = new ConsoleParser(zoo);
        consoleParser.parse();
    }
}
