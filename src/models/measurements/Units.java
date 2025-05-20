package models.measurements;

import java.util.Objects;

public class Units {

    private final double value;
    private final String unit;
    private final double millimeterFactor;

    public Units(double value, String unit, double millimeterFactor) {
        this.value = value;
        this.unit = unit;
        this.millimeterFactor = millimeterFactor;
    }

    private Units toMillimeter() {
        return new Units(value * millimeterFactor, "millimeter", 1);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) return false;

        Units otherUnit = ((Units) other).toMillimeter();
        Units thisUnit = this.toMillimeter();

        return Double.compare(thisUnit.value, otherUnit.value) == 0 && thisUnit.millimeterFactor == otherUnit.millimeterFactor && thisUnit.unit.equals(otherUnit.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
