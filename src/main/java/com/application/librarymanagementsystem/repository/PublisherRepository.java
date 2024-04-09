package com.application.librarymanagementsystem.repository;

import com.application.librarymanagementsystem.entity.Book;
import com.application.librarymanagementsystem.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
