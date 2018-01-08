package exercises.ch07.ex05;

import java.util.*;

import static java.lang.Math.*;

public class ListSwap {

    public static void swap(List<?> list, int i, int j) {
        if (list instanceof RandomAccess) {
            swapHelper(list, i, j);
        } else {
            System.out.println("Non Random Access");
            swapHelperNonRandomAccess(list, i, j);
        }
    }

    private static <T> void swapHelper(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private static <T> void swapHelperNonRandomAccess(List<T> list, int i, int j) {
        ListIterator<T> iterator = list.listIterator(min(i, j));
        int noOfIterations = abs(j - i);
        T firstValue = iterator.next();
        for (int k = 0; k < noOfIterations; k++) { iterator.next(); }
        T secondValue = iterator.previous();
        iterator.set(firstValue);
        for (int k = 0; k < noOfIterations; k++) { iterator.previous(); }
        iterator.set(secondValue);
    }

    @SuppressWarnings("unchecked")
    private static void swapJavaSource(List<?> list, int i, int j) {
        ((List) list).set(i, ((List) list).set(j, ((List) list).get(i)));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        swap(list, 0, 4);
        list.forEach(System.out::print);
        System.out.println();
        list = new LinkedList<>(Arrays.asList(0, 1, 2, 3, 4));
        swapJavaSource(list, 0, 4);
        list.forEach(System.out::print);
        System.out.println();
        list = new LinkedList<>(Arrays.asList(0, 1, 2, 3, 4));
        swap(list, 0, 4);
        list.forEach(System.out::print);
    }
}