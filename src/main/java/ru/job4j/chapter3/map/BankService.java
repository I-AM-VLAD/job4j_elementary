package ru.job4j.chapter3.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс позволяет проводить простые
 * банковские операции.
 * @author VLAD CHUPRYNA
 * @version 1.0
 */

public class BankService {
    /**
     * Хранилище всех клиентов
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет всавить пользователя
     * в хранилище.
     * @param user пользователь, который добавляется в хранилище
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод удаляет полязователя из хранилища.
     * @param passport для поиска user, для удаления
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Находим пользователя по паспорту,
     * получаем список его аккаунтов,
     * если передаваемого аккаута еще нет,
     * вставояем его в спискок
     * @param passport для поиска пользователя
     * @param account для вставки в список аккаунтов
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * В методе получаем список всех пользовтелей
     * и ищем походящего пальзователя
     * @param passport для поиска пользователя
     * @return возвращаем позователя
     */
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

    /**
     * Получаем список аккаутов и ищем
     * подходящий аккаунт по реквизитам
     * @param passport для поиска пользователя
     * @param requisite для поиска подходящего аккаунта
     * @return подходящий аккаунт
     */
    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account element : users.get(user)) {
                if (element.getRequisite().equals(requisite)) {
                    result = element;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * По соответствующим параметрам мы находим sourceAccount
     * и destinationAccount, с одного аккаунта мы снимаем значение amount,
     * а к другому прибавляем
     * @param sourcePassport для поиска sourceAccount
     * @param sourceRequisite для поиска sourceAccount
     * @param destinationPassport для поиска destinationAccount
     * @param destinationRequisite для поиска destinationAccount
     * @param amount значение, которое либо добавляется, либо отнимается из
     *               соответствующего аккаунта.
     * @return true, если деньги удалось перевести и false - в противном случае
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount != null && destinationAccount != null && sourceAccount.getBalance() >= amount) {
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            destinationAccount.setBalance(destinationAccount.getBalance() + amount);
            result = true;
        }
        return result;
    }

    /**
     * Метод для тестов
     * @param user ключ поиска
     * @return список аккаунтов
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}