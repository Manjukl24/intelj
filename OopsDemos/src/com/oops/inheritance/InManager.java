package com.oops.inheritance;

public class InManager  extends  InEmployee{
    double salary;
    void printBonus(double amount){
        System.out.println("Bonus:"+(amount+salary));
    }
}
