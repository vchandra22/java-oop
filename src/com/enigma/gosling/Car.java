package com.enigma.gosling;

public class Car {

    /*
    * Access modifier ada 4:
    * 1. Public -> dapat diakses dari manapun bahkan dari package yang berbeda
    * 2. Default -> tidak bisa diakses di package yang berbeda
    * 3. Protected -> hanya bisa diakses dari package yang sama
    * 4. Private -> hanya bisa diakses didalam class
    * */

    String name;
    String brand;
    String model = "SUV";

    /*
    * Contructor -> sebuah method yang memiliki nama yang sama seperti classnya
    * dan dipanggil ketika pertama kali membuat object
    *
    * this -> kata kunci untuk mengakses (merujuk) atribut / properti
    * this -> agar menghindari variable shadowing
    *
    * */

    public Car(String name, String brand, String model) {
        this.name = name;
        this.brand = brand;
        this.model = model;
    }

    // overloading -> membuat method yang sama tapi parameternya berbeda
    public Car(String name) {
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Car starts engine...");
    }

}
