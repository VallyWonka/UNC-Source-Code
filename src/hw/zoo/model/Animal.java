package hw.zoo.model;

/**
 * class provides information about Animals
 * each animal should have its own class
 *
 * @getName is used as a primary key of Animal
 */
public interface Animal {
    String getName();

    Species getSpecies();
}
