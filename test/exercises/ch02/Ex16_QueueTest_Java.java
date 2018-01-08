package exercises.ch02;

import exercises.ch02.Ex16_Queue.*;

/**
 * @author Chris Kimberley
 */
public class Ex16_QueueTest_Java {
    public static void main(String[] args) {
        Ex16_Queue queue = new Ex16_Queue();
        queue.add("anita");
        queue.add("beth");
        queue.add("claire");
        queue.add("debbie");
        MyIterator iter = queue.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        for (Object s : queue) {
            System.out.println(s);
        }
    }
}
