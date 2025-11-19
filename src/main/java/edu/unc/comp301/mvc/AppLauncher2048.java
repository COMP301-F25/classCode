package edu.unc.comp301.mvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.List;

public class AppLauncher2048 extends Application {
    @Override
    public void start(Stage stage) {
        View view = new View();
        // Make scene
        Scene scene = new Scene(view.render(),300, 500);
        stage.setScene(scene);

        // Show the stage
        stage.setTitle("MVC Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
