package com.oops.bean;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Mercedes");
        vehicle.setModel("AMG");
        vehicle.setPrice(786857);
//        System.out.println(vehicle.getBrand());
//        System.out.println(vehicle.getModel());
//        System.out.println(vehicle.getPrice());
        System.out.println(vehicle.toString());
    }
}
