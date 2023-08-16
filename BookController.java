package com.example.demo.controller;

import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @PutMapping("/addBooks")
    public List<Book> addBooks(@RequestBody Book book){
        

    }

}
