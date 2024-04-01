package com.list.custom;

public class BrandSort implements Comparable<Vehicle> {

    public  int compare(Vehicle o1, Vehicle o2) {
        return o1.getBrand();
    }
}
