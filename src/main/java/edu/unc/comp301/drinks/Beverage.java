package edu.unc.comp301.drinks;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Beverage implements Orderable{
    private final String name;
    protected final Collection<AddOn> addOns;

    public Beverage(String name){
        this.name = name;
        this.addOns = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public Collection<AddOn> getAddOns(){
        return addOns;
    }


    @Override
    public abstract double getPrice();

    @Override
    public void modify(AddOn add) {
        addOns.add(add);
    }

    @Override
    public String toString(){
        String retval = name + "\n";
        for(AddOn add : addOns){
            retval += add.getDescription() + "\n";
        }

        return retval;
    }


}
