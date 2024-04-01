package com.oops.overloading;

public class VechicleMain {
    public static void main(String[] args) {

        Vehicle vehicle =new Vehicle("BMW");
        vehicle.getDetails();
        System.out.println();
        Vehicle vehicle1 =new Vehicle("TT",987654);
        vehicle1.getDetails();
        System.out.println();
        Vehicle vehicle2 =new Vehicle("BENZ",244536,"Mercedes");
        vehicle2.getDetails();
        System.out.println();

    }
}
