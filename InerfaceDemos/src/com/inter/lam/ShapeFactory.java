package com.inter.lam;

public class ShapeFactory {
    void printArea(IShape shape,int x, int y){
        System.out.println("Printing Area");
        System.out.println();
        shape.area(x,y);

    }
}
