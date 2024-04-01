package com.threads.basics;

class Child extends Thread{
    public Child(String name,int priority){

    }
    @Override
    public void run() {
        for(int i=1;i<11;i++) {
            String name=Thread.currentThread().getName();
            System.out.println("5"+"x"+i+"="+(i*5)+ ""+name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
        }
    }
}

public class ExThread {
    public static void main(String[] args) {
        Child child1 = new Child("manju", 3);
        child1.setName("childone");
        System.out.println(child1);
        child1.start();
        Child child2 = new Child("ram", 4);
        child2.setName("childtwo");
        System.out.println(child2);
        child2.start();
        for (int i = 1; i < 11; i++) {
            String name = Thread.currentThread().getName();
            System.out.println("10" + "x" + i + "=" + (i * 10) + "" + name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
