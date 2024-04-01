package com.inter.extend;

public class CalcMain {
    public  static  void  main(String [] args) {
        ICalculator calculator=new BasicCalculator();
        calculator.add(2,7);
        calculator.product(3,5);
        System.out.println();
        ScientificCalc scientificCalc=new ScientificCalc();
        scientificCalc.square(2);
        scientificCalc.cube(3);
        scientificCalc.sub(10,5);

    }
}
