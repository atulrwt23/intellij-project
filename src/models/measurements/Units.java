package models.measurements;

import java.util.Objects;

public class Units {

    private final double value;

    private Units(double value) {
        this.value = value;
    }

    public static Units inches(double value) {
        return new Units(value * 25);
    }

    public static Units centimeter(double value) {
        return new Units(value * 10);
    }

    public static Units millimeters(double value) {
        return new Units(value);
    }

    public static Units feet(double value) {
        return new Units(value * 12 * 25);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Units that = (Units) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
