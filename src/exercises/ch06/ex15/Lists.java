package exercises.ch06.ex15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lists {

    public static <T,R> ArrayList<R> map(ArrayList<T> listOfT, Function<T, R> function) {
        return listOfT.stream().map(function).collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) {
        new Lists().launch();
    }

    private void launch() {
        map(new ArrayList<String>(Arrays.asList("amy", "beth", "claire", "delilah")), String::length)
                .forEach(System.out::println);
    }
}