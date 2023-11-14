package org.example.controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import org.example.model.Config;
import org.example.model.Juego;
import org.example.model.Jugador;
import org.example.view.TableroView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JuegoController implements EventHandler<CambioDeTurnoEvent>  {
    @FXML
    public Rectangle jugador1_color;
    @FXML
    public Rectangle jugador2_color;
    private Juego juego;

    @FXML
    private TableroController tableroController;

    @FXML
    private Label jugador1;

    @FXML
    private Label jugador2;

    @FXML
    private Label jugadorActual;

    private static final Map<Config.ColoresJugadores, Color> colores = Map.ofEntries(
            Map.entry(Config.ColoresJugadores.BLANCO, Color.WHITE),
            Map.entry(Config.ColoresJugadores.NEGRO, Color.BLACK)
    );

    public void setJuego(Juego juego) {
        this.juego = juego;
        List<Jugador> jugadores = juego.getJugadores();
        Jugador jugador1 = jugadores.get(0);
        Jugador jugador2 = jugadores.get(1);
        this.jugador1.setText(jugadores.get(0).getNombre());
        this.jugador2.setText(jugadores.get(1).getNombre());
        this.jugador1_color.setFill(colores.get(jugador1.getColor()));
        this.jugador2_color.setFill(colores.get(jugador2.getColor()));
        this.jugadorActual.setText("Jugador actual: " + juego.getJugadorActual().getNombre());
        tableroController.setJuego(juego);
    }

    @Override
    public void handle(CambioDeTurnoEvent cambioDeTurnoEvent) {
        this.juego.cambiarTurno();
        this.jugadorActual.setText("Jugador actual: " + juego.getJugadorActual().getNombre());
    }
}
