package coding.day_1.cp;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0, "Acc001");
        Thread husband = new Thread(() -> {
            account.withdraw(25000);
        }, "House Based Husband");

        Thread wife = new Thread(() -> {
            account.deposit(25000);
        }, "Career Minded Wife");

        Thread bankManager = new Thread(() -> {
            synchronized (account) { // at this point of execution lock will be acquired
                double interest = account.getBalance() * 9 / 100 / 12 / 30;
                account.deposit(interest);
            }
        }, "Bank Manager");

        husband.start();
        wife.start();
        bankManager.start();

    }
}
