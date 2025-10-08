package edu.unc.comp301.drinks;

import edu.unc.comp301.composition.interfaces.C;

public class Main {
    public static void main(String[] args){
        Beverage frap = new CaramelCrunchFrappuccino();
        frap.modify(new MilkChoicre("Almond Milk"));
        frap.modify(new Syrup("Vanilla", 5));

        System.out.println(frap);
        System.out.println(frap.getPrice());
    }
}
