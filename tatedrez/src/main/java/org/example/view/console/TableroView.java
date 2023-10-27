package org.example.view.console;

import org.example.model.Pieza;
import org.example.model.Tablero;

import java.util.Optional;

public class TableroView {
    private PiezaViewFactory piezaViewFactory;
    private Tablero tablero;

    public TableroView(Tablero tablero) {

        this.tablero = tablero;
        this.piezaViewFactory = new PiezaViewFactory();
    }

    public void mostrar() {
        Integer dimensiones = tablero.getDimensiones();

        for (Integer i = 0; i < dimensiones; i++) {
            for (Integer j = 0; j < dimensiones; j++) {
                Optional<Pieza> pieza = tablero.getPieza(i, j);
                if (pieza.isEmpty()) {
                    System.out.print(" _ ");
                } else {
                    PiezaView piezaVista = this.piezaViewFactory.createPiezaView(pieza.get());
                    piezaVista.mostrar();
                }
            }
            System.out.println();
        }
    }
}
