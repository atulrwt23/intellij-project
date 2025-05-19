package models.measurements;

public class Millimeter extends Units {
    final double value;

    public Millimeter(double value) {
        super(value);
        this.value = value;
    }

    public Centimeter toCentimeter() {
        return new Centimeter(value / 10);
    }
}
