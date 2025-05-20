package models.measurements;

import java.util.Objects;

public class Units {

    private final double value;
    private final MeasurementUnits measurementUnit;

    public Units(double value, MeasurementUnits measurementUnits) {
        this.value = value;
        this.measurementUnit = measurementUnits;
    }

    private Units toBase() {
        switch (measurementUnit.getMeasurementType()) {
            case Length: {
                return new Units(value * measurementUnit.getBaseFactor(), MeasurementUnits.Millimeter);
            }

            case Volume: {
                return new Units(value * measurementUnit.getBaseFactor(), MeasurementUnits.Liters);
            }

            default:
                throw new IllegalStateException("Unexpected value: " + measurementUnit.getMeasurementType());
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) return false;
        if (measurementUnit.getClass() != ((Units) other).measurementUnit.getClass()) return false;

        Units otherUnit = ((Units) other).toBase();
        Units thisUnit = this.toBase();

        return Double.compare(thisUnit.value, otherUnit.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
