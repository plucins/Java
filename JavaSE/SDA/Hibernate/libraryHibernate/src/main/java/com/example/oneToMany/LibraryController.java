package com.example.oneToMany;

import com.example.oneToMany.model.Author;
import com.example.oneToMany.model.Book;
import com.example.oneToMany.model.BookType;
import com.example.oneToMany.model.Publisher;
import com.example.oneToMany.repo.AuthorRepo;
import com.example.oneToMany.repo.BookRepo;
import com.example.oneToMany.repo.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

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
