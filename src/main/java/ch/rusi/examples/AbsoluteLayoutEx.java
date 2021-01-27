package ch.rusi.examples;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;


public class AbsoluteLayoutEx extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        Pane root = new Pane();

        Rectangle rect = new Rectangle();
        rect.setX(25);
        rect.setY(25);
        rect.setWidth(50);
        rect.setHeight(50);
        rect.setFill(Color.CADETBLUE);

        Line line = new Line();
        line.setStartX(90);
        line.setStartY(40);
        line.setEndX(230);
        line.setEndY(80);
        line.setCursor(Cursor.CROSSHAIR);
        line.setStrokeWidth(4);
        line.setStroke(Color.BLACK);

        Circle circle = new Circle();
        circle.setCenterX(130);
        circle.setCenterY(130);
        circle.setRadius(30);
        circle.setStrokeWidth(5);
        circle.setStroke(Color.BLACK);
        circle.setStrokeType(StrokeType.OUTSIDE);
        circle.setFill(Color.CHOCOLATE);

        root.getChildren().addAll(rect, line, circle);

        Scene scene = new Scene(root, 250, 220, Color.WHITESMOKE);

        stage.setTitle("Absolute layout");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
