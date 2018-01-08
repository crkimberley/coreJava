package exercises.ch01;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * @author Chris Kimberley
 */
public class Ex7_TwoShorts {
    public static void main(String[] args) {
        new Ex7_TwoShorts().launch();
    }

    private void launch() {
        final int BIAS = 32768;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers, each betweeb 0 & 65535: ");
        short number1 = (short) (input.nextInt() - BIAS);
        short number2 = (short) (input.nextInt() - BIAS);
        System.out.println("Sum = " + (number1 + number2 + 2 * BIAS));
        System.out.println("Difference = " + abs(number1 - number2));
        System.out.println("Product = " + ((number1 + BIAS) * (number2 + BIAS)));
        System.out.println("Quotient = " +
                ((number2 + BIAS) != 0 ? ((number1 + BIAS) / (number2 + BIAS)) : "CAN'T DIVIDE BY ZERO"));
        System.out.println("Remainder = " +
                ((number2 + BIAS) != 0 ? ((number1 + BIAS) % (number2 + BIAS)) : "CAN'T DIVIDE BY ZERO"));
    }
}
