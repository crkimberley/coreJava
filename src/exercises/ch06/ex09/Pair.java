package exercises.ch06.ex09;

import java.util.StringJoiner;

public class Pair<E> {
    private E elementA;
    private E elementB;

    public Pair(E elementA, E elementB) {
        this.elementA = elementA;
        this.elementB = elementB;
    }

    public E getElementA() { return elementA; }

    public E getElementB() { return elementB; }

    public String toString() {
        return (new StringJoiner(", ","[","]")
                .add(elementA.toString()).add(elementB.toString())).toString();
    }
}