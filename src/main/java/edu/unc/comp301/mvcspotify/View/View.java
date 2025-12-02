package edu.unc.comp301.mvcspotify.View;

import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.comp301.spotify.mvcspotify.Controller.Controller;
import org.comp301.spotify.mvcspotify.Model.Model;
import org.comp301.spotify.mvcspotify.Model.ModelObserver;

public class View implements FXComponent, ModelObserver {
  private final Stage stage;
  private final Model model;
  private final Controller controller;

  public View(Stage stage, Model model, Controller controller) {
    this.stage = stage;
    this.controller = controller;
    this.model = model;
  }

  @Override
  public void update(Model model) {
    stage.getScene().setRoot(render());
  }

  @Override
  public Parent render() {
    PlaylistView playlist = new PlaylistView(model, controller);
    AddSongView add = new AddSongView(controller);
    VBox layout = new VBox();
    layout.getStyleClass().add("outer-box");
    layout.getStyleClass().add("view");
    layout.getChildren().add(playlist.render());
    layout.getChildren().add(add.render());
    return layout;
  }

}
