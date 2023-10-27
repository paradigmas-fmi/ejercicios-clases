package org.example.view.console;

import org.example.model.Pieza;

public abstract class PiezaView {

    protected Pieza pieza;
    public PiezaView(Pieza pieza) {
        this.pieza = pieza;
    }

    public abstract void mostrar();
}
