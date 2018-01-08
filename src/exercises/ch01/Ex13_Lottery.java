package exercises.ch01;

import java.util.*;

/**
 * @author Chris Kimberley
 */
public class Ex13_Lottery {
    public static void main(String[] args) {
        new Ex13_Lottery().launch();
    }
    
    private void launch() {
        Random generator = new Random();
        int[] combination = new int[6];
        for (int c = 0; c< 100; c++) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 49; i++) {
                numbers.add(i, i + 1);
            }
            for (int i = 0; i < 6; i++) {
                combination[i] = numbers.remove(generator.nextInt(numbers.size()));
            }
            Arrays.sort(combination);
            for (int value : combination) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}