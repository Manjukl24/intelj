package com.threads.basics;

class  Greetings{
    String message(String name){
        String result = null;
        System.out.println("Hi"+name);
       // Thread.sleep(1000);
        result = "Great Day" + name;
        return result;
    }
}

public class RunThread {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
//        //Thread thread1= new Thread("Manjunathkl","Thread-1");
//        Thread thread2= new Thread("Basava","Thread-2");
//
//        thread1.start();
//        thread1.start();
//    }
    }
}
