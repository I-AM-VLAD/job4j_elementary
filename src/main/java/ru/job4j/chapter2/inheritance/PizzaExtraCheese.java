package ru.job4j.chapter2.inheritance;

public class PizzaExtraCheese extends Pizza {
    public String name() {
        return super.name() + "+сыр";
    }
}
