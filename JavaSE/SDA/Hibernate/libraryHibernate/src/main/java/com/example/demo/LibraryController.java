package com.example.demo;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.BookType;
import com.example.demo.model.Publisher;
import com.example.demo.repo.AuthorRepo;
import com.example.demo.repo.BookRepo;
import com.example.demo.repo.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@RestController
public class LibraryController {


    @Autowired
    AuthorRepo authorRepo;

    @Autowired
    BookRepo bookRepo;

    @Autowired
    PublisherRepo publisherRepo;

    @GetMapping("/addBook")
    public void addBook(){

        Author a = new Author();
        a.setName("Adam");
        a.setLastName("Adamowicz");

        Book book = new Book();
        book.setBookType(BookType.KRYMINAL);
        book.setISBN(12345L);
        Book book1 = new Book();
        book1.setBookType(BookType.POWIESC);
        book1.setPublishedDate(LocalDate.now());
        book.setAuthor(a);
        book1.setAuthor(a);
        Publisher publisher = new Publisher();
        publisher.setCity("Gdańsk");
        publisher.setName("Adam");
        a.setPublisher(publisher);


        publisherRepo.save(publisher);
        authorRepo.saveAndFlush(a);
        bookRepo.saveAndFlush(book);
        bookRepo.saveAndFlush(book1);

    }
}
