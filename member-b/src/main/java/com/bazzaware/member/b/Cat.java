/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bazzaware.member.b;

/**
 *
 * @author bazza
 */

public class Cat {
    private final String _name;
    private final String _colour;

    public Cat(String name, String colour) {
        _name = name;
        _colour = colour;
    }
    public String makeNoise(){
        return "Purr purr!";
    }

    @Override
    public String toString() {
        return "Name: " + _name + "\nColour: " + _colour;
    }
}
