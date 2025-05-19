package models.measurements;

public class Feet {
    private final Double value;

    public Feet(Double value) {
        this.value = value;
    }

    public Inch toInches() {
        Double inch = value * 12;

        return new Inch(inch);
    }
}
