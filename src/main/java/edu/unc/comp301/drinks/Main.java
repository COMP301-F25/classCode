package edu.unc.comp301.drinks;

public class Main {

    public static void main(String[] args){
        Beverage frap = new CaramelCrunchFrappuccino("Venti");

        frap.modify(new Syrup("Vanilla", 5));
        frap.modify(new Syrup("Caramel", 3));
        frap.modify(new MilkChoice("Almond Milk"));

        System.out.println(frap);
        System.out.printf("Total: $%.2f%n",frap.getPrice());
    }
}
