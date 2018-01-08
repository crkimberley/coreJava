package exercises.ch02;

/**
 * @author Chris Kimberley
 */
public class Ex09_Car {
    private double position;
    private double fuel;
    private double mpg;

    public Ex09_Car(int mpg) {
        position = 0.0;
        fuel = 10.0;
        this.mpg = mpg;
    }

    @Override
    public String toString() {
        return "Ex09_Car{" +
                "position=" + position +
                ", fuel=" + fuel +
                ", mpg=" + mpg +
                '}';
    }

    public void drive(int distance) {
        if (distance / mpg > fuel) {
            position += fuel * mpg;
            fuel = 0.0;
        } else {
            position += distance;
            fuel -= distance / mpg;
        }
    }

    public void addFuel(int topUp) {
        fuel += topUp;
    }
}
