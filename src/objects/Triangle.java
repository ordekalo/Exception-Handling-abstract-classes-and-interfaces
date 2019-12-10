package objects;

import exceptions.InvalidColorException;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(String color, int base, int height) throws InvalidColorException {
        super(color);
        this.base = base;
        this.height = height;
    }

    public void show() {
        System.out.println("Triangle, " + getColor() + ", " + base + ", " + height + ", area = " + getArea());
    }

    public double getArea() {
        return (double) (base * height) / 2;
    }
}
