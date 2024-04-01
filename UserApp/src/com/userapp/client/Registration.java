package com.userapp.client;

import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import  java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String username = sc.next();
        IValidationService service = new ValidationServiceImpl();

        try {
            if(service.validateUsername(username)) {
                System.out.println();
                System.out.println();
                System.out.println();
            }
        }
    }
}
