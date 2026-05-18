package com.empresa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraAcceptanceTest {

    @Test
    void testFlujoCompletoCalculadora() {

        Calculadora calc = new Calculadora();

        int resultado = calc.sumar(10,5);

        resultado = calc.restar(resultado,3);

        assertEquals(12, resultado);
    }
}