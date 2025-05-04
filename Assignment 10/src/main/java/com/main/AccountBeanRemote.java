package com.main;

import javax.ejb.Remote;

@Remote
public interface AccountBeanRemote {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

