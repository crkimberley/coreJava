package exercises.ch06.ex09;

import java.util.ArrayList;
import java.util.Comparator;

public class Arrays {

    public static <E> Pair<E> firstLast(ArrayList<? extends E> a) {
        return new Pair<E>(a.get(0), a.get(a.size() - 1));
    }

    public static <E extends Comparable<? super E>> E min(ArrayList<E> arrayList) {
        return arrayList.stream().min(Comparator.naturalOrder()).orElse(null);
    }

    public static <E extends Comparable<? super E>> E max(ArrayList<E> arrayList) {
        return arrayList.stream().max(Comparator.naturalOrder()).orElse(null);
    }

    public static <E extends Comparable<? super E>> Pair<E> minMax(ArrayList<E> arrayList) {
        return new Pair<E>(min(arrayList), max(arrayList));
    }
}