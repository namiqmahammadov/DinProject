package oop3.task4;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(Double balance) {
        super(balance);
    }

    @Override
    void withdraw(Double amount) {

        if ((amount > 0) && amount <= getBalance()) {
            balance -= amount;
            System.out.println("balansdan" + amount + "azn cixarildi with CheckingAccount");
        } else {
            System.out.println("balansinizda kifayet qeder pul yoxdur with CheckingAccount");
        }
    }


    @Override
    void deposit(Double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("balansiniza" + amount + "azn elave olundu with CheckingAccount");
        } else {
            System.out.println("menif pull elave edilmez with CheckingAccount");
        }
    }

}

