package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.example.model.*;

import java.io.IOException;
import java.util.List;

public class MainJavaFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Hello JavaFx");
        StackPane stackPane = new StackPane(label);
        Scene scene = new Scene(stackPane, 640, 480);
        stage.setScene(scene);

        stage.show();
    }
}