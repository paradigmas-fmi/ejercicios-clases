package org.example;

import org.example.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Jugador j1 = new Jugador("Mati", Config.ColoresJugadores.BLANCO);
        Jugador j2 = new Jugador("Nacho", Config.ColoresJugadores.NEGRO);
        Juego juego = new Juego(List.of(j1, j2));

        juego.setPieza(new Caballo(Config.ColoresJugadores.BLANCO), 0, 0);
        juego.setPieza(new Torre(Config.ColoresJugadores.NEGRO), 1, 0);
        juego.setPieza(new Alfil(Config.ColoresJugadores.BLANCO), 0, 2);

        juego.setPieza(new Caballo(Config.ColoresJugadores.NEGRO), 2, 0);
        juego.setPieza(new Torre(Config.ColoresJugadores.BLANCO), 2, 1);
        juego.setPieza(new Alfil(Config.ColoresJugadores.NEGRO), 2, 2);

        JuegoController juegoController = new JuegoController(juego);

        while (!juego.terminado()) {
            juegoController.jugarTurno();
        }

        System.out.println("Juego terminado!");
    }
}