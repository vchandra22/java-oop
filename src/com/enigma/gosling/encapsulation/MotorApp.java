package com.enigma.gosling.encapsulation;

public class MotorApp {
    public static void main(String[] args) {
        Motorcycle beat = new Motorcycle();
        beat.setName("Beat");
        System.out.println(beat.getName());

        beat.setName("Vario");
        System.out.println(beat.getName());

        beat.setFuel(-10);
    }
}
