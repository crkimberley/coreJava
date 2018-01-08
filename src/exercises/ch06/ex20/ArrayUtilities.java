package exercises.ch06.ex20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayUtilities {

    @SafeVarargs public static final <T> T[] repeat(int m, T... objs) {
        @SuppressWarnings("unchecked") T[] repeatArray = (T[]) Array.newInstance(objs.getClass().getComponentType(), objs.length * m);
        for (int i = 0; i < repeatArray.length; i++) {
            repeatArray[i] = objs[i % objs.length];
        }
        return repeatArray;
    }

    @SuppressWarnings("unchecked")
    @SafeVarargs public static final <T> T[] construct(int capacity, T... dummy) {
        return (T[]) Array.newInstance(dummy.getClass().getComponentType(), capacity);
    }

    public static void main(String[] args) {
        new ArrayUtilities().launch();
    }

    private void launch() {
        String[] repeatArray1 = repeat(5, "alf", "bert", "charlie");
        for (String string : repeatArray1) {
            System.out.println(string);
        }
        System.out.println();
        Integer[] repeatArray2 = repeat(5, 7, 11, 13, 17, 33);
        for (Integer integer : repeatArray2) {
            System.out.println(integer);
        }
        System.out.println();
        List<String>[] result = ArrayUtilities.construct(3);
        result[0] = Arrays.asList("cog", "cat", "cart");
        result[1] = Arrays.asList("hog", "hat", "hart");
        result[2] = Arrays.asList("tog", "tat", "tart");
        Arrays.asList(result).forEach(System.out::println);
    }
}