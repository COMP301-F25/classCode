package edu.unc.comp301.mvcspotify.View;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import edu.unc.comp301.mvcspotify.Model.*;
import edu.unc.comp301.mvcspotify.Controller.*;
import edu.unc.comp301.mvcspotify.View.*;

public class AddSongView implements FXComponent {
    private final Controller controller;
    private HBox layout;

    public AddSongView(Controller controller) {
        this.controller = controller;
    }

    @Override
    public Parent render() {
        layout = new HBox();
        layout.getStyleClass().add("view");

        // Title
        TextField titleInput = new TextField();
        layout.getChildren().add(new Label("Song:"));
        layout.getChildren().add(titleInput);

        // Artist
        TextField artistInput = new TextField();
        layout.getChildren().add(new Label("Artist:"));
        layout.getChildren().add(artistInput);

        // Rating
        Slider ratingSlider = new Slider(0, 5, 5);
        ratingSlider.getStyleClass().add("add-song-slider");
        layout.getChildren().add(new Label("Rating:"));
        layout.getChildren().add(ratingSlider);

        // Add button
        Button addButton = new Button("\uff0b");
        addButton.setOnAction((ActionEvent event) -> {
            String title = titleInput.getText();
            String artist = artistInput.getText();
            int rating = (int) ratingSlider.getValue();
            controller.addSong(title, artist, rating);
            titleInput.setText("");
            artistInput.setText("");
        });
        layout.getChildren().add(addButton);

        return layout;
    }
}
