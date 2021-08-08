package hw.zoo.console.commandFactory;

import hw.zoo.ZooImpl;
import hw.zoo.model.Animal;
import hw.zoo.model.AnimalFactory;

public class CheckInCommand extends Command {
    public CheckInCommand(ZooImpl zoo) {
        super(zoo);
    }

    @Override
    public void executeCommand(String[] tokens) {
            try {
                Animal animal = AnimalFactory.createAnimal(tokens[1], tokens[2]);
                this.zoo.checkInAnimal(animal);
                System.out.format("Successfully checked %s %s in!\n",
                        animal.getSpecies().toString().toLowerCase(),
                        animal.getName());
            } catch (IllegalArgumentException | IllegalAccessException e) {
                System.out.println(e.getMessage());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Please make sure that you provided both the name and the species " +
                        "of the Animal you want to check in.");
            }
    }
}
