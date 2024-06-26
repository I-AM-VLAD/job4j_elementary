package ru.job4j.chapter4.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {

    public static List<Integer> convert(Integer[][] matrix) {
       return Stream.of(matrix)
                .flatMap(Stream::of)
                .collect(Collectors.toList());

    }
}
