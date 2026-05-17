package com.empresa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSuma() {
        assertEquals(5, calc.sumar(2,3));
    }

    @Test
    void testResta() {
        assertEquals(2, calc.restar(5,3));
    }
}