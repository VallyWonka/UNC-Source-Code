package hw.zoo.model;

public class Squirrel implements Animal {
    private Species species = Species.SQUIRREL;
    private String name;

    public Squirrel(String name) {
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
