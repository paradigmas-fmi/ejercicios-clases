package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import org.example.model.Juego;
import org.example.model.Jugador;
import org.example.view.TableroView;

import java.util.List;

public class JuegoController {
    private Juego juego;

    @FXML
    private TableroController tableroController;

    @FXML
    private Label jugador1;

    @FXML
    private Label jugador2;

    public void setJuego(Juego juego) {
        this.juego = juego;
        List<Jugador> jugadores = juego.getJugadores();
        this.jugador1.setText(jugadores.get(0).getNombre());
        this.jugador2.setText(jugadores.get(1).getNombre());
        tableroController.setJuego(juego);
    }
}
