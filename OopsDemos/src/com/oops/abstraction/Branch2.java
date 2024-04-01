package com.oops.abstraction;

public abstract class Branch2 extends  Bank {
    @Override
    void carLoan() {
        System.out.println("carLoan in Branch 2");

    }

    @Override
    void houseLoan() {
        System.out.println("houseLoan in Branch 2");

    }

    @Override
    void eduLoan() {
        System.out.println("eduLoan in Branch 2");
    }
void loanType(){
        System.out.println("Loan in Branch2");
    }
}
