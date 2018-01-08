package exercises.ch03.ex08;

/**
 * @author Chris Kimberley
 */
public class GreeterScript {

    public static void main(String[] args) {
        new GreeterScript().launch();
    }

    private void launch() {
        new Thread(new Greeter(37, "Sid")).start();
        new Thread(new Greeter(62, "Bert")).start();
    }
}
