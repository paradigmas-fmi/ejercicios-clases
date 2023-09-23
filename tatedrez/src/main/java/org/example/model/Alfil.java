package org.example.model;

import java.util.stream.IntStream;

public class Alfil extends Pieza {

    public Alfil(Config.ColoresJugadores color) {
        super(color);
    }

    @Override
    public Boolean validarMovimiento(Tablero tablero, Integer oi, Integer oj, Integer di, Integer dj) {
        if (di >= tablero.getDimensiones() || dj >= tablero.getDimensiones()) {
            return false;
        }

        Integer idiff = Math.abs(oi - di);
        Integer jdiff = Math.abs(oj - dj);
        Integer isign = (di - oi) / idiff;
        Integer jsign = (dj - oj) / jdiff;

        if (idiff == jdiff) {
            return IntStream.range(1, idiff).allMatch(x -> !tablero.estaOcupada(oi+isign*x, oj+jsign*x));
        }
        return false;
    };
}
