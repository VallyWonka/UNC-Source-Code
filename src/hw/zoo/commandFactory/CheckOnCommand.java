package hw.zoo.commandFactory;

import hw.zoo.ZooImpl;

public class CheckOnCommand extends Command {
    public CheckOnCommand(ZooImpl zoo) {
        super(zoo);
    }

    @Override
    public void executeCommand(String[] tokens) {
        try {
            System.out.println(this.zoo.checkOnAnimal(tokens[1]));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please make sure that you provided the name " +
                    "of the Animal you want to check on.");
        }
    }
}
