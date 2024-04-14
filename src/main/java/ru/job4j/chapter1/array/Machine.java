package ru.job4j.chapter1.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int change = money - price;
        int j = 0;
        for (int element : coins) {
            while (change >= element) {
               change -= element;
               result[j] = element;
               j++;
            }
        }
        return Arrays.copyOf(result, j);
    }
}
