package ch.rusi;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class GridPaneEx extends Application{

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        GridPane root = new GridPane();
        root.setHgap(8);
        root.setVgap(8);
        root.setPadding(new Insets(5));

        ColumnConstraints cons1 = new ColumnConstraints();
        cons1.setHgrow(Priority.NEVER);

        ColumnConstraints cons2 = new ColumnConstraints();
        cons2.setHgrow(Priority.ALWAYS);

        root.getColumnConstraints().addAll(cons1, cons2);

        RowConstraints rcons1 = new RowConstraints();
        rcons1.setVgrow(Priority.NEVER);

        RowConstraints rcons2 = new RowConstraints();
        rcons2.setVgrow(Priority.ALWAYS);

        root.getRowConstraints().addAll(rcons1, rcons2);

        Label label = new Label("Name:");
        TextField field = new TextField();
        ListView view = new ListView();
        Button buttonOk = new Button("OK");
        Button buttonClose = new Button("Close");

        GridPane.setHalignment(buttonOk, HPos.RIGHT);

        root.add(label, 0, 0);
        root.add(field, 1, 0, 3, 1);  // (object, column, row, colspan, rowspan)
        root.add(view, 0, 1, 4, 2);
        root.add(buttonOk, 2, 3);
        root.add(buttonClose, 3, 3);

        Scene scene = new Scene(root, 280, 300);

        stage.setTitle("New folder");
        stage.setScene(scene);
        stage.setMinHeight(300);
        stage.setMinWidth(280);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
