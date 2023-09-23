package org.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Tablero {

    private List<List<Pieza>> piezas;
    static private Integer dimensiones = 3;

    public Tablero() {
        this.piezas = new ArrayList<>();
        for (int i=0; i<dimensiones; ++i) {
            this.piezas.add(Arrays.asList(new Pieza[dimensiones]));
        }
    }

    public Integer getDimensiones() {
        return dimensiones;
    }

    public Optional<Pieza> getPieza(Integer i, Integer j) {
        return Optional.ofNullable(piezas.get(j).get(i));
    }

    public Pieza setPieza(Pieza pieza, Integer i, Integer j) {
        return piezas.get(j).set(i, pieza);
    }

    public void removePieza(Integer i, Integer j) {
        piezas.get(j).set(i, null);
    }

    public boolean estaOcupada(Integer i, Integer j) {
        return piezas.get(j).get(i) != null;
    }

    public List<Integer[]> getPiezas(Config.ColoresJugadores color) {
        List<Integer[]> coordenadas = new ArrayList<>();

        for (Integer j=0; j < dimensiones; j++) {
            for (Integer i=0; i < dimensiones; i++) {
                Pieza pieza = piezas.get(j).get(i);
                if (pieza != null && pieza.getColor() == color) {
                    coordenadas.add(new Integer[]{i, j});
                }
            }
        }

        return coordenadas;
    }
}
