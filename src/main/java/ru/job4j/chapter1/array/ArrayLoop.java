package ru.job4j.chapter1.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int numb : numbers) {
            System.out.println(numb);
        }
    }
}
