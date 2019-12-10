package exceptions;

public class InvalidRadiusException extends Exception {
    public InvalidRadiusException(double radius) {
        super(radius + " is illegal radius");
    }
}
