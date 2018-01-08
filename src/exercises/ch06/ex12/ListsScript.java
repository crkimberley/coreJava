package exercises.ch06.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListsScript {
    public static void main(String[] args) {
        new ListsScript().launch();
    }

    private void launch() {
        ArrayList<String> strings = new ArrayList<>
                (Arrays.asList("alison", "beth", "claire", "debbie", "elizabeth", "fiona"));
        List<? super String> results = new ArrayList<>();
        Lists.minmax(strings, Comparator.comparingInt(String::length), results);
        results.forEach(System.out::println);
    }
}