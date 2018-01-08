package exercises.ch05.ex06;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BrokenTryFix2 {

    public void brokenTry() {
        BufferedReader in = null;
        Path path = Paths.get("alice.txt");
        try {
            try {
                in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }
            } finally {
                if (in != null) in.close();
            }
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }
}