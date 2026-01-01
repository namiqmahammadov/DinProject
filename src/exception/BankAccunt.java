package exception;

public class BankAccunt {
    private final Integer correctPin = 9921;
    private Double balance;
    private double dailyWithdrawn = 0;
    private final double dailyLimit = 100;

    public BankAccunt(Double balance) {
        this.balance = balance;
    }

    public Double withdrawing(int pin, double amount) {
        if (pin != correctPin) {
            throw new InvalidPinException("PArol sehvdir yeniden cehd edin  ");
        } else {
            if ((dailyWithdrawn + amount) > dailyLimit) {
                throw new DailyLimitExceededException("limiti asmisiniz");
            } else {
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    dailyWithdrawn += amount;
                    System.out.println("Uğurlu əməliyyat: " + amount + " AZN çıxarıldı.");
                    return balance;
                } else {
                    throw new InsufficientBalanceException("Balansda kifayet qeder pul yoxdur ");
                }
            }
        }
    }
}