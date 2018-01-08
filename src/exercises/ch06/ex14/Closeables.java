package exercises.ch06.ex14;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Closeables {
    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Throwable {
        List<Exception> exceptions = new ArrayList<>();
        int elementCounter = 0;
        for (T elem : elems) {
            try {
                elem.close();
                elementCounter++;
                // Throwing exception to test method
                throw new Exception("exception after closing element " + elementCounter);
            } catch (Exception ex){
                exceptions.add(ex);
            }
        }
        if (!exceptions.isEmpty()) {
            Throwable chainedException = exceptions.get(0);
            for (int i = 1; i < exceptions.size(); i++) {
                chainedException = exceptions.get(i).initCause(chainedException);
            }
            throw chainedException;
        }
    }

    public static void main(String[] args) {
        new Closeables().launch();
    }

    private void launch() {
        try {
            closeAll(new ArrayList<AutoCloseable>(Arrays.asList(
                    new PrintStream("tmp1"),
                    new PrintStream("tmp2"),
                    new PrintStream("tmp3"))));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}