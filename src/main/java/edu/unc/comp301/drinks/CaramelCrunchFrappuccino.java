package edu.unc.comp301.drinks;

public class CaramelCrunchFrappuccino extends Beverage{
    private double basePrice = 5.50;

    public CaramelCrunchFrappuccino(String size) {
        super("CaramelCrunchFrappuccino", "Venti");


    }

    @Override
    public double getPrice() {
        double price = basePrice;
        for(AddOn a : getAddOns()){
            price += a.getUpCharge();
        }

        return price;
    }

}
