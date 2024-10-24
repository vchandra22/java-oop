package com.enigma.gosling.abstraction;

public class Marksman extends Hero {
    public Marksman(String name, Integer hp, Integer damage) {
        super(name, hp, damage);
    }

    @Override
    public void attack(Character target) {
        target.hp -= damage;
    }
}
