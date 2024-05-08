package ru.job4j.chapter4.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(product -> (product.getActual() - product.getStandard()) >= 0)
                .filter(product -> (product.getActual() - product.getStandard()) <= 3)
                .map(Product::toString).collect(Collectors.toList());
    }
}
