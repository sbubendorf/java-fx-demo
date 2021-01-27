package ch.rusi.examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CornerButtonsEx extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        AnchorPane root = new AnchorPane();

        Button buttonOk = new Button("OK");
        Button buttonClose = new Button("Close");
        HBox box = new HBox(5, buttonOk, buttonClose);

        root.getChildren().addAll(box);

        AnchorPane.setRightAnchor(box, 10d);
        AnchorPane.setBottomAnchor(box, 10d);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Corner buttons");
        stage.setScene(scene);
        stage.setMinWidth(300);
        stage.setMinHeight(300);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
