package ru.job4j.chapter2.exception;

public class FactorialRecursion {
    public static int calc(int n) {
        int result;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            result = calc(n - 1) * n;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = calc(5);
        System.out.println(result);
    }
}
