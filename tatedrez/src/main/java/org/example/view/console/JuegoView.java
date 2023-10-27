package org.example.view.console;

import org.example.model.Juego;
import org.example.model.Jugador;

import java.util.HashMap;
import java.util.List;

public class JuegoView {

    private HashMap<String, JugadorView> jugadores;
    private Juego juego;
    private TableroView vistaTablero;
    public JuegoView(Juego juego) {
        this.juego = juego;
        this.jugadores = new HashMap<String, JugadorView>();
        List<Jugador> jugadores = juego.getJugadores();
        for (Jugador jugador: jugadores) {
            this.jugadores.put(jugador.getNombre(), new JugadorView(jugador));
        }
        this.vistaTablero = new TableroView(juego.getTablero());
    }

    public void mostrar() {
        vistaTablero.mostrar();
        jugadores.get(juego.getJugadorActual().getNombre()).mostrar();
    }
}
