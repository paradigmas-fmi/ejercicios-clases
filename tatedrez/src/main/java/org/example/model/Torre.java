package org.example.model;

import java.util.stream.IntStream;

public class Torre extends Pieza {

    public Torre(Config.ColoresJugadores color) {
        super(color);
    }
    @Override
    public Boolean validarMovimiento(Tablero tablero, Integer oi, Integer oj, Integer di, Integer dj) {
        if (di >= tablero.getDimensiones() || dj >= tablero.getDimensiones()) {
            return false;
        }

        Integer idiff = Math.abs(oi - di);
        Integer jdiff = Math.abs(oj - dj);

        if (idiff == 0 || jdiff == 0) {
            Integer sign = idiff != 0 ? (di - oi) / idiff : (dj - oj) / jdiff;
            boolean iMovValido = IntStream.range(1, idiff).allMatch(i -> !tablero.estaOcupada(oi+sign*i, oj));
            boolean jMovValido = IntStream.range(1, jdiff).allMatch(j -> !tablero.estaOcupada(oi, oj+sign*j));
            return iMovValido && jMovValido;
        }
        return false;
    }
}
