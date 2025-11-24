package edu.unc.comp301.mvc.view;

import edu.unc.comp301.mvc.model.Model;
import edu.unc.comp301.mvc.model.Observer;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View implements FXComponent, Observer {
    private final Model model;
    private final Stage stage;


    public View(Stage stage, Model model){
        this.model = model;
        this.stage = stage;
    }

    @Override
    public Parent render() {
        Pane layout = new VBox();
        layout.getStyleClass().add("layout");

        ScoreboardView scoreboardView = new ScoreboardView(model);
        InstructionsView instructionsView = new InstructionsView();
        BoardView boardView = new BoardView(model);
        layout.getChildren().add(scoreboardView.render());
        layout.getChildren().add(instructionsView.render());
        layout.getChildren().add(boardView.render());
        return layout;
    }

    @Override
    public void update(){
        Parent root = render();
        stage.getScene().setRoot(root);
    }
}
