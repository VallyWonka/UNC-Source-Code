package hw.zoo.console.commandFactory;

import hw.zoo.ZooImpl;

public class CheckOutCommand extends Command {
    public CheckOutCommand(ZooImpl zoo) {
        super(zoo);
    }

    @Override
    public void executeCommand(String[] tokens) {
        try {
            this.zoo.checkOutAnimal(tokens[1]);
            System.out.format("Successfully checked %s out!\n", tokens[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please make sure that you provided the name of the Animal " +
                    "you want to check out.");
        }
    }
}
