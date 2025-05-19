package models.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTossTest {
    @Test
    void givesTheProbabilityOfTails() {
        CoinToss coinToss = new CoinToss();

        assertEquals(1/2,coinToss.tails());
    }
}