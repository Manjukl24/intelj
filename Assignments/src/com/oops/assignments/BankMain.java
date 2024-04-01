package com.oops.assignments;

import  java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank bank = new Bank(2300);
        System.out.println("Enter your choice");
        System.out.println("select 1 for deposit");
        System.out.println("select 2 for withdrawn");

        int choice =sc.nextInt();
        switch(choice){
            case 1:{
                System.out.println("Enter the amount to deposit");
                double amount=sc.nextDouble();
                bank.deposit(amount);
            break;
        }
            case 2:{
                System.out.println("Enter the amount to withdrawn");
                double amount=sc.nextDouble();
                bank.withdraw(amount);
                break;
    }
            default:{
                System.out.println("Invalid input");
                bank.getBalance();
            }
}
System.out.