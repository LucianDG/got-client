package com.globant.got.client.service;

import com.globant.got.client.client.BookClient;
import com.globant.got.client.model.Book;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    public List<Book> getAllBooks(String url) {
        BookClient bookClient = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(BookClient.class, url);
        return bookClient.getAllBooks();
    }

    public Book getBook(String url, int id) {
        BookClient bookClient = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(BookClient.class, url);
        return bookClient.getOne(id);
    }
}

