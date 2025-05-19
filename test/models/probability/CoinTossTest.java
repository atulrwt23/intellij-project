package models.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTossTest {
    @Test
    void givesTheProbabilityOfTails() {
        CoinToss coinToss = new CoinToss();

        assertEquals(0.5, coinToss.tails());
    }

    @Test
    void givesTheProbabilityOfNotGettingTails() {
        CoinToss coinToss = new CoinToss();

        assertEquals(0.5, coinToss.notTails());
    }
}
