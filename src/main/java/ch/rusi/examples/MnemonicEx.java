package ch.rusi.examples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MnemonicEx extends Application {

    private long pressCounter = 0;

    @Override
    public void start(Stage stage) {

        initUI(stage);

    }

    private void initUI(Stage stage) {

        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(20);
        root.setFillWidth(true);

        Button button = new Button("_Button");
        button.setOnAction((ActionEvent event) -> {
            buttonPress();
        });

        root.getChildren().add(button);

        Label label = new Label("Press Alt to show Button mnemonic");
        label.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        root.getChildren().add(label);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Mnemonic");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void buttonPress() {
        pressCounter += 1;
        System.out.println("Button fired #" + pressCounter);
    }
}
