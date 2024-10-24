package com.enigma.gosling.interface_practice;

public class PhoneUser {
    private String name;
    private Phone phone;

    public PhoneUser(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public void turnOnPhone() {
        phone.powerOn();
    }

    public void turnOffPhone() {
        phone.powerOff();
    }

    public void increaseVolume() {
        phone.volumeUp();
    }

    public void decreaseVolume() {
        phone.volumeDown();
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String infoDevice() {
        return "User: " + name + "\nDevice: " + ((PhoneImpl)phone).getName(); //casting
    }
}
