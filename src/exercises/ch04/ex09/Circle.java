package exercises.ch04.ex09;

/**
 * @author Chris Kimberley
 */
public class Circle extends Shape {
    private double radius;

    public Circle(Point centre, double radius) {
        super(centre);
        this.radius = radius;
    }

    @Override
    public Point getCentre() {
        return point;
    }

    @Override
    public Circle clone() {
        try { return new Circle(point.clone(), radius); }
        catch (CloneNotSupportedException ex) { return null; }
    }
}