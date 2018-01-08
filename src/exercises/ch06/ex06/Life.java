package exercises.ch06.ex06;

public class Life {
    private String name;

    public Life(String name) {
        this.name = name;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}