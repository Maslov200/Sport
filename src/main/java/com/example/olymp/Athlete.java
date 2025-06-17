package com.example.olymp;

public class Athlete {
    private String firstName;
    private String lastName;
    private String sport;

    public Athlete(String firstName, String lastName, String sport) {
        this.firstName = firstName != null && !firstName.isEmpty() ? firstName : "Не указано";
        this.lastName = lastName != null && !lastName.isEmpty() ? lastName : "Не указано";
        this.sport = sport != null ? sport : "Не указано";
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSport() {
        return sport;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + " — " + sport;
    }
}
