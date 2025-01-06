public class Account {
    private int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
