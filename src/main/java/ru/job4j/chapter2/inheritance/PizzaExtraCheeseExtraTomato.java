package ru.job4j.chapter2.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    public String name() {
        return super.name() + "+томаты";
    }
}
