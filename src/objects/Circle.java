package objects;

import exceptions.InvalidColorException;
import exceptions.InvalidRadiusException;
import interfaces.Radius;

public class Circle extends Shape implements Radius {
    private int radius;

    public Circle(String color, int radius) throws InvalidColorException, InvalidRadiusException {
        super(color);
        this.radius = radius;
        radiusCheck();
    }

    public void show() {
        System.out.println("Circle, " + getColor() + ", " + radius + ", area = " + getArea());
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void radiusCheck() throws InvalidRadiusException {
        if (radius > MAX || radius < MIN) {
            throw new InvalidRadiusException(radius);
        }
    }
}
