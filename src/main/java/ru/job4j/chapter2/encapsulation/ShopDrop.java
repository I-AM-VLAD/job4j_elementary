package ru.job4j.chapter2.encapsulation;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        if (index >= products.length) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < products.length; i++) {
            if (i + 1 < products.length) {
                products[i] = products[i + 1];
            }
        }
        products[products.length - 1] = null;
        return products;
    }
}