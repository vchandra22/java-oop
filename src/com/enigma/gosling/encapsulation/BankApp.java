package com.enigma.gosling.encapsulation;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bca = new BankAccount(1000000);
        System.out.println(bca.getBalance());

        bca.withdraw(50000);
        System.out.println(bca.getBalance());

        bca.deposit(100000);
        System.out.println(bca.getBalance());

        bca.withdraw(1050000);
        bca.deposit(100000);
        bca.withdraw(1080);
    }
}
