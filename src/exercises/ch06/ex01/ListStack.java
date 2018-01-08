package exercises.ch06.ex01;

import java.util.ArrayList;
import java.util.List;

public class ListStack<E> {
    List<E> list = new ArrayList<E>();

    public E push(E item) {
        list.add(0, item);
        return item;
    }

    public E pop() {
        return list.remove(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}