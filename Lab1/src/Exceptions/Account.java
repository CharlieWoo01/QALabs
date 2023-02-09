package Exceptions;

public class Account {
    int id;
    double balance;
    String owner;

    public Account(int id, double balance, String owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    void withdraw(double amount) throws IllegalAccessException {
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Balance can't be negative");
        } else {
            balance -= amount;
        }
    }

    void deposit(double amount) {
        this.balance += balance;
    }

    void close() {
        System.out.println("Account ID: " + id + " is closed");
    }

    public String getDetails() {
        return "ID: " + id + " Owner: " + owner + " Balance: " + balance;
    }
}
