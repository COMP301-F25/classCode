package edu.unc.comp301.mvcspotify;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.comp301.spotify.mvcspotify.Controller.Controller;
import org.comp301.spotify.mvcspotify.Controller.ControllerImpl;
import org.comp301.spotify.mvcspotify.Model.Model;
import org.comp301.spotify.mvcspotify.Model.ModelImpl;
import org.comp301.spotify.mvcspotify.Model.SongImpl;
import org.comp301.spotify.mvcspotify.View.View;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Model model = new ModelImpl();
        Controller controller = new ControllerImpl(model);
        View view = new View(stage, model, controller);
        model.addObserver(view);



        Scene scene = new Scene(view.render());
        scene.getStylesheets().add("main.css");
        stage.setTitle("Hello!");
        stage.setScene(scene);

        model.addSong(new SongImpl("yes", "no",3));
        model.addSong(new SongImpl("ye2s", "no",3));
        model.addSong(new SongImpl("yes3", "no",3));



        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}