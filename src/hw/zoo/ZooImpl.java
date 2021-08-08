package hw.zoo;

import hw.zoo.logging.InhibitionLog;
import hw.zoo.logging.ZooLogger;
import hw.zoo.model.Animal;
import hw.zoo.model.CageImpl;
import hw.zoo.model.Species;

import java.util.*;

public class ZooImpl implements Zoo {
    private ZooLogger logger;
    private Map<Integer, CageImpl> cages;
    private Map<Animal, Integer> inhabitants;

    public ZooImpl(Map<Integer, CageImpl> cageHashMap) {
        this.cages = cageHashMap;
        this.logger = new ZooLogger();
        this.inhabitants = new HashMap<>();
    }

    public String getInfoAboutZoo() {
        if (this.countCages() == 0) {
            return "The Zoo is not particularly thriving at the moment. We have no cages and no animals can live here.";
        } else {
            StringBuilder info = new StringBuilder();
            info.append(String.format("Our Zoo currently owns %d cages with %d vacant place(s). ",
                    this.countCages(),
                    this.countVacant()));
            if (countInhabitants() > 0) {
                info.append("Here you can meet");
                for (Animal inhabitant : this.inhabitants.keySet()) {
                            info.append(String.format(" %s %s,",
                            inhabitant.getSpecies().toString().toLowerCase(),
                            inhabitant.getName()));
                }
                info.append(" and we hope that your animal will join our gang soon!");
            } else {
                info.append("Unfortunately, no animals live here at the moment. Yours may be first!");
            }
            return info.toString();
        }
    }

    private int countCages() {
        return this.cages.size();
    }

    private int countVacant() {
        int vacantPlaces = 0;
        for (CageImpl cage : this.cages.values()) {
            vacantPlaces += cage.countVacant();
        }
        return vacantPlaces;
    }

    private int countInhabitants() {
        return this.inhabitants.size();
    }

    public void buildCage(Species species, Double area, Integer capacity) {
        this.cages.put(this.cages.size(), new CageImpl(species, area, capacity));
    }

    private Map.Entry<Animal, Integer> findAnimalByName(String animalName) {
        for (Map.Entry<Animal, Integer> inhabitant : this.inhabitants.entrySet()) {
            if (inhabitant.getKey().getName().equals(animalName)) {
                return inhabitant;
            }
        }
        return null;
    }

    @Override
    public void checkInAnimal(Animal animal) throws IllegalArgumentException, IllegalAccessException {
        if (findAnimalByName(animal.getName()) != null) {
            throw new IllegalArgumentException("An Animal with this name already lives in the Zoo." +
                    " If you'd like to check them out, please use the check-out command.");
        }
        boolean cageFound = false;
        for (Map.Entry<Integer, CageImpl> cage : this.cages.entrySet()) {
            if (cage.getValue().isAvailableFor().equals(animal.getSpecies()) && cage.getValue().isVacantCage()) {
                cageFound = true;
                cage.getValue().moveIn(animal);
                this.inhabitants.put(animal, cage.getKey());
                this.logger.addLog(animal, cage.getKey());
                break;
            }
        }
        if (!cageFound) {
            throw new IllegalAccessException("Sorry, no vacant cage for this species.");
        }
    }

    public String checkOnAnimal(String animalName) {
        InhibitionLog log = this.logger.findLog(animalName);
        if (log == null) {
            return "An Animal with this name has never lived in the Zoo." +
                    " If you'd like to check them in, please use the check-in command.";
        } else if (log.getCheckOutDate() != null) {
            return String.format("The %s %s has already checked out. They lived here in cage %d from %s to %s.",
                    log.getAnimalSpecies().toString().toLowerCase(),
                    log.getAnimalName(),
                    log.getCageNumber(),
                    log.getCheckInDate(),
                    log.getCheckOutDate());
        }

        Map.Entry<Animal, Integer> inhabitant = this.findAnimalByName(animalName);
        assert inhabitant != null;
        Animal animal = inhabitant.getKey();
        CageImpl cage = this.cages.get(inhabitant.getValue());

        StringBuilder info = new StringBuilder();
        info.append(String.format("The %s %s has moved in here %s and is now living their best life " +
                        "in cage %d of area %.2f",
                animal.getSpecies().toString().toLowerCase(),
                animalName,
                log.getCheckInDate(),
                inhabitant.getValue(),
                cage.getArea()));
        if (cage.getInhabitants().size() > 1) {
            info.append(String.format(" with %d (out of %d) other animal(s):",
                    cage.getInhabitants().size() - 1,
                    cage.getCapacity() - 1));
            for (Animal neighbour: cage.getInhabitants()) {
                if (!neighbour.getName().equals(animalName)) {
                    info.append(String.format(" %s,", neighbour.getName()));
                }
            }
        } else {
            info.append(" alone,");
        }
        info.append(" and can't wait to meet you!");
        return info.toString();
    }

    @Override
    public void checkOutAnimal(String animalName) throws IllegalArgumentException {
        Map.Entry<Animal, Integer> inhabitant = this.findAnimalByName(animalName);
        if (inhabitant == null) {
            throw new IllegalArgumentException("An Animal with this name doesn't live in the Zoo." +
                    " If you'd like to check them in, please use the check-in command.");
        }
        this.cages.get(inhabitant.getValue()).moveOut(inhabitant.getKey());
        this.inhabitants.remove(inhabitant.getKey());
        this.logger.updateLog(animalName);
    }

    @Override
    public List<InhibitionLog> getHistory() {
        return this.logger.getHistory();
    }
}
