package imtahan;

public class BankAccount {
  private String   accountNumber;

         private Double   balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
     public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount+"  azn balansa elave edildi");
        }

     }
    public void withdraw(double amount){
        if(amount > 0){
            if(balance >= amount){
                balance -= amount;
                System.out.println(amount+"azn cixarildi");
            }
            else{
                System.out.println("balansda kifayet qeder pul yoxudr");
            }
        }


    }
}
