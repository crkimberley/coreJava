package exercises.ch05.ex12;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class AssertMin {

    public int min(int[] values) {
        int min = Arrays.stream(values).min().getAsInt();
        assert Arrays.stream(values).allMatch(n -> min <= n);
        return min;
    }

    public static void main(String[] args) {
        new AssertMin().launch();
    }

    private void launch() {
        final int ARRAY_SIZE = 200000000;
        int[] valuesX = {13, 2956, 5456, 654, 25, 34, 1254, 65, 9, 145, 7, 2534, 968};
        System.out.println(min(valuesX) + "\n");

        Random random = new Random();
        int offset = random.nextInt(100);
        int[] values = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            values[i] = random.nextInt(1000) + offset;
        }
        System.out.println("START");
        Instant start = Instant.now();
        System.out.println(min(values));
        Instant end = Instant.now();
        System.out.println("END\n" + Duration.between(start, end));
    }
}
