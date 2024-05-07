package ru.job4j.chapter3.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenByDescNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenByAscNameAndAscPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Программист", 1),
                new Job("Грузчик", 2)
        );
        List<Job> expected = Arrays.asList(
                jobs.get(1),
                jobs.get(0)

        );
        jobs.sort(new JobDescByPriority());
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Программист", 1),
                new Job("Грузчик", 2)
        );
        List<Job> expected = Arrays.asList(
                jobs.get(0),
                jobs.get(1)

        );
        jobs.sort(new JobDescByName());
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenAscByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Программист", 1),
                new Job("Грузчик", 2)
        );
        List<Job> expected = Arrays.asList(
                jobs.get(1),
                jobs.get(0)

        );
        jobs.sort(new JobAscByName());
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Программист", 1),
                new Job("Грузчик", 2)
        );
        List<Job> expected = Arrays.asList(
                jobs.get(0),
                jobs.get(1)

        );
        jobs.sort(new JobAscByPriority());
        assertThat(jobs).isEqualTo(expected);
    }
}