package com.oops.abstraction;

public class SubBranch extends  Branch2{

    void  subPay(){
        System.out.println("Payment in subbranch");
    }
    @Override
    void carLoan() {
        System.out.println("car loan in subbranch");

    }
}
