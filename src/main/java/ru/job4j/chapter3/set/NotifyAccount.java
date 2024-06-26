package ru.job4j.chapter3.set;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> result = new HashSet<>();
        for (Account account : accounts) {
            result.add(account);
        }
        return result;
    }
}
