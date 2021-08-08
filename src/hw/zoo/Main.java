package hw.zoo;


import hw.zoo.console.ConsoleParser;

public class Main {
    public static void main(String[] args) {
        ZooBuilder zooBuilder = new ZooBuilder();
        ZooImpl zoo = new ZooImpl(zooBuilder.readCageConfig());
        ConsoleParser consoleParser = new ConsoleParser(zoo);
        consoleParser.run();
    }
}
