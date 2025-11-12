package edu.unc.comp301.bugOfTheDay.DecoratorBug;

public class LoggingPriceTag implements PriceTag {
    private final PriceTag tag;

    public LoggingPriceTag(PriceTag tag) {
        this.tag = tag;
    }

    public PriceTag getTag(){
        return this.tag;
    }

    @Override
    public double getAmount() {
        System.out.println("Checking price...");
        double result = this.getTag().getAmount();
        System.out.println("Price is " + result);
        return result;
    }
}