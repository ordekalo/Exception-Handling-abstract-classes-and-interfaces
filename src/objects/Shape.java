package objects;

import exceptions.InvalidColorException;

public abstract class Shape implements Comparable<Shape> {
    private static final String[] INVALID_COLORS = {"green", "purple", "brown", "black"};
    private String color;

    public Shape(String color) throws InvalidColorException {
        String lowerCaseColor = color.toLowerCase();

        for (String invColor : INVALID_COLORS) {
            if (invColor.equals(lowerCaseColor)) {
                throw new InvalidColorException(lowerCaseColor);
            }
        }
        this.color = lowerCaseColor;
    }

    public abstract double getArea();

    public abstract void show();

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(getArea(), o.getArea());
    }
}
