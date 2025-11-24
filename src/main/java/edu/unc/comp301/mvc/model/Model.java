package edu.unc.comp301.mvc.model;

public interface Model extends Subject {
    int getTile(int x, int y);
    int getCurrentScore();
    int getBestScore();
    boolean isGameOver();

    void swipeLeft();
    void swipeRight();
    void swipeUp();
    void swipeDown();
    void reset();
}
