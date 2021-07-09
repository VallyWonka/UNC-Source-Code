package classes.main.interfaces.tomAndJerry;

import java.util.List;

public class ZooOrchestrator {

    private Zoo zoo;

    public boolean move(Animal animal, Point point){
        animal.move(point);
        List<Animal> relatedAnimals =  zoo.getAnimalsInPoint(point);
        boolean isAnyoneEaten = false;
        for (Animal relatedAnimal: relatedAnimals){
            if(relatedAnimal.eat(animal)){
                zoo.remove(animal);
                return true;
            }
            else if(animal.eat(relatedAnimal)){
                zoo.remove(relatedAnimal);
                isAnyoneEaten = true;
            }
        }
        return isAnyoneEaten;
    }

    private boolean checkAnimalsPlace(Animal animal, Animal relatedAnimal) {
        if(relatedAnimal.eat(animal)){
            zoo.remove(animal);
            return true;
        }
        else if(animal.eat(relatedAnimal)){
            zoo.remove(relatedAnimal);
            return true;
        }
        return false;
    }
}
