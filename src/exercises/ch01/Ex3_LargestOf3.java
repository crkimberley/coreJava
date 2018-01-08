package exercises.ch01;

public class Ex3_LargestOf3 {
    public static void max(int int1, int int2, int int3) {
        int largestOf2 = int1 > int2 ? int1 : int2;
        int largestOf3 = largestOf2 > int3 ? largestOf2 : int3;
        System.out.println(largestOf3);
        System.out.println(mathMax(int1, int2, int3));
    }

    public static int mathMax(int int1, int int2, int int3) {
        return Math.max(Math.max(int1, int2), int3);
    }
}