package edu.unc.comp301.drinks;

public class CaramelCrunchFrappuccino extends Beverage {
    private double basePrice = 5.50;

    public CaramelCrunchFrappuccino(){
        super("CaramelCrunchFrappuccino");
    }

    @Override
    public double getPrice() {
        double price = basePrice;
        for(AddOn a : this.addOns){
            price += a.getUpcharge();
        }
        return price;
    }
}
