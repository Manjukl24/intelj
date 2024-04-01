package com.list.custom;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Angular");
        list.add("VB");
        list.add("Unix");
        System.out.println(list);
        list.addFirst("html");
        list.addLast("Css"");
                list.set(1,"react");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println();
        Iterator <String>  iterator=list.iterator();
        while (iterator.hasNext()) {
            String val1=iterator.next();
        System.out.println(val);
    }
        System.out.println();
       ListIterator <String>  listIterator=list.listIterator();
        while (listiterator.hasPrevious()) {
            String val1=iterator.previous;
            System.out.println(val);
}
    }}