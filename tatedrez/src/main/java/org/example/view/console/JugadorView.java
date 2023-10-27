package org.example.view.console;

import org.example.model.Jugador;

public class JugadorView {
    private Jugador jugador;

    public JugadorView(Jugador jugador) {
        this.jugador = jugador;
    }

    public void mostrar() {
        System.out.println(String.format("Turno de %s (%s)", jugador.getNombre(), jugador.getColor()));
    }
}
