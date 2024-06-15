package main.structuralPatterns.proxy;

public class RealBankAccount implements BankAccount {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Amount: %.2f deposited\n", amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Amount: %.2f withdrawn\n", amount);
        }
        else {
            System.out.println("Insufficient Funds!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
