package org.example.model;

public class AdministradorDeMovimientos {
    private Tablero tablero;

    public AdministradorDeMovimientos(Tablero tablero) {
        this.tablero = tablero;
    }

    public Boolean mover(Pieza pieza, Integer oi, Integer oj, Integer di, Integer dj) {
        if (
                di >= tablero.getDimensiones() ||
                dj >= tablero.getDimensiones() ||
                tablero.estaOcupada(di, dj) ||
                !pieza.validarMovimiento(tablero, oi, oj, di, dj)
        ) {
            return false;
        };

        tablero.removePieza(oi, oj);
        tablero.setPieza(pieza, di, dj);
        return true;
    }

}
