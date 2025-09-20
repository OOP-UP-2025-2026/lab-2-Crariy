package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    void deposit(double amount) {
        if(amount <= 0) {
            return;
        }
        this.balance = balance + amount;
    }

    double getBalance() {
        return this.balance;
    }

    boolean withdraw(double amount) {
        if(amount <= 0 || this.balance < (amount + transactionFee)) {
            return false;
        }
        this.balance = balance - amount - transactionFee;
        return true;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if(this.balance < amount + transactionFee || amount <= 0) {
            return false;
        }
        this.balance -= amount + transactionFee;
        receiver.balance += amount;
        return true;
    }
}
