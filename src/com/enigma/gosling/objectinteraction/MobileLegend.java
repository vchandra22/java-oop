package com.enigma.gosling.objectinteraction;

public class MobileLegend {
    public static void main(String[] args) {
        Hero layla = new Hero("Layla", 1500, 100);
        Hero miya = new Hero("Miya", 1500, 200);
        Monster creep = new Monster("Creep", 900, 50);

        System.out.println(layla.getHp());
        System.out.println(creep.getHp());
        layla.attack(creep);
        System.out.println(creep.getHp());

        System.out.println(miya.getHp());
        miya.attack(layla);
        System.out.println(layla.getHp());
    }
}
