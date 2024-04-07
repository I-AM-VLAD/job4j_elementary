package ru.job4j.chapter1.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {
    @Test
    void start0Finish5Then15() {
        int result = Counter.sum(0, 5);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void start3Finish8Then33() {
        int result = Counter.sum(3, 8);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void start1Finish1Then0() {
        int result = Counter.sum(1, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void start10Finish1Then0() {
        int result = Counter.sum(10, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus3T010Then28() {
        int result = Counter.sumByEven(-3, 10);
        int expected = 28;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersStart10Finish1Then0() {
        int result = Counter.sumByEven(10, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }


}