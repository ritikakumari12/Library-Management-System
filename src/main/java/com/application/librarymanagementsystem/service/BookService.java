package com.application.librarymanagementsystem.service;

import com.application.librarymanagementsystem.entity.Book;
import com.application.librarymanagementsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book>findAllBooks()
    {
        return bookRepository.findAll();
    }

    public Book findBookById(Long id)
    {

       Book book = bookRepository.findById(id).orElseThrow(()->new RuntimeException("Book Is Not Available"));

        return book;
    }

    public void createBook(Book book)
    {
        bookRepository.save(book);
    }

    public void updateBook(Book book)
    {
        bookRepository.save(book);
    }

    public void deleteBook(Long id)
    {
        Book book = bookRepository.findById(id).orElseThrow(()->new RuntimeException("Book Is Not Available"));
        bookRepository.deleteById(book.getId());
    }
}
