package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("mysql", "c", 123),
                new Book("sql", "c", 220),
                new Book("VB", "c", 321),
                new Book("java", "c", 324),
                new Book("html", "c", 543)
        );
        System.out.println("Before Sorting");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
        System.out.println("After Sorting");
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

