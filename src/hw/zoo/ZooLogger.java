package hw.zoo;

import hw.zoo.model.Animal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZooLogger {
    private List<InhibitionLog> history;

    public ZooLogger() {
        this.history = new ArrayList<>();
    }

    public void addLog(Animal animal, Integer cageNumber) {
        this.history.add(0,
                new InhibitionLog(new Date(),
                        null,
                        animal.getSpecies(),
                        animal.getName(),
                        cageNumber));
    }

    public InhibitionLog findLog(String animalName) {
        for (InhibitionLog log : this.history) {
            if (log.getAnimalName().equals(animalName)) {
                return log;
            }
        }
        return null;
    }

    public void updateLog(String animalName) {
        this.findLog(animalName).setCheckOutDate(new Date());
    }

    public List<InhibitionLog> getHistory() {
        return this.history;
    }
}
