package exercises.ch03;

import exercises.ch03.ex04.ArgSequence;
import exercises.ch03.ex04.IntSequence;
import org.junit.jupiter.api.Test;

/**
 * @author Chris Kimberley
 */
public class ArgSequenceTest {

    @Test
    void produceSequenceOfArgsTest() {
        IntSequence seq = ArgSequence.of(6, 3, 4, 5, 7, 8, 9);
        while (seq.hasNext()) {
            System.out.print(seq.next() + " ");
        }
        System.out.println();
    }

    @Test
    void produceConastantSequenceTest() {
        IntSequence seq = ArgSequence.constant(7);
        for (int i = 0; i < 50; i++) {
            System.out.print(seq.next() + " ");
        }
    }
}
