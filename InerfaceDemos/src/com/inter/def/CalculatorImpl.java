package com.inter.def;

public class CalculatorImpl implements  IBonusCalculator,IAllowanceCalculator {
    public  void calculator(Double amount) {
        System.out.println("The amount is"+amount);

        default void policyType(){
            System.out.println("Policy type for all employee");
        }
    }
}
