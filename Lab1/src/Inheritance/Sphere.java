package Inheritance;

import java.awt.*;

public class Sphere extends Circle {

    /**
     * Construct the sphere
     * @param colour
     * @param position
     * @param radius
     */
    public Sphere(Color colour, Point position, double radius) {
        super(colour, position, radius);
    }

    /**
     * Get calculated volume
     * @return
     */
    public double getVolume() {
        return Math.round((4.0 / 3.0) * PI_VALUE * Math.pow(radius, 3));
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
                "Radius: " + super.getRadius() + "\n" +
                "Diameter: " + super.getDiameter() + "\n" +
                "Area: " + super.getArea() + "\n" +
                "Circumference: " + super.getCircumference() + "\n" +
                "Volume: " + getVolume() + "\n";
    }
}
