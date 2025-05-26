package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraGeometricaTest {

    @Test
    public void calculoSenoTest() {
        CalculadoraGeometrica calculadora = new CalculadoraGeometrica();
        assertEquals( 0, calculadora.sen(0));
        assertEquals(1, calculadora.sen(90));
        assertEquals(0, calculadora.sen(180));
        assertEquals(-1, calculadora.sen(270));
    }

    @Test
    public void calculoCosenoTest() {
        CalculadoraGeometrica calculadora = new CalculadoraGeometrica();
        assertEquals( 1, calculadora.cos(0));
        assertEquals(0, calculadora.cos(90));
        assertEquals(-1, calculadora.cos(180));
        assertEquals(0, calculadora.cos(270));
    }

    @Test
    public void calculoTangenteTest() {
        CalculadoraGeometrica calculadora = new CalculadoraGeometrica();
        assertEquals( 1, calculadora.tan(45), 0.001);
        assertEquals(Math.sqrt(3), calculadora.tan(60),  0.001);
    }

    @Test
    public void calculoHipotenusaTest() {
        CalculadoraGeometrica calculadora = new CalculadoraGeometrica();
        double opuesto = 1;
        double adyacente = 1;
        double angulo = 45;

        double hip2 = adyacente / calculadora.cos(angulo); // raiz 2

        assertEquals(5, calculadora.hipotenusa(3, 4));
        assertEquals(hip2, calculadora.hipotenusa(opuesto, adyacente), 0.0000001);
    }




}