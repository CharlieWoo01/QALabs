package inheritance;

import java.awt.*;

public class Rectangle extends Shape {
    public double sideA, sideB;

    /**
     * Construct the rectangle
     * @param colour
     * @param position
     * @param sideA
     * @param sideB
     */
    public Rectangle(Color colour, Point position, double sideA, double sideB) {
        super(colour, position);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /**
     * Get calculated area
     * @return
     */
    public double getArea() {
        return Math.round(sideA * sideB);
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
                "Side A: " + sideA + "\n" +
                " Side B: " + sideB + "\n" +
                " Area: " + getArea() + "\n" +
                " Circumference: " + getCircumference() + "\n";
    }

    /**
     * Get calculated circumference
     * @return
     */
    public double getCircumference() {
        return Math.round(2 * (sideA + sideB));
    }
}
