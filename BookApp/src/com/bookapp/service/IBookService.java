package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;

import java.awt.print.Book;

import java.util.List;

public interface IBookService {

    List<com.bookapp.model.Book> getAll();
    List<Book> getByAuthorStartWith(String author)throws BookNotFoundException;
    List<Book> getByCategory(String category)throws BookNotFoundException;
    List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
    List<Book> getByAuthorContainsAndCategory(String author,String category)throws Exception.BookNotFoundException;
    List<Book> getId(int bookId) throws IdNotFoundException;
}
