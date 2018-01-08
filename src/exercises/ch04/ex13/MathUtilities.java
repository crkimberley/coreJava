package exercises.ch04.ex13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.DoubleFunction;

/**
 * @author Chris Kimberley
 */
public class MathUtilities {

    public static void printTableOfValues(Method method, double lowerBound,
                                          double upperBound, double stepSize) {
        for (double i = lowerBound; i <= upperBound; i += stepSize) {
            try {
                System.out.printf("%6.1f\t%-12s\n", i, method.invoke(null, i).toString());
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printTableOfValues(DoubleFunction<Object> method, double lowerBound,
                                          double upperBound, double stepSize) {
        for (double i = lowerBound; i <= upperBound; i += stepSize) {
            System.out.printf("%6.1f\t%-12s\n", i, method.apply(i).toString());
        }
    }

    public static void main(String[] args) {
        new MathUtilities().launch();
    }

    private void launch() {
        Method sqrt = null;
        Method toHexString = null;
        Method sin = null;
        try {
            sqrt = Math.class.getDeclaredMethod("sqrt", double.class);
            toHexString = Double.class.getDeclaredMethod("toHexString", double.class);
            sin = Math.class.getDeclaredMethod("sin", double.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("\nUSING REFLECTION\n");
        printTableOfValues(sqrt,1.0, 20.0, 1.0);
        System.out.println();
        printTableOfValues(toHexString,0.0, 100.0, 10.0);
        System.out.println();
        printTableOfValues(sin, Math.toRadians(1.0), Math.toRadians(90.0), Math.toRadians(1.0));

        System.out.println("\nUSING DOUBLE FUNCTION\n");
        printTableOfValues(Math::sqrt, 1.0, 20.0, 1.0);
        System.out.println();
        printTableOfValues(Double::toHexString, 0.0, 100.0, 10.0);
    }
}
