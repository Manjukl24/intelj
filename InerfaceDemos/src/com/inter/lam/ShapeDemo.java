package com.inter.lam;

public class ShapeDemo {
    public  static  void main(String[] args){
        IShape shape=new IShape() {
            @Override
            public void areaRect(int x, int y) {
                System.out.println("Area is :"+(x+y));
            }
        };
        shape.area(09,45);
        System.out.println();
        IShape shape1=new IShape() {
            @Override
            public void areaRect(int x, int y) {
                System.out.println("Area is :"+(.5*x*y));
            }
        };
        shape1.area(15,20);
    }
}
