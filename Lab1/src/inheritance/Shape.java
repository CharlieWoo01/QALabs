package inheritance;

import java.awt.*;

public abstract class Shape {
    public Color colour;
    public Point position;

    /**
     * Construct the shape
     * @param colour
     * @param position
     */
    public Shape(Color colour, Point position) {
        this.colour = colour;
        this.position = position;
    }

    /**
     * Get the colour
     * @return
     */
    public Color getColour() {
        return colour;
    }

    /**
     * Set the colour
     * @param colour
     */
    private void setColour(Color colour) {
        this.colour = colour;
    }

    /**
     * Get the position
     * @return
     */
    public Point getPosition() {
        return position;
    }

    /**
     * Set the position
     * @param position
     */
    private void setPosition(Point position) {
        this.position = position;
    }
}
