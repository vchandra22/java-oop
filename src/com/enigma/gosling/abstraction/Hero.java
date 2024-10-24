package com.enigma.gosling.abstraction;

public class Hero extends Character {
    public Hero(String name, Integer hp, Integer damage) {
        super(name, hp, damage);
    }

    @Override
    public void attack(Character target) {
        target.getDamage(this.damage);
    }
}
