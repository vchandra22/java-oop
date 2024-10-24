package com.enigma.gosling.interface_practice;

public class PhoneImpl implements Phone {
    private String name;
    private int volume;
    private boolean isPowerOn;

    public PhoneImpl(String name) {
        this.name = name;
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void powerOff() {
        this.isPowerOn = false;
    }

    @Override
    public void volumeUp() {
        if(isPowerOn) {
            if (this.volume < MAX_VOLUME) {
                this.volume += 10;
                System.out.println("Volume: " + this.volume);
            } else {
                System.out.println("Volume maximum");
            }
        } else {
            System.out.println("Phone is off");
        }
    }

    @Override
    public void volumeDown() {
        if(isPowerOn) {
            if (this.volume > MIN_VOLUME) {
                this.volume -= 10;
                System.out.println("Volume: " + this.volume);
            } else {
                System.out.println("Muted");
            }
        } else {
            System.out.println("Phone is off");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
