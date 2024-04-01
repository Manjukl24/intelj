package com.inter.lam;

public class ShapeLambda {
    public  static  void main(String[] args) {
        IShape shape=(int x, int y)->{
            System.out.println("Area is"+(x*y));
        };
        shape.area(10,20);

        shape=(int x,int y)->System.out.println("Area is"+(x+y)+"@$!#");
        shape.area(10.20);

        IShape shape1=(int x, int y)->{
            System.out.println("Area of Triangle"+(.5*x*y));
        };
        shape1.area(10,30);
        System.out.println();
        shape1=(int x,int y)->System.out.println("Area of Triangle is"+(.5*x*y));
        shape1.area(40,30);
    }
}
