package exercises.ch06.ex12;

import java.util.Comparator;
import java.util.List;

public class Lists {
    public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
        result.add(elements.stream().min(comp).orElse(null));
        result.add(elements.stream().max(comp).orElse(null));
    }
}