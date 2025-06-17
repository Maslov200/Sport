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
        // Например, передаем только имя, а фамилия должна быть "Не указано"
        Athlete athlete = new Athlete("Иван", "", "Плавание");

        String expectedLastName = "Не указано";

        // Логика обработки некорректного ФИО должна быть реализована в конструкторе Athlete
        // (если она не реализована — добавь туда)
        assertEquals("Иван", athlete.getFirstName());
        assertEquals(expectedLastName, athlete.getLastName());
    }
}
