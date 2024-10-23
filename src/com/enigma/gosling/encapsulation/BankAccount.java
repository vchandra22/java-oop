package com.enigma.gosling.encapsulation;

public class BankAccount {
    private Integer balance;

    public BankAccount(Integer balance) {
        this.balance = balance;
    }

    public void withdraw(Integer amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else if (amount < 10000) {
            System.out.println("Minimum withdraw 10.000");
        } else {
            balance -= amount;
            System.out.println("Withdraw successful");
            System.out.println("Your balance is: " + balance);
        }
    }

    public void deposit(Integer amount) {
        if (amount < 10000) {
            System.out.println("Minimum balance is 10000");
        } else {
            balance += amount;
            System.out.println("Deposit successful");
            System.out.println("Deposit amount: " + amount);
        }
    }

    public Integer getBalance() {
        return balance;
    }
}
