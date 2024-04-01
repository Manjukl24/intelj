package com.threads.basics;

public class Counter implements Runnable{
    String name;
    int noofTickets;
    Booking booking;

    public  Counter(String  name, int noofTickets,Booking booking){
        super();
        this.name =name;
        this.noofTickets = noofTickets;
        this.booking = booking;
        Thread t = new Thread(this,name);
        t.start();
    }
    public  void run(){
        System.out.println("Welcome to ABC Theatres"+name);
        double amount=booking.bookTickets(name,noofTickets);
         System.out.println();
    }
}
