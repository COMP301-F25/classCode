package edu.unc.comp301.mvcspotify.View;

import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import edu.unc.comp301.mvcspotify.Model.*;
import edu.unc.comp301.mvcspotify.Controller.*;
import edu.unc.comp301.mvcspotify.View.*;


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
