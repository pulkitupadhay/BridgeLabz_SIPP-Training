package epicdemo;

import java.util.*;

//Abstract class: BankAccount
abstract class BankAccount {
 private String accountNumber;
 private String holderName;
 private double balance;

 public BankAccount(String accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 public String getAccountNumber() { return accountNumber; }
 public String getHolderName() { return holderName; }
 public double getBalance() { return balance; }

 public void deposit(double amount) {
     if (amount > 0) balance += amount;
 }

 public void withdraw(double amount) {
     if (amount > 0 && balance >= amount) balance -= amount;
 }

 public abstract double calculateInterest();
}

//Interface: Loanable
interface Loanable {
 void applyForLoan(double amount);
 boolean calculateLoanEligibility();
}

//SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
 public SavingsAccount(String accountNumber, String holderName, double balance) {
     super(accountNumber, holderName, balance);
 }

 @Override
 public double calculateInterest() {
     return getBalance() * 0.04;
 }

 @Override
 public void applyForLoan(double amount) {
     System.out.println("Savings Account Loan Application for: " + amount);
 }

 @Override
 public boolean calculateLoanEligibility() {
     return getBalance() > 10000;
 }
}

//CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
 public CurrentAccount(String accountNumber, String holderName, double balance) {
     super(accountNumber, holderName, balance);
 }

 @Override
 public double calculateInterest() {
     return getBalance() * 0.02;
 }

 @Override
 public void applyForLoan(double amount) {
     System.out.println("Current Account Loan Application for: " + amount);
 }

 @Override
 public boolean calculateLoanEligibility() {
     return getBalance() > 50000;
 }
}

//Main class
public class BankingSystemDemo {
 public static void main(String[] args) {
     List<BankAccount> accounts = new ArrayList<>();
     accounts.add(new SavingsAccount("SAV123", "John", 20000));
     accounts.add(new CurrentAccount("CUR456", "Jane", 60000));

     for (BankAccount acc : accounts) {
         System.out.println(acc.getHolderName() + " - Interest: " + acc.calculateInterest());

         if (acc instanceof Loanable) {
             Loanable loan = (Loanable) acc;
             loan.applyForLoan(30000);
             System.out.println("Eligible for loan: " + loan.calculateLoanEligibility());
         }

         System.out.println("-----------------------------");
     }
 }
}
