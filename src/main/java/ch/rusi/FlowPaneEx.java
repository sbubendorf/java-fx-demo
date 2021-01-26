package ch.rusi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class FlowPaneEx extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        FlowPane root = new FlowPane();
        root.setOrientation(Orientation.HORIZONTAL);
        // Set distance between leaf nodes
        root.setHgap(5);
        root.setVgap(5);
        // Set distance of leaf nodes from window border
        root.setPadding(new Insets(5));

        Button button;
        for (int i=1; i<=50; i++) {
            button = new Button();
            button.setText(String.valueOf(i));
            button.setAlignment(Pos.CENTER);
            button.setMinWidth(50);
            root.getChildren().add(button);
        }

        Scene scene = new Scene(root, 500, 250);

        stage.setTitle("FlowPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
