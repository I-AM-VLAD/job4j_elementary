package ru.job4j.chapter2.exception;

public class FactorialRecursion {
    public static int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return calc(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        int result = calc(5);
        System.out.println(result);
    }
}
