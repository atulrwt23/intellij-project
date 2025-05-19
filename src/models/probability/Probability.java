package models.probability;

import java.util.Objects;

public class Probability {
    private final double value;

    public Probability(double probability) {
        this.value = probability;
    }

    public static Probability set (double probability) throws InvalidProbabilityException {
        if (probability < 0 || probability > 1) {
            throw new InvalidProbabilityException();
        }

        return new Probability(probability);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Probability complement() throws InvalidProbabilityException {

        return Probability.set(1 - value);
    }

    public Probability and(Probability other) throws InvalidProbabilityException {
        return Probability.set(value * other.value);
    }

    public Probability or(Probability other) throws InvalidProbabilityException {
        return other.complement().and(this.complement()).complement();
    }
}
