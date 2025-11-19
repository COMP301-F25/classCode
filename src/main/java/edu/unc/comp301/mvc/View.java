package edu.unc.comp301.mvc;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class View implements FXComponent{
    private final Model model;
    private final Controller controller;
    private final Stage stage;
    public View(Stage stage, Model model, Controller controller){
        this.controller = controller;
        this.model = model;
        this.stage = stage;
    }

    @Override
    public Parent render() {
        // Make view
        StackPane stack = new StackPane();
        Button button  = new Button("Hello world");
        stack.getChildren().add(button);

        return stack;
    }

    @Override
    public void update() {
        stage.getScene().setRoot(render());
    }
}
