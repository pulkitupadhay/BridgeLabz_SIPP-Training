import java.util.ArrayList;

class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    public String getName() {
    return name;
}

public void viewBalance() {
        System.out.println(name + " has balance: ₹" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposited ₹" + amount);
    }
}


class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + " at " + name);
    }
}


public class Bank_and_Account_Holders {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer c1 = new Customer("Alice");

        bank.openAccount(c1);

        c1.deposit(5000);
        c1.viewBalance();
    }

}
