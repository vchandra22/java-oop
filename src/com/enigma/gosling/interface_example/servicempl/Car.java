package com.enigma.gosling.interface_example.servicempl;

import com.enigma.gosling.interface_example.service.LandVehicle;

public class Car implements LandVehicle {
    @Override
    public void fuel() {
        System.out.println("Please use pertamax...");
    }

    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}
