package edu.unc.comp301.drinks;

public class Syrup implements AddOn{
    private int pumps;
    private String name;

    public Syrup(String name, int pumps){
        this.name = name;
        this.pumps = pumps;
    }

    @Override
    public String getDescription() {
        return pumps + " " + name + " syrup";
    }

    @Override
    public double getUpCharge() {
        return .5 * pumps;
    }
}
