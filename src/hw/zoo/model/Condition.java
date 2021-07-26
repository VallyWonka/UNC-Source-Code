package hw.zoo.model;


/**
 * class provides information about who can be placed in a Cage
 */
public interface Condition {
    Species isAvailableFor();
}
