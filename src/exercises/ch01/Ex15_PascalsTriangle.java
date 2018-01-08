package exercises.ch01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Kimberley
 */
public class Ex15_PascalsTriangle {
    List<List<Integer>> triangle;

    public Ex15_PascalsTriangle(int n) {
        triangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            triangle.add(row);
            for (int j = 1; j < i; j++) {
                triangle.get(i).add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            if (i > 0) row.add(1);
        }
    }

    public void printTriangle() {
        for (List<Integer> row : triangle) {
            for (int value : row) {
                System.out.printf("\t%5d", value);
            }
            System.out.println();
        }
    }
}