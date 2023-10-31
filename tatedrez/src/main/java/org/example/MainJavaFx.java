package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.controller.JuegoController;
import org.example.model.*;

import java.io.IOException;
import java.util.List;

public class MainJavaFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Jugador j1 = new Jugador("Mati", Config.ColoresJugadores.BLANCO);
        Jugador j2 = new Jugador("Nacho", Config.ColoresJugadores.NEGRO);
        Juego juego = new Juego(List.of(j1, j2));

        juego.setPieza(new Caballo(Config.ColoresJugadores.BLANCO), 0, 0);
        juego.setPieza(new Torre(Config.ColoresJugadores.NEGRO), 1, 0);
        juego.setPieza(new Alfil(Config.ColoresJugadores.BLANCO), 0, 2);

        juego.setPieza(new Caballo(Config.ColoresJugadores.NEGRO), 2, 0);
        juego.setPieza(new Torre(Config.ColoresJugadores.BLANCO), 2, 1);
        juego.setPieza(new Alfil(Config.ColoresJugadores.NEGRO), 2, 2);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("juego-view.fxml"));
        VBox root = loader.load();

        JuegoController juegoController = loader.getController();
        juegoController.setJuego(juego);

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);

        stage.show();
    }
}