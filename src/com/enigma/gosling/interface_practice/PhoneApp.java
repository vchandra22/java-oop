package com.enigma.gosling.interface_practice;

public class PhoneApp {
    public static void main(String[] args) {
        Phone samsung = new PhoneImpl("Samsung");
        PhoneUser king = new PhoneUser("King", samsung);

        System.out.println(king.infoDevice());
        king.turnOnPhone();
        king.decreaseVolume();
    }
}
