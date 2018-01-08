package exercises.ch03.ex01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Chris Kimberley
 */
public class MeasurableUtilities {

    public static double average(Measurable[] objects) {
        return Arrays.stream(objects)
                .mapToDouble(Measurable::getMeasure)
                .average()
                .getAsDouble();
    }

    public static Measurable largest(Measurable[] objects) {
        return Arrays.stream(objects).max(Comparator.comparingDouble(Measurable::getMeasure)).get();
    }
}