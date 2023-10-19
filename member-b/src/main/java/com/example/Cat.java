package com.example;

public class Cat {
    private String _name;
    private String _colour;

    public Cat(String name, String colour) {
        _name = name;
        _colour = colour;
    }

    public String toString() {
        return "Name: " + _name + "\nColour: " + _colour;
    }

}
