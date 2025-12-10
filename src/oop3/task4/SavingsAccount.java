package oop3.task4;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(Double balance) {
        super(balance);
    }

    public static final Double LImit = 1000.0;

    @Override
    void withdraw(Double amount) {
        if (amount > LImit) {
            System.out.println("Limiti asmisiniz : with SavingsAccount");
        } else {
            if ((amount > 0) && amount <= getBalance()) {
                balance -= amount;
                System.out.println("balansdan" + amount + "azn cixarildi : with SavingsAccount");
            } else {
                System.out.println("balansinizda kifayet qeder pul yoxdur : with SavingsAccount");
            }
        }
    }

    @Override
    void deposit(Double amount) {
        if (amount > LImit) {
            System.out.println("Limiti asmisiniz : with SavingsAccount");
        } else {
            if (amount > 0) {
                balance += amount;
                System.out.println("balansiniza" + amount + "azn elave olundu: with SavingsAccount");
            } else {
                System.out.println("menif pull elave edilmez : with SavingsAccount");
            }
        }

    }
}
