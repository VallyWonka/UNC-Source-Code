package hw.zoo.model;

public class Penguin implements Animal {
    private Species species = Species.PENGUIN;
    private String name;

    public Penguin(String name) {
        this.name = name;
    }

    @Override
    public Species getSpecies() {
        return this.species;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
