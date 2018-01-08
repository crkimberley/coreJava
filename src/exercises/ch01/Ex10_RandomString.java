package exercises.ch01;

import java.util.Random;

/**
 * @author Chris Kimberley
 */
public class Ex10_RandomString {
    public static void main(String[] args) {
        new Ex10_RandomString().launch();
    }

    private void launch() {
        Random generator = new Random();
        for (int i = 0; i < 20; i++) {
            long randomLong = generator.nextLong();
            System.out.println(Long.toUnsignedString(randomLong, 36));
        }
    }
}