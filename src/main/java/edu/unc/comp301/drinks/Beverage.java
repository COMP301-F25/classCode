package edu.unc.comp301.drinks;

import java.util.*;

public abstract class Beverage implements Orderable{
    private final String name;
    private final String size;
    private final Collection<AddOn> addOns;

    public Beverage(String name, String size){
        this.name = name;
        this.size = size;
        this.addOns = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();

    public Collection<AddOn> getAddOns() {
        return addOns;
    }

    @Override
    public void modify(AddOn add){
        addOns.add(add);
    }

    @Override
    public String toString(){
        String retval = size + " " + name;

        if(addOns.size() > 0){
            retval += " with " + "\n";
        }

        for(AddOn add : addOns){
            retval += add.getDescription() + "\n";
        }

        return retval;
    }

}
