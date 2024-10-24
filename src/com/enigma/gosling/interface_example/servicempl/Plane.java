package com.enigma.gosling.interface_example.servicempl;

import com.enigma.gosling.interface_example.service.Fly;
import com.enigma.gosling.interface_example.service.Vehicle;

public class Plane implements Fly, Vehicle {
    @Override
    public void flying() {
        System.out.println("Plane flying");
    }

    @Override
    public void engineStart() {
        System.out.println("Engine starting");
    }

    @Override
    public void move() {
        System.out.println("Plane moves");
    }
}
