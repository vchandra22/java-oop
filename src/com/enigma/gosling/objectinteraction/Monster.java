package com.enigma.gosling.objectinteraction;

public class Monster {
    private String name;
    private Integer hp;
    private Integer damage;

    public Monster(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void getDamage(Integer damage) {
        this.hp -= damage;
    }

    public Integer getHp() {
        return hp;
    }
}
