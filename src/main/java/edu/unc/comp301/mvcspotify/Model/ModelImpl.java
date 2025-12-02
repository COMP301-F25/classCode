package edu.unc.comp301.mvcspotify.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ModelImpl implements Model{
    List<Song> playlist = new ArrayList<>();
    List<ModelObserver> observers = new ArrayList<>();


    @Override
    public Song getSong(int index) {
        return playlist.get(index);
    }

    @Override
    public int getNumSongs() {
        return playlist.size();
    }

    @Override
    public void addSong(Song song) {
        playlist.add(song);
        notifyObservers();

    }

    @Override
    public void removeSong(int index) {
        playlist.remove(index);
        notifyObservers();
    }

    @Override
    public void moveSong(int oldIdx, int newIdx) {
        Song song = playlist.remove(oldIdx);
        playlist.add(newIdx, song);
        notifyObservers();

    }

    @Override
    public void shuffleSongs() {
        Collections.shuffle(playlist);
        notifyObservers();
    }

    @Override
    public void addObserver(ModelObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ModelObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(){
        for(ModelObserver o : observers){
            o.update(this);
        }
    }
}
