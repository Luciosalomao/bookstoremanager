package com.luciosalomao.bookstoremanager.dto;

import com.luciosalomao.bookstoremanager.entity.Author;
import jakarta.validation.Valid;
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
    @Pattern(regexp ="(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$",
            message = "ISBN format must be a valid format")
    private String isbn;
    @NotBlank(message = "PublisherName is required")
    @Size(max = 100)
    private String publisherName;

    @Valid
    @NotNull
    private AuthorDTO author;
}
