package edu.unc.comp301.drinks;

public class Syrup implements AddOn {
    private final int pumps;
    private final String name;

    public Syrup(String name, int pumps){
        this.name = name;
        this.pumps = pumps;
    }

    @Override
    public String getDescription() {
        return pumps + " " + name + " syrup";
    }

    @Override
    public double getUpcharge() {
        return 0.5 * this.pumps;
    }
}
