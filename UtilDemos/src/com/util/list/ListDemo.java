package com.util.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();
        System.out.println(list.size());
        list.add("java");
        list.add("java");
        list.add("100.0");
        list.add("spring");
        list.add("angular");
        list.add("Maven");
        list.add(1,"helen");
        System.out.println(list);
        list.set(2,"Manjunath");
        System.out.println(list.size());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println();
        ListIterator<String> iter =list.listIterator(list.size());
        while ( iter.hasPrevious()) {
            String str = iter.previous();
            System.out.println(str);
        }
        System.out.println(".....");
        System.out.println("Sorting the list");
        Collections.sort(list);
        for (String val:list)
            System.out.println(val.toUpperCase());
    }
}
