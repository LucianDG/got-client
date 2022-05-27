package com.globant.got.client.controller;

import com.globant.got.client.model.Book;
import com.globant.got.client.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    public BooksService booksService;

    private String url = "https://www.anapioficeandfire.com/api";

    @GetMapping("/books")
    public  List<Book> getBooks() {
        return booksService.getAllBooks(url);
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id) {
        return booksService.getBook(url, id);
    }

}