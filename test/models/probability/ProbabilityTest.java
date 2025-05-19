package models.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void givesTheProbabilityOfTails() throws InvalidProbabilityException {
        Probability probabilityOfTails = Probability.set(0.5);

        assertEquals(Probability.set(0.5), probabilityOfTails);
    }

    @Test
    void givesErrorWhenProbabilityIsMoreThanOne() {
        assertThrows(InvalidProbabilityException.class, () -> Probability.set(7));
    }

    @Test
    void givesTheComplementOfAProbability() throws InvalidProbabilityException {
        Probability p1 = Probability.set(0.3);

        assertEquals(Probability.set(0.7), p1.complement());
    }

    @Test
    void calculatesTheProbabilityOfBothOccurring() throws InvalidProbabilityException {
        Probability p1 = Probability.set(0.3);
        Probability p2 = Probability.set(0.3);

        assertEquals(Probability.set(0.09),p1.and(p2));
    }

    @Test
    void calculatesTheProbabilityOfAtLeastOneEventOccurring() throws InvalidProbabilityException {
        Probability p1 = Probability.set(0.5);
        Probability p2 = Probability.set(0.6);

        assertEquals(Probability.set(0.8),p1.or(p2));
    }

    @Test
    void calculatesTheProbabilityOfAtLeastOneEventOccurringWhenOneIsCertain() throws InvalidProbabilityException {
        Probability p1 = Probability.set(1);
        Probability p2 = Probability.set(0.6);

        assertEquals(Probability.set(1),p1.or(p2));
    }
}
