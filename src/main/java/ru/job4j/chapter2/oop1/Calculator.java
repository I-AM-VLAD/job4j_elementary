package ru.job4j.chapter2.oop1;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a)
                + multiply(a)
                + minus(a)
                + divide(a);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(10);
        int resultMinus = Calculator.minus(10);
        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(10);
        int resultDivide = calculator.divide(10);
        int resultAll = calculator.sumAllOperation(10);
    }
}
