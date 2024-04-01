package com.exceptions.basics;

public class FinallyDemo {

    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = "Manjun";
            System.out.println("Value" + value);
            int num = Integer.parseInt(value);
            System.out.println("Number" + num);
            int result = 100 / num;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("close the connection");
        }
        System.out.println("Continue...");
    }
}
