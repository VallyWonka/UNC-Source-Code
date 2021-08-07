package hw.zoo.commandFactory;

import hw.zoo.ZooImpl;

public class LogCommand extends Command {
    public LogCommand(ZooImpl zoo) {
        super(zoo);
    }

    @Override
    public void executeCommand(String[] tokens) {
        this.zoo.getHistory().forEach(System.out::println);
    }
}
