package edu.unc.comp301.mvcspotify.Controller;

import org.comp301.spotify.mvcspotify.Model.Model;
import org.comp301.spotify.mvcspotify.Model.SongImpl;

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

    @Override
    public void shuffleSongs() {
        model.shuffleSongs();
    }
}
