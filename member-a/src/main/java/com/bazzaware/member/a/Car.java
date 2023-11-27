/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bazzaware.member.a;

/**
 *
 * @author bazza
 */
public class Car {
    private final String _make;
    private final String _model;
    
    public Car(String make, String model){
        _make = make;
        _model = model;
    }
    
    public String makeNoise(){
        return "Broom broom!";
    }
    
    @Override
    public String toString() {
        return "Make: " + _make + "\nModel: " + _model;
    }
}
