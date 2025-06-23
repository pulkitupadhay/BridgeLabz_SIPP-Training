package objects_and_class;

import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        accountHolder = scanner.nextLine();
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        balance = scanner.nextDouble();
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient balance.");
        else {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        acc.createAccount();

        System.out.print("Enter amount to deposit: ");
        acc.deposit(scanner.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        acc.withdraw(scanner.nextDouble());

        acc.displayBalance();
    }
}
