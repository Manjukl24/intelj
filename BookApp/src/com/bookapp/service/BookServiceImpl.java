package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;

import com.bookapp.util.BookDetails;


import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements  IBookService{
    @Override
    public List<com.bookapp.model.Book> getAll() throws BookNotFoundException {
        List<com.bookapp.model.Book> books=BookDetails.showDetails();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartWith(String author) throws BookNotFoundException {
        List<Book> books = BookDetails.showDetails();
        List<Book> authorStartsWith = new ArrayList<>();
        for (Book book : books) {
            if (book.getByAuthor().startsWith(author)){
                authorStartsWith.add(book);
            }
        }
if(authorStartsWith.isEmpty()){
    throw  new BookNotFoundException("Unable to Find the book author starts with");
}
        return authorStartsWith;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books = BookDetails.showDetails();
        List<Book> BooksByCategory = new ArrayList<>();
        for (Book categories : books) {
            if (categories.GetByCategory().euals(category)){
                newCategory.add(categories);
            }
        }
        if(newCategory.isEmpty()) {
            throw  new BookNotFoundException("Unable to Find the book getCategory");
        }
        return newCategory;
    }


    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books = BookDetails.showDetails();
        List<Book> newPrices = new ArrayList<>();
        for (Book prices: books) {
            if (prices<prices.getPrice()){
                newPrices.add(prices);
            }
        }
        if(newPrices.isEmpty()){
            throw  new BookNotFoundException("Unable to Find the book newPrices");
        }
        return newPrices;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws Exception.BookNotFoundException {
        List<Book> books = BookDetails.showDetails();
        List<Book> autCatBy = new ArrayList<>();
        for (Book aut : books) {
            if(aut.getAuthor().equals(author) && aut.getCategory().euals(category)) {
                autCatBy.add(aut);
            }
        }
        if(autCatBy.isEmpty()){
            throw  new BookNotFoundException("Unable to Find the Book AuthorContainsAndCategory");
        }
        return autCatBy;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List<Book> books = BookDetails.showDetails();
        for (Book newBook : books) {
            if (newBook.getBookId() == bookId) {
                
                return  newBook;
            }
        }
            throw  new IdNotFoundException("Invalid ID");
    }
}
