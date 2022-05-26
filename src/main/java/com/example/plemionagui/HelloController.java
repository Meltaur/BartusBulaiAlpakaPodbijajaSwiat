package com.example.plemionagui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController<img1> implements Initializable{

    @FXML
    public TableView tableView;

    @FXML
    public TableColumn<Jednostka, String> nazwa;

    @FXML
    public TableColumn<Jednostka, Integer> liczba;

    @FXML
    public Button loadButton;

    @FXML
    public TextField textField;


    @FXML
    ObservableList<Jednostka> list = FXCollections.observableArrayList(
            new Jednostka("Pika", 50),
            new Jednostka("Miecz", 550),
            new Jednostka("Topor", 100),
            new Jednostka("Luk", 10),
            new Jednostka("Zwiad", 200),
            new Jednostka("LK", 550),
            new Jednostka("LK", 0),
            new Jednostka("CK", 50),
            new Jednostka("Taran", 100),
            new Jednostka("Katapulta", 10),
            new Jednostka("Rycerz", 1),
            new Jednostka("Gruby", 1),
            new Jednostka("Chlop", 100),
            new Jednostka("Komendy", 30),
            new Jednostka("Ataki", 2)
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        tableView.setFixedCellSize(20.0);
    }

    public ObservableList<Jednostka> getList() {
        return list;
    }

    public void onButton(){
        textField.setText("User: NaczelnySabotazysta");

        nazwa.setCellValueFactory(new PropertyValueFactory<>("nazwa"));
        liczba.setCellValueFactory(new PropertyValueFactory<>("liczba"));

        tableView.setItems(list);


    }
}

