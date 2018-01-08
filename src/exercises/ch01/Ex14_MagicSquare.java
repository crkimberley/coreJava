package exercises.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Chris Kimberley
 */
public class Ex14_MagicSquare {
    public static void main(String[] args) {
        new Ex14_MagicSquare().launch();
    }

    private void launch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Magic Square check: enter lines of integers - blank line to finish");
        List<String> lines = new ArrayList<>();
        String line;
        do {
            line = input.nextLine();
            lines.add(line);
        } while (!line.equals(""));
        int size = lines.size() - 1;
        Integer[][] square = new Integer[size][size];
        for (int row = 0; row < size; row++) {
            String[] stringRow = lines.get(row).split(" ");
            for (int column = 0; column < size; column++) {
                square[row][column] = Integer.parseInt(stringRow[column]);
            }
        }
        System.out.println(Arrays.deepToString(square));
        boolean magic = true;
        int sum = 0;
        int diagonal1Sum = 0;
        int diagonal2Sum = 0;
        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for (int j = 0; j < size; j++) {
                if (i == 0) {
                    diagonal1Sum += square[j][j];
                    diagonal2Sum += square[size - 1 - j][j];
                }
                rowSum += square[i][j];
                columnSum += square[j][i];
            }
            if (i == 0) { sum = rowSum; }
            if (rowSum != sum || columnSum != sum || diagonal1Sum != sum || diagonal2Sum != sum) {
                magic = false;
                break;
            }
        }
        System.out.println("Magic Square: " + magic);
    }
}