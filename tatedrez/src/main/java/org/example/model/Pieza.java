package org.example.model;

public abstract class Pieza {
    // TODO: Cambiar color a enum
    protected Config.ColoresJugadores color;

    public Pieza(Config.ColoresJugadores color) {
        this.color = color;
    }
    public abstract Boolean validarMovimiento(Tablero tablero, Integer oi, Integer oj, Integer di, Integer dj);

    public Config.ColoresJugadores getColor() {
        return this.color;
    }
}
