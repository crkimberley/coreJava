package exercises.ch07.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class UpperCase {

    public static ArrayList<String> upperCaseIterator(ArrayList<String> strings) {
        ListIterator<String> listIterator = strings.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set(listIterator.next().toUpperCase());
        }
        return strings;
    }

    public static ArrayList<String> indexLoop(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, strings.get(i).toUpperCase());
        }
        return strings;
    }

    public static ArrayList<String> replaceAllMethod(ArrayList<String> strings) {
        strings.replaceAll(String::toUpperCase);
        return strings;
    }

    public static void main(String[] args) {
        new UpperCase().launch();
    }

    private void launch() {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("andy", "beth", "claire", "debbie", "ed", "fiona"));
        strings.forEach(System.out::println);
        upperCaseIterator(strings).forEach(System.out::println);

        strings = new ArrayList<>(Arrays.asList("andy", "beth", "claire", "debbie", "ed", "fiona"));
        strings.forEach(System.out::println);
        indexLoop(strings).forEach(System.out::println);

        strings = new ArrayList<>(Arrays.asList("andy", "beth", "claire", "debbie", "ed", "fiona"));
        strings.forEach(System.out::println);
        replaceAllMethod(strings).forEach(System.out::println);
    }
}