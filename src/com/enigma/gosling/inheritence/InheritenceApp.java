package com.enigma.gosling.inheritence;

public class InheritenceApp {
    /*
    * Inheritence -> pewarisan
    * 1. Mewarisi method dan property dari parent class
    * 2. Keyword menggunakan extends
    *
    * */
    public static void main(String[] args) {
        Cat persia = new Cat("Persia");
        Bird pipit = new Bird("Pipit");
        persia.eat();
        pipit.sleep();
    }
}
