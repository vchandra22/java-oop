package com.enigma.gosling.inheritence;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    };
}
