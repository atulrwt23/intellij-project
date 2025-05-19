package models.measurements;

import java.util.Objects;

public class Centimeter extends Units {
    private final Double value;

    public Centimeter(Double value) {
        super(value);
        this.value = value;
    }

    public Inch toInches() {
        return new Inch(value / 2.5);
    }

    public Millimeter toMillimeter() {
        return new Millimeter(value * 10);
    }
}
