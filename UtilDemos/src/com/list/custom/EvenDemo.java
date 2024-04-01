package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10, 20, 30, 12, 15, 23);
        List<Integer> evennum = new ArrayList<>();
        for (Integer number : num) {
            if (number %  4 == 0) {
                evennum.add(number);
            }
        }
        for (Integer numbers : evennum) {
            System.out.println(numbers);
        }
    }
}