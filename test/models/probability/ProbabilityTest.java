package models.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void givesTheProbabilityOfTails() {
        Probability probability = Probability.favorable(0.5);

        assertEquals(Probability.favorable(0.5), probability);
    }

    @Test
    void givesErrorWhenProbabilityIsMoreThanOne() {
        assertThrows(RuntimeException.class, () -> Probability.favorable(7));
    }

    @Test
    void givesTheComplementOfAProbability() {
        Probability p1 = Probability.favorable(0.3);

        assertEquals(Probability.favorable(0.7), p1.complement());
    }

    @Test
    void combinesTwoProbabilities() {
        Probability p1 = Probability.favorable(0.3);
        Probability p2 = Probability.favorable(0.3);

        assertEquals(Probability.favorable(0.09),p1.combines(p2));

    }
}
