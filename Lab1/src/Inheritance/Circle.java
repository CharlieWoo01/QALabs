package Inheritance;

import java.awt.*;

public class Circle extends Shape {
    public double radius;

    /**
     * Define a constant for PI value
     */
    public static final double PI_VALUE = Math.PI;

    /**
     * Construct the circle
     * @param colour
     * @param position
     * @param radius
     */
    public Circle(Color colour, Point position, double radius) {
        super(colour, position);
        this.radius = radius;
    }

    /**
     * Get calculated area
     * @return
     */
    public double getArea() {
        return Math.round(PI_VALUE * (getRadius() * getRadius()));
    }

    /**
     * Get calculated circumference
     * @return
     */
    public double getCircumference() {
        return Math.round(PI_VALUE * getDiameter());
    }

    /**
     * Get calculated diameter
     * @return
     */
    public double getDiameter() {
        return Math.round((radius * 2));
    }

    /**
     * Get calculated radius
     * @return
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Get the characteristics and format it to remove silly import name from colour and position
     * @return
     */
    public String getCharacteristics() {
        return String.format("Colour: [r=%d,g=%d,b=%d]\n",
                colour.getRed(), colour.getGreen(), colour.getBlue()) +
                String.format("Position: [x=%d,y=%d]\n",
                        (int) position.getX(), (int) position.getY()) +
                "Radius: " + radius + "\n" +
                "Diameter: " + getDiameter() + "\n" +
                "Area: " + getArea() + "\n" +
                "Circumference: " + getCircumference() + "\n";
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
