package oop3.task4;

public abstract class BankAccount {
    protected Double balance;

    public BankAccount(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    abstract void withdraw(Double amount);

    abstract void deposit(Double amount);
}
