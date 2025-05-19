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
    void calculatesTheProbabilityOfBothOccurring() {
        Probability p1 = Probability.favorable(0.3);
        Probability p2 = Probability.favorable(0.3);

        assertEquals(Probability.favorable(0.09),p1.and(p2));
    }

    @Test
    void calculatesTheProbabilityOfAtLeastOneEventOccurring() {
        Probability p1 = Probability.favorable(0.5);
        Probability p2 = Probability.favorable(0.6);

        assertEquals(Probability.favorable(0.8),p1.or(p2));
    }

    @Test
    void calculatesTheProbabilityOfAtLeastOneEventOccurringWhenOneIsCertain() {
        Probability p1 = Probability.favorable(1);
        Probability p2 = Probability.favorable(0.6);

        assertEquals(Probability.favorable(1),p1.or(p2));
    }
}
