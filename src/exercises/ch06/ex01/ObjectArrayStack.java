package exercises.ch06.ex01;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ObjectArrayStack<E> {
    private final static int INITIAL_ARRAY_SIZE = 5;
    private Object[] array;
    private int size;

    public ObjectArrayStack() {
        array = new Object[INITIAL_ARRAY_SIZE];
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