package exercises.ch04.ex09;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class UniversalToString {

    public static String uniToString(Object o) {
        Collection<String> resultStrings = new ArrayList<String>();
        uniToString(o, new HashSet<Object>(), resultStrings);
        return resultStrings.stream().collect(joining());
    }

    private static void uniToString(Object object, Set<Object> identitySet, Collection<String> resultStrings) {
        identitySet.add(object);
        Class oClass = object.getClass();
        if (isPrimitiveEtc(object)) resultStrings.add(object + "");
        else if (oClass.isArray()) {
            resultStrings.add("{");
            for (int i = 0; i < Array.getLength(object); i++) {
                if (i > 0) resultStrings.add(", ");
                Object arrayElement = Array.get(object, i);
                if (arrayElement != null)
                    processIfNotCyclic(arrayElement, identitySet, resultStrings);
            }
            resultStrings.add("}");
        } else {
            for (Class superclass : reverseSuperClasses(oClass)) {
                for (Field field : superclass.getDeclaredFields()) {
                    if (field == null) continue;
                    field.setAccessible(true);
                    resultStrings.add("\n" + field.getName() + ": ");
                    try {
                        processIfNotCyclic(field.get(object), identitySet, resultStrings);
                    } catch (IllegalAccessException ex) {
                        ex.printStackTrace();
                    }
                    resultStrings.add(" ");
                }
            }
        }
    }

    private static boolean isPrimitiveEtc(Object object) {
        return (object.getClass().isPrimitive()
                || object.getClass() == java.lang.String.class
                || object.getClass() == java.lang.Character.class
                || object.getClass() == java.lang.Integer.class
                || object.getClass() == java.lang.Long.class
                || object.getClass() == java.lang.Double.class
                || object.getClass() == java.lang.Boolean.class);
    }

    private static List<Class> reverseSuperClasses(Class c) {
        List<Class> classes = new ArrayList<>();
        do {
            classes.add(c);
            c = c.getSuperclass();
        } while (c != null);
        Collections.reverse(classes);
        return classes;
    }

    private static void processIfNotCyclic(Object o, Set<Object> identitySet, Collection<String> resultStrings) {
        if (!identitySet.contains(o)) uniToString(o, identitySet, resultStrings);
        else resultStrings.add(o.getClass().getSimpleName());
    }
}