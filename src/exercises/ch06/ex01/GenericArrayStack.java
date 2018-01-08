package exercises.ch06.ex01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericArrayStack<E> {
    private final static int INITIAL_ARRAY_LENGTH = 5;
    private E[] array;
    private int size;

    @SuppressWarnings("unchecked") public GenericArrayStack(Class<E> eClass) {
        array = (E[]) Array.newInstance(eClass, INITIAL_ARRAY_LENGTH);
        size = 0;
    }

    public E push(E item) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = item;
        size++;
        return item;
    }

    @SuppressWarnings("unchecked") public E pop() {
        if (size == 0) throw new EmptyStackException();
        size--;
        return (E) array[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}