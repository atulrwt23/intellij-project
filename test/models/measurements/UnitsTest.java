package models.measurements;

import org.junit.jupiter.api.Test;

class UnitsTest {
    @Test
    void oneInchShouldBeTwentyFiveMillimeter() {
        Units oneInch = new Units(1, MeasurementUnits.Inches);
        Units twentyFiveMillimeter = new  Units(25, MeasurementUnits.Millimeter);

        assert (twentyFiveMillimeter.equals(oneInch));
    }

    @Test
    void oneInchShouldBeTwelveInches() {
        Units twelveInches = new Units(12, MeasurementUnits.Inches);
        Units oneFeet = new Units(1, MeasurementUnits.Feet);

        assert (oneFeet.equals(twelveInches));
    }

    @Test
    void twoInchesShouldBeFiveCentimeter() {
        Units fiveCentimeter = new Units(5, MeasurementUnits.Centimeter);
        Units twoInches = new Units(2, MeasurementUnits.Inches);

        assert (twoInches.equals(fiveCentimeter));
    }

    @Test
    void oneCentimeterShouldBeTenMillimeter() {
        Units oneCentimeter = new Units(1, MeasurementUnits.Centimeter);
        Units tenMillimeters = new Units(10, MeasurementUnits.Millimeter);

        assert (oneCentimeter.equals(tenMillimeters));
    }

    @Test
    void oneGallonShouldBeThreePointSevenEightLiters() {
        Units oneGallon = new Units(1, MeasurementUnits.Gallon);
        Units liters = new Units(3.78, MeasurementUnits.Liters);

        assert (oneGallon.equals(liters));
    }
}
