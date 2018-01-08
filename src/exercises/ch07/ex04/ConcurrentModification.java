package exercises.ch07.ex04;

import ch06.sec06.Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModification {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(6, 3, 4, 5, 7, 8, 9));
        Iterator<Integer> iterator1 = integers.iterator();
        Iterator<Integer> iterator2 = integers.iterator();

        int count = 0;
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
            if (count == 0) iterator1.remove();
            count++;
        }

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
     }
}
