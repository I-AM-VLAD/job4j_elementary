package ru.job4j.chapter3.list;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> pAddress = person -> person.getAddress().contains(key);
        Predicate<Person> pName = person -> person.getName().contains(key);
        Predicate<Person> pPhone = person -> person.getPhone().contains(key);
        Predicate<Person> pSurname = person -> person.getSurname().contains(key);
        Predicate<Person> combine = pAddress.or(pName).or(pPhone).or(pSurname);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
