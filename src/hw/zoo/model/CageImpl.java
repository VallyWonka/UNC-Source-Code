package hw.zoo.model;

import java.util.ArrayList;
import java.util.List;

public class CageImpl implements Cage, Condition {
    private Species species;
    private Double area;
    private Integer capacity;
    private List<Animal> inhabitants;

    public CageImpl(Species species, Double area, Integer capacity) {
        this.species = species;
        this.area = area;
        this.capacity = capacity;
        this.inhabitants = new ArrayList<>(capacity);
    }

    @Override
    public Species isAvailableFor() {
        return this.species;
    }

    @Override
    public Double getArea() {
        return this.area;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public Integer countVacant() {
        return this.capacity - this.inhabitants.size();
    }

    @Override
    public boolean isVacantCage() {
        return this.countVacant() > 0;
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
