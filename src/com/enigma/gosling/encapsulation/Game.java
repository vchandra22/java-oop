package com.enigma.gosling.encapsulation;

import java.util.Scanner;

public class Game {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama: ");
        String name = scanner.nextLine();

        Player player = new Player(name);
        Computer computer = new Computer();

        while (true) {
            int guess;
            System.out.print("Tebak angka 1-10: ");
            guess = scanner.nextInt();
            if (guess < computer.getNumber()) {
                System.out.println("Tebakan anda lebih kecil");
            } else if (guess > computer.getNumber()) {
                System.out.println("Tebakan anda lebih besar");
            } else {
                System.out.println("Selamat " + player.getName() + " Tebakan benar");
                break;
            }
        }
    }
}
