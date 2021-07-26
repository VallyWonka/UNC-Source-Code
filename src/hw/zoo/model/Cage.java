package hw.zoo.model;

/**
 * class provides information about Cages
 * Assumptions:
 * one Cage - one Animal
 *
 * @getNumber() is used as a return primary key
 */
public interface Cage {
    //primary key
    // int getNumber();
    Double getArea();

    // Condition getCondition();
    boolean isVacantCage();
}
