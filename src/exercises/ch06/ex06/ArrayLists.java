package exercises.ch06.ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLists {


    public static <T> void appendExtends(List<T> list1, List<? extends T> list2) {
        list1.addAll(list2);
    }

    public static <T> void appendSuper(List<? super T> list1, List<T> list2) {
        list1.addAll(list2);
    }

    public static void main(String[] args) {
        new ArrayLists().launch();
    }
    private void launch() {
        List<Life> lifes = new ArrayList<>(Arrays.asList(
                new Life("flower"), new Life("tree"), new Life("bush")));
        List<Animal> animals = new ArrayList<>(Arrays.asList(
                new Animal("cat"), new Animal("dog"), new Animal("lizard")));
        List<Mammal> mammals1 = new ArrayList<>(Arrays.asList(
                new Mammal("fox"), new Mammal("beaver"), new Mammal("mongoose")));
        List<Mammal> mammals2 = new ArrayList<>(Arrays.asList(
                new Mammal("baboon"), new Mammal("ocelot"), new Mammal("leopard")));

        System.out.println("lifes: " + lifes.stream().map(Life::toString).collect(Collectors.joining(", ")));
        System.out.println("animals1: " + animals.stream().map(Life::toString).collect(Collectors.joining(", ")));
        System.out.println("mammals1: " + mammals1.stream().map(Life::toString).collect(Collectors.joining(", ")));
        System.out.println("\nappendExtends(animals, mammals1)");
        appendExtends(animals, mammals1);
        System.out.println(animals.stream().map(Life::toString).collect(Collectors.joining(", ")));
        System.out.println("\nappendExtends(mammals1, mammals2)");
        appendExtends(mammals1, mammals2);
        System.out.println(mammals1.stream().map(Life::toString).collect(Collectors.joining(", ")));
        System.out.println("\nappendExtends(lifes, animals);");
        appendExtends(lifes, animals);
        System.out.println(lifes.stream().map(Life::toString).collect(Collectors.joining(", ")));
        System.out.println("\nappendExtends(lifes, mammals1);");
        appendExtends(lifes, mammals1);
        System.out.println(lifes.stream().map(Life::toString).collect(Collectors.joining(", ")));

        lifes = new ArrayList<>(Arrays.asList(
                new Life("flower"), new Life("tree"), new Life("bush")));
        animals = new ArrayList<>(Arrays.asList(
                new Animal("cat"), new Animal("dog"), new Animal("lizard")));
        mammals1 = new ArrayList<>(Arrays.asList(
                new Mammal("fox"), new Mammal("beaver"), new Mammal("mongoose")));
        mammals2 = new ArrayList<>(Arrays.asList(
                new Mammal("baboon"), new Mammal("ocelot"), new Mammal("leopard")));

        System.out.println("\nappendSuper(animals, mammals1)");
        appendSuper(animals, mammals1);
        System.out.println(animals.stream().map(Life::toString).collect(Collectors.joining(", ")));
        System.out.println("\nappendSuper(mammals1, mammals2)");
        appendSuper(mammals1, mammals2);
        System.out.println(mammals1.stream().map(Life::toString).collect(Collectors.joining(", ")));
        System.out.println("\nappendSuper(lifes, animals);");
        appendSuper(lifes, animals);
        System.out.println(lifes.stream().map(Life::toString).collect(Collectors.joining(", ")));
        System.out.println("\nappendSuper(lifes, mammals1);");
        appendSuper(lifes, mammals1);
        System.out.println(lifes.stream().map(Life::toString).collect(Collectors.joining(", ")));
    }
}