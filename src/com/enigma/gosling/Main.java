package com.enigma.gosling;

public class Main {
    public static void main(String[] args) {
        /*
        * Class -> adalah sebuah blueprint / rancangan dari object
        *
        * Object -> representasi dari class / blueprint (implementasi)
        *
        *
        * */

        // membuat objek sama seperti membuat variable
        Car yaris = new Car("Toyota", "Yaris", "Hatchback"); // membuat object yaris
        Car civic = new Car("Honda");
        Car rubicon = new Car("Jeep");

        yaris.name = "Yaris";

        System.out.println(yaris.name);
        System.out.println(yaris.model);
        yaris.startEngine();

        System.out.println(civic.name);
        System.out.println(civic.model);
    }
}
