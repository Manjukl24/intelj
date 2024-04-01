package com.inter.def;

public class DefMain {
    public  static  void  main(String[] args) {
        IBonusCalculator bonusCalclator=new CalculatorImpl();
        bonusCalclator.calculotor(3445);
        IBonusCalculator.show();

        IAllowanceCalculator allowance=(IAllowanceCalculator) bonusCalclator;
        allowance.calculate((233);
        allowance.ploicyType();
    }
}
