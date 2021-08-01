package classes.main.annatations;

import classes.main.annatations.validation.Validation;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {

        List<Validation> validations = ValidationFinder.getAllValidations("classes.main.annatations.validation");

        for (Validation validation: validations){
            validation.validate();
            validation.oldValidation();
        }
    }
}
