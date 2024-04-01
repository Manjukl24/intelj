package com.oops.overloading;

public class VarargsDemos {
    void calSum(String name,int... marks){
        System.out.println("Welcome :"+name);
        int sum =0;
        for (int mark:marks) {
            sum+=mark;
            System.out.println("Sum :"+sum);
        }
    }
    void calSum(String name){
        System.out.println("Hello:"+name);
    }
    public static  void  main(String[] args){
        VarargsDemos demo =new VarargsDemos();
        demo.calSum("kushal",87,67,56);
        demo.calSum("Adi",56,45,24);
        demo.calSum("Basava");
    }
}
