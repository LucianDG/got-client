package com.globant.got.client.model;

import lombok.Data;

@Data
public class Book {

    String url;
    String name;
    String isbn;
    String[] authors;
    Integer numberOfPages;
    String publisher;
    String country;
    String mediaType;
    String released;
    String[] characters;
    String[] povCharacters;
}
