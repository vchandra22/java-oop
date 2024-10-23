package com.enigma.gosling.inheritence;

public class Bird extends Animal {
    public Bird(String name) {
        super("Bird");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping" );
    }
}
