package com.inter.lam;

public  class ShapeMain{
    public static void main(String[] args){
        ShapeFactory factory =new ShapeFactory();
        IShape shape = new Rectangle();
        factory.printArea(shape,10,23);

        factory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Calculating area");
                System.out.println("Tri"+(x*y*0.5));
            }
        }, 10,40);
        System.out.println(".......");
        //using lamda expression
        factory.printArea(int x,int y)->{
            System.out.println("Calculating area");
            System.out.println("Square is"+(x*y));
        },2,3);
    }
}
