package hw.zoo.model;

import java.util.ArrayList;
import java.util.List;

public class CageImpl implements Cage, Condition {
    private Species species;
    private Double area;
    private Integer capability;
    private List<Animal> inhabitants;

    public CageImpl(Species species, Double area, Integer capability) {
        this.species = species;
        this.area = area;
        this.capability = capability;
        this.inhabitants = new ArrayList<>(capability);
    }

    @Override
    public Species isAvailableFor() {
        return this.species;
    }

    @Override
    public Double getArea() {
        return this.area;
    }

    public Integer getCapability() {
        return this.capability;
    }

    public Integer countVacant() {
        return this.capability - this.inhabitants.size();
    }

    @Override
    public boolean isVacantCage() {
        return (this.capability  - this.inhabitants.size()) > 0;
    }

    public List<Animal> getInhabitants() {
        return this.inhabitants;
    }

    public void moveIn(Animal animal) {
        this.inhabitants.add(animal);
    }

    public void moveOut(Animal animal) {
        this.inhabitants.remove(animal);
    }

}
