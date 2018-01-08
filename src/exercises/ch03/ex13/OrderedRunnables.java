package exercises.ch03.ex13;

/**
 * @author Chris Kimberley
 */
public class OrderedRunnables {

    public static Runnable orderedRuns(Runnable... runs) {
        return () -> {
            for (Runnable r : runs) {
                r.run();
            }
        };
    }

    public static void main(String[] args) {
        OrderedRunnables.orderedRuns(
                () -> System.out.println("Alison"),
                () -> System.out.println("Beth"),
                () -> System.out.println("Claire"),
                () -> System.out.println("Fiona"),
                () -> System.out.println("Nina"),
                () -> System.out.println("Winona")).run();
    }
}