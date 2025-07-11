package com.bookstore.book_service.service;

import com.bookstore.book_service.entity.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(Long Id);
}
