package com.oops.assignments;

public class Employee{
    String name;
    String Designation;

    public Employee(String name, String designatuion){
        this.name =name;
        this.Designation =designatuion;
    }
    public double calBonus(double basicAllowance){
        return basicAllowance;
    }
     double calBonus(double basicAllowance,double houseAllowance, String gift) {
         System.out.println("the gift is" + gift);
         return basicAllowance;
     }


    }

}
