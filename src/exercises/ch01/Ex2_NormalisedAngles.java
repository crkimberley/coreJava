package exercises.ch01;

import static java.lang.Math.floorMod;

public class Ex2_NormalisedAngles {
    public static void normaliseAngle(int... angles) {
        for (int angle : angles) {
            System.out.printf("mod: %4d • Math.floorMod: %4d\n", (angle + 360) % 360, floorMod(angle, 360));
        }
    }
}