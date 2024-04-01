package com.threads.basics;

public class Demo {
    public static void main(String[] args) {
        Runnable task=()->{
            System.out.println("task 1");
        };
        Thread thread1=new Thread(task,"pop");
        Thread thread2= new Thread(()->{
            System.out.println("task2");
        },"pop");
        thread1.start();
        thread2.start();

    }
}
