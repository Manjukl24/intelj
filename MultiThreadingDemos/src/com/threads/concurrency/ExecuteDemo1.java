package com.threads.concurrency;

import com.threads.basics.Booking;
import com.threads.concurrency.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(() -> {
            System.out.println("Doing pooling");
            Booking booking = new Booking();
            System.out.println(booking.bookTickets("A", 10));
        });
        executorService.execute(() -> {
            System.out.println("Doing Task");
            Greetings greetings = new Greetings();
            System.out.println(greetings.sayHello("B"));

        });
        executorService.execute(() -> {
            System.out.println("Reading from DB");
        });
    }
}
