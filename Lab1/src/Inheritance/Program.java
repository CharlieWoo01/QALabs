package Inheritance;

import java.awt.*;

public class Program {

    public static void main(String args[]) {

        /**
         * Set the colours and points
         */
        Color red = new Color(255, 0, 0);
        Point center = new Point(0, 0);

        /**
         * Construct the shape objects
         */
        Circle circle = new Circle(red, center, 5);
        Sphere sphere = new Sphere(red, center, 5);
        Rectangle rectangle = new Rectangle(red, center, 10, 20);

        /**
         * Print the characteristics
         */
        System.out.println("\n Circle Characteristics: \n" + circle.getCharacteristics());
        System.out.println("\n Sphere Characteristics: \n" + sphere.getCharacteristics());
        System.out.println("\n Rectangle Characteristics: \n " + rectangle.getCharacteristics());
    }
}
