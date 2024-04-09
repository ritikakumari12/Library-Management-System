package com.application.librarymanagementsystem.service;

import com.application.librarymanagementsystem.entity.Publisher;
import com.application.librarymanagementsystem.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> findAllPublishers()
    {
        return publisherRepository.findAll();
    }

    public Publisher findPublisherById(Long id)
    {

        Publisher publisher = publisherRepository.findById(id).orElseThrow(()->new RuntimeException("Publisher Is Not Available"));

        return publisher;
    }

    public void createPublisher(Publisher publisher)
    {
        publisherRepository.save(publisher);
    }

    public void updatePublisher(Publisher publisher)
    {
        publisherRepository.save(publisher);
    }

    public void deletePublisher(Long id)
    {
        Publisher publisher = publisherRepository.findById(id).orElseThrow(()->new RuntimeException("Publisher Is Not Available"));
        publisherRepository.deleteById(publisher.getId());
    }
}
