package exercises.ch02;

/**
 * @author Chris Kimberley
 */
public class Ex08_PointWithHelpFromIDE {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ex08_PointWithHelpFromIDE{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Ex08_PointWithHelpFromIDE(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ex08_PointWithHelpFromIDE translate(double xShift, double yShift) {
        return new Ex08_PointWithHelpFromIDE(x + xShift, y + yShift);
    }

    public void translateMutate(double xShift, double yShift) {
        x += xShift;
        y += yShift;
    }

    public Ex08_PointWithHelpFromIDE scale(double factor) {
        return new Ex08_PointWithHelpFromIDE(x * factor, y * factor);
    }

    public void scaleMutate(double factor) {
        x *= factor;
        y *= factor;
    }
}
