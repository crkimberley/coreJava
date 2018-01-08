package exercises.ch03;

import exercises.ch03.ex07.Shuffle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Chris Kimberley
 */
public class ShuffleTest {
    ArrayList<String> strings1 =
            new ArrayList<String>(Arrays.asList
            ("xavier", "yoghurt", "lotion", "orange", "peanut", "haggis", "onion", "nougat", "egg"));

    ArrayList<String> strings2 =
            new ArrayList<String>(Arrays.asList("angela", "bonnie", "claire", "debbie", "ella"));

    @Test
    void shuffleTest() {
        Shuffle.luckySort(strings1, String::compareToIgnoreCase);
        Shuffle.luckySort(strings2, String::compareToIgnoreCase);
        Shuffle.luckySort(strings1, Comparator.comparingInt(String::length));
        Shuffle.luckySort(strings2, Comparator.comparingInt(String::length));
    }
}
