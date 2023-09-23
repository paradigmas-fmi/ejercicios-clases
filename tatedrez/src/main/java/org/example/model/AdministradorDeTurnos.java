package org.example.model;

import java.util.List;

public class AdministradorDeTurnos {
    private int turno;
    private List<Jugador> jugadores;

    public AdministradorDeTurnos(List<Jugador> jugadores) {
        this.turno = 0;
        this.jugadores = jugadores;
    }

    public void siguienteTurno() {
        this.turno += 1;
    }

    public Jugador obtenerJugador() {
        return this.jugadores.get(this.turno % 2);
    }
}
