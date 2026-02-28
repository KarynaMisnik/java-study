import java.util.Scanner;

public class BankAccount {
    String owner;
    int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void printAccount() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }

    void deposit() {
        System.out.println("How much to deposit: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Deposited " + amount);
        System.out.println("New balance " + balance);
    }

    void withdraw() {
        System.out.println("How much to withdraw: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
            System.out.println("New balance " + balance);
        } else {
            System.out.println("Not enough money");
        }

    }

    void checkStatus() {
        if (balance >= 1000) {
            System.out.println("Premium");
        } else if (balance >= 500) {
            System.out.println("Standard");
        } else {
            System.out.println("Basic");
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("John", 1640);
        BankAccount a2 = new BankAccount("Alice", 3040);

        a1.printAccount();
        a1.deposit();
        a1.withdraw();
        a1.checkStatus();

        System.out.println("/=/=/=/=/=");
        a2.printAccount();
        a2.deposit();
        a2.withdraw();
        a2.checkStatus();
    }
}
