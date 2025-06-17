package com.example.olymp;

import javafx.scene.control.*;
import javafx.scene.layout.*;

public class MainView {
    private VBox view;
    private AthleteController controller;
    public MainView() {
        controller = new AthleteController();

        TextField nameField = new TextField();
        nameField.setPromptText("Имя");

        TextField surnameField = new TextField();
        surnameField.setPromptText("Фамилия");

        TextField sportField = new TextField();
        sportField.setPromptText("Вид спорта");

        Button addButton = new Button("Добавить спортсмена");
        ListView<String> listView = new ListView<>();
        addButton.setOnAction(e -> {
            String name = nameField.getText().trim();
            String surname = surnameField.getText().trim();
            String sport = sportField.getText().trim();
            if (!name.isEmpty() && !surname.isEmpty() && !sport.isEmpty()) {
                controller.addAthlete(name, surname, sport);
                listView.getItems().clear();
                controller.getAthletes().forEach(a -> listView.getItems().add(a.toString()));
                nameField.clear();
                surnameField.clear();
                sportField.clear();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Пожалуйста, заполните все поля.");
                alert.showAndWait();
            }
        });

        view = new VBox(10, new Label("Добавить спортсмена:"), nameField, surnameField, sportField, addButton,
                new Label("Список спортсменов:"), listView);
        view.setStyle("-fx-padding: 10;");
    }

    public VBox getView() {
        return view;
    }
}
