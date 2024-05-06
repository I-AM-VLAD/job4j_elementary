package ru.job4j.chapter3.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(String passport) {
        if (findByPassport(passport) != null) {
            users.remove(findByPassport(passport));
        }
    }

    public void addAccount(String passport, Account account) {
        boolean result = false;
        if (findByPassport(passport) != null) {
            for (Account element : users.get(findByPassport(passport))) {
                if (element.equals(account)) {
                    result = true;
                    break;
                }
            }
        }
        if (!result && findByPassport(passport) != null) {
            users.get(findByPassport(passport)).add(account);
        }
    }

    public User findByPassport(String passport) {
        User result = null;
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                result = user;
                break;
            }
        }
        return result;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        if (users.get(findByPassport(passport)) != null) {
            for (Account element : users.get(findByPassport(passport))) {
                if (element.getRequisite().equals(requisite)) {
                    result = element;
                    break;
                }
            }
        }
        return result;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount != null && destinationAccount != null && sourceAccount.getBalance() >= amount) {
            findByRequisite(sourcePassport, sourceRequisite).setBalance(sourceAccount.getBalance() - amount);
            findByRequisite(destinationPassport, destinationRequisite).setBalance(destinationAccount.getBalance() + amount);
            result = true;
        }
        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}