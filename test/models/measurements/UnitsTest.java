package models.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void calculatesTheSumOfTwoInchesToTwoInches() {
        Units twoInches = Units.inches(2);
        Units fourInches = Units.inches(4);

        assertEquals(fourInches,twoInches.add(twoInches));
    }

    @Test
    void calculatesTheSumOfTwoInchesToTwoPointFiveCentimeterInInches() {
        Units twoInches = Units.inches(2);
        Units threeInches = Units.inches(3);
        Units twoPointFiveCentimeter = Units.centimeter(2.5);

        assertEquals(threeInches,twoInches.add(twoPointFiveCentimeter));
    }

    @Test
    void calculatesTheSumOfCentimetersInInches() {
        Units twoAndHalfCentimeters = Units.centimeter(2.5);
        Units twoInches = Units.inches(2);

        assertEquals(twoInches, twoAndHalfCentimeters.add(twoAndHalfCentimeters));
    }

    @Test
    void calculatesTheSumOfMillimetersInInches() {
        Units fiftyMillimeters = Units.millimeters(50);
        Units fourInches = Units.inches(4);

        assertEquals(fourInches, fiftyMillimeters.add(fiftyMillimeters));
    }

    @Test
    void calculatesTheSumOfCentimetersAndFeetInInches() {
        Units oneFeet = Units.feet(1);
        Units twoAndHalfCentimeters = Units.centimeter(2.5);
        Units thirteenInches = Units.inches(13);

        assertEquals(thirteenInches, oneFeet.add(twoAndHalfCentimeters));
    }
}
