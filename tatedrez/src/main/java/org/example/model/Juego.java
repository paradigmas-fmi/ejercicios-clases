package org.example.model;

import java.util.List;
import java.util.Optional;

public class Juego {
    private List<Jugador> jugadores;
    private Tablero tablero;
    private AdministradorDeTurnos administradorDeTurnos;
    private AdministradorDeMovimientos administradorDeMovimientos;

    public Juego(List<Jugador> jugadores) {
        this.tablero = new Tablero();
        this.jugadores = jugadores;

        this.administradorDeTurnos = new AdministradorDeTurnos(jugadores);
        this.administradorDeMovimientos = new AdministradorDeMovimientos(tablero);
    }

    public void setPieza(Pieza pieza, Integer i, Integer j) {
        tablero.setPieza(pieza, i, j);
    }

    public Jugador getJugadorActual() {
        return administradorDeTurnos.obtenerJugador();
    }

    public Boolean terminado() {
        List<Integer[]> negras = tablero.getPiezas(Config.ColoresJugadores.NEGRO);
        List<Integer[]> blancas = tablero.getPiezas(Config.ColoresJugadores.BLANCO);

        return checkColoresEnLinea(negras) || checkColoresEnLinea(blancas);
    }

    public void cambiarTurno() {
        administradorDeTurnos.siguienteTurno();
    }

    public Tablero getTablero() {
        return this.tablero;
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    public Boolean mover(Integer oi, Integer oj, Integer di, Integer dj) {
        Jugador jugador = this.getJugadorActual();
        Optional<Pieza> pieza = this.tablero.getPieza(oi, oj);
        if (pieza.isEmpty() || pieza.get().getColor() != jugador.getColor()) {
            return false;
        }

        return administradorDeMovimientos.mover(pieza.get(), oi, oj, di, dj);
    }

    private boolean checkColoresEnLinea(List<Integer[]> piezas) {
        Integer[] p1 = piezas.get(0);
        Integer[] p2 = piezas.get(1);
        Integer[] p3 = piezas.get(2);
        return  p1[0] == p2[0]+1 && p2[0] == p3[0]+1 && p1[1] == p2[1] && p2[1] == p3[1] || // Horizontales
                p1[0] == p2[0]-1 && p2[0] == p3[0]-1 && p1[1] == p2[1] && p2[1] == p3[1] ||
                p1[0] == p2[0]+1 && p2[0] == p3[0]+1 && p1[1] == p2[1]+1 && p2[1] == p3[1]+1 || // Diagonales
                p1[0] == p2[0]+1 && p2[0] == p3[0]+1 && p1[1] == p2[1]-1 && p2[1] == p3[1]-1 ||
                p1[0] == p2[0]-1 && p2[0] == p3[0]-1 && p1[1] == p2[1]+1 && p2[1] == p3[1]+1 ||
                p1[0] == p2[0]-1 && p2[0] == p3[0]-1 && p1[1] == p2[1]-1 && p2[1] == p3[1]-1 ||
                p1[0] == p2[0] && p2[0] == p3[0] && p1[1] == p2[1]+1 && p2[1] == p3[1]+1 || // Verticales
                p1[0] == p2[0] && p2[0] == p3[0] && p1[1] == p2[1]-1 && p2[1] == p3[1]-1;
    }
}
