package unit.model;

import org.example.model.*;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class JuegoTest {

    @Test
    public void testMover() throws IllegalAccessException {
        // Arrange
        Jugador j1 = mock(Jugador.class);
        Jugador j2 = mock(Jugador.class);
        Juego juego = new Juego(List.of(j1, j2));

        // Mock private attribute
        AdministradorDeMovimientos adminDeMovimientosMock = mock(AdministradorDeMovimientos.class);
        juego.setAdministradorDeMovimientos(adminDeMovimientosMock);

        // Mock private attribute
        AdministradorDeTurnos adminDeTurnosMock = mock(AdministradorDeTurnos.class);
        juego.setAdministradorDeTurnos(adminDeTurnosMock);

        Pieza pieza = mock(Pieza.class);
        juego.setPieza(pieza, 0,0);

        when(pieza.getColor()).thenReturn(Config.ColoresJugadores.BLANCO);
        when(adminDeTurnosMock.obtenerJugador()).thenReturn(j1);
        when(j1.getColor()).thenReturn(Config.ColoresJugadores.BLANCO);

        // Act
        juego.mover(0,0, 1,1);

        // Assert
        verify(pieza).getColor();
        verify(j1).getColor();
        verify(adminDeTurnosMock).obtenerJugador();
        verify(adminDeMovimientosMock).mover(pieza, 0,0,1,1);
    }
}
