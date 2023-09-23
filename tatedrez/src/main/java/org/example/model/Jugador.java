package org.example.model;

import java.util.List;

public class Jugador {

    private String nombre;
    private Config.ColoresJugadores color;
    private List<Pieza> piezas;

    public Jugador(String nombre, Config.ColoresJugadores color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Config.ColoresJugadores getColor() {
        return color;
    }
}
