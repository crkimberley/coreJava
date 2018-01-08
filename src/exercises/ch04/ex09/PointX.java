package exercises.ch04.ex09;

/**
 * @author Chris Kimberley
 */
public class PointX {
    private double x;
    private double y;
    private PointX pointX = this;

    public PointX(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }
}
