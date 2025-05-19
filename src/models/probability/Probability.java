package models.probability;

import java.util.Objects;

public class Probability {
    private final double value;

    public Probability(double probability) {
        this.value = probability;
    }

    public static Probability favorable(double probability) {
        if (probability < 0 || probability > 1) {
            throw new RuntimeException();
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

    public Probability complement() {

        return Probability.favorable(1 - value);
    }

    public Probability and(Probability other) {
        return Probability.favorable(value * other.value);
    }

    public Probability or(Probability other) {
        return other.complement().and(this.complement()).complement();
    }
}
