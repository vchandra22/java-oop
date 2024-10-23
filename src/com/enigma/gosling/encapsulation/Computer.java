package com.enigma.gosling.encapsulation;

import java.util.Random;

public class Computer {
    private Integer number;

    public Computer() {
        number = setNumber();
    }
    public Integer getNumber() {
        return number;
    }

    public Integer setNumber() {
        Random numberGenerator = new Random();
        return numberGenerator.nextInt(10);
    }
}
