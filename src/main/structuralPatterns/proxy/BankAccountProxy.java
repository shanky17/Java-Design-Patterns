package main.structuralPatterns.proxy;



public class BankAccountProxy implements BankAccount {
    RealBankAccount realBankAccount;
    String password;

    public BankAccountProxy(String password) {
        this.password = password;
        authenticate();
    }

    private void authenticate() {
        if(password.equals("secret")) {
            realBankAccount = new RealBankAccount();
            System.out.println("Authentication Successful");
        }
        else {
            System.out.println("Incorrect password! Try Again");
            System.exit(-1);
        }
    }


    @Override
    public void deposit(double amount) {
        realBankAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        realBankAccount.withdraw(amount);
    }

    @Override
    public double getBalance() {
        return realBankAccount.getBalance();
    }
}
