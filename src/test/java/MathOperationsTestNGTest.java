package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathOperationsTestNGTest {

    @Test
    public void testFactorial() {
        Assert.assertEquals(MathOperations.factorial(0), 1);
        Assert.assertEquals(MathOperations.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialException() {
        MathOperations.factorial(-5);
    }

    @Test
    public void testTriangleArea() {
        Assert.assertEquals(MathOperations.triangleArea(5, 4), 10.0, 0.0001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaException() {
        MathOperations.triangleArea(0, 4);
    }

    @Test
    public void testCalculate() {
        Assert.assertEquals(MathOperations.calculate(9, 1, "+"), 10);
        Assert.assertEquals(MathOperations.calculate(8, 6, "-"), 2);
        Assert.assertEquals(MathOperations.calculate(6, 5, "*"), 30);
        Assert.assertEquals(MathOperations.calculate(6, 3, "/"), 2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testCalculateException() {
        MathOperations.calculate(6, 0, "/");
    }

    @Test
    public void testCompare() {
        Assert.assertEquals(MathOperations.compare(10, 5), 1);
        Assert.assertEquals(MathOperations.compare(3, 7), -1);
        Assert.assertEquals(MathOperations.compare(5, 5), 0);
    }
}