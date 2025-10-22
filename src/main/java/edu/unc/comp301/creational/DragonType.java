package edu.unc.comp301.creational;

public enum DragonType {
    FIRE(10, 8), ICE(7, 10), LIGHTNING(9, 7), EARTH(8, 9), WIND(6, 6), SHADOW(7, 8);
    final int power;
    final int toughness;

    DragonType(int power, int toughness) {
        this.power = power;
        this.toughness = toughness;
    }

    public int getPower() {
        return power;
    }

    public int getToughness() {
        return toughness;
    }
}

