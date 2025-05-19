package models.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitsTest {
    @Test
    void oneFootShouldBeTwelveInches() {
        Feet oneFeet = new Feet(1.0);
        Inch twelveInches = new Inch(12.0);

        assertEquals(twelveInches,oneFeet.toInches());
    }
}