package com.enigma.gosling.encapsulation;

public class Motorcycle {
    private String name;
    private String brand;
    private Integer price;
    private Integer fuel;

    public Motorcycle(String name, String brand, Integer price, Integer fuel) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.fuel = fuel;
    }

    public Motorcycle() {

    }

    // getter
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getFuel() {
        return fuel;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setFuel(Integer fuel) {
        if (fuel < 0) {
            System.out.println("fuel is negative");
            return;
        }
        this.fuel = fuel;
    }
}
