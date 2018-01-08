package exercises.ch04.ex04;

/**
 * @author Chris Kimberley
 */
public class ShapeScript {
    public static void main(String[] args) {
        new ShapeScript().launch();
    }

    private void launch() {
        Circle circle1 = new Circle(new Point(20, 10), 4);
        System.out.println(circle1.getCentre());
        System.out.println(circle1.getCentre().getX());
        System.out.println(circle1.getCentre().getY());
        circle1.moveBy(6, 3);
        System.out.println(circle1.getCentre());

        Shape rectangle1 = new Rectangle(new Point(50, 60), 12, 12);
        System.out.println(rectangle1.getCentre());
        rectangle1.moveBy(1000, 1000);
        System.out.println(rectangle1.getCentre());

        Shape line1 = new Line(new Point(100, 120), new Point(150, 170));
        System.out.println(line1.getCentre());
        System.out.println(line1.point);
        line1.moveBy(2000, 2000);
        System.out.println(line1.getCentre());
        System.out.println(line1.point);

        Circle clonedCircle1 = circle1.clone();
        System.out.println(clonedCircle1.getCentre());
        circle1.point = new Point(777, 999);
        System.out.println(circle1.getCentre());
        System.out.println(clonedCircle1.getCentre());

        Rectangle clonedRectangle1 = ((Rectangle) rectangle1).clone();
        System.out.println(clonedRectangle1.getCentre());
        clonedRectangle1.point = new Point(1445, 1445);
        System.out.println(clonedRectangle1.getCentre());
        System.out.println(rectangle1.getCentre());
        Rectangle clonedRectangle2 = ((Rectangle) rectangle1).clone();
        System.out.println(clonedRectangle2.getCentre());
        clonedRectangle2.moveBy(1000000, 1000000);
        System.out.println(clonedRectangle2.getCentre());
        System.out.println(rectangle1.getCentre());
    }
}