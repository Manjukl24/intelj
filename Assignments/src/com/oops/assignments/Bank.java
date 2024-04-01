package com.oops.assignments;

public class Bank {
    double balance;

    public  Bank(double balance) { this.balance = balance;}

    public void withdraw(double amount) {
            balance -= amount;
            System.out.println("Amount withdrawn by Bank ");
        }
    public void deposit(double amount) {
        balance -= amount;
        System.out.println("Amount deposited");
    }
    double getBalance(){
        return balance;
    }
}
