package ru.job4j.chapter2.exception;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] != null && key.equals(value[i])) {
                result = i;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("element non found");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] example = new String[] {"test1", "test2", "test3"};
        try {
            int result = indexOf(example, "test4");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
