package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsJUnit5Test {

    @Test
    void testFactorial() {
        assertEquals(1, MathOperations.factorial(0));
        assertEquals(120, MathOperations.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> MathOperations.factorial(-1));
    }

    @Test
    void testTriangleArea() {
        assertEquals(10.0, MathOperations.triangleArea(5, 4), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> MathOperations.triangleArea(-1, 4));
    }

    @Test
    void testCalculate() {
        assertEquals(14, MathOperations.calculate(10, 4, "+"));
        assertEquals(1, MathOperations.calculate(10, 9, "-"));
        assertEquals(35, MathOperations.calculate(5, 7, "*"));
        assertEquals(2, MathOperations.calculate(6, 3, "/"));
        assertThrows(ArithmeticException.class, () -> MathOperations.calculate(6, 0, "/"));
    }

    @Test
    void testCompare() {
        assertEquals(1, MathOperations.compare(10, 5));
        assertEquals(-1, MathOperations.compare(3, 7));
        assertEquals(0, MathOperations.compare(5, 5));
    }
}