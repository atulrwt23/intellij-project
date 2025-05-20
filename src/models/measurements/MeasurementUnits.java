package models.measurements;

public enum MeasurementUnits {
    Inches(25, MeasurementType.Length),
    Millimeter(1, MeasurementType.Length),
    Feet(12 * 25, MeasurementType.Length),
    Centimeter(10, MeasurementType.Length),
    Gallon(3.78, MeasurementType.Volume),
    Liters(1, MeasurementType.Volume);

    private final double baseFactor;
    private final MeasurementType measurementType;

    MeasurementUnits(double baseFactor, MeasurementType measurementType) {
        this.baseFactor = baseFactor;
        this.measurementType = measurementType;
    }

    public double getBaseFactor() {
        return baseFactor;
    }

    public MeasurementType getMeasurementType() {
        return measurementType;
    }
}
