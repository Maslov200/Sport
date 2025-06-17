package com.example.olymp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class AthleteController {
    private ObservableList<Athlete> athletes = FXCollections.observableArrayList();
    public void addAthlete(String firstName, String lastName, String sport) {
        athletes.add(new Athlete(firstName, lastName, sport));
    }
    public ObservableList<Athlete> getAthletes() {
        return athletes;
    }
}
