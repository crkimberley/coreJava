package exercises.ch02;

/**
 * @author Chris Kimberley
 */
public class Ex05_Point {
    private double x;
    private double y;

    public Ex05_Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ex05_Point() {
        x = 0.0;
        y = 0.0;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public Ex05_Point translate(double xShift, double yShift) {
        return new Ex05_Point(x + xShift, y + yShift);
    }

    public void translateMutate(double xShift, double yShift) {
        x += xShift;
        y += yShift;
    }

    public Ex05_Point scale(double factor) {
        return new Ex05_Point(x * factor, y * factor);
    }

    public void scaleMutate(double factor) {
        x *= factor;
        y *= factor;
    }

    public String toString() {
        return String.format("(%.1f, %.1f)", x, y);
    }
}
