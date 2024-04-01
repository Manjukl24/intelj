package com.oops.assignments;

public class Book {
    String title;
    String author;
    float price;
    String category;

    Book(String title,String author,float price,String category){
        this.title=title;
        this.author=author;
        this.price=price;
        this.category=category;
    }
    void getDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println(category);
    }
    void checkbookType(){
        if(price>500){
            System.out.println("premium books");
            else
                System.out.println("standard book");
        }
    }
}
