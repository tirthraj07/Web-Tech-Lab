package com.main;


import jakarta.ejb.Remote;

@Remote
public interface AccountBeanRemote {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

