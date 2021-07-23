package classes.main.exception;

public class IncorrectInputtedValueException extends Exception {

    private static final String EXCEPTION_PREFIX = "[UNC Exception] ";

    protected IncorrectInputtedValueException(){
        super(EXCEPTION_PREFIX);
    }

    public IncorrectInputtedValueException(String message, Throwable cause) {
        super(EXCEPTION_PREFIX + message, cause);
    }

    public IncorrectInputtedValueException(String message) {
        super(EXCEPTION_PREFIX + message);
    }
}
