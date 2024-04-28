package ru.job4j.chapter2.exception;

public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String message) {
        super(message);
    }
}
