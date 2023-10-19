package com.bazzaware.main;

import com.example.Car;
import com.example.Cat;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car01 = new Car("Ford", "Capri");
        Cat cat01 = new Cat("Tom", "Grey");

        System.out.println(car01);
        System.out.println(cat01);
    }
}
