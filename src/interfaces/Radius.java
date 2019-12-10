package interfaces;

import exceptions.InvalidRadiusException;

public interface Radius {
    public static final int MAX = 800;
    public static final int MIN = 0;
    void radiusCheck() throws InvalidRadiusException;
}
