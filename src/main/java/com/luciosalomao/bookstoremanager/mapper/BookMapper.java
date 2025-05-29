package com.luciosalomao.bookstoremanager.mapper;

import com.luciosalomao.bookstoremanager.dto.BooksDTO;
import com.luciosalomao.bookstoremanager.entity.Books;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Books toModel(BooksDTO booksDTO);

    BooksDTO toDTO(Books books);

}
