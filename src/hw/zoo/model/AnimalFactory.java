package hw.zoo.model;

public class AnimalFactory {

    public static Animal createAnimal(String species, String name) throws IllegalArgumentException {
        switch (AnimalFactory.checkSpecies(species)) {
            case LION -> {
                return new Lion(name);
            }
            case GIRAFFE -> {
                return new Giraffe(name);
            }
            case PENGUIN -> {
                return new Penguin(name);
            }
            case SQUIRREL -> {
                return new Squirrel(name);
            }
            default -> throw new IllegalArgumentException("Unexpected value: " + species);
        }
    }

    public static Species checkSpecies(String species) throws IllegalArgumentException {
        species = species.toUpperCase();
        switch (species) {
            case "LION" -> {
                return Species.LION;
            }
            case "GIRAFFE" -> {
                return Species.GIRAFFE;
            }
            case "PENGUIN" -> {
                return Species.PENGUIN;
            }
            case "SQUIRREL" -> {
                return Species.SQUIRREL;
            }
            default -> throw new IllegalArgumentException("This species is unknown.");
        }
    }
}
