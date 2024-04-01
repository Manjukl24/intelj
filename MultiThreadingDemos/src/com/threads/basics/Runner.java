package com.threads.basics;
public class Runner implements Runnable{
    String name;
    Greetings greetings;
    public  Runner(String name, Greetings greetings){
        Thread t=new Thread(this,name);
        this.name=name;
        this.greetings=greetings;
        t.start();
    }

    public Runner() {

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }
        System.out.println("Work Done");
    }
}
