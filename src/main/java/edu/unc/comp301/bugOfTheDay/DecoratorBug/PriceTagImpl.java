package edu.unc.comp301.bugOfTheDay.DecoratorBug;

public class PriceTagImpl implements PriceTag {
    private final double amount;

    public PriceTagImpl(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}