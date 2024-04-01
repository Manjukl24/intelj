package com.exceptions.custom;

public class VoyaAtm {
    public static void main(String[] args)  {
        VoyaBank bank = new VoyaBank(2000);
        try {
            bank.withdraw(1000);
        } catch (NegativeBalanceException e) {
            System.out.println("Withdrawn Done");
        } catch (OutofLimitsException e) {
            System.out.println();
        }
        System.out.println("Withdrawn Done");
    }
}
