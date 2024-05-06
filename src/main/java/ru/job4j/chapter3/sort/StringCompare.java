package ru.job4j.chapter3.sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            if (Character.compare(left.charAt(i), right.charAt(i)) != 0) {
                result = Character.compare(left.charAt(i), right.charAt(i));
            }
        }
        if (result == 0) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}