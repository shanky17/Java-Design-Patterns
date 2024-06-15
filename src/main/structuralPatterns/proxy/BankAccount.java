package main.structuralPatterns.proxy;

public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
