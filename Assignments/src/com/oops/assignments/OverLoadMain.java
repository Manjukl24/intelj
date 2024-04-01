package com.oops.assignments;

import java.util.Scanner;

public class OverLoadMain {
    public static void main(String[] args){
        System.out.println("Welcome");
        Scanner sc =new Scanner(System.in);


        for(int i=0;i<3;i++){
            System.out.println("Enter the Name");
            String name =sc.next();
            System.out.println("Enter the Designation");
            String Designation = sc.next();
            Employee [i] =new Employee(name,Designation);
        }
        System.out.println("Enter the designation to know the bonus");
        String choice =sc.next();
        for(Employee emp:emplist){
            if(choice.equals("Programmer")){
                emp.calBonus(2000);
            } else if (choice) {
                
            }
        }
    }
}
