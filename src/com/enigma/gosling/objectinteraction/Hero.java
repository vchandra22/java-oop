package com.enigma.gosling.objectinteraction;

public class Hero {
    private String name;
    private Integer hp;
    private Integer damage;

    public Hero(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void attack(Monster monster) {
        monster.getDamage(this.damage);
    }

    public void attack(Hero hero) {
        hero.getDamage(this.damage);
    }

    public void getDamage(Integer damage) {
        this.hp -= damage;
    }

    public Integer getHp() {
        return hp;
    }

}
