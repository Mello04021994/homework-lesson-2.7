package com.homework;

public class MathOperations {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double triangleArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Все стороны должны быть > 0");
        }
        return 0.5 * base * height;
    }

    public static int calculate(int a, int b, String operation) {
        switch (operation) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Деление на ноль");
                return a / b;
            default: throw new IllegalArgumentException("Неверная операция: " + operation);
        }
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }
}