package exercises.ch01;

/**
 * @author Chris Kimberley
 */
public class Ex16_Average {
    public static double average(double first, double... values) {
        double sum = first;
        for (double value : values) {
            sum += value;
        }
        return sum / (values.length + 1);
    }
}