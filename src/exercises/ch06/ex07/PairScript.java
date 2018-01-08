package exercises.ch06.ex07;

public class PairScript {
    public static void main(String[] args) {
        new PairScript().launch();
    }

    private void launch() {
        Pair<Integer> pair1 = new Pair<>(13, 27);
        System.out.println(pair1);

        Pair<String> pair2 = new Pair<>("left", "right");
        System.out.println(pair2);

        System.out.println(pair1.max());
        System.out.println(pair1.min());
        System.out.println(pair2.max());
        System.out.println(pair2.min());
    }
}