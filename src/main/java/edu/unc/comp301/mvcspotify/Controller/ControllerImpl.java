package edu.unc.comp301.mvcspotify.Controller;

import edu.unc.comp301.mvcspotify.Model.*;
import edu.unc.comp301.mvcspotify.Controller.*;
import edu.unc.comp301.mvcspotify.View.*;

public class ControllerImpl implements Controller{
    private Model model;

    public ControllerImpl(Model model){
        this.model = model;
    }


    @Override
    public void moveSongUp(int index) {
        if (index > 0) {
            model.moveSong(index, index - 1);
        }
    }

    @Override
    public void moveSongDown(int index) {
        if (index + 1 < model.getNumSongs()) {
            model.moveSong(index, index + 1);
        }
    }

    @Override
    public void addSong(String title, String artist, int rating) {
        model.addSong(new SongImpl(title, artist, rating));
    }

    @Override
    public void removeSong(int index) {
        model.removeSong(index);
    }


}
