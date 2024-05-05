package ru.job4j.chapter3.map;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenDuplicate() {
        Citizen citizenPetr = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizenVlad = new Citizen("2f44a", "Vlad Chupryna");
        PassportOffice office = new PassportOffice();
        office.add(citizenPetr);
        assertThat(office.add(citizenVlad)).isFalse();
    }
}