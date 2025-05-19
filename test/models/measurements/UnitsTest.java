package models.measurements;

import org.junit.jupiter.api.Test;

class UnitsTest {
    @Test
    void oneInchShouldBeTwentyFiveMillimeter() {
        Units oneInch = new Units(1, "inches", 25);
        Units twentyFiveMillimeter = new Units(25, "millimeter", 1);

        assert (twentyFiveMillimeter.equals(oneInch));
    }

    @Test
    void oneInchShouldBeTwelveInches() {
        Units twelveInches = new Units(12, "inches", 25);
        Units oneFeet = new Units(1, "feet", 12 * 25);

        assert (oneFeet.equals(twelveInches));
    }

    @Test
    void twoInchesShouldBeFiveCentimeter() {
        Units fiveCentimeter = new Units(5, "centimeter", 10);
        Units twoInches = new Units(2, "inches", 25);

        assert (twoInches.equals(fiveCentimeter));
    }

    @Test
    void oneCentimeterShouldBeTenMillimeter() {
        Units oneCentimeter = new Units(1, "centimeter", 10);
        Units tenMillimeters = new Units(10, "millimeter", 1);

        assert (oneCentimeter.equals(tenMillimeters));
    }
}
