package edu.unc.comp301.mvc;

public interface Model extends Subject {
    int getTile(int x, int y);
    int getCurrentScore();
    int getBestScore();
    boolean isGameOver();

    void swipeUp();
    void swipeLeft();
    void swipeDown();
    void swipeRight();
    void reset();
}
