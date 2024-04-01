package com.util.set;

import com.list.custom.Book;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("java", "james", 4345),
                new Book("java", "james", 4345),
                new Book("JSP", "jam", 6245),
                new Book("VB", "sam", 345));

        System.out.println("List Book");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println(books);
        System.out.println("Set Books");
        Set<Book> bookset = new LinkedHashSet<>(books);
        for (Book book : bookset) {
            System.out.println(book);
        }
    }
}
