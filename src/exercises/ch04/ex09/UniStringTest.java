package exercises.ch04.ex09;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static exercises.ch04.ex09.UniversalToString.*;
import static java.util.stream.Collectors.joining;

public class UniStringTest {
    public static void main (String[] args) throws IllegalAccessException {
        new UniStringTest().launch();
    }

    private void launch() throws IllegalAccessException {
        List<Object> objects = new ArrayList<>();

        objects.add(1234);
        objects.add(12.34);
        objects.add("piglets");
        objects.add(new int[] {1, 2, 3});
        objects.add(new double[] {1.1, 2.2, 3.3});
        objects.add(false);
        objects.add(new Rectangle(new Point(40, 60), 10, 20));
        objects.add(new Circle(new Point(40, 60), 7));
        objects.add(new Employee("Fred", 40000));
        objects.add(new Line(new Point(10, 12), new Point(100, 102)));
        objects.add(new PointX(100, 200));
        List<String> strings = new ArrayList<String>();
        strings.addAll(Arrays.asList("donkeys", "sausages"));
        objects.add(strings);

        objects.stream().forEach(o -> System.out.println(uniToString(o)));

        //System.out.println("\n" + ArrayLists.stream(java.lang.String.class.getDeclaredFields()).map(o -> o.getName()).collect(joining(" ")));
    }
}