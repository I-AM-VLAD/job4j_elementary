package ru.job4j.chapter1.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательный аргумент");
        }
        for (int i = 1; i <= number; i++) {
            if (number == 0 || number == 1) {
                break;
            }
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(0));
    }
}
