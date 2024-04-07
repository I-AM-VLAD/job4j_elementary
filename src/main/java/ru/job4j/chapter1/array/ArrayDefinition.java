package ru.job4j.chapter1.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);

        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Vlad";
        names[2] = "Stas";
        names[3] = "Ruslan";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
