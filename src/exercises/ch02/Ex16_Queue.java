package exercises.ch02;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Chris Kimberley
 */
public class Ex16_Queue implements Iterable {
    private Node head = null;

    public void add(String text) {
        if (head == null) {
            head = new Node(text);
            head.next = null;
        } else {
            add(text, head);
        }
    }

    public void add(String text, Node node) {
        if (node.next == null) {
            node.next = new Node(text);
            node.next.next = null;
        } else {
            add(text, node.next);
        }
    }

    public String remove() {
        if (head == null) {
            return "";
        }
        String removedHeadText = head.text;
        head = head.next;
        return removedHeadText;
    }

    public MyIterator iterator() {
        return new MyIterator();
    }

    private class Node {
        String text;
        Node next;

        Node(String text) {
            this.text = text;
        }
    }

    public class MyIterator implements Iterator {
        Node position = head;

        public boolean hasNext() {
            return position != null;
        }

        public String next() {
            if (position != null) {
                Node currentPosition = position;
                position = position.next;
                return currentPosition.text;
            }
            throw new NoSuchElementException();
        }
    }
}