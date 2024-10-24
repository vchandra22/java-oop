package com.enigma.gosling.abstraction;

public abstract class Character {
    protected String name;
    protected Integer hp;
    protected Integer damage;

    public Character(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    //abstract method
    public abstract void attack(Character target);

    public void getDamage(Integer damage) {
        this.damage -= damage;
    }

    public String getName() {
        return name;
    }

    public Integer getHp() {
        return hp;
    }
}
