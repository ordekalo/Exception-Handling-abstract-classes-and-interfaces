package objects;

import exceptions.InvalidColorException;

public class Rect extends Shape {
    private int width;
    private int height;

    public Rect(String color, int width, int height) throws InvalidColorException {
        super(color);
        this.width = width;
        this.height = height;
    }

    public void show() {
        System.out.println("Rect, " + getColor() + ", " + width + ", " + height + ", area = " + getArea());
    }

    public double getArea() {
        return width * height;
    }
}
