package exercises.ch05.ex10;


import java.util.Arrays;

public class FactorialStackPrint {

    public long factorial(int n) {
        Arrays.stream(new Exception().getStackTrace()).forEach(System.out::println);
        System.out.println();
        return n == 1 ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        new FactorialStackPrint().launch();
    }

    private void launch() {
        System.out.println(factorial(10));
    }
}