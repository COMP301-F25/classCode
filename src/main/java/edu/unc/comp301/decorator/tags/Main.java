package edu.unc.comp301.decorator.tags;

public class Main {
    public static void main(String[] args){
        PriceTag msrp = new PriceTagImpl(100);
        PriceTag blackFriday = new DiscountTag(msrp, 20);
        PriceTag finalTotal = new TaxPriceTag(blackFriday, 0.07);

        System.out.println(msrp);
        System.out.println(blackFriday);
        System.out.println(finalTotal);

        System.out.println(finalTotal.unwrap());

    }
}
