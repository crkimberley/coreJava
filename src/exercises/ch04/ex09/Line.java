package exercises.ch04.ex09;

/**
 * @author Chris Kimberley
 */
public class Line extends Shape {
    Point to;


    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCentre() {
        return new Point(point.getX() + (to.getX() - point.getX()) / 2,
                point.getY() + (to.getY() - point.getY()) / 2);
    }

    @Override
    public Line clone() {
        try { return new Line(point.clone(), to.clone()); }
        catch (CloneNotSupportedException ex) { return null; }
    }
}