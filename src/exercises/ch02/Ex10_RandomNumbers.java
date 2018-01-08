package exercises.ch02;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Chris Kimberley
 */
public class Ex10_RandomNumbers {
    private static Random generator = new Random();

    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }

    public static int randomElement(int[] intArray) {
        return intArray.length == 0 ? 0 : intArray[nextInt(0, intArray.length -1)];
    }

    public static int randomElement(ArrayList<Integer> intArrayList) {
        return intArrayList.isEmpty() ? 0 : intArrayList.get(nextInt(0, intArrayList.size() -1));
    }
}
