package classes.main.exception;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        int i = 0;

        //checkAssertI(-2);

        //throw new AssertionError();


        /*try {

            checkI(i);

        } catch (IncorrectInputtedValueException e){
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally");
        }*/

    }


    private static void checkI(int i) throws IncorrectInputtedValueException {

        if(i > -1){
            throw new IncorrectInputtedValueException("i > -1");
        }
        else{
            throw new IncorrectInputtedValueException("else");
        }
    }

    private static void checkAssertI(int i) {
        assert 10 > -1: "i > -1";
    }
}
