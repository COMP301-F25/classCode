package edu.unc.comp301.mvc;

public class ModelImpl implements Model{
    private int[][] board;
    private int score;
    private int best;

    public ModelImpl(){
        board = new int[4][4];
        score = 0;
        best = 0;
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
        boolean isFull = true;
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
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeUp() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void reset() {
        this.board = new int[4][4];
        if(score > best){
            best = score;
        }
        score = 0;
    }
}
