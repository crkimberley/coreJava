package exercises.ch05.ex06;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BrokenTryFix1 {

    public void brokenTry() {
        BufferedReader in = null;
        Path path = Paths.get("alice.txt");
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            if (in != null) try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}