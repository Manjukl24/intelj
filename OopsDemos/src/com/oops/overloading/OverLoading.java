package com.oops.overloading;

public class OverLoading {
    public static void main(String[] args) {
        Shape shape =new Shape();
        shape.calcArea(10);
        shape.calcArea(2.0);
        int rect = shape.calcArea(10,20); //12.9908349234
        System.out.println("React"+rect);
        double tri = shape.calcArea(12.0, 4);
        System.out.println("tri"+tri);
    }
}
