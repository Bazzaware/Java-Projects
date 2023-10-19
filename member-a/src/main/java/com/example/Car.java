package com.example;

public class Car {
    private String _make;
    private String _model;

    public Car(String make, String model) {
        _make = make;
        _model = model;
    }

    public String toString() {
        return "Make: " + _make + "\nModel: " + _model;
    }
 
}
