
package com.bookapp.model;

public class Book {
    private String  title;
    private String  author;
    private String  category;
    private String  bookId;
    private Integer price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", bookId='" + bookId + '\'' +
                ", price=" + price +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Book(String title, String author, String category, String bookId, Integer price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.bookId = bookId;
        this.price = price;
    }
}
