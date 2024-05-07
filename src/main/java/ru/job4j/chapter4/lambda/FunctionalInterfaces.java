package ru.job4j.chapter4.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (first, second) -> map.put(first, second);
        biConsumer.accept(1, "one");
        biConsumer.accept(2, "two");

        BiPredicate<Integer, String> biPredicate = (key, second) -> key % 2 == 0 || second.length() == 4;
        for (Integer key : map.keySet()) {
            if (biPredicate.test(key, map.get(key))) {
                System.out.println("key: " + key + " value: " + map.get(key));
            }
        }

        Supplier<List<String>> supplier = () -> new ArrayList<String>();
        List<String> strings = supplier.get();

        Consumer<String> consumer = (first) -> System.out.println(first);
        Function<String, String> function = (first) -> first.toUpperCase();
        for (String string : strings) {
            consumer.accept(function.apply(string));
        }
    }
}