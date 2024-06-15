package main.structuralPatterns.proxy;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccountProxy("secret");

        bankAccount.deposit(100);
        bankAccount.withdraw(70);

        System.out.printf("Balance: %f\n", bankAccount.getBalance());
    }
}
