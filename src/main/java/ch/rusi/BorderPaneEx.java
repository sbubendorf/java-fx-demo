package ch.rusi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.*;

class MyLabel extends Label {

    public MyLabel(String text) {
        super(text);

        setAlignment(Pos.BASELINE_CENTER);
    }
}

public class BorderPaneEx extends Application {

    private BorderPane root;
    private final int SIZE = 60;
    private final int GAP = 4;

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        root = new BorderPane();

        //root.setTop(getTopLabel());
        root.setTop(getButtonBar());
        root.setBottom(getBottomLabel());
        root.setLeft(getLeftLabel());
        root.setRight(getRightLabel());
        root.setCenter(getCenterLabel());

        Scene scene = new Scene(root, 350, 300);

        stage.setTitle("BorderPane");
        stage.setScene(scene);
        stage.show();
    }

    private HBox getButtonBar() {
        HBox box = new HBox(GAP);
        Label labelTop = new Label("Top");
        Button buttonPrevious = new Button("Previous");
        Button buttonNext = new Button("Next");
        Button buttonCancel = new Button("Cancel");
        Button buttonHelp = new Button("Help");
        box.getChildren().addAll(labelTop, buttonPrevious, buttonNext, buttonCancel, buttonHelp);
        box.setAlignment(Pos.CENTER);
        box.setMinHeight(SIZE);
        box.setStyle(
                "-fx-border-style: dotted; " +
                "-fx-border-width: 0 0 1 0;" +
                "-fx-border-color: gray; " +
                "-fx-font-weight: bold");
        return box;
    }

    private Label getTopLabel() {

        Label lbl = new MyLabel("Top");
        lbl.setPrefHeight(SIZE);
        lbl.prefWidthProperty().bind(root.widthProperty());
        lbl.setStyle(
                "-fx-border-style: dotted; " +
                "-fx-border-width: 0 0 1 0;" +
                "-fx-border-color: gray; " +
                "-fx-font-weight: bold");
        return lbl;
    }

    private Label getBottomLabel() {

        Label lbl = new MyLabel("Bottom");
        lbl.setPrefHeight(SIZE);
        lbl.prefWidthProperty().bind(root.widthProperty());
        lbl.setStyle("-fx-border-style: dotted; -fx-border-width: 1 0 0 0;"
                + "-fx-border-color: gray; -fx-font-weight: bold");

        return lbl;
    }

    private Label getLeftLabel() {

        Label lbl = new MyLabel("Left");
        lbl.setPrefWidth(SIZE);
        lbl.prefHeightProperty().bind(root.heightProperty().subtract(2*SIZE));
        lbl.setStyle("-fx-border-style: dotted; -fx-border-width: 0 1 0 0;"
                + "-fx-border-color: gray; -fx-font-weight: bold");

        return lbl;
    }


    private Label getRightLabel() {

        Label lbl = new MyLabel("Right");
        lbl.setPrefWidth(SIZE);
        lbl.prefHeightProperty().bind(root.heightProperty().subtract(2*SIZE));
        lbl.setStyle("-fx-border-style: dotted; -fx-border-width: 0 0 0 1;"
                + "-fx-border-color: gray; -fx-font-weight: bold");

        return lbl;
    }

    private Label getCenterLabel() {

        Label lbl = new MyLabel("Center");
        lbl.setStyle("-fx-font-weight: bold");
        lbl.prefHeightProperty().bind(root.heightProperty().subtract(2*SIZE));
        lbl.prefWidthProperty().bind(root.widthProperty().subtract(2*SIZE));

        return lbl;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
