package com.application.librarymanagementsystem.service;

import com.application.librarymanagementsystem.entity.Author;
import com.application.librarymanagementsystem.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAllAuthors()
    {
        System.out.println("AUTHOR FIND ALL");
        System.out.println(authorRepository.findAll());
        return authorRepository.findAll();
    }

    public Author findAuthorById(Long id)
    {

        Author author = authorRepository.findById(id).orElseThrow(()->new RuntimeException("Author Is Not Available"));

        return author;
    }

    public void createAuthor(Author author)
    {
        authorRepository.save(author);
    }

    public void updateAuthor(Author author)
    {
        authorRepository.save(author);
    }

    public void deleteAuthor(Long id)
    {
        Author author = authorRepository.findById(id).orElseThrow(()->new RuntimeException("Book Is Not Available"));
        authorRepository.deleteById(author.getId());
    }
}
