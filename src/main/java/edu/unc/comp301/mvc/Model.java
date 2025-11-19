package edu.unc.comp301.mvc;

public interface Model {
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
