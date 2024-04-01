package com.inter.lam;

public class CalcLambda {
    public static void main(String[] args){
        IMycalculotor calc=(int x,int y)->x+y;
        calc.calculate(10,30);
    }
}
