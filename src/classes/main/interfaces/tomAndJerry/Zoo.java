package classes.main.interfaces.tomAndJerry;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void add(Animal animal){
        animals.add(animal);
    }

    public void remove(Animal animal){
        animals.remove(animal);
    }

    public void clearAll(){
        animals.clear();
    };

    public List<Animal> getAnimalsInPoint(Point point){
        List<Animal> result = new ArrayList<>();
        for(Animal animal : animals){
            if(animal.getCurrentPoint().equals(point)){
                result.add(animal);
            }
        }
        return result;
    }
}
