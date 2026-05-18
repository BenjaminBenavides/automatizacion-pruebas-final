package com.empresa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculadoraIntegrationTest {

    @Test
    void testOperacionCompleta() {

        Calculadora calc = new Calculadora();

        int resultado = calc.sumar(5,5);

        resultado = calc.restar(resultado,3);

        assertTrue(resultado == 7);
    }
}