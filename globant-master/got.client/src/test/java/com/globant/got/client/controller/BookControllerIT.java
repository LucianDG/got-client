package com.globant.got.client.controller;

import com.globant.got.client.service.BooksService;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BookController.class)
@RunWith(SpringRunner.class)
public class BookControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BooksService service;

    @Test
    public void getBooksTest() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("https://www.anapioficeandfire.com/api/books").contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request).andReturn();
        assertThat(result.getResponse().getContentAsString()).isNotNull();
    }

    @Test
    public void getBookTest() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("https://www.anapioficeandfire.com/api/books/1").contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request).andReturn();
        assertThat(result.getResponse().getContentAsString()).isNotNull();
    }




}
