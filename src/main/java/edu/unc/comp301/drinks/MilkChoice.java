package edu.unc.comp301.drinks;

public class MilkChoice implements AddOn {
    private String milk;

    public MilkChoice(String milk){
        this.milk = milk;
    }

    @Override
    public String getDescription() {
        return milk;
    }

    @Override
    public double getUpCharge() {
        return 1.0;
    }
}
