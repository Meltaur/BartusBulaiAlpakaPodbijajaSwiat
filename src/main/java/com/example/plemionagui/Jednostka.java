package com.example.plemionagui;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Jednostka {
    public SimpleStringProperty nazwa;
    public SimpleIntegerProperty liczba;

    public Jednostka(String nazwa, int liczba){
        this.nazwa = new SimpleStringProperty(nazwa);
        this.liczba = new SimpleIntegerProperty(liczba);
    }

    public StringProperty nazwaProperty(){
        return nazwa;
    }

    public void setNazwa(String nazwa){
        this.nazwa.set(nazwa);
    }

    public IntegerProperty liczbaProperty(){
        return liczba;
    }

    public void setLiczba(int liczba){
        this.liczba.set(liczba);
    }
}
