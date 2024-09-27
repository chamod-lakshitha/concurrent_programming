package coding.day_1;

public class Main {
    public static void main(String[] args) {
        BankAccount acc001 = new BankAccount(0, "Acc001");
        Thread husband = new Thread(() -> {
            acc001.withdraw(25000);
        }, "Husband Thread");

        Thread wife = new Thread(() -> {
            acc001.deposit(25000);
        }, "Wife Thread");

        husband.start();
        wife.start();
    }
}
