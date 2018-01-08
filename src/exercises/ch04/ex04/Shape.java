package exercises.ch04.ex04;

/**
 * @author Chris Kimberley
 */
public abstract class Shape implements Cloneable {
    Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point = new Point(point.getX() + dx, point.getY() + dy);
    }

    public abstract Point getCentre();
}