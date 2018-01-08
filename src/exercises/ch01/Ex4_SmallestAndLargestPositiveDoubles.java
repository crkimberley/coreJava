package exercises.ch01;

/**
 * @author Chris Kimberley
 */
public class Ex4_SmallestAndLargestPositiveDoubles {
    public static void smallestAndLargest() {
        double smallest = Math.nextUp(0.0);
        double largest = Math.nextDown(Double.POSITIVE_INFINITY);
        System.out.println("smallest = " + smallest + " largest = " + largest);
    }
}