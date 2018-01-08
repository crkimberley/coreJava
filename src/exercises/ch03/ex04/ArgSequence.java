package exercises.ch03.ex04;

/**
 * @author Chris Kimberley
 */
public class ArgSequence {

    public static IntSequence of(int... args) {
        return new IntSequence() {
            int position = 0;

            @Override
            public boolean hasNext() { return position < args.length; }

            @Override
            public int next() { return args[position++]; }
        };
    }

    public static IntSequence constant(int n) { return () -> n; }
}
