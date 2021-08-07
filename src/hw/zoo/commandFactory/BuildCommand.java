package hw.zoo.commandFactory;

import hw.zoo.ZooImpl;
import hw.zoo.model.AnimalFactory;

public class BuildCommand extends Command {
    public BuildCommand(ZooImpl zoo) {
        super(zoo);
    }

    @Override
    public void executeCommand(String[] tokens) {
        try {
            this.zoo.buildCage(AnimalFactory.checkSpecies(tokens[1]),
                    Double.parseDouble(tokens[2]),
                    Integer.parseInt(tokens[3]));
            System.out.println("Successfully built a new Cage! We are grateful for your contribution.");
        } catch (IllegalArgumentException e) {
            System.out.println("Please make sure you provided the correct species, area " +
                    "and capacity of the Cage you want to build in the given order.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please make sure that you provided both the species, the area " +
                    "and the capacity of the Cage you want to build.");
        }
    }
}
