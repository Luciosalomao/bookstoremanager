package com.luciosalomao.bookstoremanager.dto;

import com.luciosalomao.bookstoremanager.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BooksDTO {
    private Long id;

    @NotBlank(message = "Name is required")
    @Size(max = 200)
    private String name;
    @NotNull
    private Integer pages;
    @NotNull
    private Integer chapters;
    @NotBlank(message = "Isbn is required")
    @Size(max = 100)
    private String isbn;
    @NotBlank(message = "PublisherName is required")
    @Size(max = 100)
    private String publisherName;
    @NotNull
    private AuthorDTO author;
}
