package com.list.custom;

import java.util.ArrayList;
import java.util.List;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>();
        List<String> fruitsWithA= new ArrayList<>();
        fruits.add("PineApple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");
        fruits.add("Cheeku");

        for(String fruit:fruits){
            //System.out.println(fruit);
            if(fruit.contains("A")){
                fruitsWithA.add(fruit);
            }
        }
        for(String fruit:fruitsWithA) {
            System.out.println(fruit);
        }
    }
}
