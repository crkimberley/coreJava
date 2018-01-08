package exercises.ch06.ex03;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TableScript {
    public static void main(String[] args) {
        new TableScript().launch();
    }

    private void launch() {
        Table<String, String> table = new Table<>();
        
        table.put("apple", "green");
        table.put("carrot", "orange");
        table.put("banana", "yellow");
        table.put("grape", "red");
        table.put("sweetcorn", "yellow");
        table.put("blueberry", "blue");
        table.put("cucumber", "green");
        table.put("pepper", "red");
        
        List<String> fruits1 = Arrays.asList("apple", "banana", "grape", "blueberry");
        List<String> vegetables = Arrays.asList("carrot", "sweetcorn", "cucumber", "pepper");

        System.out.println("\nFRUIT COLOURS");
        fruits1.forEach(key -> System.out.println(table.get(key)));

        System.out.println("\nVEGETABLE COLOURS");
        vegetables.forEach(key -> System.out.println(table.get(key)));

        System.out.println("\nFRUIT COLOURS with added cherry");
        List<String> fruits2 = Stream.concat(fruits1.stream(), Stream.of("cherry"))
                .collect(Collectors.toList());
        table.put("cherry", "purple");
        fruits2.forEach(key -> System.out.println(table.get(key)));

        System.out.println("\nFRUIT COLOURS with cherry colour changed to black");
        table.put("cherry", "black");
        fruits2.forEach(key -> System.out.println(table.get(key)));

        System.out.println("\nVEGETABLE COLOURS with cucumber removed");
        table.remove("cucumber");
        vegetables.stream().map(table::get).filter(Objects::nonNull).forEach(System.out::println);

        System.out.println("\nVEGETABLE COLOURS...pepper removed");
        table.remove("pepper");
        vegetables.stream().map(table::get).filter(Objects::nonNull).forEach(System.out::println);

        System.out.println("\nVEGETABLE COLOURS...sweetcorn removed");
        table.remove("sweetcorn");
        vegetables.stream().map(table::get).filter(Objects::nonNull).forEach(System.out::println);

        System.out.println("\nVEGETABLE COLOURS with carrot removed");
        table.remove("carrot");
        vegetables.stream().map(table::get).filter(Objects::nonNull).forEach(System.out::println);

        System.out.println("\nVEGETABLE COLOURS with carrot removed - AGAIN!");
        table.remove("carrot");
        vegetables.stream().map(table::get).filter(Objects::nonNull).forEach(System.out::println);
    }
}