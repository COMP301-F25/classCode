package edu.unc.comp301.bugOfTheDay.DecoratorBug;

public class MainBugDemo {
    public static void main(String[] args) {
        // BAD: this wraps itself and causes infinite recursion
        PriceTag tag = new PriceTagImpl(100);
        //PriceTag tag = new LoggingPriceTag(null);
        tag = new LoggingPriceTag(tag);  // accidentally decorates itself
        System.out.println(tag.getAmount()); // infinite loop
    }
}
