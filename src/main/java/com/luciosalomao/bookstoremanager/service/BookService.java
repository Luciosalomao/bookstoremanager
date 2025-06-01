package com.luciosalomao.bookstoremanager.service;

import com.luciosalomao.bookstoremanager.dto.BooksDTO;
import com.luciosalomao.bookstoremanager.dto.MessageResponseDTO;
import com.luciosalomao.bookstoremanager.entity.Books;
import com.luciosalomao.bookstoremanager.exception.BookNotFoundException;
import com.luciosalomao.bookstoremanager.mapper.BookMapper;
import com.luciosalomao.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BooksDTO booksDTO) {
        Books bookToSave = bookMapper.toModel(booksDTO);
        Books savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId() + " Nome: " + savedBook.getName())
                .build();
    }

    public BooksDTO findById(Long id) throws BookNotFoundException {
      Books book = bookRepository.findById(id)
              .orElseThrow(()->new BookNotFoundException(id));

        return bookMapper.toDTO(book);
    }
}