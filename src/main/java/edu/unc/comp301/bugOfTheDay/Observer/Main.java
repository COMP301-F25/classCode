package edu.unc.comp301.bugOfTheDay.Observer;


public class Main{
    public static void main(String[] args) {
        Counter c = new Counter();

        c.addObserver(null);
        c.increment();
    }
}


