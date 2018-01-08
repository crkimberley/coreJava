package exercises.ch05.ex01;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.util.Arrays.asList;

public class Values {

    public ArrayList<Double> readValues(String filename) throws IOException {
        ArrayList<Double> doubles = new ArrayList<>();
        Path path = Paths.get(filename);
        Scanner in = new Scanner(path, "UTF-8");
        while (in.hasNext()) {
            //if (!in.hasNextDouble()) throw new InputMismatchException("Found a non-double in the file");
            // Replacing exception with error value -1 for CoreJava exercise
            if (!in.hasNextDouble()) return new ArrayList<>(Collections.singletonList(-1.0));
            doubles.add(in.nextDouble());
        }
        in.close();
        return doubles;
    }

    public double sumOfValues(String filename) throws IOException {
        return readValues(filename).stream().mapToDouble(x -> x).sum();
    }

    public static void main(String[] args) {
        new Values().launch();
    }

    private void launch() {
        try {
            System.out.println(readValues("numbers.txt"));
            System.out.println(sumOfValues("numbers.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}