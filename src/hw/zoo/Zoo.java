package hw.zoo;

import hw.zoo.model.Animal;

import java.util.List;

/**
 * entity to keep state of the Zoo and provide service desk functionality
 *
 * @checkInAnimal method adds an Animal to the Zoo
 * should throw an exception when the Zoo can't provide a place
 * @checkOutAnimal method removes an Animal from the Zoo
 * @getHistory method shows log records of checking in and checking out
 */
public interface Zoo {
    void checkInAnimal(Animal animal) throws CloneNotSupportedException, IllegalAccessException;

    void checkOutAnimal(String animalName);

    List<InhibitionLog> getHistory();
}
