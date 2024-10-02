package coding.day_1.cp;

public class BankAccount {
    private double balance;
    private String accNumber;

    public BankAccount(double balance, String accNumber) {
        this.balance = balance;
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount cannot be below ZERO");
        }
        System.out.println(Thread.currentThread().getName() + " balance after deposit " + balance);
    }

    public void withdraw(double amount) {

        if (amount > 0 && balance - amount >= 0) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid withdraw amount or insufficient funds");
        }
        System.out.println(Thread.currentThread().getName() + " balance after withdrawal " + balance);
    }
}
