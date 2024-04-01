package com.oops.abstraction;

public class Branch1 extends Bank {
    @Override
    void carLoan() {
        System.out.println("The car loan in branch 1 ");
    }


    @Override
    void houseLoan() {
        System.out.println("house loan in branch 1 ");
    }

    @Override
    void eduLoan() {
        System.out.println("house loan in branch 1 ");
    }


    void staffDetails() {
        System.out.println("Staff in branch 1");
    }
}
