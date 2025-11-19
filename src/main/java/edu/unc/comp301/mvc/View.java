package edu.unc.comp301.mvc;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class View implements FXComponent{
    @Override
    public Parent render() {
        Label label = new Label("Hello, world");
        StackPane pane = new StackPane();
        pane.getChildren().add(label);
        return pane;
    }
}
