package models.measurements;

import org.junit.jupiter.api.Test;

class UnitsTest {
    @Test
    void oneInchShouldBeTwentyFiveMillimeter() {
        Units oneInch = Units.inches(1);
        Units twentyFiveMillimeter = Units.millimeters(25.0);

        assert(twentyFiveMillimeter.equals(oneInch));
    }

    @Test
    void oneInchShouldBeTwelveInches() {
        Units twelveInches = Units.inches(12);
        Units oneFeet = Units.feet(1);

        assert(oneFeet.equals(twelveInches));
    }

    @Test
    void twoInchesShouldBeFiveCentimeter() {
        Units fiveCentimeter = Units.centimeter(5);
        Units twoInches = Units.inches(2);

        assert(twoInches.equals(fiveCentimeter));
    }

    @Test
    void oneCentimeterShouldBeTenMillimeter() {
        Units oneCentimeter = Units.centimeter(1);
        Units tenMillimeters = Units.millimeters(10);

        assert(oneCentimeter.equals(tenMillimeters));
    }
    @Test
    void oneGallonShouldBeThreePointSevenEightLiters() {
        Units gallon = Units.gallon(1);
        Units liters = Units.liters(3.78);

        assert(gallon.equals(liters));
    }
}
