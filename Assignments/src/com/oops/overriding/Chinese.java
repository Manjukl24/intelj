package com.oops.overriding;

public class Chinese extends Menu {
    public void showTupe(String type) {
        if(type.equals("Starter")){
            System.out.println("Items available are in Starters are");
            System.out.println("Gobi");
            System.out.println(" chicken Chilly");
            System.out.println(" Gobi Manchuri");
        } else if(type.equalsIgnoreCase("Lunch")){
            System.out.println("Items available are in Lunchs are");
            System.out.println("Ghee Rice");
            System.out.println(" Pride Rice");
            System.out.println(" Lemon Rice");
        } else if(type.equalsIgnoreCase("Desserts are")){
            System.out.println("Items available are in Desserts are");
            System.out.println("Mysore pak");
            System.out.println("Gulab Jamun");
            System.out.println("Rasmali");

        }
    }

}
