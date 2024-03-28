package ru.job4j.chapter1.variables;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += "But I am a newbie.";
        int year = 2024;
        idea = idea + year;
        System.out.println(idea);
    }
}
