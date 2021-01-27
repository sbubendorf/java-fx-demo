package ch.rusi.examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FirstEx extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);

    }

    private void initUI(Stage stage) {

        StackPane root = new StackPane();

        Scene scene = new Scene(root, 300, 150);

        Label label = new Label("Simple JavaFX application.");
        label.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        root.getChildren().add(label);

        stage.setTitle("Simple application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);

    }

    public void sleep(long seconds) {

        long millis = seconds * 1000;

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
