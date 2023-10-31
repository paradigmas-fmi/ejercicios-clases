package org.example.view;

import org.example.model.Alfil;
import org.example.model.Caballo;
import org.example.model.Pieza;

public class PiezaViewFactory {
    public PiezaView createPiezaView(Pieza pieza) {
        if (pieza.getClass() == Caballo.class) {
            return new CaballoView(pieza);
        }
        if (pieza.getClass() == Alfil.class) {
            return new AlfilView(pieza);
        }
        return new TorreView(pieza);
    }
}
