package com.exceptions.basics;

public class Atm {
    public static void main(String[] args) {
        System.out.println("In Atm");
        Bank bank=new Bank();
        try {
            bank.withdrawn(9000);
            System.out.println("withdraw completed");
        }
        catch (Exception e){
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
        System.out.println("BYE");
    }
}
