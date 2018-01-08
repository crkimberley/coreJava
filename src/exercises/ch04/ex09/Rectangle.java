package exercises.ch04.ex09;

/**
 * @author Chris Kimberley
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCentre() {
        return new Point(point.getX() + width / 2, point.getY() - height / 2);
    }

    @Override
    public Rectangle clone() {
        try { return new Rectangle(point.clone(), width, height); }
        catch (CloneNotSupportedException ex) { return null; }
    }
}
