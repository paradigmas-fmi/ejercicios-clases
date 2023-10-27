package unit.model;

import org.example.model.Config;
import org.example.model.Tablero;
import org.example.model.Torre;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TorreTest {

    @Test
    public void testValidarMovimientoFueraDeDimensiones() {
        // Arrange
        Torre torre = new Torre(Config.ColoresJugadores.BLANCO);
        Tablero tablero = mock(Tablero.class);
        when(tablero.getDimensiones()).thenReturn(3);

        // Act
        Boolean resultado = torre.validarMovimiento(tablero, 0, 0, 3,0);

        // Assert
        assertEquals(resultado, false);
    }

    @Test
    public void testValidarMovimientoInvalido() {
        // Arrange
        Torre torre = new Torre(Config.ColoresJugadores.BLANCO);
        // Mock tablero
        Tablero tablero = mock(Tablero.class);
        when(tablero.getDimensiones()).thenReturn(3);

        // Act
        Boolean resultado = torre.validarMovimiento(tablero, 0, 0, 1,1);

        // Assert
        assertEquals(resultado, false);
    }

    @Test
    public void testValidarMovimientoPosicionItermediaOcupada() {
        // Arrange
        Torre torre = new Torre(Config.ColoresJugadores.BLANCO);
        // Mock tablero
        Tablero tablero = mock(Tablero.class);
        when(tablero.getDimensiones()).thenReturn(3);
        when(tablero.estaOcupada(anyInt(), anyInt())).thenReturn(false);
        when(tablero.estaOcupada(1, 0)).thenReturn(true);

        // Act
        Boolean resultado = torre.validarMovimiento(tablero, 0, 0, 2,0);

        // Assert
        assertEquals(resultado, false);
    }

    @Test
    public void testValidarMovimientoValido() {
        // Arrange
        Torre torre = new Torre(Config.ColoresJugadores.BLANCO);
        // Mock tablero
        Tablero tablero = mock(Tablero.class);
        when(tablero.getDimensiones()).thenReturn(3);
        when(tablero.estaOcupada(anyInt(), anyInt())).thenReturn(false);

        // Act
        Boolean resultado = torre.validarMovimiento(tablero, 0, 0, 2,0);

        // Assert
        assertEquals(resultado, true);
    }
}
