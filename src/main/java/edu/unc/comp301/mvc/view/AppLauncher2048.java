package edu.unc.comp301.mvc.view;

import edu.unc.comp301.mvc.controller.Controller;
import edu.unc.comp301.mvc.controller.ControllerImpl;
import edu.unc.comp301.mvc.controller.Direction;
import edu.unc.comp301.mvc.model.Model;
import edu.unc.comp301.mvc.model.ModelImpl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLauncher2048 extends Application {
    @Override
    public void start(Stage stage) {

        Model model = new ModelImpl();
        Controller controller = new ControllerImpl(model);
        View view = new View(stage, model);
        model.addObserver(view);

        //title
        stage.setTitle("Play 2048!");


        Scene scene = new Scene(view.render(),350,450);
        scene.getStylesheets().add("main.css");

        scene.setOnKeyPressed(event ->{
            switch (event.getCode()){
                case UP:
                    controller.swipe(Direction.UP);
                    break;
                case DOWN:
                    controller.swipe(Direction.DOWN);
                    break;
                case LEFT:
                    controller.swipe(Direction.LEFT);
                    break;
                case RIGHT:
                    controller.swipe(Direction.RIGHT);
                    break;
                default:
                    //Ignore all others
            }
        });

        stage.setScene(scene);



        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
