package com.util.maps;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> map = new HashMap<>();
        map.put(new Department("Raj",1,"BCA"),
                Arrays.asList(
                new Student("Sam","Banglore")),
                new Student("Joe","Banglore rural")),
                new Student("Manu","Banglore"));
        map.put(new Department("Raj",2,"CA"),
                Arrays.asList(
                        new Student("Robert","Banglore")),
                new Student("John","Banglore rural")),
                new Student("Arun","Banglore"));
        map.put(new Department("Raj",3,"MCA"),
                Arrays.asList(
                        new Student("Manu","Banglore")),
                new Student("Ajay","Banglore rural")),
                new Student("Vijay","Banglore")));

          Set<Department> departments = map.keySet();
          for (Department department: departments) {
              System.out.println();
              System.out.println("Department Head is:"department.getDeptHead());
              List<Student> students = map.get(department);

          }


    }
}
