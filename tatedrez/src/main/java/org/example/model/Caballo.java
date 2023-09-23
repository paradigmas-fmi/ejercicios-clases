package org.example.model;

public class Caballo extends Pieza {

    public Caballo(Config.ColoresJugadores color) {
        super(color);
    }
    @Override
    public Boolean validarMovimiento(Tablero tablero, Integer oi, Integer oj, Integer di, Integer dj) {
        if (di >= tablero.getDimensiones() || dj >= tablero.getDimensiones()) {
            return false;
        }

        Integer idiff = Math.abs(oi - di);
        Integer jdiff = Math.abs(oj - dj);

        return ((idiff == 2 && jdiff == 1) || (idiff == 1 && jdiff == 2)) && !tablero.estaOcupada(di, dj);
    };
}
