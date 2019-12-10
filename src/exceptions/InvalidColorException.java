package exceptions;

public class InvalidColorException extends Exception {
    public InvalidColorException(String color) {
        super(color + " is invalid color!");
    }
}
