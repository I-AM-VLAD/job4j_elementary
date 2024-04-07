package ru.job4j.chapter1.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int number = 5;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int result = Factorial.calculate(0);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNegativeArgumentThenException() {
        assertThatThrownBy(() -> Factorial.calculate(-6))
                .isInstanceOf(IllegalArgumentException.class);
    }
}