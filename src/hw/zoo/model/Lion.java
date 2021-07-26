package hw.zoo.model;

public class Lion implements Animal {
    private Species species = Species.LION;
    private String name;

    public Lion(String name) {
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
