package com.enigma.gosling.inheritence;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }
}
