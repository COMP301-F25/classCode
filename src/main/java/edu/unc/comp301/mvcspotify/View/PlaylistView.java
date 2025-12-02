package edu.unc.comp301.mvcspotify.View;

import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import edu.unc.comp301.mvcspotify.Model.*;
import edu.unc.comp301.mvcspotify.Controller.*;
import edu.unc.comp301.mvcspotify.View.*;

public class PlaylistView implements FXComponent{
    private final Model model;
    private final Controller controller;

    public PlaylistView(Model model, Controller controller){
        this.model = model;
        this.controller = controller;
    }

    @Override
    public Parent render() {
        VBox layout = new VBox();
        layout.getStyleClass().add("view");
        for (int i = 0; i < model.getNumSongs(); i++) {
            SongView songView = new SongView(i, controller, model);
            layout.getChildren().add(songView.render());
        }
        return layout;
    }
}
