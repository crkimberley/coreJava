package exercises.ch01;

/**
 * @author Chris Kimberley
 */
public class Ex9_UnequalStrings {
    public static void main(String[] args) {
        new Ex9_UnequalStrings().launch();
    }

    private void launch() {
        String hatstand = "hatstand";
        String hat = "hat";
        String stand = "stand";
        System.out.println("hatstand == hat + stand: " + (hatstand == hat + stand));
        System.out.println("hatstand.equals(hat + stand): " + hatstand.equals(hat + stand));
    }
}