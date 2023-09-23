package org.example.view;

import org.example.model.Config;
import org.example.model.Pieza;

public class AlfilView extends PiezaView {

    public AlfilView(Pieza pieza) {
        super(pieza);
    }
    @Override
    public void mostrar() {
        System.out.printf(pieza.getColor() == Config.ColoresJugadores.NEGRO ? " \u2657 " : " \u265D ");
    }
}
