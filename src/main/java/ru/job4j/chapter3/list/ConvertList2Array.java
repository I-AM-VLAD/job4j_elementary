package ru.job4j.chapter3.list;

import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int i = 0;
        int j = 0;
        for (Integer number : list) {
            array[i][j] = number;
            j++;
            if (j == cells) {
                j = 0;
                i++;
            }
        }
        return array;
    }
}
