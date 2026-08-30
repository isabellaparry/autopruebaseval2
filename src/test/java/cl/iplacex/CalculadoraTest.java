package cl.iplacex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    void testSuma() {
        Calculadora calculadora = new Calculadora();

        int resultadoTest = calculadora.sumar(5, 3);

        assertEquals(8, resultadoTest);
    }

    @Test
    void testResta() {
        Calculadora calculadora = new Calculadora();

        int resultadoTest = calculadora.restar(10, 4);

        assertEquals(6, resultadoTest);
    }
}