package exercises.ch01;

import java.util.Scanner;

public class Ex1_BinOctHex {

    public static void intToBinaryOctalHex() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter integer: ");
            int number = input.nextInt();
            String binaryResult = Integer.toBinaryString(number);
            String octalResult = Integer.toOctalString(number);
            String hexresult = Integer.toHexString(number);
            System.out.println("Binary: " + binaryResult + " • Octal: " + octalResult + " • Hex: " + hexresult);

            double reciprocal = 1.0 / number;
            System.out.println("Reciprocal (hex, floating point): " + Double.toHexString(reciprocal));
        } while (input.hasNextInt());
    }
}