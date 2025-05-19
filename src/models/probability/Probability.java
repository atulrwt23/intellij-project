package models.probability;

import javax.management.RuntimeMBeanException;
import java.util.Objects;

public class Probability {
    private final double probability;

    public Probability(double probability) {
        this.probability = probability;
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
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

    public Probability complement() {

        return Probability.favorable(1 - probability);
    }

    public Probability combines(Probability obj) {
        return Probability.favorable(probability * obj.probability);
    }
}
