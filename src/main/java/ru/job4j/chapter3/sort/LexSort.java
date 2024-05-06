package ru.job4j.chapter3.sort;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String numberLeft = left.split("\\.")[0];
        String numberRight = right.split("\\.")[0];
        return Integer.compare(Integer.parseInt(numberLeft), Integer.parseInt(numberRight));
    }
}
