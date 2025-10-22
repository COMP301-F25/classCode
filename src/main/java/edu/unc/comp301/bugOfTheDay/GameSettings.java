package edu.unc.comp301.bugOfTheDay;

public class GameSettings {
    private static GameSettings instance;
    private int volume;

    public GameSettings() {
        volume = 5;
    }

    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    public void setVolume(int value) {
        volume = value;
    }

    public int getVolume() {
        return volume;
    }

    public static void main(String[] args) {
        // Oops... creates a second instance!
        GameSettings g1 = new GameSettings();
        GameSettings g2 = GameSettings.getInstance();

        g1.setVolume(1);
        g2.setVolume(9);

        System.out.println("g1 volume: " + g1.getVolume());
        System.out.println("g2 volume: " + g2.getVolume());
    }

}