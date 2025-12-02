package edu.unc.comp301.mvcspotify.Controller;

public interface Controller {

    void moveSongUp(int index);

    void moveSongDown(int index);

    void addSong(String title, String artist, int rating);

    void removeSong(int index);

    void shuffleSongs();
}
