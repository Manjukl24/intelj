package com.exceptions.basics;

public class MultiCatch {

    public static void main(String[] args) throws NumberFormatException {
        try{
            System.out.println("Welcome");
            String value = args[0];
            System.out.println("Value"+value);
            int num =Integer.parseInt(value);
            System.out.println("Number"+num);
            int result =100/num;
            System.out.println(result);
            int []marks = null;
            System.out.println(marks[0]);
        } catch (ArrayIndexOutOfBoundsException |NumberFormatException |ArithmeticException |NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Please enter value");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("completed");
    }
}
