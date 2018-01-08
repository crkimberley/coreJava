package exercises.ch06.ex05;

public class Arrays {

    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }

    public static void main(String[] args) {
        new Arrays().launch();
    }

    private void launch() {
        Number[] result = Arrays.swap(0, 1, 1.5, 2, 3);
        java.util.Arrays.asList(result).forEach(System.out::println);
    }
}
