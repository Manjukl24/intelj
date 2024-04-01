package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
        new Vehicle("city", "Honda", 23_90_000),
                new Vehicle("hexa", "Tata", 23_20_000),
                new Vehicle("A133", "Benz", 23_40_000),
                new Vehicle("Xuv", "Audi", 2390000)
                );
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);
     Collections.sort(vehicles,(o1,o2)->o1.getBrand().compareTo(o2.getBrand());
     for (Vehicle vehicle :vehicles){
         System.out.println(vehicle);
         System.out.println(vehicle);
         Collections.sort(vehicles,(o1,o2)->o1.getModel().compareTo(o2.getModel());
         for (Vehicle vehicle :vehicles){
             System.out.println(vehicle);
             System.out.println(vehicle);
             Collections.sort(vehicles,(o1,o2)->o1.getPrice().compareTo(o2.getPrice());
             for (Vehicle vehicle :vehicles){
                 System.out.println(vehicle);
     }

    }

}


