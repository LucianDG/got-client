package com.globant.got.client.client;

import com.globant.got.client.model.Book;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface BookClient {

    @RequestLine(value = "GET /books")
    @Headers("Content-Type: application/json")
    List<Book> getAllBooks();

    @RequestLine(value = "GET /books/{id}")
    @Headers("Content-Type: application/json")
    Book getOne(@Param int id);
}