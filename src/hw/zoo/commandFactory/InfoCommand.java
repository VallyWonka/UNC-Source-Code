package hw.zoo.commandFactory;

import hw.zoo.ZooImpl;

public class InfoCommand extends Command {
    public InfoCommand(ZooImpl zoo) {
        super(zoo);
    }

    @Override
    public void executeCommand(String[] tokens) {
        System.out.println(this.zoo.getInfoAboutZoo());
    }
}
