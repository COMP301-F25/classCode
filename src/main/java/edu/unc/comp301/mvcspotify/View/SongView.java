package edu.unc.comp301.mvcspotify.View;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import edu.unc.comp301.mvcspotify.Model.*;
import edu.unc.comp301.mvcspotify.Controller.*;
import edu.unc.comp301.mvcspotify.View.*;
public class SongView implements FXComponent {
  private final int songIndex;
  private final Controller controller;
  private final Model model;

  public SongView(int songIndex, Controller controller, Model model) {
    this.songIndex = songIndex;
    this.controller = controller;
    this.model = model;
  }

  @Override
  public Parent render() {
    HBox layout = new HBox();
    layout.getStyleClass().add("view");

    Button delete = new Button("\u274C");
    delete.setOnAction((ActionEvent e) -> {
          controller.removeSong(songIndex);});
    Button up = new Button("\u25B2");
    up.setOnAction((ActionEvent e) -> {
          controller.moveSongUp(songIndex);});
    Button down = new Button("\u25BC");
    down.setOnAction((ActionEvent e) -> {
          controller.moveSongDown(songIndex);});
    Label songLabel = new Label(songLabel());

    layout.getChildren().addAll(delete, up, down, songLabel);

    return layout;
  }

  private String songLabel() {
    Song song = model.getSong(songIndex);
    String retval = "";
    retval += song.getTitle() + " by " + song.getArtist() + "  (";

    int ratingInt = song.getRating();
    String ratingString = "";
    for (int i = 0; i < ratingInt; i++) {
      ratingString += "\u2605";
    }
    for (int i = ratingInt; i < 5; i++) {
      ratingString += "\u2606";
    }

    retval += ratingString + ")";
    return retval;
  }
}
