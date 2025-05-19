package models.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitsTest {
    @Test
    void oneFootShouldBeTwelveInches() {
        Feet oneFeet = new Feet(1.0);
        Inch twelveInches = new Inch(12.0);

        assertEquals(twelveInches, oneFeet.toInches());
    }

    @Test
    void twelveInchesShouldBeOneFeet() {
        Feet oneFeet = new Feet(1.0);
        Inch twelveInches = new Inch(12.0);

        assertEquals(twelveInches.toFeet(), oneFeet);
    }

    @Test
    void TwoInchesToCentimeter() {
        Centimeter fiveCentimeter = new Centimeter(5.0);
        Inch twoInch = new Inch(2.0);

        assertEquals(twoInch, fiveCentimeter.toInches());
    }

    @Test
    void fiveCentimetersShouldBeTwoInches() {
        Centimeter fiveCentimeter = new Centimeter(5.0);
        Inch twoInch = new Inch(2.0);

        assertEquals(fiveCentimeter, twoInch.toCentimeter());
    }

    @Test
    void oneCentimeterShouldBeTenMillimeter() {
        Centimeter oneCentimeter = new Centimeter(1.0);
        Millimeter tenMillimeter = new Millimeter(10);

        assertEquals(tenMillimeter,oneCentimeter.toMillimeter());
    }

    @Test
    void tenMillimeterShouldBeOneCentimeter() {
        Centimeter oneCentimeter = new Centimeter(1.0);
        Millimeter tenMillimeter = new Millimeter(10);

        assertEquals(oneCentimeter,tenMillimeter.toCentimeter());
    }
}