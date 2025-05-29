package com.luciosalomao.bookstoremanager.controller;

import com.luciosalomao.bookstoremanager.dto.BooksDTO;
import com.luciosalomao.bookstoremanager.dto.MessageResponseDTO;
import com.luciosalomao.bookstoremanager.repository.BookRepository;
import com.luciosalomao.bookstoremanager.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luciosalomao.bookstoremanager.entity.Books;


@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BooksDTO booksDTO) {
        return bookService.create(booksDTO);
    }
}
