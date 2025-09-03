package edu.unc.comp301.encapsulation;

public class AShape implements Shape {
    private String name;

    public AShape(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public double getArea(){

        return 0;
    }
}
