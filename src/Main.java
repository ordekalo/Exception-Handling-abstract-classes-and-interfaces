import exceptions.InvalidColorException;
import exceptions.InvalidRadiusException;
import objects.Circle;
import objects.Rect;
import objects.Shape;
import objects.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void show(String header, Shape[] shapes) {
        System.out.println(header + ":\n" +
                "==========================");
        for (Shape shape :
                shapes) {
            shape.show();
        }
    }

    static void bubbleSort(Shape[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].getArea() > arr[j + 1].getArea()) {
                    // swap arr[j+1] and arr[i]
                    Shape temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static Circle userInputCircle() {
        Scanner scanner = new Scanner(System.in);
        String color;
        int radius;
        do {
            System.out.println("Please enter color and then radius for the first circle:");
            try {
                color = scanner.nextLine();
                radius = scanner.nextInt();
                scanner.nextLine();

                Circle circle = new Circle(color, radius);
                scanner.close();
                return circle;
            } catch (InvalidColorException | InvalidRadiusException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Only integer is allowed here..");
                scanner.nextLine();
            }

        } while (true);

    }

    public static void main(String[] args) throws InvalidColorException, InvalidRadiusException {

        Shape[] shapes = new Shape[6];
        shapes[0] = userInputCircle();
        shapes[1] = new Triangle("red", 10, 20);
        shapes[2] = new Rect("blue", 3, 5);
        shapes[3] = new Circle("yellow", 100);
        shapes[4] = new Triangle("red", 1, 2);
        shapes[5] = new Rect("white", 6, 2);

        show("Original array and areas", shapes);
        System.out.println();

        bubbleSort(shapes);
        show("after sorting", shapes);
    }


}
