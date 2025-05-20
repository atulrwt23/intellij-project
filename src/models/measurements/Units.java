package models.measurements;

import java.util.Objects;

public class Units {

    private final double value;
    private final MeasurementUnits unit;

    private Units(double value, MeasurementUnits unit) {
        this.value = value * unit.getBaseFactor();
        this.unit = unit;
    }

    public static Units inches(double value) {
        return new Units(value, MeasurementUnits.Inches);
    }

    public static Units centimeter(double value) {
        return new Units(value, MeasurementUnits.Centimeter);
    }

    public static Units millimeters(double value) {
        return new Units(value, MeasurementUnits.Millimeter);
    }

    public static Units feet(double value) {
        return new Units(value, MeasurementUnits.Feet);
    }

    public static Units gallon(double value) {
        return new Units(value, MeasurementUnits.Gallon);
    }

    public static Units liters(double value) {
        return new Units(value, MeasurementUnits.Liters);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (unit.getMeasurementType() != ((Units) o).unit.getMeasurementType()) return false;

        Units that = (Units) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Units add(Units additive) {
        return Units.inches((additive.value + value) / additive.unit.getBaseFactor());
    }
}