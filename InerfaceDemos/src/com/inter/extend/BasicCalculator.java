package com.inter.extend;

public class BasicCalculator implements ICalculator {
    @Override
    public void add(int x, int y) {
        System.out.println("Sum is:"+(x+y));

    }

    @Override
    public void product(int x, int y) {
        System.out.println(" Product is:"+(x+y));
    }
}
