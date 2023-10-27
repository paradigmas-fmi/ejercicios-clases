package integration.model;

import org.example.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JuegoTest {

    @Test
    public void testJuegoCorto() {
        // Arrange
        Jugador j1 = new Jugador("Mati", Config.ColoresJugadores.BLANCO);
        Jugador j2 = new Jugador("Nacho", Config.ColoresJugadores.NEGRO);
        Juego juego = new Juego(List.of(j1, j2));

        juego.setPieza(new Caballo(Config.ColoresJugadores.BLANCO), 0, 0);
        juego.setPieza(new Torre(Config.ColoresJugadores.NEGRO), 1, 0);
        juego.setPieza(new Alfil(Config.ColoresJugadores.BLANCO), 0, 2);

        juego.setPieza(new Caballo(Config.ColoresJugadores.NEGRO), 2, 0);
        juego.setPieza(new Torre(Config.ColoresJugadores.BLANCO), 2, 1);
        juego.setPieza(new Alfil(Config.ColoresJugadores.NEGRO), 2, 2);

        //   0  1  2
        // 0 ♞  _  ♝
        // 1 ♖  _  _
        // 2 ♘  ♜  ♗

        // Juego continua
        assertEquals(juego.terminado(), false);

        // Mover torre blanca
        assertEquals(
                juego.mover(2,1,0,1),
                true
        );

        // Juego terminado
        assertEquals(juego.terminado(), true);
    }

    @Test
    public void testJuegoLargo() {
        // Arrange
        Jugador j1 = new Jugador("Mati", Config.ColoresJugadores.BLANCO);
        Jugador j2 = new Jugador("Nacho", Config.ColoresJugadores.NEGRO);
        Juego juego = new Juego(List.of(j1, j2));

        juego.setPieza(new Caballo(Config.ColoresJugadores.BLANCO), 0, 0);
        juego.setPieza(new Torre(Config.ColoresJugadores.NEGRO), 1, 0);
        juego.setPieza(new Alfil(Config.ColoresJugadores.BLANCO), 0, 2);

        juego.setPieza(new Caballo(Config.ColoresJugadores.NEGRO), 2, 0);
        juego.setPieza(new Torre(Config.ColoresJugadores.BLANCO), 2, 1);
        juego.setPieza(new Alfil(Config.ColoresJugadores.NEGRO), 2, 2);

        //   0  1  2
        // 0 ♞  _  ♝
        // 1 ♖  _  _
        // 2 ♘  ♜  ♗


        // Juego continua
        assertEquals(juego.terminado(), false);

        // Mover torre negra en turno blanco
        assertEquals(
                juego.mover(1,0,1,1),
                false
        );

        // Mover alfil blanca
        assertEquals(
                juego.mover(0,2,1,1),
                true
        );

        //   0  1  2
        // 0 ♞  _  _
        // 1 ♖  ♝  _
        // 2 ♘  ♜  ♗

//        juego.cambiarTurno();

        // Mover caballo negro
        assertEquals(
                juego.mover(2,0,1,2),
                true
        );


        // Juego terminado
        assertEquals(juego.terminado(), false);
    }
}
