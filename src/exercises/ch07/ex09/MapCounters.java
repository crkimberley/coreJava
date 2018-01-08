package exercises.ch07.ex09;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCounters {

    public static void counterMerge(String file) throws IOException {
        String WORD_REGEXP = "[^A-Za-z'-]+";
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(Paths.get(file)).useDelimiter(WORD_REGEXP);
        while (in.hasNext()) {
            map.merge(in.next().toLowerCase(), 1, Integer::sum);
        }
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void counterContains(String file) throws IOException {
        String WORD_REGEXP = "[^A-Za-z'-]+";
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(Paths.get(file)).useDelimiter(WORD_REGEXP);
        while (in.hasNext()) {
            String word = in.next();
            map.put(word, map.containsKey(word) ? map.get(word) + 1 : 1);
        }
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void counterGetAndNullCheck(String file) throws IOException {
        String WORD_REGEXP = "[^A-Za-z'-]+";
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(Paths.get(file)).useDelimiter(WORD_REGEXP);
        while (in.hasNext()) {
            String word = in.next();
            Integer oldCount = map.get(word);
            map.put(word, oldCount != null ? oldCount + 1 : 1);
        }
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void counterGetOrDefault(String file) throws IOException {
        String WORD_REGEXP = "[^A-Za-z'-]+";
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(Paths.get(file)).useDelimiter(WORD_REGEXP);
        while (in.hasNext()) {
            String word = in.next();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void counterPutIfAbsent(String file) throws IOException {
        String WORD_REGEXP = "[^A-Za-z'-]+";
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(Paths.get(file)).useDelimiter(WORD_REGEXP);
        while (in.hasNext()) {
            String word = in.next();
            Integer oldCount = map.putIfAbsent(word, 1);
            if (oldCount != null) map.put(word, oldCount + 1);
        }
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void main(String[] args) throws IOException {
        //counterMerge("alice.txt");
        //counterContains("alice.txt");
        //counterGetAndNullCheck("alice.txt");
        //counterGetOrDefault("alice.txt");
        counterPutIfAbsent("alice.txt");
    }
}