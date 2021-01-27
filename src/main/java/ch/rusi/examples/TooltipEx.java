package ch.rusi.examples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TooltipEx extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        HBox root = new HBox();
        root.setPadding(new Insets(20));
        //root.setPadding(Insets.EMPTY);

        Button button = new Button("Button");
        Tooltip tooltip = new Tooltip("Button control");
        Tooltip.install(button, tooltip);

        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Tooltip");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
