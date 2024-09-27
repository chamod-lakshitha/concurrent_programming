package coding.day_1;

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
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount can not be below zero");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 0) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid withdraw amount");
        }
        System.out.println(Thread.currentThread().getName() + "balance is" + " " + balance);
    }
}
