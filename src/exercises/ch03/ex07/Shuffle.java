package exercises.ch03.ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Chris Kimberley
 */
public class Shuffle {

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        boolean sorted;
        int counter = 0;
        while (true) {
            sorted = true;
            for (int i = 0; i < strings.size() - 1 && sorted; i++) {
                if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) sorted = false;
            }
            if (sorted) break;
            Collections.shuffle(strings);
            counter++;
        }
        System.out.println(strings);
        System.out.println("Shuffle counter: " + counter);
    }
}