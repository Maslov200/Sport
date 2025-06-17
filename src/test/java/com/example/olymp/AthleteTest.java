package com.example.olymp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AthleteTest {

    @Test
    public void testCorrectFullName() {
        Athlete athlete = new Athlete("Иван", "Иванов", "Лёгкая атлетика");

        assertEquals("Иван", athlete.getFirstName());
        assertEquals("Иванов", athlete.getLastName());
        assertEquals("Лёгкая атлетика", athlete.getSport());
    }

    @Test
    public void testIncorrectFullName() {
        Athlete athlete = new Athlete("Иван", "", "Плавание");

        String expectedLastName = "Не указано";

        assertEquals("Иван", athlete.getFirstName());
        assertEquals(expectedLastName, athlete.getLastName());
    }
}
