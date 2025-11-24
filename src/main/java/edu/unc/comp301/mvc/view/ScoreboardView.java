package edu.unc.comp301.mvc.view;

import edu.unc.comp301.mvc.model.Model;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;


public class ScoreboardView implements FXComponent{
    private Model model;

    public ScoreboardView(Model model){
        this.model = model;
    }
    @Override
    public Parent render() {
        Pane scoreBoard = new HBox();
        scoreBoard.getStyleClass().add("scoreboard");

        Pane logoContainer = new HBox();
        Label logo = new Label("2048");
        logo.getStyleClass().add("logo");
        HBox.setHgrow(logoContainer, Priority.ALWAYS);
        logoContainer.getChildren().add(logo);

        scoreBoard.getChildren().add(logoContainer);

        // current score
        Pane score = new VBox();
        score.getStyleClass().add("score");
        Label scoreLabel = new Label("SCORE");
        scoreLabel.getStyleClass().add("score-label");
        score.getChildren().add(scoreLabel);

        Label scoreValue = new Label("" + model.getCurrentScore());
        scoreValue.getStyleClass().add("score-value");
        score.getChildren().add(scoreValue);
        scoreBoard.getChildren().add(score);


        // best score
        Pane best = new VBox();
        best.getStyleClass().add("score");
        Label highScoreLabel = new Label("BEST");
        highScoreLabel.getStyleClass().add("score-label");
        best.getChildren().add(highScoreLabel);

        Label highScoreValue = new Label("" + model.getBestScore());
        highScoreValue.getStyleClass().add("score-value");
        best.getChildren().add(highScoreValue);

        scoreBoard.getChildren().add(best);


        return scoreBoard;

    }
}
