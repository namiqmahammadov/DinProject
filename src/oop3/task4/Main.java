package oop3.task4;

import oop3.task2.Animal;
import oop3.task2.Elephant;
import oop3.task2.Leon;
import oop3.task2.Monkey;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new SavingsAccount(1001.0);
        BankAccount bankAccount1 = new CheckingAccount(1001.0);

        bankAccount.withdraw(1001.0);
        bankAccount.deposit(1001.0);
        bankAccount1.withdraw(2000.0);
        bankAccount1.deposit(200.0);
    }
}
