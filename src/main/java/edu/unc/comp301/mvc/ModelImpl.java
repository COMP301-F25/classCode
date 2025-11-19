package edu.unc.comp301.mvc;

import java.util.ArrayList;
import java.util.List;

public class ModelImpl implements Model {
    private int [][] board = new int[4][4];
    private int score = 0;
    private int best = 0;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o){
        if(o != null){
            observers.add(o);
        }
    }

    private void notifyObservers(){
        for(Observer o: observers){
            o.update();
        }
    }

    @Override
    public int getTile(int x, int y) {
        return board[x][y];
    }

    @Override
    public int getCurrentScore() {
        return score;
    }

    @Override
    public int getBestScore() {
        return best;
    }

    @Override
    public boolean isGameOver() {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length; j++){
                if(board[i][j] == 0){
                    return false;
                }
            }
        }
    return true;
    }

    @Override
    public void swipeUp() {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void reset() {
        board = new int[4][4];
        if(score > best){
            best = score;
        }
        score = 0;
    }

}
