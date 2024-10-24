package com.enigma.gosling.interface_example;

import com.enigma.gosling.interface_example.servicempl.Plane;

public class InterfaceApp {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.engineStart();
        plane.move();
        plane.flying();
    }
}
