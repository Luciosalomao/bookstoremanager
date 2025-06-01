package com.luciosalomao.bookstoremanager.controller;

import com.luciosalomao.bookstoremanager.dto.BooksDTO;
import com.luciosalomao.bookstoremanager.dto.MessageResponseDTO;
import com.luciosalomao.bookstoremanager.repository.BookRepository;
import com.luciosalomao.bookstoremanager.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/{id}")
    public BooksDTO findById(@PathVariable Long id) {
        return bookService.findById(id);
    }
}
