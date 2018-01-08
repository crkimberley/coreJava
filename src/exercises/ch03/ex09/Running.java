package exercises.ch03.ex09;

/**
 * @author Chris Kimberley
 */
public class Running {

    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks) { new Thread(task).start(); }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) { task.run(); }
    }

    public static void main(String[] args) {
        runTogether(() -> System.out.println("Together Hey!"),
                () -> System.out.println("Together Ho!"),
                () -> System.out.println("Together There!"));

        runInOrder(() -> System.out.println("InOrder Hey!"),
                () -> System.out.println("InOrder Ho!"),
                () -> System.out.println("InOrder There!"));
    }
}
