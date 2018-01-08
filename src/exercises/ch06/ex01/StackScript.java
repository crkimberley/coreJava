package exercises.ch06.ex01;

import java.util.Arrays;
import java.util.List;

public class StackScript {
    public static void main(String[] args) {
        new StackScript().launch();
    }

    private void launch() {
        List<String> strings = Arrays.asList("amy", "beth", "claire", "debbie", "ella", "fiona");

        System.out.println("LIST STACK");
        ListStack<String> stringStack1 = new ListStack<>();
        strings.forEach(stringStack1::push);
        while (!stringStack1.isEmpty()) System.out.println(stringStack1.pop());

        System.out.println();

        System.out.println("OBJECT ARRAY STACK");
        ObjectArrayStack<String> stringStack2 = new ObjectArrayStack<>();
        strings.forEach(stringStack2::push);
        while (!stringStack2.isEmpty()) System.out.println(stringStack2.pop());

        System.out.println();

        System.out.println("GENERIC ARRAY STACK");
        GenericArrayStack<String> stringStack3 = new GenericArrayStack<>(String.class);
        strings.forEach(stringStack3::push);
        while (!stringStack3.isEmpty()) System.out.println(stringStack3.pop());

        System.out.println();

        System.out.println("GENERIC ARRAY STACK VARARGS");
        GenericArrayStackVarargs<String> stringStack4 = new GenericArrayStackVarargs<>();
        strings.forEach(stringStack4::push);
        while (!stringStack4.isEmpty()) System.out.println(stringStack4.pop());
    }
}