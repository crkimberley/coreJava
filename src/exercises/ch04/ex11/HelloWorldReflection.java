package exercises.ch04.ex11;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalTime;

/**
 * @author Chris Kimberley
 */
public class HelloWorldReflection {
    public static void main(String[] args) {
        new HelloWorldReflection().launch();
    }

    private void launch() {
        Method reflectionPrint;
        Object outObject;
        try {
            outObject = java.lang.System.class.getField("out").get(null);
            reflectionPrint = outObject.getClass().getMethod("print", String.class);
            reflectionPrint.invoke(outObject, "");
            LocalTime startTime = LocalTime.now();
            for (int i = 0; i < 1000000; i++) {
                //System.out.print("");
                reflectionPrint.invoke(outObject, "");
            }
            Duration totalTime = Duration.between(startTime, LocalTime.now());
            System.out.println(totalTime.getSeconds() + "." + totalTime.getNano());
        } catch (Exception ex) {ex.printStackTrace();}
    }
}