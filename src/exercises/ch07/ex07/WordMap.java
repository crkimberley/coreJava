package exercises.ch07.ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordMap {

    public static void wordCount(String file) throws IOException {
        String WORD_REGEXP = "[^A-Za-z'-]+";
        //Map<String, Integer> map = new TreeMap<>();
        /*Scanner in = new Scanner(Paths.get(file)).useDelimiter(WORD_REGEXP);
        while (in.hasNext()) {
            map.merge(in.next().toLowerCase(), 1, Integer::sum);
        }*/
        Map<String, Integer> map;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(file))) {
            map = reader.lines().flatMap(line -> Stream.of(line.split(WORD_REGEXP)))
                    .collect(Collectors.toMap(String::toLowerCase, count -> 1, Integer::sum, TreeMap::new));
        }
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void wordLineNumbers(String file) throws IOException {
        String WORD_REGEXP = "[^A-Za-z'-]+";
        List<String> lines;
        Map<String, Set<Integer>> map = new HashMap<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(file))) {
            lines = reader.lines().collect(Collectors.toList());
        }
        for (int lineNo = 0; lineNo < lines.size(); lineNo++) {
            for (String string : lines.get(lineNo).split(WORD_REGEXP)) {
                map.merge(string, new HashSet<>(Collections.singleton(lineNo)), (x, y) -> {
                    x.addAll(y);
                    return x;
                });
            }
        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + ": " + entry.getValue()
                        .stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(", ")))
                .forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        //wordCount("alice.txt");
        wordLineNumbers("alice.txt");
    }
}