package ru.job4j.chapter1.array;

public class Turn {
    public static int[] back(int[] array) {
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (i >= j) {
                break;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            --j;
        }
        return array;
    }
}
