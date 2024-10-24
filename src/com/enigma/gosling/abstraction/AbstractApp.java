package com.enigma.gosling.abstraction;

/*
* Abstract class -> Mewariskan method, tapi tidak bisa di instance sebagai object
* */
public class AbstractApp {
    public static void main(String[] args) {
        Character layla = new Marksman("Layla", 1000, 500);
        Character golem = new Turtle("Golem", 10000, 100);

        layla.attack(golem);
        golem.attack(layla);
        System.out.println("HP Golem setelah di hit layla: " + golem.getHp());
        System.out.println("HP Layla setelah di hit golem: " + layla.getHp());

    }
}
