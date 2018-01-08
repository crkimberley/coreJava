package exercises.ch01;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Chris Kimberley
 */
public class Ex8_AllSubstrings {
    public static void main(String[] args) {
        new Ex8_AllSubstrings().launch();
    }

    private void launch() {
        System.out.print("Enter text: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Collection<String> subs = new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j <= text.length(); j++) {
                subs.add(text.substring(i, j));
            }
            subs.add("\n");
        }
        System.out.println(subs);
    }
}