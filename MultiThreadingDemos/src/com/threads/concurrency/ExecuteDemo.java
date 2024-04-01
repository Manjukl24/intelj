package com.threads.concurrency;

import  java.util.concurrent.ExecutorService;
import  java.util.concurrent.Executors;

public class ExecuteDemo {
    public static void main(String[] args) {
      //Get a Thread Pool
      ExecutorService executorService= Executors.newFixedThreadPool(10);

      for(int i=0;i<10;i++){
          //pass the implementation of Runnable using Lambda
            executorService.execute(()->{
                System.out.println("Doing Task");
            });
            executorService.execute(()->{
                System.out.println("hellllloooooo");
            });
        }
    }
}
