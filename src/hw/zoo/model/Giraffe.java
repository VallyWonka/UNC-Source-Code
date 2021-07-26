package hw.zoo.model;

public class Giraffe implements Animal {
    private Species species = Species.GIRAFFE;
    private String name;

    public Giraffe(String name) {
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
