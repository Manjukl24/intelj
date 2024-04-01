package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles =
                Arrays.asList(
                        new Vehicle("city", "Honda", 23_90_000),
                        new Vehicle("hexa", "Tata", 23_20_000),
                        new Vehicle("A133", "Benz", 23_40_000),
                        new Vehicle("Xuv", "Audi", 2390000)
                );
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);
        System.out.println("Sort y Brand");
        Collections.sort(vehicles,new BrandSort());
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);
        System.out.println("Sort By ");
        Collections.sort(vehicles,new BrandSort());
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);
        System.out.println("Sort By Brand");
        Collections.sort(vehicles,new BrandSort());
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);
    }

        }


