package com.enigma.gosling.abstraction;

public class Monster extends Character {
    public Monster(String name, Integer hp, Integer damage) {
        super(name, hp, damage);
    }

    @Override
    public void attack(Character target) {
        target.hp -= damage;
    }
}
