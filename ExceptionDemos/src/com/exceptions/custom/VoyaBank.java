package com.exceptions.custom;

public class VoyaBank {

    double balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws NegativeBalanceException, OutofLimitsException {
        try {
            if (balance - amount <= 0)
                throw new NegativeBalanceException("balance is negative");
            if (amount > 1000)
                throw new OutofLimitsException("Limit Exceeded");

            balance = balance - amount;
            System.out.println("Balance" + balance);
        } catch (NegativeBalanceException e) {
            System.out.println("Negative Balance");
            throw e;
        } catch (OutofLimitsException e) {
            System.out.println("Exceeding");
            throw e;
        } finally {
            System.out.println("close db");
        }
        System.out.println("work done");
    }
}


