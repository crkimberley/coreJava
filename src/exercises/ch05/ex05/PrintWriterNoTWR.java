package exercises.ch05.ex05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintWriterNoTWR {
    public static void main(String[] args) {
        new PrintWriterNoTWR().launch();
    }

    private void launch() {
        Scanner in = null;
        PrintWriter out = null;
        try {
            // • Scanner constructor could throw IOException if I/O error occurs opening source
            // • Paths.get could throw InvalidPathException if path string can't be converted to a Path
            in = new Scanner(Paths.get("alice.txt"));
            // • PrintWriter constructor could throw FileNotFoundException
            out = new PrintWriter("output.txt");
            // Scanner hasNext would only throw IllegalStateException if scanner was closed
            while (in.hasNext()) {
                // Scanner next would only throw IllegalStateException if scanner was closed
                // Scanner next would only throw NoSuchElementException if no more tokens available
                // PrintWriter println doesn't throw exceptions
                out.println(in.next().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File or Path problem");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // PrintWriter close doesn't throw exceptions
            // ...but NullPointerException possible if already closed
            if (out != null) out.close();
            // Scanner close doesn't throw exceptions
            // ...but NullPointerException possible if already closed
            if (in != null) in.close();
        }
    }
}