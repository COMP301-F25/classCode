package edu.unc.comp301.bugOfTheDay.Observer;

import java.util.ArrayList;
import java.util.List;

class Counter {
    private final List<Observer> observers = new ArrayList<>();
    private int value = 0;

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void increment() {
        value++;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(value);
        }
    }
}
