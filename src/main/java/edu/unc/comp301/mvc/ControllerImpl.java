package edu.unc.comp301.mvc;

public class ControllerImpl implements Controller{
    private Model model;

    public ControllerImpl(Model model){
        this.model = model;
    }

    @Override
    public void swipe(Direction d) {
        switch(d) {
            case UP:
                model.swipeUp();
                break;
            case DOWN:
                model.swipeDown();
                break;
            case LEFT:
                model.swipeLeft();
                break;
            case RIGHT:
                model.swipeRight();
                break;
        }
    }

    @Override
    public void reset() {
        model.reset();
    }
}
