package exercises.ch04.ex01;

import java.util.Objects;

/**
 * @author Chris Kimberley
 */
public class LabelledPoint extends Point {
    private String label;

    public LabelledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getlabel() { return label; }

    public String toString() {
        return super.toString() + String.format("[label=%s]", label);
    }

    /*public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        LabelledPoint other = (LabelledPoint) otherObject;
        return label.equals(other.label);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LabelledPoint that = (LabelledPoint) o;
        return Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }
}