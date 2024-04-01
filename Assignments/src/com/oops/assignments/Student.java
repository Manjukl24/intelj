package com.oops.assignments;

public class Student {
    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public  void printDetails(){
        System.out.println("Student Name"+name);
        System.out.println("Student Department"+department);
    }
    public String getGrades(int... marks){
        double sum=0;
        int count=0;
        for(int mark : marks){
            sum= sum+mark;
        }
        Double average = sum/ marks.length;
        if(average >=90)
            return  "Grade A";
        else if(average >=80)
            retrun "Grade B";
        else if(average >=70)
            retrun "Grade C";
        else if(average >=60)
            retrun "Grade D";
        else
            return "Fail";
        }
        public void grtDetails() {
            System.out.println("Enter the name of the Student");
        }
    }

