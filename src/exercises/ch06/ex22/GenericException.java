package exercises.ch06.ex22;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class GenericException {

    public static <V, T extends Throwable> V doWork(Callable<V> c, Supplier<T> exceptionSupplier) throws Throwable {
        Throwable suppliedException = exceptionSupplier.get();
        try {
            int[] ints = new int[3];
            // FOR TESTING - uncomment following line to throw an example exception
            //System.out.println(ints[5]);
            return c.call();
        } catch (Throwable ex) {
            suppliedException.initCause(ex);
            throw suppliedException;
        }
    }

    public static void main(String[] args) throws Throwable {
        new GenericException().launch();
    }

    private void launch() throws Throwable {
        System.out.println(doWork(() -> "RETURNED CALL STRING", Exception::new));
    }
}