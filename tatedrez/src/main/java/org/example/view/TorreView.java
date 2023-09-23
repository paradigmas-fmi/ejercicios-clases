package org.example.view;

import org.example.model.Config;
import org.example.model.Pieza;

public class TorreView extends PiezaView {

    public TorreView(Pieza pieza) {
        super(pieza);
    }
    @Override
    public void mostrar() {
        System.out.printf(pieza.getColor() == Config.ColoresJugadores.NEGRO ? " \u2656 " : " \u265C ");
    }
}
