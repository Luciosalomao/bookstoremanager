package com.luciosalomao.bookstoremanager.mapper;

import com.luciosalomao.bookstoremanager.dto.BooksDTO;
import com.luciosalomao.bookstoremanager.entity.Books;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
    Books toModel(BooksDTO booksDTO);

    BooksDTO toDTO(Books books);

}
