package lab09;

public class Ball {

    public int x, y, w, h;
    private int dirX, dirY;

    public Ball(int x, int y, int w, int h, int dirX, int dirY) {
        setX(x);
        setY(y);
        setH(h);
        setW(w);
        setDirX(dirX);
        setDirY(dirY);

    }

    public Ball(int x, int y, int h, int w) {
        this(x, y, h, w, 1, 1);
    }

    /**
     * Method to get x
     * @return
     */
    protected int getX() {
        return x;
    }

    /**
     * Method to set ID
     * @param x
     */
    protected void setX(int x) {
        this.x = x;
    }

    /**
     * Method to get x+y
     * @return
     */
    protected int getY() {
        return y;
    }

    /**
     * Method to set ID
     * @param y
     */
    protected void setY(int y) {
        this.y = y;
    }

    /**
     * Method to get w
     * @return
     */
    protected int getW() {
        return w;
    }

    /**
     * Method to set w
     * @param w
     */
    protected void setW(int w) {
        this.w = w;
    }

    /**
     * Method to get h
     * @return
     */
    protected int getH() {
        return h;
    }

    /**
     * Method to set dirX
     * @param dirX
     */
    protected void setDirX(int dirX) {
        this.dirX = dirX;
    }

    /**
     * Method to get dirX
     * @return
     */
    protected int getDirX() {
        return dirX;
    }

    /**
     * Method to set dirY
     * @param dirY
     */
    protected void setDirY(int dirY) {
        this.dirY = dirY;
    }

    /**
     * Method to get dirX
     * @return
     */
    protected int getDirY() {
        return dirY;
    }

    /**
     * Method to set ID
     * @param h
     */
    protected void setH(int h) {
        this.h = h;
    }

    public void move() {
        x += dirX;
        y += dirY;

        if (x < 0) {
            x = 0;
            dirX = -dirX;
        }

        if (x > 300 - w) {
            x = 300 - w;
            dirX = -dirX;
        }

        if (y < 0) {
            y = 0;
            dirY = -dirY;
        }

        if (y > 300 - h) {
            y = 300 - h;
            dirY = -dirY;
        }
    }

}