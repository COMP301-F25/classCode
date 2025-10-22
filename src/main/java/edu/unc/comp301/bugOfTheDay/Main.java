package edu.unc.comp301.bugOfTheDay;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();

        InnerInterface inner = outer.getInner();
        inner.printMessage();
    }

}
