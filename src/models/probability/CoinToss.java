package models.probability;

public class CoinToss {
    public double tails() {
        return 0.5;
    }

    public double notTails() {
        return 1 -  this.tails();
    }
}
