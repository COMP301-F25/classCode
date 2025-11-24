package edu.unc.comp301.mvc.controller;

import edu.unc.comp301.mvc.model.Model;

public class ControllerImpl implements Controller {
    private final Model model;

    public ControllerImpl(Model model){
        this.model = model;
    }

    @Override
    public void swipe(Direction d) {
        switch(d){
            case UP:
                model.swipeUp();
                break;
            case DOWN:
                model.swipeDown();
                break;
            case RIGHT:
                model.swipeRight();
                break;
            case LEFT:
                model.swipeLeft();
                break;
        }
    }

    @Override
    public void reset() {
        model.reset();
    }
}
