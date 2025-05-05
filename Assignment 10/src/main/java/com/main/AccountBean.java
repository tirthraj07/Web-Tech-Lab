package com.main;


import jakarta.ejb.Stateless;

@Stateless
public class AccountBean implements AccountBeanRemote {

    private double balance = 0.0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
