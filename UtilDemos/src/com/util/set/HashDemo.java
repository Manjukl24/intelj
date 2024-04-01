package com.util.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("PineApple");
        hashSet.add("Orange");
        hashSet.add("Banana");
        hashSet.add("Kiwi");
        hashSet.add("100");
        hashSet.add(null);
        System.out.println(hashSet);
        System.out.println(hashSet);
        for (String element : hashSet)
            System.out.println(element);

            List<String> fruits=Arrays.asList("apple","banana","orange","apple");
            Set<String> newFruits = new HashSet<>(fruits);
            System.out.println(newFruits);
        }
    }

