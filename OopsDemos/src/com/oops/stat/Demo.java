package com.oops.stat;

public class Demo {
    static {
        System.out.println("In demo static block");
    }
    public  static  void  main(String[] args) {
        System.out.println("main Demo");
        try {
            Class.forName("com.oops.stat.Trial");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
