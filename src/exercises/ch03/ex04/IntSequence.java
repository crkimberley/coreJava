package exercises.ch03.ex04;

public interface IntSequence {
    default boolean hasNext() { return true; };
    int next();
}