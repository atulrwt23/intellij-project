package models.measurements;

import java.util.Objects;

public class Inch extends Units{
    private final Double value;

    public Inch(Double value) {
        super(value);
        this.value = value;
    }

    public Feet toFeet() {
        return new Feet(value / 12);
    }

    public Centimeter toCentimeter() {
        return new Centimeter(value * 2.5);
    }
}
