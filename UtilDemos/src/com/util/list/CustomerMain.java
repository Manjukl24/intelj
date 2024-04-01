package com.util.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        ArrayList<Customer> customerByCity = new ArrayList<>();
        Customer customer1 = new Customer("Manjunath", 100, "Banglore");
        customerList.add(customer1);
        Customer customer2 = new Customer("Anu", 200, "Banglore");
        customerList.add(customer2);
        Customer customer3 = new Customer("Sam", 300, "BK Pallya");
        customerList.add(customer3);
        Customer customer4 = new Customer("Basava", 100, "Banglore");
        customerList.add(customer4);
        Customer customer5 = new Customer("Kushal", 300, "Banglore");
        customerList.add(customer5);
        for (Customer customer : customerList) {
            //System.out.println(customer);
            if (customer.getCity().equals("Banglore")) {
                customerByCity.add(customer);
            }
        }
        for (Customer customer : customerByCity) {
            System.out.println(customer);
        }
    }
}
