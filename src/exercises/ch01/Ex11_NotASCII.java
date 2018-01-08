package exercises.ch01;

import java.util.Scanner;

/**
 * @author Chris Kimberley
 */
public class Ex11_NotASCII {
    public static void main(String[] args) {
        new Ex11_NotASCII().launch();
    }

    private void launch() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        for (int i = 0; i < text.length(); i++) {
            int code = Character.codePointAt(text, i);
            if (code > 127) {
                System.out.println(String.format("U+%04x", code));
            }
        }
    }
}