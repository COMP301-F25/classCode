package edu.unc.comp301.drinks;

public class MilkChoicre implements AddOn{
    private final String milk;

    public MilkChoicre(String milk){
        this.milk = milk;
    }

    @Override
    public String getDescription() {
        return milk;
    }

    @Override
    public double getUpcharge() {
        return 1.0;
    }
}
