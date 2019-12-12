package interfaces;

import exceptions.InvalidRadiusException;

public interface Radius {
    int MAX = 800;
    int MIN = 0;
    void radiusCheck() throws InvalidRadiusException;
}
