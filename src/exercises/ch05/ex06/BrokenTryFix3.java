package exercises.ch05.ex06;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BrokenTryFix3 {

    public void brokenTry() {
        Path path = Paths.get("alice.txt");
        String line;
        try(BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8);) {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }
}