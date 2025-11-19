package edu.unc.comp301.mvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;

public class AppLauncher2048 extends Application {
    @Override
    public void start(Stage stage) {
        Model model = new ModelImpl();
        Controller controller = new ControllerImpl(model);

        //View
        View view = new View(model, controller);
        model.addObservers();
        // Make scene
        Scene scene = new Scene(view.render(), 200,300);
        stage.setScene(scene);

        // Show the stage
        stage.setTitle("MVC Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
